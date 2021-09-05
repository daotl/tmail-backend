#!/bin/sh

VOLUMES_ROOT=/data/docker/volumes/tmail
mkdir -p ${VOLUMES_ROOT}/elasticsearch/data
mkdir -p ${VOLUMES_ROOT}/cassandra/data
mkdir -p ${VOLUMES_ROOT}/rabbitmq/data
mkdir -p ${VOLUMES_ROOT}/cloudserver/data
mkdir -p ${VOLUMES_ROOT}/cloudserver/metadata

docker network create --driver bridge emaily
