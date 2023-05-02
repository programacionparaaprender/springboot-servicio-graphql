# microservicio de graphql

### repositorio
https://github.com/programacionparaaprender/springboot-servicio-graphql

# curso
https://www.udemy.com/course/microservicios-con-spring-boot-y-spring-cloud/

### curso graphql
https://udemy.com/course/graphql-springboot/learn/lecture/17566752#overview

# agregar loggin
https://refactorizando.com/uso-logging-spring-boot/

###
http://localhost:8300/graphiql?query=%7B%0A%20%20hello%2C%0A%20%20soma(a%3A1%2C%20b%3A2)%0A%7D
{
  hello,
  soma(a:1, b:2)
}

###
http://localhost:8300/graphiql?query=%7B%0A%20%20hello%2C%0A%20%20soma(a%3A1%2C%20b%3A2)%2C%0A%20%20productos%20%7B%0A%20%20%20%20id%2C%0A%20%20%20%20nombre%2C%20%0A%20%20%20%20precio%0A%20%20%7D%0A%7D
{
  hello,
  soma(a:1, b:2),
  productos {
    id,
    nombre, 
    precio
  }
}