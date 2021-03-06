package GeoTree.geo;


import GeoTree.core.model.CellObject;

/**
 * Класс для построения геологического дерева человека. Здесь человек используется не как существо,
 * а как запись в хранилище, от чего и название.
 */
public class Person extends CellObject {
    int ID;
    String fullName;
    Sex sex;

    public Person(int ID, String fullName, Sex sex) {
        super(sex);
        this.ID = ID;
        this.fullName = fullName;
        this.sex = sex;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", ID, fullName, sex);
    }
}
