public class Xirurg extends Doctor{
    @Override
    public void Tekshirish() {
        System.out.println("Shikastlanishlarga tashxis qo'yadi");
    }

    @Override
    public void Davolash() {
        System.out.println("Kasalliklarni jarrohlik yo'li bilan operatsiya qiladi");
    }


    @Override
    public void Vazifasi() {
        System.out.println("Xirurgning vazifasi kasalliklar va shikastlanishlarni tashxislash " +
                "va ularni jarrohlik yo‘li bilan davolash bo‘yicha ta’lim olgan mutaxasis.");
    }

    @Override
    public void Maosh_belgilash(int maosh) {
        super.Maosh_belgilash(maosh);
    }

    @Override
    public void Maoshi() {
        super.Maoshi();
    }
}
