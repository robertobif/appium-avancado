$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pedido.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#language: pt"
    }
  ],
  "line": 5,
  "name": "Realizar Pedido no App",
  "description": "",
  "id": "realizar-pedido-no-app",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@pedido"
    }
  ]
});
formatter.before({
  "duration": 13358323682,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Pedido com sucesso",
  "description": "",
  "id": "realizar-pedido-no-app;pedido-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 7,
      "name": "@pedido-sucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que eu realize login com sucesso",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu adicione um produto no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "eu preencher as informações do pedido",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "devo ser redirecionado para a tela de confirmação de pedido",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.que_eu_realize_login_com_sucesso()"
});
formatter.result({
  "duration": 11579339344,
  "status": "passed"
});
formatter.match({
  "location": "PedidoSteps.eu_adicione_um_produto_no_carrinho()"
});
formatter.result({
  "duration": 12582433430,
  "status": "passed"
});
formatter.match({
  "location": "PedidoSteps.eu_preencher_as_informações_do_pedido()"
});
formatter.result({
  "duration": 4267918962,
  "status": "passed"
});
formatter.match({
  "location": "PedidoSteps.devo_ser_redirecionado_para_a_tela_de_confirmação_do_pedido()"
});
formatter.result({
  "duration": 710303996,
  "status": "passed"
});
});