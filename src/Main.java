// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.Maosh_belgilash(500);
        doctor.Davolash_narxini_belgilash(10);
        doctor.Vazifasi();

        Lor lor = new Lor();

        lor.Vazifasi();
        lor.Maosh_belgilash(600);
        doctor.Maoshi();
        lor.Maoshi();
        lor.Davolash_narxini_belgilash(15);

        Xirurg xirurg = new Xirurg();
        xirurg.Maosh_belgilash(800);
        xirurg.Maoshi();
        xirurg.Davolash_narxini_belgilash(20);

        System.out.println("davolash narxlari: ");
        System.out.print("Umumiy doctor:");
        doctor.Davolash_narxlarini_korsatish();
        System.out.print("Lor:");
        lor.Davolash_narxlarini_korsatish();
        System.out.print("Xirurg:");
        xirurg.Davolash_narxlarini_korsatish();


        PC pc = new PC();
        pc.Turini_korsatish();

        Laptop laptop = new Laptop();
        laptop.turini_korsat();

        LoudSpeaker loudSpeaker = new LoudSpeaker();
        loudSpeaker.vazifasi();

        Subwoofer subwoofer = new Subwoofer();
        subwoofer.vazifasi();
    }
}