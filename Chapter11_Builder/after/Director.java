package Builder.after;

public class Director {

    // 建造一个传统的石头房子
    public void constructTraditionalStoneHouse(Builder builder){
        builder.reset();
        builder.setHouseType(HouseType.STONE_HOUSE);
        builder.buildWalls();
        builder.buildDoors(4);
        builder.buildWindows(8);
        builder.buildRooms(5);
        builder.buildRoof();
    }

    // 建造一个传统的木头房子
    public void constructWoodHouse(Builder builder){
        builder.reset();
        builder.setHouseType(HouseType.WOOD_HOUSE);
        builder.buildWalls();
        builder.buildDoors(2);
        builder.buildWindows(6);
        builder.buildRooms(4);
        builder.buildRoof();
    }

    // 建造别墅
    public void constructVilla(Builder builder){
        builder.reset();
        builder.setHouseType(HouseType.STONE_HOUSE);
        builder.buildWalls();
        builder.buildDoors(4);
        builder.buildWindows(8);
        builder.buildRooms(5);
        builder.buildRoof();
        // 豪华系列
        builder.buildSwimPool(true);
        builder.buildGarage(true);
        builder.buildGarden(true);
        builder.buildStatues(true);
    }
}
