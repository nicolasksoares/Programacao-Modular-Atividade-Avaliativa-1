import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String CPF;
    private ArrayList<Veiculo> veiculo = new ArrayList<>();

    public Cliente(String nome, String CPF, ArrayList<Veiculo> veiculo) {
        this.nome = nome;
        this.CPF = CPF;
        this.veiculo = veiculo;
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

    public ArrayList<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(ArrayList<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    
}
