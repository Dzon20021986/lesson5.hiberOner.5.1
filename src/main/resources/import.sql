DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, price int, title VARCHAR(255), PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Stew', 200), ('Buckwheat', 110), ('Rice', 100), ('Potato', 50), ('Dumplings', 70);
