CREATE SEQUENCE IF NOT EXISTS seq_client_id
    START WITH 1
    INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS seq_ticket_id
    START WITH 1
    INCREMENT BY 1;

CREATE DOMAIN planet_id AS TEXT
    CONSTRAINT check_valid_id CHECK ( VALUE IS NOT NULL AND VALUE ~ '[A-Z,0-9]{1,255}');

CREATE TABLE IF NOT EXISTS client
(
    id   BIGINT DEFAULT nextval('seq_client_id'),
    name VARCHAR(200) CHECK ( length(name) > 2 ),
    CONSTRAINT pk_client_id PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS planet
(
    id   planet_id,
    name VARCHAR(500) CHECK ( length(name) > 0 ),
    CONSTRAINT pk_planet_id PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS ticket
(
    id             BIGINT    DEFAULT nextval('seq_ticket_id'),
    created_at     TIMESTAMP DEFAULT NOW(),
    client_id      BIGINT,
    from_planet_id planet_id,
    to_planet_id   planet_id,
    CONSTRAINT pk_ticket_id PRIMARY KEY (id),
    CONSTRAINT fk_client_id FOREIGN KEY (client_id) references client (id),
    CONSTRAINT fk_from_planet_id FOREIGN KEY (from_planet_id) references planet (id),
    CONSTRAINT fk_to_planet_id FOREIGN KEY (to_planet_id) references planet (id)

);