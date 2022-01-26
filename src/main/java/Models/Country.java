package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    private String name;
    private String continentName;
    private int population;
    private String telephoneCode;
    private String capitalName;
    private List<String> cities;
}
