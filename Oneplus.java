public class Oneplus extends Features {
    Oneplus() {
    }

    Oneplus(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void availableModel() {
        System.out.println("ONEPLUS: Available Devices");
        System.out.println("1.Oneplus 8 Pro   2.Oneplus Nord  3.Oneplus 8t  4.Oneplus 7");
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
