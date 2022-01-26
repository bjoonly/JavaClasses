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
public class Book {
    private String name;
    private String nameOfAuthor;
    private Date releaseYear;
    private String publisherName;
    private String genre;
    private int pagesNumber;
}
