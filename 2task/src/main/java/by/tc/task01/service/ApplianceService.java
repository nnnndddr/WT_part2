package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Kettle;

import java.util.List;

public interface ApplianceService {
    Appliance getCheapestAppliance();
    List<Kettle> getKettles();
}
