package sia.tacocloud.tacos.interfaces;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.tacos.domains.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}