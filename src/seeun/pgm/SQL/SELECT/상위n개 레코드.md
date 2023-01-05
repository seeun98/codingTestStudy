# [프로그래머스] 상위 n개 레코드
https://school.programmers.co.kr/learn/courses/30/lessons/59405

### solution
```SQL
SELECT NAME
FROM (SELECT *
      FROM ANIMAL_INS
      ORDER BY DATETIME)
WHERE ROWNUM = 1
```


### 참고
- 첫 시도 (실패)
```SQL
SELECT NAME
FROM ANIMAL_INS
WHERE ROWNUM = 1
ORDER BY DATETIME
```
- rownum은 order by 순서대로 생기지 않음... 
- order byu로 데이터 정렬이 되기 전에 rownum이 매겨진다.
- order by를 먼저 적용 한뒤에 바깥 쿼리에 rownum을 이용한 경우