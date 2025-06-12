### Workflow
Workflow é um fluxo de automação que define quando e como um conjunto de tarefas (jobs) deve ser executado. 
Ele é descrito em um arquivo YML que fica armazenado na pasta .github/workflows/ do repositório. 
Neste projeto, os arquivos ci.yml e hello.yml são exemplos de workflows, responsáveis por orquestrar etapas como build, testes e deploy.

### Action
Action representa uma unidade reutilizável dentro de um workflow. 
Ela funciona como um bloco que executa uma tarefa específica, como realizar o checkout do código, configurar o ambiente Java ou empacotar um artefato. 
As actions podem ser desenvolvidas pela comunidade, pela própria GitHub ou criadas sob medida para necessidades específicas. 
Dentro dos workflows, as actions são chamadas utilizando a instrução uses:, que referencia a ação desejada e permite sua execução como parte do processo de automação.


### Como uma Action é estruturada internamente?

Uma action é composta basicamente pelos seguintes itens:
- Um diretório próprio contendo:
  - O arquivo principal action.yml ou action.yaml (obrigatório). 
  - Código-fonte da ação (pode ser JavaScript, Docker ou outro ambiente). 
  - Outros arquivos auxiliares, se necessário.


### Papel do arquivo action.yml

O arquivo action.yml é o manifesto da action. Nele estão definidos:
- Nome da Action 
- Descrição 
- Entradas (inputs): parâmetros que o usuário pode fornecer. 
- Saídas (outputs): valores que podem ser usados posteriormente no workflow. 
- Ambiente: define se roda em Docker, Node.js ou outro ambiente. 
- Comandos executados: especifica o script ou arquivo principal que será executado.
