-- 59047
SELECT animal_id, name
FROM animal_ins
where UPPER(name) like '%EL%'
  and animal_type = 'Dog'
order by name;