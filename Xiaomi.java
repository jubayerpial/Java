public class Xiaomi extends Features {
    Xiaomi(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Xiaomi() {
    }

    public void availableModel() {

        System.out.println("XIAOMI: Available Devices");
        System.out.println("1.MI 10T   2.Redmi Note 9 Pro  3.Redmi K30 Pro  4.MI 9T Pro");
        System.out.print("Enter device name: ");
    }

    public void specification1(String processor, String color, String body, String camera) {
        super.processor = processor;
        super.color = color;
        super.body = body;
        super.camera = camera;
    }

    public void specification2(int ram, int rom, int battery, double price) {
        super.ram = ram;
        super.rom = rom;
        super.battery = battery;
        super.price = price;
    }
}
