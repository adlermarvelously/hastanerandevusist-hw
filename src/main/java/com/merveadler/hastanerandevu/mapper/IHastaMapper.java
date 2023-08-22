package com.merveadler.hastanerandevu.mapper;

import com.merveadler.hastanerandevu.repository.entity.Hasta;
import com.merveadler.hastanerandevu.dto.request.HastaSaveRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IHastaMapper {
    IHastaMapper INSTANCE = Mappers.getMapper(IHastaMapper.class);

    Hasta fromSaveDto(HastaSaveRequestDto dto);
}
