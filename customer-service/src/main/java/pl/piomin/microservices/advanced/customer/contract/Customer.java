package pl.piomin.microservices.advanced.customer.contract;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Customer {
    @Id
    private Long id;
    private String username;
    private String password;
}
