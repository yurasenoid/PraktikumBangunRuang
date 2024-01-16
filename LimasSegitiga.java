
public class LimasSegitiga extends BangunRuang {
    float p, l, t;
    
    @Override
    float volume(){
        float volume =  p*t*t*1/3;
        System.out.println("Volume Limas Segitiga : " + volume);
        return volume;
    }
}
