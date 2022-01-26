package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Human {
    private String fullName;
    private Date dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;
}
