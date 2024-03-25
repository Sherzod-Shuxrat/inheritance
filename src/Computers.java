public class Computers extends Electronics{
    public int monitor_hajmi;
    public String turi;
    public String modeli;
    @Override
    public void vazifasi() {
        System.out.println("Kompyuterlar qog'oz ma'lumotlarni elektron xolatga o'tqazishda " +
                "foydalaniladigan qurilma.");
    }
    public void Monitor_hajmini_belgilash(int monitor_hajmi){
        this.monitor_hajmi = monitor_hajmi;
    }
    public void setModeli(String modeli){
        this.modeli = modeli;
    }
    public void setTuri(String turi){
        this.turi = turi;
    }

}
