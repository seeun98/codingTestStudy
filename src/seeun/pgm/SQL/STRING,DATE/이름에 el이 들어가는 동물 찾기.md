## [프로그래머스] 이름에 el이 들어가는 동물 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/59047

### solution
```SQL
-- 코드를 입력하세요
SELECT animal_id, name
FROM ANIMAL_INS
WHERE (NAME LIKE '%el%' or name like '%EL%' or name like '%El%' or name like '%eL%') and animal_type = 'Dog'
order by name
```

### 참고
- 대소문자 구분 없이 -> LOWER(NAME) LIKE '%el%’