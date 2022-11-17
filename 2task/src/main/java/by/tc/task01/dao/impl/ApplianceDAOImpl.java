package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Kettle;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.enums.OS;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    @Override
    public List<Kettle> findKettles() {
        List<Kettle> kettles = new ArrayList<>();

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/appliances.xml");

            Node root = document.getDocumentElement();

            NodeList appliances = root.getChildNodes();

            for (int i = 0; i < appliances.getLength(); i++) {
                Node appliance = appliances.item(i);

                if (appliance.getNodeType() != Node.TEXT_NODE) {
                    NodeList applianceProps = appliance.getChildNodes();

                    Map<String, Object> potentialKettle = new HashMap<>();

                    for (int j = 0; j < applianceProps.getLength(); j++) {
                        Node applianceProp = applianceProps.item(j);

                        if (applianceProp.getNodeType() != Node.TEXT_NODE) {
                            potentialKettle.put(applianceProp.getNodeName(),
                                    applianceProp.getChildNodes().item(0).getTextContent());
                        }
                    }

                    if (potentialKettle.get("type").equals("Kettle")) {
                        int price = Integer.parseInt(potentialKettle.get("price").toString());
                        double volume = Double.parseDouble(potentialKettle.get("volume").toString());
                        int powerConsumption = Integer.parseInt(potentialKettle.get("powerConsumption").toString());

                        kettles.add(new Kettle(price, powerConsumption, volume));
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace(System.out);
        }

        return kettles;
    }

    @Override
    public Appliance findCheapestAppliance() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/appliances.xml");

            Node root = document.getDocumentElement();

            NodeList appliances = root.getChildNodes();
            Integer minPrice = null;
            Map<String, Object> potentialAppliance = new HashMap<>();
            Map<String, Object> potentialApplianceTemporary = new HashMap<>();

            for (int i = 0; i < appliances.getLength(); i++) {
                Node appliance = appliances.item(i);

                if (appliance.getNodeType() != Node.TEXT_NODE) {
                    NodeList applianceProps = appliance.getChildNodes();

                    for (int j = 0; j < applianceProps.getLength(); j++) {
                        Node applianceProp = applianceProps.item(j);

                        if (applianceProp.getNodeType() != Node.TEXT_NODE) {
                            potentialApplianceTemporary.put(applianceProp.getNodeName(),
                                    applianceProp.getChildNodes().item(0).getTextContent());
                        }
                    }

                    int price = Integer.parseInt(potentialApplianceTemporary.get("price").toString());

                    if (minPrice != null) {
                        if (minPrice > price) {
                            minPrice = price;
                            potentialAppliance = new HashMap<>(potentialApplianceTemporary);
                        } else {
                            potentialApplianceTemporary = new HashMap<>();
                        }
                    } else {
                        minPrice = price;
                    }
                }
            }

            String type = (String) potentialAppliance.get("type");

            switch (type) {
                case "Kettle" -> {
                    int price = Integer.parseInt(potentialAppliance.get("price").toString());
                    double volume = Double.parseDouble(potentialAppliance.get("volume").toString());
                    int powerConsumption = Integer.parseInt(potentialAppliance.get("powerConsumption").toString());

                    return new Kettle(price, powerConsumption, volume);
                }
                case "Laptop" -> {
                    int price = Integer.parseInt(potentialAppliance.get("price").toString());
                    double batteryCapacity = Double.parseDouble(potentialAppliance.get("batteryCapacity").toString());
                    OS os = OS.valueOf(potentialAppliance.get("os").toString());
                    int memoryRom = Integer.parseInt(potentialAppliance.get("memoryRom").toString());
                    int systemMemory = Integer.parseInt(potentialAppliance.get("systemMemory").toString());
                    double CPU = Double.parseDouble(potentialAppliance.get("CPU").toString());
                    int displayInchs = Integer.parseInt(potentialAppliance.get("displayInchs").toString());

                    return new Laptop(price, batteryCapacity, os, memoryRom, systemMemory, CPU, displayInchs);
                }
                case "Oven" -> {
                    int price = Integer.parseInt(potentialAppliance.get("price").toString());
                    int powerConsumption = Integer.parseInt(potentialAppliance.get("powerConsumption").toString());
                    int weight = Integer.parseInt(potentialAppliance.get("weight").toString());
                    int capacity = Integer.parseInt(potentialAppliance.get("capacity").toString());
                    int depth = Integer.parseInt(potentialAppliance.get("depth").toString());
                    int height = Integer.parseInt(potentialAppliance.get("height").toString());
                    int width = Integer.parseInt(potentialAppliance.get("width").toString());

                    return new Oven(price, powerConsumption, weight, capacity, depth, height, width);
                }
                default -> throw new RuntimeException();
            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            throw new RuntimeException();
        }
    }
}
