import java.util.ArrayList;

public class Mecanico {
    private String nome;
    private String CPF;
    private String especialidade;
    private String telefone;
    ArrayList <Box> box = new ArrayList<>();

    public Mecanico(String nome, String cPF, String especialidade, String telefone, Box box) {
        this.nome = nome;
        CPF = cPF;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
