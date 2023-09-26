mvn clean install -DskipTests
docker build --platform=amd64 -t habor.production.horsecoder.com/sock-shop/carts:latest -f ./Dockerfile .
docker push habor.production.horsecoder.com/sock-shop/carts:latest