-- 59414
SELECT animal_id, name, to_char(datetime,'YYYY-MM-DD') 날짜
from animal_ins
order by animal_id