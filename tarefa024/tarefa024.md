# Tarefa 024 - Configuração de software em tempo de execução - 10/11/2021

1. Considere o título desta tarefa. Para compreendê-lo, solicito que seja efetuada uma pesquisa a respeito de qualquer um dos seguintes temas:

  1.1 Profile.

  1.2 IoC Inversão de Controle (Inversion of Control).

  1.3 Injeção de Dependências.

2. Elaborar um resumo descritivo com o resultado obtido na pesquisa do tema selecionado.


#### Profile

O profiling é usado para descrever o processo de medição do tempo de execução de métodos, para que assim possamos localizar e corrigir gargalos de desempenho. No contexto do Java esse termo é expandido ainda mais o que inclui a coleta de várias métricas e permite a depuração de threads e objetos em tempo de execução.

Existem diversas razões para utilizarmos os profilers nas aplicações Java, entre eles, para investigarmos o uso do heap e a frequência que está ocorrendo a coleta de lixo, pesquisar a alocação de objetos e referências para encontrar e corrigir vazamentos de memória, investigar a alocação e a sincronização de threads para encontrar problemas de bloqueio e de concorrência no acesso a dados, identificar métodos custosos, ou investigar uma aplicação em tempo de execução para que possamos entender a sua estrutura.

O profiling ocorre normalmente após a fase de desenvolvimento e os principais objetivos da sua utilização é melhorar o desempenho das aplicações, corrigir bugs de difícil localização e entender o que está acontecendo na aplicação enquanto ela executa.




#### Inversão de Controle vs Injeção de Dependência 

De acordo com o artigo escrito por Martin Fowler , inversão de controle é o princípio em que o fluxo de controle de um programa é invertido: em vez de o programador controlar o fluxo de um programa, as fontes externas (estrutura, serviços, outros componentes) assumem o controle de isto. É como se conectássemos algo a outra coisa. Ele mencionou um exemplo sobre o EJB 2.0:

Por exemplo, a interface Session Bean define ejbRemove, ejbPassivate (armazenado no armazenamento secundário) e ejbActivate (restaurado do estado passivo). Você não consegue controlar quando esses métodos são chamados, exatamente o que eles fazem. O contêiner nos chama, não chamamos.

Isso leva à diferença entre estrutura e biblioteca:

Inversão de controle é uma parte essencial do que diferencia uma estrutura de uma biblioteca. Uma biblioteca é essencialmente um conjunto de funções que você pode chamar, atualmente organizado em classes. Cada chamada realiza algum trabalho e retorna o controle ao cliente.

Eu acho que, do ponto de vista de que DI é COI, significa que a dependência de um objeto é invertida: em vez de controlar suas próprias dependências, ciclo de vida ... outra coisa faz isso por você. Mas, como você me contou sobre o DI pelas mãos, ele não é necessariamente COI. Ainda podemos ter DI e nenhum COI.

No entanto, neste documento (da pococápsula, outra estrutura do IOC para C / C ++), sugere que, devido ao IOC e DI, os contêineres do IOC e as estruturas DI sejam muito mais superiores ao J2EE, pois o J2EE combina o código da estrutura nos componentes , portanto, não o torna Objeto Java / C ++ Antigo Simples (POJO / POCO).

Inversão de contêineres de controle que não sejam o padrão de injeção de dependência (link Archive)

Leitura adicional para entender qual é o problema da Estrutura de Desenvolvimento Baseada em Componentes antiga, que leva ao segundo artigo acima: Por que e o que é Inversão de Controle (link Archive)

