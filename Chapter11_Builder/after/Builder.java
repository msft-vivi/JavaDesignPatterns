package Builder.after;

public interface Builder {
    void reset();
    void setHouseType(HouseType houseType);
    void buildWalls();
    void buildDoors(int number);
    void buildWindows(int number);
    void buildRoof(); // 房顶
    void buildRooms(int number);

    void buildSwimPool(boolean flag); // 是否建游泳池
    void buildGarage(boolean flag); // 是否建车库
    void buildGarden(boolean flag); // 是否建花园
    void buildStatues(boolean flag); // 是否建雕塑
}
