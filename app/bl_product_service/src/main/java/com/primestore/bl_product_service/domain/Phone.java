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
@Table(name = "phones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Phone extends Product {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpu_id")
    private Cpu cpu;
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
    @Column(name = "has_ex_memory_card_slot", nullable = false, columnDefinition = "bool default false")
    private Boolean hasExMemoryCardSlot;
    @Column(name = "count_sim_cards")
    private Integer countSimCards;
    @Column(name = "esim_support", nullable = false, columnDefinition = "bool default false")
    private Boolean esimSupport;
    @Column(name = "communication_standard", length = 10)
    private String communicationStandard;
    @Column(name = "count_main_camera")
    private Integer countMainCamera;
    @Column(name = "main_camera_resolution")
    private Integer mainCameraResolution;
    @Column(name = "has_nfc", nullable = false, columnDefinition = "bool default false")
    private Boolean hasNFC;
    @Column(length = 10)
    private String bluetooth;
    @Column(length = 30)
    private String wifi;
    @Column(length = 10)
    private String protection;
    @Column(name = "for_playing", nullable = false, columnDefinition = "bool default false")
    private Boolean forPlaying;
}
