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
public class Car {
    private String name;
    private String manufacturerName;
    private Date yearOfManufacture;
    private float engineCapacity;
}
