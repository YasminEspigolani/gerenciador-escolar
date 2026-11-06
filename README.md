# Gerenciador Escolar - Java (POO) 🏫☕

Um projeto educacional desenvolvido em Java para simular as operações e a estrutura de uma instituição de ensino. O sistema utiliza os pilares da Programação Orientada a Objetos (POO) para modelar e interagir com as principais entidades do ambiente acadêmico.

## 🚀 Funcionalidades e Modelagem

O projeto é dividido em diferentes classes para representar o ecossistema escolar:
- **Alunos:** Gerencia dados como nome, idade, matrícula, período de estudo e notas, com métodos para simular ações como estudar e ser avaliado.
- **Professores:** Armazena informações de cadastro e disciplina lecionada, incluindo métodos de interação em sala de aula.
- **Disciplinas:** Modela a grade curricular, carga horária e temas abordados.
- **Turmas:** Controla a alocação de turmas, turnos (matutino, vespertino) e salas de aula.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem base do projeto.
- **Paradigma POO**: Utilização intensiva de classes, objetos, atributos e métodos.

## 📁 Estrutura de Pacotes

O código está organizado seguindo as convenções do Java para separação de responsabilidades:
- `br.com.escola.main`: Contém a classe principal (`Main.java`) responsável por instanciar os objetos e executar a aplicação.
- `br.com.escola.sistema`: Contém as classes de modelo (`Alunos.java`, `Professores.java`, `Disciplinas.java`, `Turmas.java`).

## ▶️ Como executar

1. Clone este repositório:
   ```bash
   git clone [https://github.com/YasminEspigolani/GERENCIADOR-ESCOLA.git](https://github.com/YasminEspigolani/GERENCIADOR-ESCOLA.git)
   
2. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ IDEA, VS Code) ou navegue até a pasta src via terminal.
3. Compile as classes respeitando a estrutura de pacotes:
   ```bash
   javac br/com/escola/sistema/*.java
   javac br/com/escola/main/Main.java

4. Execute a classe principal:
    ```bash
    java br.com.escola.main.Main
