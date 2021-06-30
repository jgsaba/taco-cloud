package saba.manning.study.tacocloud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);

    List<Order> findByDeliveryToAndDeliveryCityAllIgnoresCase(
            String deliveryTo, String deliveryCity);
}
