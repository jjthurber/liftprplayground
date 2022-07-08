#!/usr/bin/env bash

JAVA=/usr/lib/jvm/java-11-openjdk-amd64/bin/java

dir=$1
commit=$2
cmd=$3

function tellName() {
  return "Environment Export"
  return 0
}

function tellApplicable() {
  echo "true"
  return 0
}

function tellVersion() {
  echo "1"
  return 0
}

function run() {
  echo "[{"
  echo "\"type\" : \"baz\","
  echo "\"message\" : \"value: $LIFT_ANALYSIS_API_URL\","
  echo "\"file\" : \"foo.bar\","
  echo "\"line\" : 1"
  echo "}]"
}

if [[ "$cmd" = "name" ]] ; then
  tellName
fi

if [[ "$cmd" = "run" ]] ; then
        run
fi
if [[ "$cmd" = "applicable" ]] ; then
        tellApplicable
fi
if [[ "$cmd" = "version" ]] ; then
        tellVersion
fi

