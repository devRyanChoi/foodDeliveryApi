package mc.foodDeliveryApi.menu.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity @Getter
public class Restaurant {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int number;
}
