public class Mecanico {
    private String nome;
    private String CPF;
    private String especialidade;
    private String telefone;
    private Box box;

    public Mecanico(String nome, String CPF, String especialidade, String telefone, Box box) {
        this.nome = nome;
        this.CPF = CPF;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.box = box;
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

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

        public Box getBox() {
        return box;
    }

    public void setTelefone(Box box) {
        this.box = box;
    }



}
