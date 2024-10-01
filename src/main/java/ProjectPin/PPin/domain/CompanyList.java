package ProjectPin.PPin.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "CompanyList")
public class CompanyList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Cnb;
    private String Position;
    private String Department;
    private Long BaseSalary;
}
