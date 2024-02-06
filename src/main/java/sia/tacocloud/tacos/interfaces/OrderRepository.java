package sia.tacocloud.tacos.interfaces;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.tacos.domains.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}