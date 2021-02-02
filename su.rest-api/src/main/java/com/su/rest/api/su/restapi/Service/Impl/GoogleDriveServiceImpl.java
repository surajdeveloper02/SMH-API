package com.su.rest.api.su.restapi.Service.Impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Files.Get;
import com.google.api.services.drive.model.FileList;
import com.su.rest.api.su.conf.GoogleDriveManager;
import com.su.rest.api.su.restapi.Service.GoogleDriveService;

@Service
public class GoogleDriveServiceImpl implements GoogleDriveService {

	private Drive service = null;
	Logger log = LoggerFactory.getLogger(GoogleDriveServiceImpl.class);

	@Override
	public Drive getDriveService() {

		if (service == null) {
			try {
				service = GoogleDriveManager.getDriveService();
			} catch (GeneralSecurityException e) {
				log.error("Error occurred while fetching Drive service Error : {}", e.getMessage());
			} catch (IOException e) {
				log.error("Error occurred while fetching Drive service Error : {}", e.getMessage());

			}
		}

		return service;
	}

	@Override
	public List<com.google.api.services.drive.model.File> getFileLists(Drive service) {
		List<com.google.api.services.drive.model.File> files = null;
		try {

			FileList result = service.files().list().setPageSize(10).setFields("nextPageToken, files(id, name)")
					.execute();
			files = result.getFiles();
		
			if (files != null) {
				for (com.google.api.services.drive.model.File file : files) {
					System.out.printf("%s (%s)\n", file.getName(), file.getId());
					
					OutputStream outputStream = new ByteArrayOutputStream();
					
					try {
						service.files().get(file.getId())
					    .executeMediaAndDownloadTo(outputStream);
						System.out.println(outputStream);
					}catch(Exception e) {
						log.error("Error occurred while fetching List of files  Error : {}", e.getMessage());
					}
				
				}
			}

		} catch (IOException e) {
			log.error("Error occurred while fetching List of files  Error : {}", e.getMessage());
		}
		return files;
	}

}
