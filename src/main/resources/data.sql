-- Insert some sample addresses
INSERT INTO address (street, city, state, zip_code) VALUES ('123 Main St', 'Anytown', 'CA', '12345');
INSERT INTO address (street, city, state, zip_code) VALUES ('456 Elm St', 'Othertown', 'NY', '67890');

-- Insert some sample users
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('johndoe', 'John', 'Doe', 1);
INSERT INTO user (username, firstname, lastname, address_id) VALUES ('janedoe', 'Jane', 'Doe', 2);

-- Insert some sample fields (courts)
INSERT INTO courts (court_name) VALUES ('Court A');
INSERT INTO courts (court_name) VALUES ('Court B');

-- Insert some sample bookings with associated fields
INSERT INTO booking (user_id, court_id, datum, tid, antal_spelare, totalpris) VALUES (1, 1, '2024-06-12', '10:00:00', 4, 500);
INSERT INTO booking (user_id, court_id, datum, tid, antal_spelare, totalpris) VALUES (2, 2, '2024-06-13', '14:00:00', 2, 300);


