public class Veiculo {

    private String numeracaoDaplaca;
    private String modeloDoVeiculo;

    public Veiculo(String numeracaoDaplaca, String modeloDoVeiculo) {
        this.numeracaoDaplaca = numeracaoDaplaca;
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public String getNumeracaoDaplaca() {
        return numeracaoDaplaca;
    }
    public void setNumeracaoDaplaca(String numeracaoDaplaca) {
        this.numeracaoDaplaca = numeracaoDaplaca;
    }
    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }
    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }
}
