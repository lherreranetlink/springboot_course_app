package sia.tacocloud.tacos.domains;

import lombok.Data;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

@Data
public class IngredientRef {
    private final String ingredient;

    //AggregateReference<Ingredient, String> ingredient;
}