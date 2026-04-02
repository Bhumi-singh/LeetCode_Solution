# Write your MySQL query statement below
# Write your MySQL query statement below
select E.employee_id,
E.name , 
count(M.reports_to) as reports_count, 
round(avg(M.age)) as average_age
from Employees E
left join Employees M on 
E.employee_id=M.reports_to
group by E.employee_id
HAVING ROUND(AVG(M.age)) IS NOT NULL
order by E.employee_id;