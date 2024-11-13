package com.primestore.bl_customer_service.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
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
    @Min(value = 5)
    @Max(value = 20)
    @NotBlank
    @NotEmpty
    @Column(unique = true, nullable = false)
    private String login;
    private String password;
    @Column(name = "orders_id")
    private String ordersIdString;
    @Transient
    private List<Integer> ordersId;
    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
