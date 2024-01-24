package sia.tacocloud.tacos.interfaces;

import java.util.Optional;
import sia.tacocloud.tacos.domains.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}