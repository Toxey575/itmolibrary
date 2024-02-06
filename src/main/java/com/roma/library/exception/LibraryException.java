package com.roma.library.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LibraryException extends RuntimeException {
    private final ErrorCode errorCode;
    private final String message;

    public enum ErrorCode {
        AUTHOR_NOT_FOUND,
        BOOK_NOT_FOUND,
        READER_NOT_FOUND,
    }
}
