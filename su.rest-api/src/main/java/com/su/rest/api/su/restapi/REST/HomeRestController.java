package com.su.rest.api.su.restapi.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.su.rest.api.su.conf.GoogleDriveManager;
import com.su.rest.api.su.restapi.Service.GoogleDriveService;

@RestController
@RequestMapping(value= "api/v1")
public class HomeRestController {

	
	@Autowired
	GoogleDriveService googleDriveService;
	@GetMapping("/images")
	public String SayWelcome() {
		
		googleDriveService.getFileLists(googleDriveService.getDriveService());
		return " Welcome home";
		
	}
}
