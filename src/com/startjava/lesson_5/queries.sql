SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE mark = 'Mark-1' or mark = 'Mark-2';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT avg(weight) FROM Jaegers;
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE STATUS = 'intact';
DELETE FROM Jaegers WHERE STATUS = 'Destroyed';

-- \i C:/Users/Пользователь/Documents/startjava/src/com/startjava/lesson_5/queries.sql