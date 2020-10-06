Feature: Api Swagger Ui

  @Token @Swagger
  Scenario Outline: obtengo el token
    When Realizo una peticion <endpoint> al <entity> con la siguiente <request>
    Then obtengo el <statusCode>
    And guardo el token generado

    Examples:
      | endpoint | request             | statusCode | entity |
      | POST     | request/createToken | 200        | TOKEN  |

  @User @Swagger
  Scenario Outline: obtengo mi informacion de usuario
    When Realizo una peticion <endpoint> al <entity> con la siguiente <request>
    Then obtengo el <statusCode>

    Examples:
      | endpoint | request        | statusCode | entity |
      | GET      | request/myUser | 200        | MYUSER |