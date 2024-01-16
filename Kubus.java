public class Kubus extends BangunRuang {
    float s;
    
    @Override
    float volume(){
        float volume =  s*s*s;
        System.out.println("Volume Kubus : " + volume);
        return volume;
    }
}
