# Tarefa 025 - Técnicas de construção baseadas em estado e tabelas - 10/11/2021.

1. Considere o título desta tarefa. Para compreendê-lo, solicito que seja efetuada uma pesquisa a respeito do padrão de projeto _State_, considerando sua aplicabilidade não somente ao escopo de um ou outro objeto do sistema, mas ao próprio sistema:
2. Elaborar um resumo descritivo do resultado da pesquisa.

O State é um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. Parece como se o objeto mudasse de classe. O padrão State é intimamente relacionado com o conceito de uma Máquina de Estado Finito.
A ideia principal é que, em qualquer dado momento, há um número finito de estados que um programa possa estar. Dentro de qualquer estado único, o programa se comporta de forma diferente, e o programa pode ser trocado de um estado para outro instantaneamente. Contudo, dependendo do estado atual, o programa pode ou não trocar para outros estados. Essas regras de troca, chamadas transições, também são finitas e pré determinadas.

Você também pode aplicar essa abordagem para objetos. Imagine que nós temos uma classe Documento. Um documento pode estar em um de três estados: Rascunho, Moderação e Publicado. O método publicar do documento funciona um pouco diferente em cada estado:

    - No Rascunho, ele move o documento para a moderação.
    - Na Moderação ele torna o documento público, mas apenas se o usuário atual é um administrador.
    - No Publicado ele não faz nada.
    
Máquinas de estado são geralmente implementadas com muitos operadores de condicionais (if ou switch) que selecionam o comportamento apropriado dependendo do estado atual do objeto. Geralmente esse “estado” é apenas um conjunto de valores dos campos do objeto. Mesmo se você nunca ouviu falar sobre máquinas de estado finito antes, você provavelmente já implementou um estado ao menos uma vez.     

A maior fraqueza de uma máquina de estados baseada em condicionais se revela quando começamos a adicionar mais e mais estados e comportamentos baseados em estados para a classe Documento. A maioria dos métodos irá conter condicionais monstruosas que selecionam o comportamento apropriado de um método de acordo com o estado atual. Um código como esse é muito difícil de se fazer manutenção porque qualquer mudança na lógica de transição pode necessitar de mudanças de condicionais de estado em todos os métodos.

O problema tende a ficar maior a medida que o projeto evolui. É muito difícil prever todos os possíveis estados e transições no estágio inicial de projeto. Portanto, uma máquina de estados enxuta, construída com um número limitado de condicionais pode se tornar uma massa inchada e disforme com o tempo.

O padrão State sugere que você crie novas classes para todos os estados possíveis de um objeto e extraia todos os comportamentos específicos de estados para dentro dessas classes.

Ao invés de implementar todos os comportamentos por conta própria, o objeto original, chamado contexto, armazena uma referência para um dos objetos de estado que representa seu estado atual, e delega todo o trabalho relacionado aos estados para aquele objeto.

Para fazer a transição do contexto para outro estado, substitua o objeto do estado ativo por outro objeto que represente o novo estado. Isso é possível somente se todas as classes de estado seguirem a mesma interface e o próprio contexto funcione com esses objetos através daquela interface.

Essa estrutura pode ser parecida com o padrão Strategy, mas há uma diferença chave. No padrão State, os estados em particular podem estar cientes de cada um e iniciar transições de um estado para outro, enquanto que estratégias quase nunca sabem sobre as outras estratégias.

Utilize o padrão State quando você tem um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o número de estados é enorme, e quando o código estado específico muda com frequência.

O padrão sugere que você extraia todo o código estado específico para um conjunto de classes distintas. Como resultado, você pode adicionar novos estados ou mudar os existentes independentemente uns dos outros, reduzindo o custo da manutenção.

Utilize o padrão quando você tem uma classe populada com condicionais gigantes que alteram como a classe se comporta de acordo com os valores atuais dos campos da classe.

O padrão State permite que você extraia ramificações dessas condicionais para dentro de métodos de classes correspondentes. Ao fazer isso, você também limpa para fora da classe principal os campos temporários e os métodos auxiliares envolvidos no código estado específico.

Utilize o State quando você tem muito código duplicado em muitos estados parecidos e transições de uma máquina de estado baseada em condições.

O padrão State permite que você componha hierarquias de classes estado e reduza a duplicação ao extrair código comum para dentro de classes abstratas base.





