package com.merveadler.hastanerandevu.mapper;

import com.merveadler.hastanerandevu.repository.entity.Doktor;
import com.merveadler.hastanerandevu.dto.request.DoktorSaveRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDoktorMapper {
    IDoktorMapper INSTANCE = Mappers.getMapper(IDoktorMapper.class);

    Doktor fromSaveDto(DoktorSaveRequestDto dto);
}
