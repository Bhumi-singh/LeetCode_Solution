# Write your MySQL query statement below
Select Employee.name,Bonus.bonus 
FROM Employee 
LEFT JOIN Bonus 
ON Employee.empId = Bonus.empId where Bonus.bonus<1000 OR Bonus.bonus is null;