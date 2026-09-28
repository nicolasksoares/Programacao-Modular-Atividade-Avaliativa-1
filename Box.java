import java.util.ArrayList;

public class Box {
   private int numeroBox;
   private Servico servico;
   private int capacidadeMax;
   private ArrayList<OrdemDeServico> ordensDeServicos = new ArrayList<>();

   public Box(int numeroBox, Servico servico, int capacidadeMax, ArrayList<OrdemDeServico> ordensDeServicos) {
    this.numeroBox = numeroBox;
    this.servico = servico;
    this.capacidadeMax = capacidadeMax;
    this.ordensDeServicos = ordensDeServicos;
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

   public ArrayList<OrdemDeServico> getOrdensDeServicos() {
      return ordensDeServicos;
   }

   public void setOrdensDeServicos(ArrayList<OrdemDeServico> ordensDeServicos) {
      this.ordensDeServicos = ordensDeServicos;
   }

   
}
