# Write your MySQL query statement below
Select email as Email from Person GROUP By email having count(email)>1;