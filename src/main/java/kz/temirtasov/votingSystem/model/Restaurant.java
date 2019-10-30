package kz.temirtasov.votingSystem.model;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private String name;
    private int id;
    private Map<Integer, String> menu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, String> getMenu() {
        return new HashMap<Integer, String>(menu);
    }

    public void setMenu(Map<Integer, String> menu) {
        this.menu = menu;
    }
}
