[![CI](https://github.com/albertocesario-infnet/infnet-2025-dr3tp02/actions/workflows/ci.yml/badge.svg)](https://github.com/albertocesario-infnet/infnet-2025-dr3tp02/actions/workflows/ci.yml)

## TP02 - Pipeline CI/CD e DevOps

### Projeto para testar funcionalidades de CI/CD do github 

### Comandos
```
echo "# infnet-2025-dr3tp02" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:albertocesario-infnet/infnet-2025-dr3tp02.git
git push -u origin main
```

### Workflows
- ci.yml
- hello.yml
- lint-and-test.yml

### Teste de simulação de erro

Durante a atividade de depuração do pipeline, foi provocado um erro proposital no job build utilizando o comando build packagee. 
Após realizar o push, o pipeline falhou como esperado.

Para identificar o erro, acessei a aba Actions do GitHub, selecionei a execução que falhou e naveguei até os logs do job com status vermelho. 
Nos logs, foi possível visualizar que o erro ocorreu no step chamado “Gerar .jar com Maven”, que retornava a mensagem:
Unknown lifecycle phase "packageee".

### Observações sobre Execuções do Pipeline

Na execução automática, não há escolha dos parâmetros — ela segue o fluxo completo predefinido. 
Na execução manual, há controle sobre quais etapas executar, tornando o processo mais ágil e adaptável para situações específicas, como testar apenas uma parte do projeto.

