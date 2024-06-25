-- Insert some sample addresses
INSERT INTO address (street, city, state, zip_code) VALUES ('123 Main St', 'Anytown', 'CA', '12345');
INSERT INTO address (street, city, state, zip_code) VALUES ('456 Elm St', 'Othertown', 'NY', '67890');

-- Insert some sample users
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('johndoe', 'John', 'Doe', 1);
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('janedoe', 'Jane', 'Doe', 2);
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('Chris', 'John', 'Doe', 1);
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('Jaxon', 'Jane', 'Doe', 2);
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('Jason', 'John', 'Doe', 1);
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('Linus', 'Jane', 'Doe', 2);

-- Insert some sample fields (courts)
INSERT INTO courts (court_name) VALUES ('Court A');
INSERT INTO courts (court_name) VALUES ('Court B');

INSERT INTO booking (user_id, court_id, antal_spelare, totalpris, datum, tid)
VALUES (1, 1, 4, 500, '2024-06-25', '14:00:00'); -- John Doe books Court A on June 25, 2024 at 14:00

INSERT INTO booking (user_id, court_id, antal_spelare, totalpris, datum, tid)
VALUES (2, 2, 2, 300, '2024-06-26', '15:30:00'); -- Jane Doe books Court B on June 26, 2024 at 15:30

