public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 35;

    public void ligar() { 
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume <= 35)
        volume ++;
        System.out.println("Aumentar Volume para: " + volume);
    }
    
    public void diminuirVolume() {
        if(volume <= 35)
        volume --;
    System.out.println("Diminuir Volume para: " + volume);
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
}
