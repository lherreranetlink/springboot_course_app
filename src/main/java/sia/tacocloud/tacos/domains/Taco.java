package sia.tacocloud.tacos.domains;

import java.util.List;
import java.util.Date;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

    private Long id;
    @NotNull
    @Size(min = 4, message = "Name must be at least 4 characters long")
    private String name;
    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    private Date createdAt = new Date();
}