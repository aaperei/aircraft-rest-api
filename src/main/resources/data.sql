DROP TABLE IF EXISTS aircraft;
 
CREATE TABLE aircraft(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  weight DOUBLE NOT NULL,
  number_Of_seats INT NOT NULL,
  range_in_kilometers DOUBLE NOT NULL
);
 
INSERT INTO aircraft (name, weight, number_Of_seats, range_in_kilometers) VALUES
  ('ALISON-195', 10000, 150, 5000),
  ('ALISON-390', 20000, 130, 4000),
  ('ALISON-300', 7000 , 50 , 5000);