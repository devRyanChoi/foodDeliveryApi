package mc.foodDeliveryApi.menu.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class OrderMenu {
     @Id@GeneratedValue
     @Column(name = "order_menu_id")
     private Long id;

     @ManyToOne
     @JoinColumn(name = "menu_id")
     private Menu menu;

     @ManyToOne
     @JoinColumn(name = "order_id")
     private Order order;

     private int count;

}
