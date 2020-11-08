public class Principal {
    public static void main ( String [] args ) {

        ArCondicionado ar1 = new ArCondicionado("Philco", "Branco", 12000);
        Umidificador umidificador1 = new Umidificador("Britania", "Climatizador","Branco");
        Quarto quarto1 = new Quarto("Branca", "Pequeno", "Ceramica");

        ar1.ligar();
        ar1.informacao();
        System.out.println();
        ar1.setTemperatura(17);
        System.out.println("Temperatura " +ar1.getTemperatura());
        System.out.println();

        umidificador1.ligar();
        umidificador1.informacao();
        System.out.println();

        quarto1.informacao();
        System.out.println();
        
    }
}