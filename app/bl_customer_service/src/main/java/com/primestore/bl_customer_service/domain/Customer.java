package com.primestore.bl_customer_service.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Table(name = "customers")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Size(min = 5, max = 20)
    @NotBlank
    @Column(unique = true, nullable = false)
    private String login;
    private String password;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> orders = new ArrayList<>();
    //    private Integer balance = 10000;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public void addOrder(Order order) {
        orders.add(order);
        order.setCustomer(this);
    }
}
