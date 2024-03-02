package com.buffalo.utilities;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile) throws Exception {
		
		Path uploadPath = Paths.get(uploadDir);
		
		if(!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		
		try(InputStream inputStream = multipartFile.getInputStream()){
			Path filePath = uploadPath.resolve(fileName);
			Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
		}catch(Exception ex) {
			throw new Exception("Could not save file: " + fileName, ex);
		}
		
	}
	
	public static void cleanDir(String dir) {
		Path dirPath = Paths.get(dir);
		try {
			Files.list(dirPath).forEach(file->{
				if(!Files.isDirectory(file)) {
					try {
						Files.delete(file);
					}catch(Exception ex) {
						System.out.println("Could not delete file: " + file);
					}
				}
			});
		}catch(Exception ex) {
			System.out.println("Could not list directory: " + dirPath);
		}
	}
}
