# Sistema de Gerenciamento de Trabalhadores

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Licença](https://img.shields.io/badge/Licen%C3%A7a-MIT-green)

Aplicação Java para gerenciar contratos de trabalhadores e calcular rendimentos mensais baseados em contratos por hora.

## 📌 Funcionalidades

- **Gestão de Trabalhadores**:
  - Cadastrar trabalhadores com nome, nível, salário base e departamento
  - Três níveis hierárquicos: JUNIOR, PLENO, SÊNIOR
- **Sistema de Contratos**:
  - Adicionar múltiplos contratos por hora aos trabalhadores
  - Cada contrato inclui data, valor por hora e horas trabalhadas
- **Cálculo de Rendimentos**:
  - Calcular rendimento mensal incluindo salário base e valores dos contratos
  - Filtrar contratos por mês e ano específicos

## 🛠️ Visão Geral das Classes

| Classe | Descrição |
|--------|-----------|
| `Department` | Representa um departamento com nome |
| `HourContract` | Armazena detalhes dos contratos (data, valor/hora, horas) |
| `Worker` | Classe principal com gestão de contratos |
| `WorkerLevel` | Enum para níveis hierárquicos dos trabalhadores |
| `Main` | Interface de console para interação com usuário |

## 🚀 Começando

### Pré-requisitos
- Java JDK 17 ou superior
- Maven (opcional)
  
##📝 Fluxo de Exemplo:
Informe o nome do departamento: Engenharia
Informe os dados do trabalhador:
Nome: João Silva
Nível (1 - JUNIOR / 2 - MID_LEVEL / 3 - SENIOR): 2
Salário base: 4000.00
Quantos contratos para este trabalhador? 2
Informe os dados do contrato #1:
Data (DD/MM/AAAA):10/06/2023
Valor por hora: 60.00
Duração (horas): 8
Informe os dados do contrato #2:
Data (DD/MM/AAAA):20/06/2023
Valor por hora: 70.00
Duração (horas): 5
Informe mês e ano para calcular rendimento (MM/AAAA):
Mês: 06
Ano: 2023
Nome: João Silva
Departamento: Engenharia
Rendimento para 6/2023: 4860.00

Department ────┐
               │
HourContract ──┼── Worker
               │
WorkerLevel ───┘

📜 Licença
Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para detalhes.

🤝 Como Contribuir
Contribuições são bem-vindas! Abra uma issue ou envie um pull request.

📧 Contato
Para dúvidas ou sugestões, entre em contato: yurisousaalmeida2004@gmail.com
