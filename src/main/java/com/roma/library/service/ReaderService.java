package com.roma.library.service;

import com.roma.library.entity.ReaderEntity;
import com.roma.library.exception.LibraryException;
import com.roma.library.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReaderService {
    private final ReaderRepository repository;

    public ReaderEntity getById(UUID id) {
        var reader = repository.findById(id);
        if (reader.isEmpty()) {
            throw new LibraryException(LibraryException.ErrorCode.READER_NOT_FOUND,
                    String.format("Читатель с ID %s не найден", id));
        }
        return reader.get();
    }

    public List<ReaderEntity> getAll() {
        var readers = repository.findAll();
        if (readers.isEmpty()) {
            throw new LibraryException(LibraryException.ErrorCode.READER_NOT_FOUND,
                    "Читатели не найдены");
        }
        return readers;
    }
}
