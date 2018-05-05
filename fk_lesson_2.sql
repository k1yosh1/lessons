CREATE TABLE forumPosts(
 ID INT,
 CONSTRAINT ID PRIMARY KEY (ID),
 idSubcategory INT,
 CONSTRAINT idSubcategory_FK FOREIGN KEY idSubcategory REFERENCES forumSubcategories(id),
 idUser INT,
 CONSTRAINT idUser_FK FOREIGN KEY idUser REFERENCES users(id),	
 parentPost INT,
 title VARCHAR(90),
 content TEXT,
 isPoll BOOLEAN,
 date TIMESTAMP,
 ip VARCHAR(20)
);

CREATE TABLE forumSubcategories(
 id INT,
 CONSTRAINT Subcat_id PRIMARY KEY (id),
 idCategory INT,
 CONSTRAINT ID_FK FOREIGN KEY idCategory REFERENCES forumCategories(id),
 title VARCHAR(45),
 description TEXT,
 date TIMESTAMP,
 ip VARCHAR(20)
);

CREATE TABLE forumCategories(
 id INT,
 CONSTRAINT cat_id PRIMARY KEY (id),
 title VARCHAR(64),
 description TEXT,
 date TIMESTAMP,
 ip VARCHAR(20)
 );
 
CREATE TABLE users(
 id INT,
 CONSTRAINT user_id PRIMARY KEY (id),
 nick VARCHAR(16),
 password VARCHAR(128),
 email VARCHAR(128),
 date TIMESTAMP,
 karma FLOAT(9,2),
 ip VARCHAR(20)
);

CREATE TABLE forumPollsOptionsVotes(
 id INT,
 CONSTRAINT forumPollsOptionsVotes_id PRIMARY KEY (id),
 idPollOption INT,
 idUser INT,
 CONSTRAINT idUser_FK FOREIGN KEY idUser REFERENCES users(id),
 date TIMESTAMP,
 ip VARCHAR(20)
);

CREATE TABLE forumPollsOptions(
 id INT,
 idPost INT,
 CONSTRAINT idPost_FK FOREIGN KEY idPost REFERENCES forumPosts(parentPost),
 title VARCHAR(64),
 date TIMESTAMP,
);