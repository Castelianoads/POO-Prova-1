public class Umidificador {
    // 1 Atributos    
    private String marca;
    private String modelo; 
    private String cor ;  
    private boolean ligado; //Ligado ou desligado
    private boolean umidificando; 
    private boolean ocilando;

    // 2 Método construtor
    public Umidificador(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
        this.umidificando = false;
    }

    // 3 Metodos da classe
    public void ligar() {
        ligado = true;
        System.out.println("Ligando");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Desligado.");
    }

    public void umidificar() {
        umidificando = true;
        ocilar();
    }

    public void naoUmidificar(){
        umidificando = false;
        naoOcilar();
    }

    private void ocilar() {
        ocilando = true;
    }

    private void naoOcilar() {
        ocilando = false;
    }

    public void informacao() {
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Cor: " +cor);
        System.out.println("Ligado: " +ligado);
        System.out.println("Umidificando: " +umidificando);
    }
    
    // 4 Set e Get.
    public void setMarca(String ma) {
        this.marca = ma;
    }
    public void setModelo(String mo) {
        this.modelo = mo;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public void setLigado(boolean p){
        this.ligado = p;
    }
    public void setUmidificando(boolean u) {
        this.umidificando = u;
    }
    public void setOcilando(boolean o) {
        this.ocilando = o;
    }   

    public String getMarca() {
        return this.marca;
    }    
    public String getModelo() {
        return this.modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public boolean getLigado() {
        return this.ligado;
    }
    public boolean getUmidificando() {
        return this.umidificando;
    }
    public boolean getOcilando() {
        return this.ocilando;
    }   
    
}
