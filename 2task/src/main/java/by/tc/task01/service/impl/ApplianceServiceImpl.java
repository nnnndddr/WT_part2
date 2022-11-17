package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Kettle;
import by.tc.task01.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final ApplianceDAO applianceDAO;

    public ApplianceServiceImpl() {
        this.applianceDAO = new ApplianceDAOImpl();
    }

    @Override
    public Appliance getCheapestAppliance() {
        return applianceDAO.findCheapestAppliance();
    }

    @Override
    public List<Kettle> getKettles() {
        return applianceDAO.findKettles();
    }
}
