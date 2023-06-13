package ArrayList_Association;

public class Appliances {
    String name;
    // Bidirectional reference
    UniqueId uniqueId = new UniqueId(this);
    ArrayListTryOut parent;
    boolean isOn;

    // Constructors
    Appliances(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public void addToParent(ArrayListTryOut parent) {
        parent.addAppliance(this);
    }

    public void setParent(ArrayListTryOut parent) {
        this.parent = parent;
    }

    public ArrayListTryOut getParent() {
        if (this.parent != null) {
            return this.parent;
        } else {
            return null;
        }
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsON() {
        return  this.isOn;
    }

    public String toString() {
        return "Appliances{" +
                "name=" + this.name +
                ", id=" + this.uniqueId +
                ", parent=" + this.parent +
                ", isOn=" + this.isOn +
                "}";
    }
}
