package com.smartschool.rest.servise;

import com.smartschool.rest.model.Pisma;
import com.smartschool.rest.repository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MassageService {
    @Autowired
    private MassageRepository massageRepository;

    public List<Pisma> getAllMassageForClassByClassId(int id) {
        return massageRepository.getAllMassageForClassByClassId(id);
    }

    public List<Pisma> getMassagesByParentNum(String num) {
        return massageRepository.getParentMassageByNumber(num);
    }
}
