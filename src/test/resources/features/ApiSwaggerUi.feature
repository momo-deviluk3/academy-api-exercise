Feature: Api Swagger Ui

  @User @Swagger
  Scenario Outline: obtengo mi informacion de usuario
    When Hago una peticion <peticion> al <entity> con la siguiente <request>
    Then obtengo el status code '<statusCode>'

    Examples:
      | peticion | request        | statusCode | entity |
      | GET      | request/myUser | 200        | MYUSER |
