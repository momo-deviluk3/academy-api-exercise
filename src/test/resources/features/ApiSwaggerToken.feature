Feature: Api Swagger Ui

  @Token
  Scenario Outline: obtengo el token
    When Realizo una peticion <endpoint> al <entity> con la siguiente <request>
    Then obtengo el '<statusCode>'
    And guardo el token generado

    Examples:
      | endpoint | request             | statusCode | entity |
      | POST     | request/createToken | 200        | TOKEN  |