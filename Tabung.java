
public class Tabung extends BangunRuang {
    float r, t;
    
    @Override
    float volume(){
        float volume =  (float) (Math.PI*r*r*t);
        System.out.println("Volume Tabung : " + volume);
        return volume;
    }
}
