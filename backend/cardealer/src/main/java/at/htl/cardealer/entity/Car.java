package at.htl.cardealer.entity;


import javax.persistence.*;
import javax.xml.namespace.QName;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ID")
    private Long id;
    @Column(name = "C_BRAND")
    String brand;
    @Column(name = "C_MODEL")
    String model;
    @Column(name = "C_HP")
    int hp;
    @Column(name = "C_Construction")
    int construction_year;
    @Column(name = "C_COLOR")
    String color;

    public Car() {
    }

    public Car(String brand, String model, int hp, int construction_year, String color) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.construction_year = construction_year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", hp=" + hp +
                ", construction_year=" + construction_year +
                ", color='" + color + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getConstruction_year() {
        return construction_year;
    }

    public void setConstruction_year(int construction_year) {
        this.construction_year = construction_year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
