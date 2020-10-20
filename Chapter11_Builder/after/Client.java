package Builder.after;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.constructTraditionalStoneHouse(builder);
        House traditionalStoneHouse = builder.getProduct();
        System.out.println(traditionalStoneHouse);
    }
}
