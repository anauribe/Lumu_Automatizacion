# language: es

Característica: Inicio de sesion en la pagina SauceDemo
  Como usuario de la plataforma
  Quiero autententicarme
  Para realizar una compra

  @Escenario
  Esquema del escenario:Ana ingresa el texto para validar el numero de palabras y caracteres
    Dado '<Ana>' ingresa a la pagina WordCounter
    Cuando ella escribe el '<texto>' para validarlo
    Entonces valida que el numero de palabras correspondan a <palabras_esperadas>
    Entonces valida que el numero de caracteres correspondan a <caracteres_esperados>
    Y obtiene las palabras mas repetidas y el numero de repeticiones
    Ejemplos:
      | texto                                                                                                     | palabras_esperadas | caracteres_esperados |
      | repetida palabra repetida                                                                                 | 3                  | 25                   |
      | reto                                                                                                      | 1                  | 4                    |
      | reto automatizacion implementacion tecnica                                                                | 4                  | 42                   |
      | total total                                                                                               | 2                  | 11                   |
      | total reto automatizacion implementaciones tecnicas reto implementacion tecnica palabra hello hello hello | 12                 | 105                  |


