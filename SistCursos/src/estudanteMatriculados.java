import java.util.Date;

public class estudanteMatriculados extends Estudante{


    public estudanteMatriculados(String nome, String matricula, Date dataNasc, String endereco, String emailInstitu) {
    super(nome, matricula,dataNasc, endereco, emailInstitu);
    this.setNome(nome);
    this.setMatricula(matricula);
    this.setDataNasc(dataNasc);
    this.setEndereco(endereco);
    this.setEmailInstitu(emailInstitu);
    }


}
