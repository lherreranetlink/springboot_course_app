package sia.tacocloud.tacos.domains;

import java.util.List;
import java.util.Date;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class Taco {

    @Id
    private Long id;

    @NotNull
    @Size(min = 4, message = "Name must be at least 4 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    //@MappedCollection(idColumn = "taco", keyColumn = "ingredient")
    private List<IngredientRef> ingredients;

    private Date createdAt = new Date();
}