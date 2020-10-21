# Hasura demo project

The purpose of this project is to showcase some of the features and use cases of Hasura.
It consists of docker-compose file to run Hasura, a PostgreSQL, a Quarkus-based java microservice
 and a graphql-mesh service.
 
To run, first build the quarkus service: 
```
./mvnw package
```
Then spin up the dockers
```
docker-compose up
```

### Useful links

Hasura doc: https://hasura.io/docs/1.0/graphql/core/index.html

Hasura performance blogpost: https://github.com/hasura/graphql-engine/blob/master/architecture/live-queries.md

Graphql mesh: https://graphql-mesh.com

Quarkus: https://quarkus.io/get-started/

JHipster: https://www.jhipster.tech

Postgraphile: https://www.graphile.org/postgraphile/