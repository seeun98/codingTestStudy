-- 131118
SELECT i.rest_id, i.rest_name,i.food_type,i.favorites, i.address,
       round(avg(r.review_score),2) score
from rest_info i
         inner join rest_review r on i.rest_id = r.rest_id
where i.address like '서울%'
group by i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
order by score desc, favorites desc;