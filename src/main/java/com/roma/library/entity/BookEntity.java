package com.roma.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "book_id")
    private UUID id;
    @Column(name = "book_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
    @Column(name = "year_of_writing")
    private Short yearOfWriting;
    @JoinColumn(name = "publisher_name")
    @ManyToOne
    private PublisherEntity publisher;
    @JoinColumn(name = "reader_id")
    @OneToOne
    private ReaderEntity reader;
    @Column(name = "book_count")
    private Short count;
}

