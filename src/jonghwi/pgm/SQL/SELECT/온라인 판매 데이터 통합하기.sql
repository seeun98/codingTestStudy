-- 131537
select to_char(sales_date, 'yyyy-mm-dd'), product_id, user_id, sales_amount
from (
         (SELECT sales_date, product_id, null user_id,sales_amount
          from offline_sale)
         union all
         (select sales_date, product_id, user_id,sales_amount
          from online_sale)
     )
where extract(year from sales_date)=2022 and extract(month from sales_date)=3
order by sales_date, product_id, user_id;