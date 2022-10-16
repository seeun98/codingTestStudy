-- 131114
SELECT warehouse_id, warehouse_name, address, NVL(freezer_yn,'N')
from food_warehouse
where warehouse_name like '창고_경기%'
order by warehouse_id;