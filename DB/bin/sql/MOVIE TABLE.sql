CREATE TABLE MOVIE(
    ID NUMBER,
    TITLE NVARCHAR2 (50),
    DIRECTOR NVARCHAR2 (50),
    CONSTRAINT MOVIE_PK PRIMARY KEY (ID,TITLE,DIRECTOR),
    YEAR NUMBER CHECK (YEAR BETWEEN 1900 AND 2018),
    LENGTH_MINS NUMBER CHECK ( LENGTH_MINS BETWEEN 10 AND 200)
);
