public class Bola extends BangunRuang {
    float r;
    
    float volume(){
        float volume =  (float) ((Math.PI)*r*r*r*3/4);
        System.out.println("Volume Bola : " + volume);
        return volume;
    }
    
}
