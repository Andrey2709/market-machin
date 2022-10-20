DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255),  price int, PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Wheel', 5000),
('Brake pads', 3200),
('Engine', 115000),
('Rear view mirror', 300),
('Engine oil', 700),
('Air filter', 300),
('Paints for cars', 800),
('Windshield', 7200),
('Headlight', 1200),
('Desk', 1000),
('Gur pump', 15200),
('Front spring bracket', 5200),
('Front suspension shock absorber', 3200),
('Front suspension cushion', 3200),
('Oil seal', 900),
('The inner anther of the srus', 500),
('Bracket', 2500),
('Oil filter', 1500),
('Brake padsA', 3200),
('Brake padsB', 3200),
('Brake padsC', 3200);

CREATE TABLE IF NOT EXISTS Client (id bigserial, name VARCHAR(255),  pass int, PRIMARY KEY (id));

