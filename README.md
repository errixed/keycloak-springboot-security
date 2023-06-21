# [![My Skills](https://skills.thijs.gg/icons?i=java)](https://skills.thijs.gg) keycloak-springboot-security
A sample code that shows how to secure springboot-backend application using keycloak 21.
## Built with
<a href="https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html">JDK<a/>: oracle openJDK v19.0.2
<br/>
Spring Boot: v2.7.12
<br/>
<a href="https://github.com/keycloak/keycloak/releases/tag/21.1.1">Keycloak<a/>: v21.1.1
## Setup
### used ports
`application port: 8080`
<br/>
`keycloak port: 9090`
### changing keycloak port
```
kc.bat start-dev --http-port=9090
```
### keycloak setups
 #### realm and client
1. create a `realm`
2. create a `client`
 * `Valid redirect URIs: http://localhost:8080/*`
 * `Web origins: http://localhost:8080`
 * check the `Client authentication`
 * copy `Client secret` under the Credentials tab
#### registration setup setup
1. in the realm setting under the Login tab, check the `User registration`
#### default role on registration 
1. create a `role` (either user or admin)
2. click on the `default-roles-keycloak-authentication`
3. click on the `Assign role`
4. check the role you made
