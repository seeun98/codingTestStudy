-- 코드를 입력하세요
select product_id, product_name, product_cd, category, price
from food_product
where price = (select max(price) from food_product);