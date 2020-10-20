package Builder.after;

public class HouseBuilder implements Builder{
    private House newHouse;

    @Override
    public void reset() {
        newHouse = new House();
    }

    @Override
    public void setHouseType(HouseType houseType) {
        newHouse.setHouseType(houseType);
    }

    @Override
    public void buildWalls() {
        // ...
    }

    @Override
    public void buildDoors(int number) {
        newHouse.setDoors(number);
    }

    @Override
    public void buildWindows(int number) {
        newHouse.setWindows(number);
    }

    @Override
    public void buildRoof() {
        // ...
    }

    @Override
    public void buildRooms(int number) {
        newHouse.setRooms(number);
    }

    @Override
    public void buildSwimPool(boolean flag) {
        newHouse.setHasSwimPool(flag);
    }

    @Override
    public void buildGarage(boolean flag) {
        newHouse.setHasGarage(flag);
    }

    @Override
    public void buildGarden(boolean flag) {
        newHouse.setHasGarden(flag);
    }

    @Override
    public void buildStatues(boolean flag) {
        newHouse.setHasStatues(flag);
    }

    // 返回建造好的房子 (Product)
    public House getProduct(){
        return newHouse;
    }
}
