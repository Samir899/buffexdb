package com.buffalo.controller;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/open")
public class FileDownloadController {

    @GetMapping("/license")
    public ResponseEntity<byte[]> openPdf() throws IOException {
        // Load the file from the resources directory
        ClassPathResource pdfFile = new ClassPathResource("static/files/ICAR_Data_Use_Licence.pdf");

        // Convert file content into a byte array
        byte[] fileContent = Files.readAllBytes(Paths.get(pdfFile.getURI()));

        // Set the content-disposition header to inline to allow viewing in the browser
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=ICAR_Data_Use_License.pdf");

        // Return the file as a ResponseEntity with the correct content type and headers
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(fileContent);
    }
}
