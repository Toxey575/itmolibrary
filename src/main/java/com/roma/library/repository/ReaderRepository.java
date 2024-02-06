package com.roma.library.repository;

import com.roma.library.entity.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, UUID> {
}
