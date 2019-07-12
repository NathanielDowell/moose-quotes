use moose_quotes_db;

DROP TABLE IF EXISTS moose_quotes;
DROP TABLE IF EXISTS users;


CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL ,
    email VARCHAR(255) NOT NULL ,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS moose_quotes (
    id INT unsigned not null auto_increment,
    quote varchar(255) UNIQUE,
    author INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (author) REFERENCES users(id)
);


INSERT INTO users (id, username, password, email) VALUES
  (1, 'AngelicBeaver', '1234', 'dowellnathaniel@yahoo.com');

INSERT INTO moose_quotes (id, quote, author_id) VALUES
  (1, 'The mist cleared, and there, silvery in the moonlight, was a moose and a flying squirrel. They looked to be friends.', 1),
  (2, 'I named my dog "Moose". He was my best friend, and guarded me day and night. He never barked, but he could make quite a commotion if his antlers got caught on something.', 1)




