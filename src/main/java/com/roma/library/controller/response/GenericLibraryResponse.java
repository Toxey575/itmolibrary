package com.roma.library.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenericLibraryResponse<T> {
    private UUID responseId;
    private T data;
    private LibraryErrorResponse error;
}
