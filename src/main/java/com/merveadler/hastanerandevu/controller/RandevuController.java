package com.merveadler.hastanerandevu.controller;

import com.merveadler.hastanerandevu.repository.entity.Randevu;
import com.merveadler.hastanerandevu.dto.request.RandevuSaveReqestDto;
import com.merveadler.hastanerandevu.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.merveadler.hastanerandevu.constants.RestApiList.*;
@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;

    @PostMapping(SAVE)
    public Randevu save(@RequestBody @Valid RandevuSaveReqestDto dto){
        return randevuService.save(dto);
    }
}
