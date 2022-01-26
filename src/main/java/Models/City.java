package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private String name;
    private String regionName;
    private String countryName;
    private int population;
    private String postcode;
    private String telephoneCode;
}
