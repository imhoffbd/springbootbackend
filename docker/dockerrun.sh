#!/usr/bin/env bash

docker run -p 8080:8080 -e mongodb.connectstring='mongodb://172.17.0.1:27017/' -t mytest/springbootbackend
