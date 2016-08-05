# Kotlin Quotes
Exemplo de aṕlicação REST escrita em kotlin utlizando Spring-Boot

Nada mais é que um "wrapper" em uma API aberta de citações [fraze.it](http://fraze.it/api.jsp)

## Usando
1. Após clone, compile via maven
    
    `$ mvn clean package`

2. Execute a aplicação

    `java -jar target/kotlin-quotes-0.0.1.jar`

3. Teste se aplicação esta up 

   [http://localhost:8080/hello](http://localhost:8080/hello)
   
4. Para ver serviço de citações funcionando

   `http://localhost:8080/quote/[categoria]/[termo]`

   [http://localhost:8080/quote/art/rock](http://localhost:8080/quote/art/rock)




