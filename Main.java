public class Main {
    
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        
        Bola bola = new Bola();
        bola.r = 14;
        
        Tabung tabung = new Tabung();
        tabung.r = 14;
        tabung.t = 12;
        
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        limasSegitiga.l = 10;
        limasSegitiga.p = 15;
        limasSegitiga.t = 34;
        
        Kubus kubus = new Kubus();
        kubus.s = 20;
        
        bangunRuang.volume();
        bola.volume();
        tabung.volume();
        limasSegitiga.volume();
        kubus.volume();
        
    }
    
}
