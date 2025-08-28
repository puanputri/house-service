-- Enable UUID generation (PostgreSQL)
-- CREATE
-- EXTENSION IF NOT EXISTS "pgcrypto";

-- Table: companies
CREATE TABLE house_schema.companies
(
    id         VARCHAR(36) PRIMARY KEY DEFAULT NULL,
    name       VARCHAR(200),
);

-- Table: jobs
CREATE TABLE house_schema.jobs
(
    id            VARCHAR(255) PRIMARY KEY DEFAULT NULL,
    company_id    VARCHAR(36) NOT NULL REFERENCES payment_schema.customers(id) ON DELETE CASCADE,
    title         VARCHAR(100),
    description   VARCHAR(200),
    created_at    TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

);

-- Optional indexes for faster lookups: nyuruh mengingat -> cara meningkatkan kecepatan
CREATE INDEX idx_company_name ON companies (name);
CREATE INDEX idx_jobs_company_id ON jobs (person_id);
CREATE INDEX idx_jobs_title ON jobs (title);
