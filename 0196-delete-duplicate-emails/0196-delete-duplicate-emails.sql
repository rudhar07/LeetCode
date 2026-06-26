# Write your MySQL query statement below

delete from Person 
where id not in(
    select minId from (
        select min(id) minId from person 
        group by email
    ) num
);