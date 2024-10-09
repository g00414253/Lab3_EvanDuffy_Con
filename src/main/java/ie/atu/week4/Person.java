package ie.atu.week4;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @NotBlank(message = "You must enter a name")
    private String name;
    @Min(value=1,message="Must be greater or equal to 1")
    private int id;

}
