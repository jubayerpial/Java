public class Apple extends Features {
    Apple() {
    }

    Apple(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void availableModel() {
        System.out.println("APPLE: Available Devices");
        System.out.println("1.Iphone X   2.Iphone 11 Pro Max   3.Iphone 11   4.Iphone 12");
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
