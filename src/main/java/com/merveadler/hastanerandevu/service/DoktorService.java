package com.merveadler.hastanerandevu.service;

import com.merveadler.hastanerandevu.repository.IDoktorRepository;
import com.merveadler.hastanerandevu.repository.entity.Doktor;
import com.merveadler.hastanerandevu.utility.ServiceManager;
import com.merveadler.hastanerandevu.dto.request.DoktorSaveRequestDto;
import com.merveadler.hastanerandevu.mapper.IDoktorMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorService extends ServiceManager<Doktor,Long> {
    private final IDoktorRepository repository;

    public DoktorService(IDoktorRepository repository){
        super(repository);
        this.repository = repository;
    }
    public Doktor save(DoktorSaveRequestDto dto){
        /**
         * Dikkat Burada ek neler yapılabilir?
         * 1- Doktorların özel olan bilgileri kontrol edilerek mükerrer kayıt yapılmasının önüne geçilebilir
         * 2- bransid benzersiz ve tutarlı olduğu için kontrol edilebilir. bransid yok ise kayıt işlemi
         * hata fırlatabilir.
         */
        Doktor doktor = IDoktorMapper.INSTANCE.fromSaveDto(dto);
        return repository.save(doktor);
    }

    public List<Doktor> findByAd(String ad){
        return repository.findAllByAdContaining(ad);
    }
}
