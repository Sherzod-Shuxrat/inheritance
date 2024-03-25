public class Doctor {
    public int maosh;
    public int narx;
    public void Tekshirish(){
        System.out.println("Tekshiruvchi");
    }
    public void Davolash(){
        System.out.println("Davolovchi");
    }
    public void Vazifasi(){
        System.out.println("Umumiy tashxis qo'yadi");
    }
    public void Maosh_belgilash(int maosh){
        this.maosh = maosh;
    }
    public void Maoshi(){
        System.out.println(maosh + "$");
    }
    public void Davolash_narxini_belgilash(int narx){
        this.narx = narx;
    }
    public void Davolash_narxlarini_korsatish(){
        System.out.println(this.narx + "$");
    }
}
