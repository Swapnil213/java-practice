//The SELECT statement is used to select data from a database.
SELECT CustomerName, City FROM Customers;

//Return all the columns from the Customers table
SELECT * FROM Customers;

//The SELECT DISTINCT statement is used to return only distinct (different) values.
SELECT DISTINCT Country FROM Customers;

//By using the DISTINCT keyword in a function called COUNT, we can return the number of different countries.
SELECT COUNT(DISTINCT Country) FROM Customers;


//Example
SELECT Count(*) AS DistinctCountries
FROM (SELECT DISTINCT Country FROM Customers);

//The WHERE clause is used to filter records.
SELECT column1, column2, ...
FROM table_name
WHERE condition;

//Example
//Select all customers from Mexico:
SELECT * FROM Customers
WHERE Country='Mexico';

//Select all customers where customer id is 1:
SELECT * FROM Customers
WHERE CustomerID=1;

//Operators in The WHERE Clause
//Select all customers with a CustomerID greater than 80:
SELECT * FROM Customers
WHERE CustomerID > 80;

Operator	Description
=	Equal	
>	Greater than	
<	Less than	
>=	Greater than or equal	
<=	Less than or equal	
<>	Not equal. Note: In some versions of SQL this operator may be written as !=	
BETWEEN	Between a certain range	
LIKE	Search for a pattern	
IN	To specify multiple possible values for a column

//The ORDER BY keyword is used to sort the result-set in ascending or descending order.
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC;

//Example
//Sort the products by price:
SELECT * FROM Products
ORDER BY Price;


//Sort the products from highest to lowest price:
SELECT * FROM Products
ORDER BY Price DESC;

//Sort the products alphabetically by ProductName:
SELECT * FROM Products
ORDER BY ProductName;

//Sort the products by ProductName in reverse order:
SELECT * FROM Products
ORDER BY ProductName DESC;

//The following SQL statement selects all customers from the "Customers" table,
//sorted by the "Country" and the "CustomerName" column. This means that it orders by Country,
//but if some rows have the same Country, it orders them by CustomerName:
SELECT * FROM Customers
ORDER BY Country, CustomerName;

//The following SQL statement selects all customers from the "Customers" table,
//sorted ascending by the "Country" and descending by the "CustomerName" column:
SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;

//Select all customers from Spain that starts with the letter 'G':
SELECT *
FROM Customers
WHERE Country = 'Spain' AND CustomerName LIKE 'G%';

//The following SQL statement selects all fields from Customers 
//where Country is "Brazil" AND City is "Rio de Janeiro" 
//AND CustomerID is higher than 50:
Example
SELECT * FROM Customers
WHERE Country = 'Brazil'
AND City = 'Rio de Janeiro'
AND CustomerID > 50;

//Select all Spanish customers that starts with either "G" or "R":
SELECT * FROM Customers
WHERE Country = 'Spain' AND (CustomerName LIKE 'G%' OR CustomerName LIKE 'R%');

//Select only the customers that are NOT from Spain:
SELECT * FROM Customers
WHERE NOT Country = 'Spain';

//Select customers that does not start with the letter 'A':
SELECT * FROM Customers
WHERE CustomerName NOT LIKE 'A%';

//Select customers with a customerID not between 10 and 60:
SELECT * FROM Customers
WHERE CustomerID NOT BETWEEN 10 AND 60;

//Select customers that are not from Paris or London:
SELECT * FROM Customers
WHERE City NOT IN ('Paris', 'London');

//Select customers with a CustomerId not greater than 50:
SELECT * FROM Customers
WHERE NOT CustomerID > 50;

Note: There is a not-greater-than operator: !> that would give you the same result.


//The following SQL statement inserts a new record in the "Customers" table:
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

//It is also possible to only insert data in specific columns.
INSERT INTO Customers (CustomerName, City, Country)
VALUES ('Cardinal', 'Stavanger', 'Norway');

//To insert multiple rows of data, we use the same INSERT INTO statement, but with multiple values:
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES
('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),
('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),
('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');

//The following SQL lists all customers with a NULL value in the "Address" field:
SELECT CustomerName, ContactName, Address
FROM Customers
WHERE Address IS NULL;

//The following SQL lists all customers with a value in the "Address" field:
SELECT CustomerName, ContactName, Address
FROM Customers
WHERE Address IS NOT NULL;

//The following SQL statement will update the ContactName to "Juan" for all records
//where country is "Mexico":
UPDATE Customers
SET ContactName='Juan'
WHERE Country='Mexico';

//Be careful when updating records. If you omit the WHERE clause, ALL records will be updated!
UPDATE Customers
SET ContactName='Juan';

//The DELETE statement is used to delete existing records in a table.
DELETE FROM table_name WHERE condition;

//The following SQL statement deletes the customer "Alfreds Futterkiste" from the "Customers" table:
DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste';

//The following SQL statement deletes all rows in the "Customers" table, without deleting the table:
DELETE FROM Customers;

//To delete the table completely, use the DROP TABLE statement:
//Remove the Customers table:
DROP TABLE Customers;