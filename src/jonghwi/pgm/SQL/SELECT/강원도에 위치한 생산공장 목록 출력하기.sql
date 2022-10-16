-- 131112

SELECT factory_id, factory_name, address
from food_factory
where address like '강원도%'
order by factory_id;