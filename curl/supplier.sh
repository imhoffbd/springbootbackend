#!/usr/bin/env bash

EXT=""
if [ $# -gt 0  ]; then
  EXT="/$1"
fi

curl -i http://localhost:8080/supplier$EXT
