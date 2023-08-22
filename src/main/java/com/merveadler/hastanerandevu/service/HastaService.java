package com.merveadler.hastanerandevu.service;

import com.merveadler.hastanerandevu.repository.IHastaRepository;
import com.merveadler.hastanerandevu.repository.entity.Hasta;
import com.merveadler.hastanerandevu.dto.request.HastaSaveRequestDto;
import com.merveadler.hastanerandevu.mapper.IHastaMapper;
import com.merveadler.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HastaService extends ServiceManager<Hasta,Long> {
    private final IHastaRepository repository;

    public HastaService(IHastaRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Hasta save(HastaSaveRequestDto dto){
        Hasta hasta = IHastaMapper.INSTANCE.fromSaveDto(dto);
        return save(hasta);
    }
}
