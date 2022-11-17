package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Kettle;

import java.util.List;

public interface ApplianceDAO {
    List<Kettle> findKettles();
    Appliance findCheapestAppliance();
}
