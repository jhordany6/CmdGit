Feature: Kiire

  @ProductoMiniDatafono
  Scenario Outline: Validacion del producto mini datafono y su interna
    Given El Usuario abre la aplicacion y visualiza el markeplace
    And   El usuario procede a loguearse con el <usuario> y <contrasena>
    When  Presencia el producto del Mini datafono y lo selecciona
    Then  Se abre la interna del Mini datafono y validamos los datos que se visualizan

    Examples:
      | usuario             | contrasena  |
      | "jhordany6@gmail.com" | "Pragma2022+" |

  @ProductoMiniPro
  Scenario Outline: Validacion del producto mini pro y su interna
    Given El Usuario abre la aplicacion y visualiza el markeplace
    And   El usuario procede a loguearse con el <usuario> y <contrasena>
    When  Presencia el producto del Mini pro y lo selecciona
    Then  Se abre la interna del Mini pro y validamos los datos que se visualizan

    Examples:
      | usuario             | contrasena  |
      | "jhordany6@gmail.com" | "Pragma2022+" |

  @ProductoLinkdepagos
  Scenario: Validacion del producto link de pagos y su interna
    Given El Usuario abre la aplicacion y visualiza el markeplace
    When  Presencia el producto del Link de pagos y lo selecciona
    Then  Se abre la interna del Link de pagos y validamos los datos que se visualizan

  @ProductoCodigoQr
  Scenario: Validacion del producto Codigo QR y su interna
    Given El Usuario abre la aplicacion y visualiza el markeplace
    When  Presencia el producto del Codigo QR y lo selecciona
    Then  Se abre la interna del Codigo QR y validamos los datos que se visualizan

  @CarritoVacio
  Scenario Outline: Validacion de la vista del carrito de compras sin productos agregados
    Given El Usuario abre la aplicacion y visualiza el markeplace
    And   El usuario procede a loguearse con el <usuario> y <contrasena>
    When  Se le de clic al icono del carrito se debe redireccionar a la vista de carrito vacio
    Then  Se valida la vista del carrito vacio

    Examples:
      | usuario             | contrasena  |
      | "jhordany6@gmail.com" | "Pragma2022+" |

  @Registro
  Scenario Outline: Validacion de la vista del registro del usuario
    Given El Usuario abre la aplicacion y visualiza el markeplace
    When  Le de clic al boton de crear cuenta debe redireccionar a la vista de registro
    Then  Se valida la vista de registro y se llena la data <usuario>, <celular> y <contrasena>

    Examples:
      | usuario               |celular       | contrasena  |
      | "jhordany6@gmail.com" | "323288" |"Pragma2022+"|
      | "jhordany6gmail.com" | "32328" |"Pragma2022"|