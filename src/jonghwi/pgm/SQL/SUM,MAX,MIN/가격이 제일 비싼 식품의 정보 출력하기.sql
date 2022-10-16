-- 131115

SELECT product_id, product_name, product_cd, category, price
from food_product
where price = (
    select max(price)
    from food_product
);