package mc.foodDeliveryApi.menu.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Customer {

    @Id @GeneratedValue
    @Column(name = "customer_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();
}
