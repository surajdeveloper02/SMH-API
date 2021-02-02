package com.su.rest.api.su.restapi.REST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value= "api/v1")
public class imageRESTController {
	
	List<MultipartFile> files = new ArrayList();
	
	
	
	@PostMapping("/image")
	private MultipartFile uploadImage(@RequestParam("file") MultipartFile file ) throws IOException {
		try {
			System.out.println("Original Image Byte Size - " + file.getBytes().length);
			byte[] imagebyte = file.getBytes();
			files.add(file);
			
			System.out.println(file.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return file;
	}
	
//	@GetMapping("/images")
//	private List<MultipartFile> getImages(){
//		
//		
//		return files;	
//	}
	
	@GetMapping("/image/{id}")
	private List<MultipartFile> getImages(@PathVariable("id") String id){
		
		
		return files;	
	}
	

}
