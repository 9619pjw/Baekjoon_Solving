-- 코드를 작성해주세요
SELECT SUM(PRICE) AS TOTAL_PRICE
FROM ITEM_INFO
WHERE RARITY LIKE('LEGEND');