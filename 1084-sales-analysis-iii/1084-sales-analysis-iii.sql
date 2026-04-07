# Write your MySQL query statement below
select P.product_id, P.product_name from Product P
join Sales S on P.product_id=S.product_id GROUP BY s.product_id
HAVING 
    MIN(s.sale_date) >= '2019-01-01'
    AND MAX(s.sale_date) <= '2019-03-31';