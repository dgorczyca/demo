# Slackbot API

### Start in docker

In order to get the API and database up and running the Java image needs to be build first.

1. Start with cloning this repo 
    * `git clone git@github.com:dgorczyca/demo.git`
2. Setup the remaining folders
    * run `./setup`
2. To build an image you will need a docker running on your machine.
3. Once docker is running we can run command to create an image (image name will be `slackbot/volunteering`)
    * `./mvnw install dockerfile:build` 
4. Add BOT id environment variable and run docker-compose up (can be done in one line like below)
    * `HUBOT_SLACK_TOKEN=xoxb-261235603910-x6RKm1qL4nppolGIZStlnKo1 docker-compose up`
5. Now you should be able to access database on port 3005 and API on port 8080



### References

* Spring database (https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* Database is initialised by JPA annotations (https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html)