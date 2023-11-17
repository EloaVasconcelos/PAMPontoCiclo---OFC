# PAMPontoCiclo---OFC


https://stackoverflow.com/questions/25256541/android-shakesensor-service-for-shake-detection-in-application-background
https://androiddevbr.wordpress.com/2012/11/25/acelerometro-no-android

  
# 4 BIMESTRE NOVAS MUDANÇAS - TROCA DE DUPLA 

# Nome do Aplicativo: PontoCiclo
### Participantes: Eloá Vasconcelos de Macedo e José Vinicius Valmoleda   
### Turma: 2ds (turma A)
### Disciplina: PAM (Programação de Aplicativos Mobile)
### Atividade AValiativa do 3 Bimestre (em conjunto com a disciplina de Estudos Avançados em Ciências da Natureza e suas Tecnologias)

## Conceitos que foram passados no 4 Bimestre:
>
> Sensores: 
>

## Mudanças no AAP inserindo o SENSOR na Tela de Metas 

### Sensores 
> A funcionalidade do Sensor será implementada na tela de metas onde o usuário precisa "Balançar" o dispositivo para que as metas sejam modificadas, aumentando suas metas
# Diagrama do Aplicativo 

![Diagrama](https://github.com/EloaVasconcelos/appPontoCiclo/assets/127448572/c1d363a4-c87e-4c38-becb-c5d6c0ca8eb9)

## Descrição do Diagrama 
>
### Objeto
>
> A classe Objeto possui o objeto: " nomedobjeto" onde o usuario irá digitar o nome do objeto, e seu método será: "verificar_objeto" justamente para o sistema verificar se o objeto é reciclável ou não.
>
> Obs: O Usuário pode fazer esse procedimento várias vezes.
>
> O tipo de dado escolhido para o método foi o boolean (valor booleano, verdadeiro ou falso) isso pois só 2 respostas são possíveis "Sim ou Não"
>
> Essa classe tem a ligação de dependência com a classe do usuário pois depende dele para existir/ "funcionar"
>
> Sua multiplicidade é de 1..*, podendo ter pelo menos uma instância da classe usuário associada a classe objeto ou muitas.


### Usuario: 
>
> Será o local de login, onde o usuário irá colocar seu nome e sua senha para logar em sua conta.
>  
> A classe usuário tem como objeto o nome e senha para o usuário se cadastrar, seu método é fazer login
>
> Essa classe está relacionada com as outras 3 classes (Objeto,  PontosdeColeta, Avaliacao), que são as 3 funcionalidades  que ele poderá executar/Interagir.
> 

## PontosdeColeta
>
> A classe PontosdeColeta irá registrar o Nome do Bairro e a Zona em que o usuário mora. O método dessa classe é "verificar_pontos" justamente para buscar os pontos mais próximos. 
>
> Essa classe está ligada com a classe usuário com uma associação binaria (padrão) onde o Usuario pode consultar os pontos de coleta próximo dele.
>
> A multiplicade dessa classe é 1..1, pois somente 1  instância da classe usuario pode estar relacionada a 1 instância da classe PontosdeColeta
>
### Avaliacao 
>
> A classe Avaliacao está ligada a classe do usuario e depende dele (ligados pela seta se dependência)
>
> Essa classe existe para que o usuário deixe sua opinião sobre o app
>
> Sua multiplicidade é de 1..1, somente uma instância da classe Usuario pode estar relacionado a 1 instância da classe Avaliacao

 ## Atualização do APP (Att - 14/09)

 > Foram adicionadas Intents Explicítas e Implícitas

##  Intent Explicíta
> Foram adicionadas 2 telas
> 
> 1 de login, onde o usuário irá digitar seu nomes e outras informações
> 
> ! Se o nome não for preechido a próxima tela não é chamada
> 
> Quando o usuário DIGITAR seu nome (e outros campos)
> 
> A proxima tela irá aparecer com a seguinte mensagem "Bem vindo ao Ponto Ciclo, nome do suário"
> 
> E o botão para realmente entrar no app
> 
> A Proxima tela carrega somente o nome digitado pelo usuário na EditTextNome

##  Intent Implícitas
> Na 7 (ultima tela do app)
> 
> Um botão (Abrir Mapa) foi inserido
> 
> Onde não é específicado aonde deverá abrir a localização
>

> Declaram apenas a ação
> 
> O botão levará o usuário para a "Cooperativa de Reciclagem Crescer"
> 

## VIDEO DO APLICATIVO 
>
> Video 1
https://github.com/EloaVasconcelos/PAMPontoCiclo/assets/127448572/cd72a69f-1d59-42ad-8130-7a3f62863204


> Video 2 
https://github.com/EloaVasconcelos/PAMPontoCiclo/assets/127448572/87e61d04-0aeb-4f70-a569-a6618bb5cb67
>
