-- 131533
SELECT p.product_code, sum(p.price * o.sales_amount) sales
from product p
         inner join offline_sale o on p.product_id = o.product_id
group by p.product_code
order by sales desc, p.product_code;