package com.primestore.bl_product_service.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Entity
@Table(name = "laptops")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Laptop extends Product {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpu_id")
    private Cpu cpu;
    @Column(length = 30)
    private String gpu;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memory_id")
    private Memory memory;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "display_id")
    private Display display;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "battery_id")
    private Battery battery;
    @Column(name = "operation_system", length = 15)
    private String operationSystem;
    @Column(name = "camera_resolution")
    private Integer cameraResolution;
    @Column(length = 10)
    private String bluetooth;
    @Column(length = 30)
    private String wifi;
    @Column(name = "for_playing", nullable = false, columnDefinition = "bool default false")
    private Boolean forPlaying;
}
