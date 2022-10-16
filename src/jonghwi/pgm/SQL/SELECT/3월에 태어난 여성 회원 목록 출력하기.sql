-- 131120

SELECT member_id, member_name, gender, to_char(date_of_birth,'YYYY-MM-DD') DATE_OF_BIRTH
from member_profile
where tlno is not null and gender = 'W' and extract(month from date_of_birth)=3
order by member_id