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

-- Insert some sample courts (fields)
INSERT INTO courts (court_name) VALUES ('Court A');
INSERT INTO courts (court_name) VALUES ('Court B');

-- Insert bookings with Euro equivalent price
-- Assuming conversion rate is 0.1 (for demonstration)
-- Replace 0.1 with actual conversion rate from SEK to EUR provided by your service

-- Booking 1: John Doe books Court A on June 25, 2024 at 14:00
INSERT INTO booking (user_id, court_id, antal_spelare, totalpris, datum, tid, priceineuro)
VALUES (1, 1, 4, 500, '2024-06-25', '14:00:00', 500 * 0.1); -- 500 SEK * 0.1 conversion rate = 50 EUR

-- Booking 2: Jane Doe books Court B on June 26, 2024 at 15:30
INSERT INTO booking (user_id, court_id, antal_spelare, totalpris, datum, tid, priceineuro)
VALUES (2, 2, 2, 300, '2024-06-26', '15:30:00', 300 * 0.1); -- 300 SEK * 0.1 conversion rate = 30 EUR


