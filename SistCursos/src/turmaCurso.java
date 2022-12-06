import java.util.Date;

public class turmaCurso {
    private String local;
    private int vagas;
    private int vagasDisponiveis;
    private Date inicioAulas;
    private Date inicioMatriculas;
    private Date fimMatriculas;

    public turmaCurso(String local, int vagas, int vagasDisponiveis, Date inicioAulas, Date inicioMatriculas, Date fimMatriculas) {
        this.local = local;
        this.vagas = vagas;
        this.vagasDisponiveis = vagasDisponiveis;
        this.inicioAulas = inicioAulas;
        this.inicioMatriculas = inicioMatriculas;
        this.fimMatriculas = fimMatriculas;
    }

    public String getLocal() {
        return local;}
    public void setLocal(String local) {
        this.local = local;}
    public int getVagas() {
        return vagas;}
    public void setVagas(int vagas) {
        this.vagas = vagas;}
    public int getVagasDisponiveis() {
        return vagasDisponiveis;}
    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;}
    public Date getInicioAulas() {
        return inicioAulas;}
    public void setInicioAulas(Date inicioAulas) {
        this.inicioAulas = inicioAulas;}
    public Date getInicioMatriculas() {
        return inicioMatriculas;}
    public void setInicioMatriculas(Date inicioMatriculas) {
        this.inicioMatriculas = inicioMatriculas;}
    public Date getFimMatriculas() {
        return fimMatriculas;}
    public void setFimMatriculas(Date fimMatriculas) {
        this.fimMatriculas = fimMatriculas;}

    @Override
    public String toString() {
        return "turmaCurso{" +
                "local='" + local + '\'' +
                ", vagas=" + vagas +
                ", vagasDisponiveis=" + vagasDisponiveis +
                ", inicioAulas=" + inicioAulas +
                ", inicioMatriculas=" + inicioMatriculas +
                ", fimMatriculas=" + fimMatriculas +
                '}';
    }
}
