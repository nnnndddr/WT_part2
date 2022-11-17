package by.tc.task01.entity;

import by.tc.task01.enums.ApplianceType;

public abstract class Appliance {
	protected int price;
    protected ApplianceType type;

    public Appliance(int price) {
        this.price = price;
        this.type = ApplianceType.valueOf(this.getClass().getSimpleName().toUpperCase());
    }

    public Appliance() {
        this.type = ApplianceType.valueOf(this.getClass().getSimpleName().toUpperCase());
    }
}
