public abstract class Fruit implements TitleFruit {

    private final String title;
    private final double weight;

    public Fruit(String title, double weight) {
        this.title = title;
        this.weight = weight;

    }

    public String getTitle() {
        return title;

    }

    public double getWeight() {
        return weight;

    }
}
