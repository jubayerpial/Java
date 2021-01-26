import java.util.Scanner;

public class Samsung extends Features{
    Scanner com = new Scanner(System.in);
    Samsung() {}
    Samsung(String name, double price)
    {
        this.name=name;
        this.price = price;
    }

    public void availableModel(){
          System.out.println("SAMSUNG: Available Devices");
          System.out.println("1.Galaxy Note 20   2.Galaxy S10 Plus  3.Galaxy A71  4.Galaxy S20");
          System.out.print("Enter device name: ");
    }

    public void specification1(String processor, String color, String body, String camera) {
        super.processor = processor;
        super.color = color;
        super.body = body;
        super.camera = camera;
    }
    public void specification2(int ram, int rom, int battery,double price) {
        super.ram = ram;
        super.rom = rom;
        super.battery = battery;
        super.price=price;
    }


}

