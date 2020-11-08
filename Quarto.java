public class Quarto {
    // 1 Atributos
    private String corParede;
    private String tamanho;
    private String piso;
    private boolean portaAberta;
    private boolean janelaAberta;
    private boolean lampadaAcesa;

    // 2 Método construtor
    public Quarto(String corParede, String tamanho, String piso){
        this.corParede = corParede;
        this.tamanho = tamanho;
        this.piso = piso;
        this.portaAberta = false;
        this.janelaAberta = false;
    }

    // 3 Metodos da classe
    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Abrindo porta");
    }

    public void fecharPorta() {
        portaAberta = false;
        ligarLampada(); // Liga a lampada sozinho
        System.out.println("Fechando porta");
    }

    public void abrirJanela() {
        janelaAberta = true;
        desligarLampada(); // Desliga a lampada sozinho
        System.out.println("Abrindo janela");
    }

    public void fecharJanela() {
        janelaAberta = false;
        System.out.println("fechando janela");
    }

    private void ligarLampada() {
        lampadaAcesa = true;
        System.out.println("Ligando lampada");
    }

    private void desligarLampada() {
        lampadaAcesa = false;
        System.out.println("Desligando lampada");
    }

    public void informacao() {
        System.out.println("Cor da parede: " +corParede);
        System.out.println("Tamanho do quarto: " +tamanho);
        System.out.println("Piso: " +piso);
        System.out.println("Porta aberta ? " +portaAberta);
        System.out.println("Janela aberta ? " +janelaAberta);
        System.out.println("Lampada acesa ?" +lampadaAcesa);
    }

    // 4 Set e Get.
    public void setCorParede(String c) {
        this.corParede = c;
    }
    public void setTamanho(String t) {
        this.tamanho = t;
    }
    public void setPiso(String p) {
        this.piso = p;    }

    public void setPortaAberta(boolean p) {
        this.portaAberta = p;
    }
    public void setJanelaAberta(boolean j) {
        this.janelaAberta = j;
    }
    public void setLampadaAcesa(boolean l) {
        this.lampadaAcesa = l;
    }

    public String getCorParede() {
        return this.corParede;
    }
    public String getTamanho() {
        return this.tamanho;
    }
    public String getPiso() {
        return this.piso;
    }
    public boolean getPortaAberta() {
        return this.portaAberta;
    }    
    public boolean getJanelaAberta(){
        return this.janelaAberta;
    }   
    public boolean getLampadaAcesa(){
        return this.lampadaAcesa;
    }    
}