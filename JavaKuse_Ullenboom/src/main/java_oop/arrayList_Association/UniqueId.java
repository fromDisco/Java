package arrayList_Association;

import java.util.UUID;

public class UniqueId {
    UUID id;
    // Bidirectional reference
    Appliances appliance;

    UniqueId(Appliances appliance) {
        this.appliance = appliance;
        this.id = UUID.randomUUID();
    }

    public String toString() {
        return id.toString();
    }
}
