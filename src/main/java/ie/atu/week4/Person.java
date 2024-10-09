package ie.atu.week4;

import jakarta.validation.constraints.Email;
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
    @NotBlank(message = "You must enter a title")
    private String title;
    @Min(value=1,message = "Must be greater or equal to one")
    private int employeeId;
    @Min(value=1,message = "Must be greater or equal to one")
    private int age;
    @Email(message = "You must enter a vaild email")
    private String email;
    @NotBlank(message = "You must enter a position")
    private String position;
    @NotBlank(message = "You must enter a department")
    private String department;

}

/*
Talend ID Block to test it working with valid arguments
{
        "name" : "evan",
        "title" : "student",
        "employeeId" : 7,
        "age" : 21,
        "email" : "evan@email.com",
        "position" : "student",
        "department" : "electronics"
        }

Talend ID block to test teh validation is working when there is errors in the arguments
{
  "name" : "",
  "title" : "",
  "employeeId" : 0,
  "age" : 0,
  "email" : "evanemail.com",
  "position" : "",
  "department" : ""
  }
 */