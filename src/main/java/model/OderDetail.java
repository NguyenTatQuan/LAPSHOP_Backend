package model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "oeder_detail")
public class OderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long price;
    private long quantity;
    private long subTotal;
    @ManyToOne
    @JoinColumn(name ="order_id")
    private Order order;
}
