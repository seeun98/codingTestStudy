-- 131530
SELECT floor(price/10000)*10000 PRICE_GROUP, count(*) products
from product
group by floor(price/10000)*10000
order by PRICE_GROUP