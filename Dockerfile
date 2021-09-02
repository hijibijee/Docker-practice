FROM openjdk:15
COPY . /src
WORKDIR /src
RUN ["javac","GuessSquareRoot.java"]
ENTRYPOINT ["java","GuessSquareRoot"]