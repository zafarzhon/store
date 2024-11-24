package com.primestore.bl_order_service.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Transient
    private List<Integer> productsId;
    @Transient
    private List<Integer> productsQuantity;
    @Transient
    private List<Integer> productsPrice;
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "products_id", nullable = false)
    private String productsIdString;
    @Column(name = "products_quantity", nullable = false)
    private String productsQuantityString;
    @Column(name = "products_price", nullable = false)
    private String productsPriceString;
    @Enumerated(EnumType.STRING)
    private Status status;
}
