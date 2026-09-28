public class Box {
   private int numeroBox;
   private String tipoDeServico;
   private int capacidadeMax;
   public Box() {
   }

   public Box(int numeroBox, String tipoDeServico, int capacidadeMax) {
    this.numeroBox = numeroBox;
    this.tipoDeServico = tipoDeServico;
    this.capacidadeMax = capacidadeMax;
   }

   public int getNumeroBox() {
    return numeroBox;
   }

   public void setNumeroBox(int numeroBox) {
    this.numeroBox = numeroBox;
   }

   public String getTipoDeServico() {
    return tipoDeServico;
   }

   public void setTipoDeServico(String tipoDeServico) {
    this.tipoDeServico = tipoDeServico;
   }

   public int getCapacidadeMax() {
    return capacidadeMax;
   }

   public void setCapacidadeMax(int capacidadeMax) {
    this.capacidadeMax = capacidadeMax;
   }

   
   
   
}
