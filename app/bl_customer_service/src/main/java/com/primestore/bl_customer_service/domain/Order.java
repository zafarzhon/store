package com.primestore.bl_customer_service.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Product> products = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private Customer customer;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.IN_PROGRESS;
    private Integer totalPrice;

    public void addProduct(Product p) {
        products.add(p);
        p.setOrder(this);
    }

    @PrePersist
    protected void onCreate() {
        if (products != null && !products.isEmpty()) {
            totalPrice = products.stream().map(p -> p.getPrice() * p.getQuantity()).mapToInt(p -> p).sum();
        }
    }

    @PreUpdate
    protected void onUpdate() {
        if (products != null && !products.isEmpty()) {
            totalPrice = products.stream().map(p -> p.getPrice() * p.getQuantity()).mapToInt(p -> p).sum();
        }
    }
}
