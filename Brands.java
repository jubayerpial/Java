public interface Brands {
    default void selectBrand() {
        System.out.println("Available Mobile Brands: ");
        System.out.println("1.Samsung  2.Apple  3.OnePlus  4.Xiaomi");
        System.out.print("Enter Brand Name: ");
    }

    void availableModel();
}
