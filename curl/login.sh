#!/usr/bin/env bash

source config.inc

curl -i -H "Content-Type: application/json" \
     -X POST \
     -d '{ "name": "'$USER'", "password": "'$PASSWORD'" }' \
     http://$HOST:$PORT/login

