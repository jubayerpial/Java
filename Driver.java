import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        CreatingAccount c1 = new CreatingAccount(); //creating object of CreatingAccount class
        Login l1 = new Login(); //creating object of Login class
        Account a1 = new Account(); //creating object of Account class
        Apple x = new Apple(); //creating object of Apple class
        //Comparison comp = new Comparison();

        Samsung s = new Samsung();
        Apple a = new Apple();
        Oneplus o = new Oneplus();
        Xiaomi xi = new Xiaomi();

        Samsung sam1 = new Samsung("Galaxy A71", 34999);
        Samsung sam2 = new Samsung("Galaxy S20", 79000);
        Samsung sam3 = new Samsung("Galaxy S10 Plus", 99900);
        Samsung sam4 = new Samsung("Galaxy Note 20", 99999);
        Apple ap1 = new Apple("Iphone X", 84999);
        Apple ap2 = new Apple("Iphone 11 pro max", 129999);
        Apple ap3 = new Apple("Iphone 11", 87999);
        Apple ap4 = new Apple("Iphone 12", 117999);
        Oneplus op1 = new Oneplus("Oneplus 8 Pro", 80000);
        Oneplus op2 = new Oneplus("Oneplus Nord", 49990);
        Oneplus op3 = new Oneplus("Oneplus 8t", 50000);
        Oneplus op4 = new Oneplus("Oneplus 7", 48500);
        Xiaomi xi1 = new Xiaomi("Redmi Note 9 Pro", 25999);
        Xiaomi xi2 = new Xiaomi("MI 10T", 49900);
        Xiaomi xi3 = new Xiaomi("Redmi K30 Pro", 46500);
        Xiaomi xi4 = new Xiaomi("MI 9T Pro", 40000);

        System.out.println("Welcome to Java Mobile Store"); //Introduction
        System.out.println("Please create an online account, To create press 1.");
        int in = input.nextInt(); //Taking input for creating an account
        //checking whether input is correct or not
        if (in == 1) {
            c1.signup(); //calling signup method in CreatingAccount class
            l1.signin(); //calling signin method in Login class
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        a1.profile(); //calling profile method in Account class
        x.selectBrand(); //calling selectBrand method in Apple class
        String brand = sc.nextLine(); //Taking inpur for mobile brand
        String comp_Device = ""; //Taking device name as input for comparing
        String model = "";
        String comp = ""; //Taking input whether to compare or not
        if (brand.equalsIgnoreCase("Samsung")) {
            s.availableModel(); //calling availableModel method in Samsung class
            model = sc.nextLine(); //taking input for model name
            if (model.equalsIgnoreCase(sam1.name)) {
                sam1.specification1("Qualcomm Snapdragon 730", "Black/Silver/Blue/Pink", "Plastic Back & Plastic Frame", "Front: 32MP, Main: 64MP+12MP+5MP+5MP");
                sam1.specification2(6, 128, 4500, 34999);
                System.out.println(sam1);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(sam1);
                }

            } else if (model.equalsIgnoreCase(sam2.name)) {
                sam2.specification1("Exynos 990", "Grey/White/Blue/Pink", "Glass Back & Aluminum Frame", "Front: 10MP, Main: 12MP+64MP+12MP");
                sam2.specification2(8, 128, 4000, 79000);
                System.out.println(sam2);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(sam2);
                }

            } else if (model.equalsIgnoreCase(sam3.name)) {
                sam3.specification1("Exynos 9820", "Black/White/Blue/Green", "Glass Back & Aluminum Frame", "Front: 10MP+8MP, Main: 12MP+16MP+12MP");
                sam3.specification2(8, 128, 4100, 99900);
                System.out.println(sam3);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(sam3);
                }

            } else if (model.equalsIgnoreCase(sam4.name)) {
                sam4.specification1("Exynos 990", "Green/Bronze/Blue/Grey", "Plastic Back & Aluminum Frame", "Front: 10MP, Main: 12MP+64MP+12MP");
                sam4.specification2(8, 128, 4300, 99999);
                System.out.println(sam4);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(sam4);
                }

            } else {
                System.out.println("This device is not available at our store");
                System.out.println("Thank you for visiting our store");
                System.exit(0);
            }
        } else if (brand.equalsIgnoreCase("Apple")) {
            a.availableModel();
            model = sc.nextLine();
            if (model.equalsIgnoreCase(ap1.name)) {
                ap1.specification1("Apple A11 Bionic", "Space Grey/Silver", "Glass Back & Stainless Steel Frame", "Front: 7MP, Main: 12MP+12MP");
                ap1.specification2(3, 256, 2716, 84999);
                System.out.println(ap1);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(ap1);
                }

            } else if (model.equalsIgnoreCase(ap2.name)) {
                ap2.specification1("Apple A13 Bionic", "Grey/Silver/Green/Gold", "Glass Back & Stainless Steel Frame", "Front: 12MP, Main: 12MP+12MP+12MP");
                ap2.specification2(4, 256, 3969, 129999);
                System.out.println(ap2);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(ap2);
                }

            } else if (model.equalsIgnoreCase(ap3.name)) {
                ap3.specification1("Apple A13 Bionic", "Black/White/Red/Green/bLUE", "Glass Back & Aluminum Frame", "Front: 12MP, Main: 12MP+12MP");
                ap3.specification2(4, 128, 3110, 87999);
                System.out.println(ap3);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(ap3);
                }

            } else if (model.equalsIgnoreCase(ap4.name)) {
                ap4.specification1("Apple A14 Bionic", "Green/Bronze/Blue/Grey", "Plastic Back & Aluminum Frame", "Front: 12MP, Main: 12MP+12MP");
                ap4.specification2(4, 128, 2815, 117999);
                System.out.println(ap4);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(ap4);
                } else {
                    System.out.println("This device is not available at our store");
                    System.out.println("Thank you for visiting our store");
                    System.exit(0);
                }
            }
        } else if (brand.equalsIgnoreCase("OnePlus")) {
            o.availableModel();
            model = sc.nextLine();
            if (model.equalsIgnoreCase(op1.name)) {
                op1.specification1("Qualcomm Snapdragon 865", "Black/Green/Blue", "Glass Back & Aluminum Frame", "Front: 16MP, Main: 48MP+48MP+8MP+5MP");
                op1.specification2(8, 128, 4510, 80000);
                System.out.println(op1);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(op1);
                }

            } else if (model.equalsIgnoreCase(op2.name)) {
                op2.specification1("Qualcomm Snapdragon 765G", "Grey/Blue Marble", "Glass Back & Plastic Frame", "Front: 32MP+8MP, Main: 48MP+8MP+5MP+2MP");
                op2.specification2(8, 128, 4115, 49990);
                System.out.println(op2);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(op2);
                }

            } else if (model.equalsIgnoreCase(op3.name)) {
                op3.specification1("Qualcomm Snapdragon 865", "Silver/Green", "Glass Back & Aluminum Frame", "Front: 16MP, Main: 48MP+16MP+5MP+2MP");
                op3.specification2(8, 128, 4500, 50000);
                System.out.println(op3);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(op3);
                }

            } else if (model.equalsIgnoreCase(op4.name)) {
                op4.specification1("Qualcomm Snapdragon 855", "Black/Red/Grey", "Glass Back & Aluminum Frame", "Front: 16MP, Main: 48MP+5MP");
                op4.specification2(6, 128, 3700, 48500);
                System.out.println(op4);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(op4);
                } else {
                    System.out.println("This device is not available at our store");
                    System.out.println("Thank you for visiting our store");
                    System.exit(0);
                }
            }

        } else if (brand.equalsIgnoreCase("Xiaomi")) {
            xi.availableModel();
            model = sc.nextLine();
            if (model.equalsIgnoreCase(xi1.name)) {
                xi1.specification1("Qualcomm Snapdragon 720G", "Green/White/Grey", "Glass Back & Plastic Frame", "Front: 16MP, Main: 64MP+8MP+5MP+2MP");
                xi1.specification2(6, 64, 5020, 25999);
                System.out.println(xi1);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(xi1);
                }

            } else if (model.equalsIgnoreCase(xi2.name)) {
                xi2.specification1("Qualcomm Snapdragon 865", "Black/Silver", "Glass Back & Aluminum Frame", "Front: 20MP, Main: 13MP+64MP+5MP");
                xi2.specification2(6, 128, 5000, 49900);
                System.out.println(xi2);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(xi2);
                }

            } else if (model.equalsIgnoreCase(xi3.name)) {
                xi3.specification1("Qualcomm Snapdragon 865", "Grey/White/Blue/Purple", "Glass Back & Aluminum Frame", "Front: 20MP, Main: 64MP+13MP+5MP+2MP");
                xi3.specification2(6, 128, 4700, 46500);
                System.out.println(xi3);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(xi3);
                }

            } else if (model.equalsIgnoreCase(xi4.name)) {
                xi4.specification1("Qualcomm Snapdragon 855", "Red/Blue/Black", "Glass Back & Aluminum Frame", "Front: 20MP, Main: 48MP+13MP+8MP");
                xi4.specification2(6, 128, 4000, 40000);
                System.out.println(xi4);
                System.out.println("Do you want compare this device with any other device? YES or NO");
                comp = sc.nextLine();
                if (comp.equalsIgnoreCase("yes")) {
                    System.out.println("Available devices to compare with: \nSamsung: " + sam1.name + ", " + sam2.name + ", " + sam3.name + ", " + sam4.name);
                    System.out.println("Apple: " + ap1.name + ", " + ap2.name + ", " + ap3.name + ", " + ap4.name);
                    System.out.println("Oneplus: " + op1.name + ", " + op2.name + ", " + op3.name + ", " + op4.name);
                    System.out.println("Xiaomi: " + xi1.name + ", " + xi2.name + ", " + xi3.name + ", " + xi4.name);
                    System.out.println("Enter a device to compare: ");
                    comp_Device = sc.nextLine();
                    System.out.println("Comparison between the two devices:");
                    System.out.println(xi4);
                }

            } else {
                System.out.println("This device is not available at our store");
                System.out.println("Thank you for visiting our store");
                System.exit(0);
            }
        } else {
            System.out.println("We don't sell products of this brand");
            System.out.println("Thank you for visiting our store");
            System.exit(0);
        }

        //comparing
        if (comp.equalsIgnoreCase("yes")) {
            if (comp_Device.equalsIgnoreCase(sam1.name)) {
                sam1.specification1("Qualcomm Snapdragon 730", "Black/Silver/Blue/Pink", "Plastic Back & Plastic Frame", "Front: 32MP, Main: 64MP+12MP+5MP+5MP");
                sam1.specification2(6, 128, 4500, 34999);
                Comparison.compare(sam1);
            } else if (comp_Device.equalsIgnoreCase(sam2.name)) {
                sam2.specification1("Exynos 990", "Grey/White/Blue/Pink", "Glass Back & Aluminum Frame", "Front: 10MP, Main: 12MP+64MP+12MP");
                sam2.specification2(8, 128, 4000, 79000);
                Comparison.compare(sam2);
            } else if (comp_Device.equalsIgnoreCase(sam3.name)) {
                sam3.specification1("Exynos 9820", "Black/White/Blue/Green", "Glass Back & Aluminum Frame", "Front: 10MP+8MP, Main: 12MP+16MP+12MP");
                sam3.specification2(8, 128, 4100, 99900);
                Comparison.compare(sam3);
            } else if (comp_Device.equalsIgnoreCase(sam4.name)) {
                sam4.specification1("Exynos 990", "Green/Bronze/Blue/Grey", "Plastic Back & Aluminum Frame", "Front: 10MP, Main: 12MP+64MP+12MP");
                sam4.specification2(8, 128, 4300, 99999);
                Comparison.compare(sam4);
            } else if (comp_Device.equalsIgnoreCase(ap1.name)) {
                ap1.specification1("Apple A11 Bionic", "Space Grey/Silver", "Glass Back & Stainless Steel Frame", "Front: 7MP, Main: 12MP+12MP");
                ap1.specification2(3, 256, 2716, 84999);
                Comparison.compare(ap1);
            } else if (comp_Device.equalsIgnoreCase(ap2.name)) {
                ap2.specification1("Apple A13 Bionic", "Grey/Silver/Green/Gold", "Glass Back & Stainless Steel Frame", "Front: 12MP, Main: 12MP+12MP+12MP");
                ap2.specification2(4, 256, 3969, 129999);
                Comparison.compare(ap2);
            } else if (comp_Device.equalsIgnoreCase(ap3.name)) {
                ap3.specification1("Apple A13 Bionic", "Black/White/Red/Green/bLUE", "Glass Back & Aluminum Frame", "Front: 12MP, Main: 12MP+12MP");
                ap3.specification2(4, 128, 3110, 87999);
                Comparison.compare(ap3);
            } else if (comp_Device.equalsIgnoreCase(ap4.name)) {
                ap4.specification1("Apple A14 Bionic", "Green/Bronze/Blue/Grey", "Plastic Back & Aluminum Frame", "Front: 12MP, Main: 12MP+12MP");
                ap4.specification2(4, 128, 2815, 117999);
                Comparison.compare(ap4);
            } else if (comp_Device.equalsIgnoreCase(op1.name)) {
                op1.specification1("Qualcomm Snapdragon 865", "Black/Green/Blue", "Glass Back & Aluminum Frame", "Front: 16MP, Main: 48MP+48MP+8MP+5MP");
                op1.specification2(8, 128, 4510, 80000);
                Comparison.compare(op1);
            } else if (comp_Device.equalsIgnoreCase(op2.name)) {
                op2.specification1("Qualcomm Snapdragon 765G", "Grey/Blue Marble", "Glass Back & Plastic Frame", "Front: 32MP+8MP, Main: 48MP+8MP+5MP+2MP");
                op2.specification2(8, 128, 4115, 49990);
                Comparison.compare(op2);
            } else if (comp_Device.equalsIgnoreCase(op3.name)) {
                op3.specification1("Qualcomm Snapdragon 865", "Silver/Green", "Glass Back & Aluminum Frame", "Front: 16MP, Main: 48MP+16MP+5MP+2MP");
                op3.specification2(8, 128, 4500, 50000);
                Comparison.compare(op3);
            } else if (comp_Device.equalsIgnoreCase(op4.name)) {
                op4.specification1("Qualcomm Snapdragon 855", "Black/Red/Grey", "Glass Back & Aluminum Frame", "Front: 16MP, Main: 48MP+5MP");
                op4.specification2(6, 128, 3700, 48500);
                Comparison.compare(op4);
            } else if (comp_Device.equalsIgnoreCase(xi1.name)) {
                xi1.specification1("Qualcomm Snapdragon 720G", "Green/White/Grey", "Glass Back & Plastic Frame", "Front: 16MP, Main: 64MP+8MP+5MP+2MP");
                xi1.specification2(6, 64, 5020, 25999);
                Comparison.compare(xi1);
            } else if (comp_Device.equalsIgnoreCase(xi2.name)) {
                xi2.specification1("Qualcomm Snapdragon 865", "Black/Silver", "Glass Back & Aluminum Frame", "Front: 20MP, Main: 13MP+64MP+5MP");
                xi2.specification2(6, 128, 5000, 49900);
                Comparison.compare(xi2);
            } else if (comp_Device.equalsIgnoreCase(xi3.name)) {
                xi3.specification1("Qualcomm Snapdragon 865", "Grey/White/Blue/Purple", "Glass Back & Aluminum Frame", "Front: 20MP, Main: 64MP+13MP+5MP+2MP");
                xi3.specification2(6, 128, 4700, 46500);
                Comparison.compare(xi3);
            } else if (comp_Device.equalsIgnoreCase(xi4.name)) {
                xi4.specification1("Qualcomm Snapdragon 855", "Red/Blue/Black", "Glass Back & Aluminum Frame", "Front: 20MP, Main: 48MP+13MP+8MP");
                xi4.specification2(6, 128, 4000, 40000);
                Comparison.compare(xi4);
            } else {
                System.out.println("\nThis device is not available in our comparison list");
            }
        }
        System.out.println("Do you want to purchase any device? YES or NO");
        String purchase = sc.next(); //Ask user to purchase or not
        if (purchase.equalsIgnoreCase("yes")) {
            System.out.print("\nWhich device do you want to buy?\nEnter Device name: ");
            String buy = sc2.nextLine(); //Taking as input which device to buy
            if (buy.equalsIgnoreCase(sam1.name)) {
                System.out.println("Price of " + sam1.name + " is BDT " + sam1.price);
                a1.addProduct(sam1);
            } else if (buy.equalsIgnoreCase(sam2.name)) {
                System.out.println("Price of " + sam2.name + " is BDT " + sam2.price);
                a1.addProduct(sam2);
            } else if (buy.equalsIgnoreCase(sam3.name)) {
                System.out.println("Price of " + sam3.name + " is BDT " + sam3.price);
                a1.addProduct(sam3);
            } else if (buy.equalsIgnoreCase(sam4.name)) {
                System.out.println("Price of " + sam4.name + " is BDT " + sam4.price);
                a1.addProduct(sam4);
            } else if (buy.equalsIgnoreCase(ap1.name)) {
                System.out.println("Price of " + ap1.name + " is BDT " + ap1.price);
                a1.addProduct(ap1);
            } else if (buy.equalsIgnoreCase(ap2.name)) {
                System.out.println("Price of " + ap2.name + " is BDT " + ap2.price);
                a1.addProduct(ap2);
            } else if (buy.equalsIgnoreCase(ap3.name)) {
                System.out.println("Price of " + ap3.name + " is BDT " + ap3.price);
                a1.addProduct(ap3);
            } else if (buy.equalsIgnoreCase(ap4.name)) {
                System.out.println("Price of " + ap4.name + " is BDT " + ap4.price);
                a1.addProduct(ap4);
            } else if (buy.equalsIgnoreCase(op1.name)) {
                System.out.println("Price of " + op1.name + " is BDT " + op1.price);
                a1.addProduct(op1);
            } else if (buy.equalsIgnoreCase(op2.name)) {
                System.out.println("Price of " + op2.name + " is BDT " + op2.price);
                a1.addProduct(op2);
            } else if (buy.equalsIgnoreCase(op3.name)) {
                System.out.println("Price of " + op3.name + " is BDT " + op3.price);
                a1.addProduct(op3);
            } else if (buy.equalsIgnoreCase(op4.name)) {
                System.out.println("Price of " + op4.name + " is BDT " + op4.price);
                a1.addProduct(op4);
            } else if (buy.equalsIgnoreCase(xi1.name)) {
                System.out.println("Price of " + xi1.name + " is BDT " + xi1.price);
                a1.addProduct(xi1);
            } else if (buy.equalsIgnoreCase(xi2.name)) {
                System.out.println("Price of " + xi2.name + " is BDT " + xi2.price);
                a1.addProduct(xi2);
            } else if (buy.equalsIgnoreCase(xi3.name)) {
                System.out.println("Price of " + xi3.name + " is BDT " + xi3.price);
                a1.addProduct(xi3);
            } else if (buy.equalsIgnoreCase(xi4.name)) {
                System.out.println("Price of " + xi4.name + " is BDT " + xi4.price);
                a1.addProduct(xi4);
            } else {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        else if (purchase.equalsIgnoreCase("no")){
            System.out.println("Thank you for visiting our store.");
            System.exit(0);
        }
        else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}