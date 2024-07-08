INSERT INTO client (name)
VALUES ('John'),
       ('Jane'),
       ('Alice'),
       ('Robert'),
       ('Emily'),
       ('Michael'),
       ('Sarah'),
       ('David'),
       ('Linda'),
       ('Daniel');
INSERT INTO planet (id, name)
VALUES ('EAR', 'Earth'),
       ('MAR', 'Mars'),
       ('VEN', 'Venus'),
       ('JUP', 'Jupiter'),
       ('SAT', 'Saturn');
INSERT INTO ticket (client_id, from_planet_id, to_planet_id)
VALUES ( 1, 'EAR', 'MAR'),
       ( 2, 'MAR', 'VEN'),
       ( 3, 'VEN', 'JUP'),
       ( 4, 'JUP', 'SAT'),
       ( 5, 'SAT', 'EAR'),
       ( 6, 'EAR', 'VEN'),
       ( 7, 'MAR', 'JUP'),
       ( 8, 'VEN', 'SAT'),
       ( 9, 'JUP', 'EAR'),
       ( 10, 'SAT', 'MAR');

