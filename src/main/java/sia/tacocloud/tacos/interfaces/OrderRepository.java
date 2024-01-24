package sia.tacocloud.tacos.interfaces;

import sia.tacocloud.tacos.domains.TacoOrder;

public interface OrderRepository {

    public TacoOrder save(TacoOrder order);
}