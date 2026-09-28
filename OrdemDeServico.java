public class OrdemDeServico {
    private String codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private String statusDaOrdem;

    public OrdemDeServico(String codigo, Cliente cliente, Veiculo veiculo, String statusDaOrdem) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.statusDaOrdem = statusDaOrdem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getStatusDaOrdem() {
        return statusDaOrdem;
    }

    public void setStatusDaOrdem(String statusDaOrdem) {
        this.statusDaOrdem = statusDaOrdem;
    }

    public void CadastrarOrdemDeServico(String codigo, Cliente cliente, Veiculo veiculo, String statusDaOrdem){

    }
}
