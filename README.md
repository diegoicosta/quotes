# Quotes
Kotlin quotes app

## Idéia Inicial 
Usuário escolhe o quanto ruim esta seu "humor" : 

> "Odeio me chefe" 

> "Minha vida tá uma merda" 

> "Depressão pós-férias" 

Esta App mapeia para uma das categorais que a API que usamos disponibiliza (ver abaixo) e mostra a frase que vai mudar a vida do sujeito (ou não).


## Source API 

https://theysaidso.com/api/

### Basic

curl -v  -i -X GET http://quotes.rest/qod/categories.json

curl -v  -i -X GET http://quotes.rest/qod.json?category=management


