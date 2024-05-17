package payment;


import factory.DbProductFactory;
import model.Db;
import model.IDbProduct;

public class Payment {
    public void pay(String productID){

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
