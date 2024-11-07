package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Entity
@Table(name = "memories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Memory {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer ram;
    @Column(name = "ram_type", length = 10)
    private String ramType;
    private Integer rom;
    @Column(name = "rom_type", length = 10)
    private String romType;
}
