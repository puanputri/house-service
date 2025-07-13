-- Enable UUID generation (PostgreSQL)
-- CREATE
-- EXTENSION IF NOT EXISTS "pgcrypto";

-- Table: persons
CREATE TABLE persons
(
    id         VARCHAR(36) PRIMARY KEY DEFAULT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    age        INTEGER,
    email      VARCHAR(255),
    address    VARCHAR(255)
);

-- Table: cars
CREATE TABLE cars
(
    id            VARCHAR(255) PRIMARY KEY DEFAULT NULL,
    make          VARCHAR(255),
    model         VARCHAR(255),
    year          INTEGER,
    color         VARCHAR(255),
    license_plate VARCHAR(255),
    person_id     VARCHAR(36),
    CONSTRAINT fk_cars_person
        FOREIGN KEY (person_id)
            REFERENCES persons (id)
            ON DELETE CASCADE
);

-- Optional indexes for faster lookups: nyuruh mengingat -> cara meningkatkan kecepatan
CREATE INDEX idx_persons_email ON persons (email);
CREATE INDEX idx_cars_person_id ON cars (person_id);
