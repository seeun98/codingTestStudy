-- 131113
SELECT order_id, product_id, to_char(out_date,'YYYY-MM-DD'),
       case
           when out_date is null then '출고미정'
           when to_char(out_date,'YYYY-MM-DD') <= '2022-05-01' then '출고완료'
           else '출고대기'
           end 출고여부
from food_order
order by order_id;