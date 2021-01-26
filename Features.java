public abstract class Features implements Brands {
    public String name;
    public String processor, color, body, camera;
    public int ram, rom, battery;
    public double price;

    public abstract void specification1(String processor, String color, String body, String camera);

    public abstract void specification2(int ram, int rom, int battery, double price);

    public String toString() {
        return "\n" + name + "\nProcessor: " + processor + "\nRAM: " + ram + "GB\nROM: " + rom + "GB\nBody Material: " + body + "\nCamera: " + camera + "\nBattery: " + battery +
                "mAh\nColor: " + color + "\nPrice: BDT " + price;
    }
}
