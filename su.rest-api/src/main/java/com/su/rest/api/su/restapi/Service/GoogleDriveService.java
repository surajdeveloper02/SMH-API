package com.su.rest.api.su.restapi.Service;

import java.io.File;
import java.util.List;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.drive.Drive;

public interface GoogleDriveService {

	public Drive getDriveService();
	public List<com.google.api.services.drive.model.File> getFileLists(Drive service);
}
