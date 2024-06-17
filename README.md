# Projeto01-One_Piece_Wiki

Este é o meu primeiro projeto pessoal em desenvolvimento e estou super empolgado! 🚀 O aplicativo possui duas telas: a tela inicial, onde você faz login, e uma segunda tela que mostra uma lista dos personagens principais de One Piece. 🌟 Este projeto é uma wiki dos personagens com informações básicas e representa a minha jornada de evolução no desenvolvimento Android. Estou muito feliz em compartilhar isso com vocês! 🏴‍☠️📱

# Capturas de Tela
## Tela de Login:
![Tela1](https://github.com/Wanderson-dev47/Projeto01-One_Piece_Wiki/assets/151024253/24b5d934-1e38-44db-ad7c-8492581c9431)

## Lista dos personagens:
![Screenshot_20240617_112105](https://github.com/Wanderson-dev47/Projeto01-One_Piece_Wiki/assets/151024253/bbd8d9d2-1226-40e7-9417-e3073458636c)


## Descrição de partes importantes do Código

### Character
O `Character` é uma data class que representa um personagem com atributos como nome, título, função e recompensa.

### Character Adapter
A classe `CharacterAdapter` é responsável por adaptar a lista de personagens para exibição em um `ListView`. Ela utiliza um layout personalizado (`item_character.xml`) para cada item da lista, preenchendo os dados de acordo com os personagens fornecidos.

### MainActivity
A `MainActivity` é a tela de login do aplicativo. Ela valida o e-mail e senha, exibindo mensagens de erro caso os dados estejam incorretos. Quando os dados estão corretos, a atividade redireciona para `TelaTwo`.

### TelaTwo
A `TelaTwo` exibe a lista de personagens em um `ListView`, utilizando o `CharacterAdapter` para renderizar cada personagem.

### activity_main.xml
O `activity_main.xml` define o layout da tela de login. Ele utiliza um `ConstraintLayout` e contém os seguintes elementos:
- Uma `ImageView` que serve como plano de fundo.
- Um `TextView` que exibe o título da aplicação.
- Dois `TextInputLayout` para entrada de e-mail e senha, com suporte para dicas e alternância de visibilidade da senha.
- Um `Button` para acionar o login, que chama a função de validação e navegação para a próxima tela.

### item_character.xml
Este layout define a aparência de cada item na lista de personagens, incluindo imagem, nome, título, função e recompensa do personagem.

### Comentários Adicionais
- O uso do `binding` facilita a interação com os elementos da interface.
- A validação de e-mail e senha na `MainActivity` garante que apenas usuários autenticados acessem a lista de personagens.
- O `CharacterAdapter` demonstra o uso de `BaseAdapter` e `ViewBinding` para otimizar o desempenho e a legibilidade do código.
