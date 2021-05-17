import business.BaseProduct;
import business.DeliveryService;
import data.Serializator;
import presentation.Controller;

public class MainClass {
    public static void main(String[] args) {
        BaseProduct.readItems();
        DeliveryService deliveryService = new DeliveryService();
     //   Serializator.serializeData();
        Serializator.deserializeData();
        Controller controller = new Controller(deliveryService);
    }
}
