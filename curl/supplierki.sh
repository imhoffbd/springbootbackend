#!/usr/bin/env bash

source config.inc

EXT=""
if [ $# -gt 1  ]; then
  EXT="/$2"
fi

curl -i http://10.211.55.5:80/supplier
