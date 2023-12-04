package org.example;


/**
 * Клас, що представляє силове обладнання в спортзалі
 */
public class StrengthEquipment extends Equipment {
    private int weight;

    private StrengthEquipment(Builder builder) {
        super(builder);
        this.weight = builder.weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "StrengthEquipment{" +
                "name='" + getName() + '\'' +

                ", quantity=" + getQuantity() +
                ", weight=" + weight +
                '}';
    }

    private int getQuantity() {
        return quantity;
    }

    private String getName() {
        return name;
    }

    public static class Builder extends Equipment.Builder {
        private int weight;

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public StrengthEquipment build() {
            return new StrengthEquipment(this);
        }
    }
}
