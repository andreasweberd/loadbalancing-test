# demo load balancing 

## Configure nginx

Replace the content of nginx.conf of the installed nginx with the content of the 
file nginx.conf in this project and restart nginx

## Compile java server:
    javac WebRequestHandler.java TestServer.java

## Run first server:
    java -cp . TestServer 8080

## Run second server:
    java -cp . TestServer 8081

## Run third server:
    java -cp . TestServer 8082

## Test

Call http://localhost in browser multiple times