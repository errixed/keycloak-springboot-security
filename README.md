<div align="center">

 # [![My Skills](https://skills.thijs.gg/icons?i=java)](https://skills.thijs.gg) keycloak-springboot-security
 A sample code that shows how to secure springboot-backend application using keycloak 21.
 <br/>
<br/>
![GitHub followers](https://img.shields.io/github/followers/errixed)
![GitHub forks](https://img.shields.io/github/forks/errixed/keycloak-springboot-security)
![GitHub watchers](https://img.shields.io/github/watchers/errixed/keycloak-springboot-security)
![GitHub Repo stars](https://img.shields.io/github/stars/errixed/keycloak-springboot-security)
 
</div>

## Built with
[JDK](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html): oracle openJDK v19.0.2
<br/>
[Spring Boot](https://spring.io/projects/spring-boot): v2.7.12
<br/>
[Keycloak](https://github.com/keycloak/keycloak/releases/tag/21.1.1): v21.1.1
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
