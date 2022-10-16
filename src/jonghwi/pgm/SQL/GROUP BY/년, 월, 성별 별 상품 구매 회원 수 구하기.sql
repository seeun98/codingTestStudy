-- 131532
SELECT extract(year from o.sales_date) year,
       extract(month from o.sales_date) month,
       u.gender,
       count(distinct(u.user_id)) users
from user_info u
         inner join online_sale o on u.user_id = o.user_id
where gender is not null
group by extract(year from o.sales_date),extract(month from o.sales_date), u.gender
order by year,month,gender;