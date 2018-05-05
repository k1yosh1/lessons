CREATE TABLE PRODUCT(
ID NUMBER,
CONSTRAINT PRODUCT_ID PRIMARY KEY (ID),
NAME NVARCHAR2(50),
MANUFACTURER_NAME NVARCHAR2(50),
COST_PRICE NUMBER
);

--INSERT
INSERT INTO PRODUCT
VALUES(1, 'test1', 'manufact1', 10);

INSERT INTO PRODUCT
VALUES(2, 'test2', 'manufact1', 20);

INSERT INTO PRODUCT
VALUES(3, 'test3', 'manufact1', 30);

INSERT INTO PRODUCT
VALUES(4, 'test4', 'manufact1', 40);

INSERT INTO PRODUCT
VALUES(5, 'test5', 'manufact1', 50);

INSERT INTO PRODUCT
VALUES(6, 'test6', 'manufact1', 60);

INSERT INTO PRODUCT
VALUES(7, 'test7', 'manufact1', 70);

INSERT INTO PRODUCT
VALUES(8, 'test8', 'manufact1', 80);

INSERT INTO PRODUCT
VALUES(9, 'test9', 'manufact1', 90);

INSERT INTO PRODUCT
VALUES(10, 'test10', 'manufact1', 100);

INSERT INTO PRODUCT
VALUES(11, 'toy123', 'manufact1', 50);

--SELECT
SELECT * FROM PRODUCT WHERE COST_PRICE = 50 AND NAME = 'toy123';
SELECT * FROM PRODUCT WHERE ID = 1005 OR COST_PRICE < 50;
SELECT * FROM PRODUCT WHERE ID > 1005 AND MANUFACTURER_NAME = 'someManufacturer';
--UPDATE
UPDATE PRODUCT SET MANUFACTURER_NAME = 'china' WHERE NAME = 't-shirt';
--DELETE
DELETE FROM PRODUCT WHERE ID < 1050;
