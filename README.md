[![CI](https://github.com/albertocesario-infnet/infnet-2025-dr3tp02/actions/workflows/ci.yml/badge.svg)](https://github.com/albertocesario-infnet/infnet-2025-dr3tp02/actions/workflows/ci.yml)

## TP03 - Pipeline CI/CD e DevOp

Este projeto demonstra a utilização de workflows no GitHub Actions, incluindo o uso de runner auto-hospedado, variáveis, secrets, ambientes de deploy, permissões personalizadas e integração com uma nova funcionalidade de API.

---

## Etapa 1 – Configuração de Runner Auto-Hospedado
### self-hosted-runner.yml

- **Descrição**: Instalado o GitHub Actions Runner em uma máquina local ou de nuvem. O runner foi registrado no repositório e executou um workflow com `runs-on: self-hosted`. 
- Comando de `uname -a` foi utilizado para validar a execução.
- **Como reexecutar**:
    - Certifique-se de que o runner esteja ativo e online.
    - Execute o workflow manualmente ou por push.
    - Verifique na aba **Actions** que o job foi executado no runner `self-hosted`.


## Etapa 2 – Uso de Variáveis e Secrets
### vars-secrets.yml

- **Descrição**: Criadas duas variáveis de ambiente (`APP_MODE`, `SUPPORT_EMAIL`) e um segredo (`PROD_TOKEN`).
- **Como reexecutar**:
    - Acesse **Settings > Secrets and variables > Actions**.
    - Verifique ou altere os valores.
    - Execute o workflow e confira a leitura correta nos logs.


## Etapa 3 – Contextos e Escopos de Variáveis
### env-context-demo.yml

- **Descrição**: Criado o arquivo `env-context-demo.yml` com exibição de:
    - Contextos: `${{ github.actor }}`, `${{ runner.os }}`
    - Variável customizada: `STAGE=test`
    - Variáveis em escopos diferentes (workflow, job, step) para demonstrar sobreposição e precedência.
- **Como reexecutar**:
    - Execute o workflow manualmente.
    - Observe os valores nos logs e compare o comportamento por escopo.

    
## Etapa 4 – Controle de Permissões e GITHUB_TOKEN
### check-variavel-demo.yml

- **Descrição**: Workflow modificado para conceder permissões específicas ao `GITHUB_TOKEN` (`contents: write`, `issues: write`). 
- Criado um passo que gera automaticamente uma issue caso uma variável esteja ausente, simulando um erro de deploy.
- **Como reexecutar**:
    - Verifique as permissões no início do YAML (`permissions:`).
    - Execute o workflow sem definir a variável esperada.
    - Confirme a criação automática da issue no repositório.


## Etapa 5 – Ambientes de Deploy: Dev e Prod
### deploy-dev.yml / deploy-prod.yml

- **Descrição**:
    - Criado o ambiente `dev`: deploy automático em push na branch `dev`, com variáveis específicas.
    - Criado o ambiente `prod`: deploy com revisão manual em push na branch `main`, com secrets protegidos.
    - Pipeline atualizado para respeitar os ambientes configurados.
- **Como reexecutar**:
    - Vá em **Settings > Environments** e revise as configurações.
    - Faça push nas branches `dev` ou `main`.
    - Acompanhe a execução condicionada dos workflows conforme o ambiente e branch.


## Etapa 6 – Nova Funcionalidade: GET /sqrt

- **Descrição**: Implementado o endpoint `GET /sqrt?x=16`, que retorna a raiz quadrada do número informado. 
- Função adicionada na classe de serviço. Testes automatizados atualizados. Pipeline de integração validado.