DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255),  price int, PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Wheel', 5000), ('Brake pads', 3200), ('Engine', 115000),( 'Rear view mirror', 300),('Engine oil', 700)( 'Air filter', 300);

CREATE TABLE IF NOT EXISTS Client (id bigserial, name VARCHAR(255),  pass int, PRIMARY KEY (id));

