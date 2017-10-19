CREATE TABLE tbl_product (
	product_id BIGINT IDENTITY(1,1) NOT NULL,
	product_name NVARCHAR(255) NOT NULL,
	price NUMERIC (19, 2) NOT NULL,
	quantity INT NOT NULL,
PRIMARY KEY( product_id ))