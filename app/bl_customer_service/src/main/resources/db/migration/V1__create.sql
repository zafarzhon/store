CREATE SEQUENCE IF NOT EXISTS customers_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS orders_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS products_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE customers
(
    id         INTEGER     NOT NULL,
    login      VARCHAR(20) NOT NULL,
    password   VARCHAR(255),
    created_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_customers PRIMARY KEY (id)
);

CREATE TABLE orders
(
    id          INTEGER NOT NULL,
    customer_id INTEGER,
    created_at  TIMESTAMP WITHOUT TIME ZONE,
    status      VARCHAR(255),
    total_price INTEGER,
    CONSTRAINT pk_orders PRIMARY KEY (id)
);

CREATE TABLE products
(
    id         INTEGER NOT NULL,
    product_id INTEGER,
    quantity   INTEGER,
    price      INTEGER,
    order_id   INTEGER,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

ALTER TABLE customers
    ADD CONSTRAINT uc_customers_login UNIQUE (login);

ALTER TABLE orders
    ADD CONSTRAINT FK_ORDERS_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES customers (id);

ALTER TABLE products
    ADD CONSTRAINT FK_PRODUCTS_ON_ORDER FOREIGN KEY (order_id) REFERENCES orders (id);