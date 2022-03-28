SELECT * FROM member;

-- 주소(1)/이메일(2) 변경
UPDATE member
SET addr = '서울시 구로구'
WHERE id = 1;

UPDATE member
SET email = 'hyun97130@gmail.com'
WHERE id = 1;