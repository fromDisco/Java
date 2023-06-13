package ArrayList_Association;

import java.util.ArrayList;

public class ArrayListTryOut {
    ArrayList<Appliances> applianceList = new ArrayList<>();

    public void addAppliance(Appliances appliance) {
        this.applianceList.add(appliance);
    }

    public int numberOfActiveAppliances() {
        int sum = 0;
        for (Appliances appliance : applianceList) {
            sum += appliance.getIsON() ? 1 : 0;
        }
        return sum;
    }

    public String toString() {
        return "ArrayList{" +
                "applianceList = " + applianceList +
                "}";
    }
}
