package sia.tacocloud.tacos.interfaces;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.tacos.domains.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}