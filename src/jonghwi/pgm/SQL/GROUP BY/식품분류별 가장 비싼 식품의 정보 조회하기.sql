-- 131116

SELECT a.category, a.price, a.product_name
from food_product a,
     (
         select category, max(price) max_price
         from food_product
         where category = any ('과자','국','김치','식용유')
         group by category
     ) b
where a.category = b.category and a.price = b.max_price
order by a.price desc;