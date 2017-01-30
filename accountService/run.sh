#/bin/bash!

gradle stage
docker build -t account_image:dockerfile .
docker run -p 80:8080 -t account_image:dockerfile
