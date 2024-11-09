package com.primestore.bl_product_service.mapper;

import com.primestore.bl_product_service.domain.Smartphone;
import com.primestore.bl_product_service.dto.SmartphoneDto;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */
@Mapper(componentModel = "Spring")
public interface SmartphoneMapper {
    List<SmartphoneDto> toDto(List<Smartphone> smartphones);

}
