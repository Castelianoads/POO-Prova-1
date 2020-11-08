public class ArCondicionado {
    // Atributos
    private String marca; 
    private String cor;
    private int btus;     
    private int temperatura; 
    private boolean ligado; //Ligado ou desligado

    // Método construtor
    public ArCondicionado (String marca, String cor, int btus){
        this.marca = marca;
        this.cor = cor;
        this.btus = btus;
        this.temperatura = 22;
        this.ligado = false;
    }

    // Metodos da classe. nao usar this
    public void ligar() {
        ligado = true;
        System.out.println("Ligando ar condicionado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Desligando ar condicionado");
    }

    public void maisTemperatura() {
        temperatura += 1;
        if (temperatura >= 25) {
            ligarSozinho();
        }
        System.out.println("Aumentando a temperatura");
    }

    public void menosTemperatura() {
        temperatura -= 1;
        if (temperatura <= 17 ) {
            desligarSozinho();
        }
        System.out.println("Abaixando a temperatura");
    }

    public void informacao() {
        System.out.println("Marca: " +marca);
        System.out.println("Cor: " +cor);
        System.out.println("Btus: " +btus);
        System.out.println("Temperatura " +temperatura);
        System.out.println("Ligado: " +ligado);
    }

    private void desligarSozinho() {
        ligado = false;       
    }

    private void ligarSozinho() {
        ligado = true;
    }

    // Set e Get.
    public void setMarca(String m) {
        this.marca = m;
    } 
    public void setBtus(int b) {
        this.btus = b;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public void setTemperatura(int t) {
        this.temperatura = t;
    }
    public void setLigado(boolean p) {
        this.ligado = p;
    }
    
    public String getMarca() {
        return this.marca;
    }
    public int getBtus(){
        return this.btus;
    }   
    public String getCor() {
        return this.cor;
    } 
    public int getTemperatura() {
        return this.temperatura;
    }
    public boolean getLigado() {
        return this.ligado;
    }
}
