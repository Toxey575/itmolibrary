package com.roma.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "reader")
public class ReaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "reader_id")
    private UUID id;

    @Column(name = "reader_name", nullable = false)
    private String name;

    @Column(name = "registration_date", nullable = false)
    @CreatedDate
    private LocalDate registrationDate;

}
