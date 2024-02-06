INSERT INTO publisher (name)
VALUES ('Питер');

INSERT INTO reader (reader_id, reader_name, registration_date)
VALUES ('97c0e659-87d3-4a84-b645-734db78f5e44', 'Иван Петров', '2023-01-02'),
       ('abaaecfd-39fb-4386-8ba9-6568bffbea71', 'Петр Васильев', '2023-05-17'),
       ('1eb09ea6-c469-11ee-a506-0242ac120002', 'Игорь Семенов', '2023-10-11');


INSERT INTO author (author_id, author_name)
VALUES ('da30d6aa-c4e6-11ee-a506-0242ac120002', 'Михаил Буглаков'),
       ('e0915ce0-c4e6-11ee-a506-0242ac120002', 'Джек Лондон'),
       ('e2fe31a6-c4e6-11ee-a506-0242ac120002', 'Иван Тургенев');

INSERT INTO book (book_id, book_name, author_id, year_of_writing, publisher_name, reader_id, book_count)
VALUES ('17fbb220-c4e7-11ee-a506-0242ac120002', 'Мартин Иден', 'e0915ce0-c4e6-11ee-a506-0242ac120002',
        1909, 'Питер', 'abaaecfd-39fb-4386-8ba9-6568bffbea71', 1),
       ('13255e0e-c4e7-11ee-a506-0242ac120002', 'Мастер и Маргарита', 'da30d6aa-c4e6-11ee-a506-0242ac120002',
        1940, 'Питер', '97c0e659-87d3-4a84-b645-734db78f5e44', 1),
       ('1aad8d7c-c4e7-11ee-a506-0242ac120002', 'Отцы и дети', 'e2fe31a6-c4e6-11ee-a506-0242ac120002',
        1860, 'Питер', '1eb09ea6-c469-11ee-a506-0242ac120002', 1);



