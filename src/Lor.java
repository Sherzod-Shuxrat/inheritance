public class Lor extends Doctor{

    @Override
    public void Tekshirish() {
        System.out.println("Quloq,Tomoq,Burunni tekshirish");
    }

    @Override
    public void Davolash() {
        System.out.println("Quloq,Tomoq,Burunni davolash");
    }

    @Override
    public void Vazifasi() {
        System.out.println("Lorning vazifasi Quloq,Burun,Tomoqni tekshirib davolaydi");
    }



    @Override
    public void Maoshi() {
        System.out.println(this.maosh + "$");
    }
}
