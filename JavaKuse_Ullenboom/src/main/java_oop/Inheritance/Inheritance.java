package Inheritance;

import java.awt.*;

public class Inheritance extends Parent {
    String type;
    Color color;

    /**
     * super() calls constructor of parent class.
     * parent class requires arguments, so child class has to require them, too.
     * @param name Parent Class field
     * @param isOn Parent Class field
     * @param type String, defines type of device. e.g. "Raspberry Pi"
     * @param color Color, instance of Color with given int color value
     * @see Color
     */
    Inheritance(String name, boolean isOn, String type, int color) {
        super(name, isOn);
        this.type = type;
        this.color = new Color(color);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setColor(int color) {
        this.color = new Color(color);
    }

    public String toString() {
        return "Inheritance{" +
                "name=" + this.name +
                ", isOn=" + this.isOn +
                ", type=" + this.type +
                ", color=" + this.color +
                "}";
    }
}
