
package passagem;


public class Passagem2 {
    
    public static void main (String[] args){
        Passagem passagem1 = new Passagem();
        
        passagem1.cadastrarDadosPassageiros("André", "14318461368", "123456789");
        passagem1.mostrarDadosPassageiros();
        
        passagem1.cadastrarDadosPassagem("Ushuaia", "32/01/2050", "21:10", "56");
        passagem1.mostrarDadosPassagem();
        
        
        System.out.println(passagem1);
    }
}
