package com.smartschool.rest.controller;

import com.smartschool.rest.model.Pisma;
import com.smartschool.rest.servise.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("school")
public class MassageController {
    @Autowired
    MassageService massageService;

    @RequestMapping("/massages")
    public List<Pisma> getAllMassageForClassByClassId(@RequestParam(value = "class", defaultValue = "1") int classId) {

        List<Pisma> pismas = massageService.getAllMassageForClassByClassId(classId);

        return pismas;
    }

    @RequestMapping("/parentmassages")
    public List<Pisma> getMassagesByParentNum(@RequestParam(value = "mobnum", defaultValue = "380501111111") String classId) {

        List<Pisma> pismas = massageService.getMassagesByParentNum(classId);

        return pismas;
    }
}
