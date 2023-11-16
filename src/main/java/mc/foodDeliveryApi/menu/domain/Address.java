package mc.foodDeliveryApi.menu.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Embeddable
@Getter
public class Address {

    @Id @GeneratedValue
    private Long id;
    private String unit_number;
    private String street_number;
    private String address_line1;
    private String address_line2;
    private String city;
    private String province;
    private String postal_code;

}
