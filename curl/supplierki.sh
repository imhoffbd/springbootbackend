#!/usr/bin/env bash

EXT=""
if [ $# -gt 0  ]; then
  EXT="/$1"
fi

curl -i http://10.211.55.5:80/supplier$EXT
