FROM node:latest
RUN yarn add graphql @graphql-mesh/runtime @graphql-mesh/cli
RUN yarn add graphql @graphql-mesh/json-schema
# COPY meshrc and request/response json sample files
COPY .meshrc.yml /
COPY breweries*.json /
CMD yarn graphql-mesh serve
