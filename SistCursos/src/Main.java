import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int op = 0;
    Scanner s = new Scanner(System.in);
    do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da operação:"
                +"\n1 - Cadastrar Estudante"
                +"\n2 - Cadastrar curso"
                +"\n3 - Cadastrar turmas de um Curso"));
        switch (op)
        {
            //cadastro aluno
            case 1:
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            String matricula = JOptionPane.showInputDialog("Digite a matricula: ");
            String endereco = JOptionPane.showInputDialog("Digite o endereco: ");
            String email = JOptionPane.showInputDialog("Digite o email: ");
            JOptionPane.showMessageDialog(null, "Aluno cadastrado:"+ "\n-Nome:"+nome + "\n-Matricula:"+matricula + "\n-Endereço:"+endereco + "\n-E-mail:"+email);
            break;

            //cadastroCurso
            case 2:
            String nomeCurso = JOptionPane.showInputDialog("Digite o nome do Curso: ");
            String cargaHoraria = JOptionPane.showInputDialog("Digite a carga Horaria do curso: ");
            String descricao = JOptionPane.showInputDialog("Fale um pouco sobre o curso: ");
            JOptionPane.showMessageDialog(null,"Curso cadastrado"+"\n-Curso:"+nomeCurso+ "\n-Carga Horaria:"+ cargaHoraria +"Horas" + "\n-Sobre o Curso:"+ descricao);

            //cadastroturma
            case 3:
            String local = JOptionPane.showInputDialog("Digite o local do Curso:");
            int vagas= Integer.parseInt(JOptionPane.showInputDialog("Informe quantas vagas tem no curso:"));
            int vagasDisp= Integer.parseInt(JOptionPane.showInputDialog("Informe quantas vagas tem disponiveis no momento:"));
            String inicioAulas = JOptionPane.showInputDialog("Informe a data de inicio das aulas:");
            String fimAulas= JOptionPane.showInputDialog("Informe a data do fim das aulas:");
            String inicioMatric= JOptionPane.showInputDialog("Informe a data de inicio das matriculas:");
            String fimMatric= JOptionPane.showInputDialog("Informe a data final das matriculas:");
            JOptionPane.showMessageDialog(null,"Turma cadastrada"+"\n-Local do Curso"+local+"\n-Vagas do curso:"+vagas+" Vagas disponiveis:"+vagasDisp +"\n-Data de inicio das aulas:"+inicioAulas+" Data fim das aulas:"+fimAulas +"\n-Data de inicio das matriculas:"+inicioMatric+" Data do fim das matriculas:"+fimMatric );

            case 4:


        }
    JOptionPane.showMessageDialog(null, "Saindo do Sistema");

    }while (op!= 0);


    }
}