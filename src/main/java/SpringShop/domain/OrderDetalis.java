package SpringShop.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "order_detalis")
public class OrderDetalis {
    private static  final String SEQ_NAME = "order_detelis_seq" ;

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME,allocationSize = 1)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order ;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product ;
    private BigDecimal amount;
    private BigDecimal price ;




}
