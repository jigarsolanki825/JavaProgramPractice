package Product;

import java.io.*;

public class ProductSerialization {

    public void serializeProduct(Product product) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/jigarsolanki/Desktop/JavaProgramPractice/SerializeFile/Product.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);

    }

    public void deserializeProduct() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("/Users/jigarsolanki/Desktop/JavaProgramPractice/SerializeFile/Product.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Product product = (Product) objectInputStream.readObject();
        System.out.println(product.getLocation());
        System.out.println(product);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ProductSerialization productSerialization = new ProductSerialization();
        Product product = new Product(1,"PenDrive",599.99,"USB drive");

        productSerialization.serializeProduct(product);
        productSerialization.deserializeProduct();

    }
}
