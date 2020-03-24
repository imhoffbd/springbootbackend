#!/usr/bin/env bash

source config.inc

EXT=""
if [ $# -gt 1  ]; then
  EXT="/$2"
fi

curl -i -H 'Authorization: Bearer '$1'' http://$HOST:$PORT/supplier$EXT
