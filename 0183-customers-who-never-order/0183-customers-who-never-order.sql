# Write your MySQL query statement below
Select Customers.name as Customers from Customers LEFT Join 
Orders on Customers.id=Orders.CustomerId where Orders.customerId IS NULL;