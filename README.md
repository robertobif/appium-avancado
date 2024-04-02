# Projeto de Automação E2E com Appium

Este é um projeto de automação end-to-end (E2E) utilizando Appium, desenvolvido como parte do curso avançado oferecido pela QAZANDO.

O objetivo deste projeto é automatizar os testes de uma aplicação móvel, garantindo a qualidade e confiabilidade do software através da execução de cenários de teste em um ambiente real ou emulador.

## Requisitos
Antes de executar os testes, certifique-se de que o seguinte software está instalado em sua máquina:

- Appium
- Node.js
- JDK (Java Development Kit)
- Android SDK (caso esteja testando em dispositivos Android)
- Xcode (caso esteja testando em dispositivos iOS)
- IntelliJ (IDE)

Além disso, é necessário baixar o código-fonte do aplicativo de teste e suas dependências. Você pode encontrar o aplicativo de exemplo e as instruções de instalação no seguinte repositório: Appium Avançado

## Configuração

Clone este repositório em sua máquina local:

<code>git clone https://github.com/seu-usuario/nome-do-repositorio.git</code>

Instale as dependências do projeto:

<code>npm install</code>

Certifique-se de ter configurado corretamente o ambiente para executar os testes. Isso inclui iniciar o servidor Appium, configurar os dispositivos/emuladores apropriados, etc.

Executando os Testes

Para executar os testes, utilize o seguinte comando:

<code>npm test</code>

Este comando iniciará a execução dos testes definidos no diretório tests/. Certifique-se de que os dispositivos/emuladores estejam disponíveis e corretamente configurados.

## Estrutura do Projeto
config/: Contém arquivos de configuração para o ambiente de teste.
helpers/: Funções auxiliares para os testes.
pages/: Páginas do aplicativo, contendo os elementos e a lógica de interação.
tests/: Testes automatizados escritos utilizando o framework de sua escolha (por exemplo, Mocha, Jasmine, etc.).
utils/: Utilitários para auxiliar na execução dos testes.
Contribuindo
Se você encontrar algum problema ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request. Sua contribuição é sempre bem-vinda!

## Autor
Roberto Bif.
