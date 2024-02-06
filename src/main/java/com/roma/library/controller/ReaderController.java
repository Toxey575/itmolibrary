package com.roma.library.controller;

import com.roma.library.controller.response.GenericLibraryResponse;
import com.roma.library.controller.response.LibraryErrorResponse;
import com.roma.library.entity.ReaderEntity;
import com.roma.library.exception.LibraryException;
import com.roma.library.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reader")
public class ReaderController {
    private final ReaderService service;

    @GetMapping("/get")
    public ResponseEntity<GenericLibraryResponse<List<ReaderEntity>>> getAll() {
        try {
            var readers = service.getAll();
            var response = GenericLibraryResponse.<List<ReaderEntity>>builder()
                    .responseId(UUID.randomUUID())
                    .data(readers)
                    .build();
            return ResponseEntity.ok(response);
        } catch (LibraryException e) {
            var response = GenericLibraryResponse.<List<ReaderEntity>>builder()
                    .responseId(UUID.randomUUID())
                    .error(LibraryErrorResponse.builder()
                            .errorCode(e.getErrorCode().toString())
                            .message(e.getMessage())
                            .build())
                    .build();
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<GenericLibraryResponse<ReaderEntity>> getById(@PathVariable UUID id) {
        try {
            var reader = service.getById(id);
            var response = GenericLibraryResponse.<ReaderEntity>builder()
                    .responseId(UUID.randomUUID())
                    .data(reader)
                    .build();
            return ResponseEntity.ok(response);
        } catch (LibraryException e) {
            var response = GenericLibraryResponse.<ReaderEntity>builder()
                    .responseId(UUID.randomUUID())
                    .error(LibraryErrorResponse.builder()
                            .errorCode(e.getErrorCode().toString())
                            .message(e.getMessage())
                            .build())
                    .build();
            return ResponseEntity.badRequest().body(response);
        }
    }

}
