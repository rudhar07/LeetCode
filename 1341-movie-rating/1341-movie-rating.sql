# Write your MySQL query statement below

(select m.title results from Movies m 
left join MovieRating r
on m.movie_id = r.movie_id 
where r.created_at like "2020-02-__" 
group by m.title
order by avg(r.rating) desc, m.title 
limit 1)
union all
(select u.name results from Users u
left join MovieRating r 
on u.user_id = r.user_id 
group by r.user_id
order by count(r.user_id) desc, u.name
limit 1);