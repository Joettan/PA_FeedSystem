CREATE TABLE Feeds(
--     必须要指定主键
    feedId int PRIMARY KEY,
    feedName VARCHAR(30),
    feedUrl VARCHAR(30)
);
INSERT INTO Feeds (feedId, feedName,feedUrl) VALUES (1, 'USA','www.baidu.com');
INSERT INTO Feeds (feedId, feedName,feedUrl) VALUES (2, 'France','www.baidu.com');