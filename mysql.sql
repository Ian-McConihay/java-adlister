CREATE TABLE ad (
                        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                        title VARCHAR(50),
                        description  VARCHAR(100) NOT NULL,
                        userId
                        PRIMARY KEY (id)
);


this.id = id;
this.userId = userId;
this.title = title;
this.description = description;
}

    public Ad(long userId, String title, String description) {
        this.userId = userId;
this.title = title;
this.description = description;