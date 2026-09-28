import java.time.LocalDateTime;

public class Servico {
    private String nome;
    private LocalDateTime tempoEstimado;
    private double valorDoServico;
    private String categoria;

    public Servico(String categoria, LocalDateTime tempoEstimado, double valorDoServico) {
        this.categoria = categoria;
        this.tempoEstimado = tempoEstimado;
        this.valorDoServico = valorDoServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(LocalDateTime tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public double getValorDoServico() {
        return valorDoServico;
    }

    public void setValorDoServico(double valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
