package presentation;

import business.DeliveryService;

public interface Observer {
    public void update(DeliveryService deliveryService);
}
