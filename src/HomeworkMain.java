public class HomeworkMain {

    public static void main(String[] args) {
//        Box<String> stringBox = new Box(); // запрещено!
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple("Яблоки", 1.0));
        appleBox.add(new Apple("Яблоки", 2.0));
        appleBox.add(new Apple("Яблоки", 3.0));
//        apples.add(new Orange(3.0)); // запрещено!!!
        appleBox.add(new GoldenApple("Золотые яблоки", 3.0)); // разрешено
        System.out.println(appleBox.getTitle() + " весят " + appleBox.getSumWeight() + " кг"); // 9.0

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange("Апельсины", 1.0));
//        orangeBox.add(new Apple(1.0)); // запрещено!!!
        System.out.println(orangeBox.getTitle() + " весят " +  orangeBox.getSumWeight() + " кг"); // 1.0

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple("Золотые яблоки", 2.0));
//        goldenAppleBox.add(new Apple(2.0)); // запрещено!
        System.out.println(goldenAppleBox.getTitle() + " весят " +  goldenAppleBox.getSumWeight() + " кг"); // 2.0


        goldenAppleBox.moveTo(appleBox); // можно
        System.out.println(goldenAppleBox.getTitle() + " весят " +  goldenAppleBox.getSumWeight() + " кг"); // 0.0
        System.out.println(appleBox.getTitle() + " весят " + appleBox.getSumWeight() + " кг"); // 9.0 + 2.0 = 11.0

//        apples.moveTo(goldenAppleBox); // нельзя!
//        orangeBox.moveTo(apples); // нельзя
    }
}