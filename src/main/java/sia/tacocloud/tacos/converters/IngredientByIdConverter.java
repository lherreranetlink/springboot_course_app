package sia.tacocloud.tacos.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.tacocloud.tacos.domains.Ingredient;
import sia.tacocloud.tacos.domains.IngredientRef;
import sia.tacocloud.tacos.interfaces.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, IngredientRef> {

    private IngredientRepository ingredientRepo;

    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public IngredientRef convert(String id) {
        Ingredient ing =  ingredientRepo.findById(id).orElse(null);

        return new IngredientRef(ing.getId());
    }
}