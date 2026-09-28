public class Box {
   private int numeroBox;
   private Servico servico;
   private int capacidadeMax;
   public Box() {
   }

   public Box(int numeroBox, Servico servico, int capacidadeMax) {
    this.numeroBox = numeroBox;
    this.servico = servico;
    this.capacidadeMax = capacidadeMax;
   }

   public int getNumeroBox() {
    return numeroBox;
   }

   public void setNumeroBox(int numeroBox) {
    this.numeroBox = numeroBox;
   }

   public Servico getServico() {
    return servico;
   }

   public void setServico(Servico servico) {
    this.servico = servico;
   }

   public int getCapacidadeMax() {
    return capacidadeMax;
   }

   public void setCapacidadeMax(int capacidadeMax) {
    this.capacidadeMax = capacidadeMax;
   }

   
   
   
}
