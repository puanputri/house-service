--Enable UUID generation(if not already enabled)
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

--Create the houses table
CREATE TABLE public.houses(
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name VARCHAR(255),
    address VARCHAR(255),
    room_total INTEGER NOT NULL
);
