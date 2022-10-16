-- 131117
SELECT p.product_id, p.product_name, sum(p.price * o.AMOUNT) TOTAL_SALES
from food_order o
         inner join food_product p on o.product_id = p.product_id
where to_char(o.product_date, 'yyyy-mm') = '2022-05'
group by p.product_id,p.product_name
order by TOTAL_SALES desc, p.product_id