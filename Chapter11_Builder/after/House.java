package Builder.after;

public class House {
    private  HouseType houseType; // 原材料类型
    private  int windows;
    private  int doors;
    private  int rooms;
    private boolean hasSwimPool;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasStatues;

    // 不定义含参构造函数，具体House 类型由 Builder 通过 setter 设置
    public House() {

    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public void setHasStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
    }

    @Override
    public String toString() {
        String info  = "";
        info += "Type of house: " + houseType + "\n";
        info += "Count of Windows: " + windows + "\n";
        info += "Count of Rooms: " + rooms + "\n";
        info += "Count of Doors: " + doors + "\n";
        if(hasSwimPool){
            info += "House with Swim Pool\n";
        }
        if(hasGarage){
            info += "House with Garage\n";
        }
        if(hasGarden){
            info += "House with Garden\n";
        }
        if(hasStatues){
            info += "House with Statues\n";
        }

        return info;
    }
}


