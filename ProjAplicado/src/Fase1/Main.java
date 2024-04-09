package Fase1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Aluno {
    private int id;
    private String nome;
    private String matricula;
    private List<Turma> turmasMatriculadas = new ArrayList<>();

    // Construtor, getters e setters

    public void matricularEmTurma(Turma turma) {
        turmasMatriculadas.add(turma);
    }

    // Outros métodos conforme necessário
}

class Turma {
    private int codigoTurma;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();
    private List<RegistroDeFrequencia> registrosDeFrequencia = new ArrayList<>();

    // Construtor, getters e setters

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    // Outros métodos conforme necessário
}

class Professor {
    private String idFuncionario;
    private String nome;

    // Construtor, getters e setters

    // Outros métodos conforme necessário
}

class Nota {
    private Aluno aluno;
    private Turma turma;
    private double valor;

    // Construtor, getters e setters

    // Outros métodos conforme necessário
}

class Disciplina {
    private String codigo;
    private String nome;

    // Construtor, getters e setters

    // Outros métodos conforme necessário
}

class RegistroDeFrequencia {
    private Aluno aluno;
    private Turma turma;
    private Date data;
    private boolean presente;

    // Construtor, getters e setters

    // Outros métodos conforme necessário
}

// Exemplo de classe de execução
class SistemaGestaoAcademica {
    public static void main(String[] args) {
        // Aqui, você pode criar instâncias de suas classes e demonstrar como elas interagem
        // Por exemplo, criar alunos, professores, disciplinas, turmas, registrar alunos em turmas, etc.
    }
}