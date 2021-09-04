#!/bin/sh
docker network create --driver bridge emaily
VOLUMES_ROOT=/data/docker/volumes/tmail \
SCALITY_ACCESS_KEY_ID=MODIFY_ME \
SCALITY_SECRET_ACCESS_KEY=MODIFY_ME \
docker compose up -d
