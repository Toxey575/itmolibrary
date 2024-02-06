package com.roma.library.service;

import com.roma.library.entity.AuthorEntity;
import com.roma.library.exception.LibraryException;
import com.roma.library.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;
import java.util.UUID;

@Service
@ControllerAdvice
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorEntity getById(UUID id) {
        var author = repository.findById(id);
        if (author.isEmpty()) {
            throw new LibraryException(LibraryException.ErrorCode.AUTHOR_NOT_FOUND,
                    String.format("Автор с ID %s не найден", id));
        }
        return author.get();
    }

    public List<AuthorEntity> getAll() {
        var authors = repository.findAll();
        if (authors.isEmpty()) {
            throw new LibraryException(LibraryException.ErrorCode.AUTHOR_NOT_FOUND,
                    "Авторыне найдены");
        }
        return authors;
    }
}
