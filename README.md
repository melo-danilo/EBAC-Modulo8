# EBAC-Modulo8
## Módulo 8: Exercício
[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Adicione os seguintes elementos ao seu layout:
- Adicione um EditText aonde o usuário poderá digitar o seu nome
- Adicione um Button com o label "Trocar Imagem"
- Adicione um TextView aonde vamos exibir o nome que o usuário informou no EditText mais o número de vezes
  que ele clicou no botão
- Adicione uma propriedade id no component de layout principal da aplicação

Vamos modificar a Activity para acrescentar as
seguintes funcionalidades:
- Criar uma propriedade do tipo int numClicks
- Escutar os eventos de click do botão
- Cada vez que o usuário clicar no botão vamos fazer o
  seguinte:
  -- Incrementar em um o numClicks
  -- Setar uma nova imagem de fundo para o layout principal
  -- Modificar o valor do TextView para mostrar o nome atual
  do usuário e o número de clicks no botão

Esses são os requisitos que foram solicitados

[Impedimento] - O site que foi mencionado, não gerou as imagens, as imagens que eu gerei em outro
site ficou ruim

    Para simular a questão do background, Criei cores [20 Cores], no resource Color.
    Crei um Enum class, para controlar o estado do background e um singleton para controlar o Enum.
