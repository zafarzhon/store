package com.primestore.bl_product_service.mapper;

import com.primestore.bl_product_service.domain.Laptop;
import com.primestore.bl_product_service.dto.LaptopDto;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Mapper(componentModel = "Spring")
public interface LaptopMapper {
    List<LaptopDto> toDto(List<Laptop> laptops);

    LaptopDto toDto(Laptop laptops);

}
