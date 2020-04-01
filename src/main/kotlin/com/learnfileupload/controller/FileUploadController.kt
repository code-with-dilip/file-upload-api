package com.learnfileupload.controller

import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import javax.validation.constraints.NotNull


@RestController

@CrossOrigin(value = ["*"], exposedHeaders = ["Content-Disposition"])
class FileUploadController {

    companion object : KLogging()

        @PostMapping("/fileUpload")
    fun uploadNewFile(@NotNull @RequestParam("file") multipartFile: MultipartFile , @RequestParam("randomString") randomString: String): ResponseEntity<String?>? {
        logger.info("file original name : ${multipartFile.originalFilename}, multipart content type ${multipartFile.contentType}, File Size ${multipartFile.size}")
        logger.info("randomString : $randomString")
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}