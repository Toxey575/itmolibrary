package com.roma.library.service;

import com.roma.library.entity.BookEntity;
import com.roma.library.exception.LibraryException;
import com.roma.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repository;

    public BookEntity getById(UUID id) {
        var reader = repository.findById(id);
        if (reader.isEmpty()) {
            throw new LibraryException(LibraryException.ErrorCode.READER_NOT_FOUND,
                    String.format("Читатель с ID %s не найден", id));
        }
        return reader.get();
    }

    public List<BookEntity> getAll() {
        var readers = repository.findAll();
        if (readers.isEmpty()) {
            throw new LibraryException(LibraryException.ErrorCode.BOOK_NOT_FOUND,
                    "Книги не найдены");
        }
        return readers;
    }
}
