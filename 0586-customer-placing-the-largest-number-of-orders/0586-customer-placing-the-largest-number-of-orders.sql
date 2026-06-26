# Write your MySQL query statement below

-- select max(customer_number) customer_number from Orders where customer_number is not null;

select customer_number from Orders 
group by customer_number 
order by count(*) desc 
limit 1;
