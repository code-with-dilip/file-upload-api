package com.learnfileupload.controller

import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.io.IOException
import javax.validation.constraints.NotNull


@RestController
@RequestMapping("/api/files")
@CrossOrigin(value = ["*"], exposedHeaders = ["Content-Disposition"])
class FileUploadController {

    companion object : KLogging()

    @PostMapping
    fun uploadNewFile(@NotNull @RequestParam("file") multipartFile: MultipartFile): ResponseEntity<String?>? {
        logger.info("file original name : ${multipartFile.originalFilename}, multipart content type ${multipartFile.contentType}, File Size ${multipartFile.size}")
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}