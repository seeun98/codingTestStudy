-- 코드를 입력하세요
select datetime
from animal_ins
where datetime = (select max(datetime) from animal_ins);
-- Date도 min., max 가능
