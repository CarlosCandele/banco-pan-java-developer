  // Criando uma Smart TV onde:
        // Tenha caracteristicas: ligada(boolean), canal(int) e volume(int)
        // Aumentar e diminuir o volume : +1 ou -1
        // Mudar de canal de 1 em 1 ou definir o numero correspondente


public class Usuario {
    public static void main(String[] args) {
            
            SmartTv smartTv = new SmartTv();
    
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
    
    
            System.out.println("Canal Atual :  " + smartTv.canal);
            
            smartTv.mudarCanal(12);
            System.out.println("Canal Atual :  " + smartTv.canal);
    
            smartTv.ligar();
            System.out.println("TV ligada? " + smartTv.ligada);
    
            smartTv.desligar();
            System.out.println("TV ligada? " + smartTv.ligada);
    
        }
}
