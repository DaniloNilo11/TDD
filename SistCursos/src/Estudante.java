import java.util.Date;

public class Estudante {
    private String nome;
    private String matricula;
    private Date dataNasc;
    private String endereco;
    private String emailInstitu;

    public Estudante(String nome, String matricula, Date dataNasc, String endereco, String emailInstitu) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.emailInstitu = emailInstitu;
    }

    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}
    public String getMatricula() {
        return matricula;}
    public void setMatricula(String matricula) {
        this.matricula = matricula;}
    public Date getDataNasc() {
        return dataNasc;}
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;}
    public String getEndereco() {
        return endereco;}
    public void setEndereco(String endereco) {
        this.endereco = endereco;}
    public String getEmailInstitu() {
        return emailInstitu;}
    public void setEmailInstitu(String emailInstitu) {
        this.emailInstitu = emailInstitu;}

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataNasc=" + dataNasc +
                ", endereco='" + endereco + '\'' +
                ", emailInstitu='" + emailInstitu + '\'' +
                '}';
    }
}
