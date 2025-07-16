# Sistema de Gerenciamento de Trabalhadores

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Licença](https://img.shields.io/badge/Licen%C3%A7a-MIT-green)

# Worker Contracts Manager 🧾💼

Este é um projeto Java simples que simula o registro de um trabalhador, seus contratos de trabalho por hora e calcula sua renda em um mês/ano específico.

## 🚀 Objetivo

Permitir que o usuário:

- Cadastre um departamento
- Registre os dados de um trabalhador (nome, nível e salário base)
- Registre múltiplos contratos com valor por hora e duração
- Calcule a renda total do trabalhador em um determinado mês/ano

## 🧱 Estrutura do Projeto

- `Main.java`: ponto de entrada da aplicação, responsável pela interação com o usuário via terminal.
- `Worker.java`: classe que representa um trabalhador.
- `WorkerLevel.java`: enum que representa o nível do trabalhador (`JUNIOR`, `MID_LEVEL`, `SENIOR`).
- `Department.java`: representa o departamento em que o trabalhador está alocado.
- `HourContract.java`: representa um contrato por hora (data, valor/hora e duração).

## 📥 Entrada Esperada (via terminal)

1. Nome do departamento
2. Dados do trabalhador:
   - Nome
   - Nível (escolhido por código: `1 - JUNIOR`, `2 - MID_LEVEL`, `3 - SENIOR`)
   - Salário base
3. Número de contratos
4. Para cada contrato:
   - Data (formato `dd/MM/yyyy`)
   - Valor por hora
   - Duração em horas
5. Mês e ano (formato `MM e YYYY`) para calcular a renda total

## 📤 Exemplo de Uso

```text
Enter department name:
TI
Enter worker data:
Name: João
Level (1 - JUNIOR / 2 - MID_LEVEL / 3 - SENIOR): 2
Base salary: 3000.00
How many contracts to this worker? 2
Enter contract #1 data:
Date (DD/MM/YYYY): 15/06/2024
Value per hour: 50.00
Duration(hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 25/06/2024
Value per hour: 60.00
Duration(hours): 10
Enter month and year to calculate income(MM/YYYY):
Month: 6
Year: 2024
Name: João
Department: TI
Income for 6/2024: 4300.0

🤝 Como Contribuir
Contribuições são bem-vindas! Abra uma issue ou envie um pull request.

📧 Contato
Para dúvidas ou sugestões, entre em contato: yurisousaalmeida2004@gmail.com
