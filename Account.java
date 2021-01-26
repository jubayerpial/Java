public class Account extends CreatingAccount {
    public void profile() {
        System.out.println("\nMY PROFILE");
        System.out.println("Name: " + name + "\nID: " + id);
        System.out.println("Cell Number: " + cell + "\nEmail Address: " + email);
        System.out.println();
    }

    public void addProduct(Samsung s) {
        profile();
        System.out.print("Your Purchased Product: \n" + s.name + ": BDT " + s.price);
        System.out.println("\nPayment Method: Cash on Delivery");
        System.out.println("Thank You for shopping with us");
    }

    public void addProduct(Apple a) {
        profile();
        System.out.println("Your Purchased Product: \n" + a.name + ": BDT " + a.price);
        System.out.println("\nPayment Method: Cash on Delivery");
        System.out.println("Thank You for shopping with us");
    }

    public void addProduct(Oneplus o) {
        profile();
        System.out.println("Your Purchased Product: \n" + o.name + ": BDT " + o.price);
        System.out.println("\nPayment Method: Cash on Delivery");
        System.out.println("Thank You for shopping with us");
    }

    public void addProduct(Xiaomi x) {
        profile();
        System.out.println("Your Purchased Product: \n" + x.name + ": BDT " + x.price);
        System.out.println("\nPayment Method: Cash on Delivery");
        System.out.println("Thank You for shopping with us");
    }
}
