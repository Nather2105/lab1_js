package org.example;

public class CardioEquipment extends Equipment {
    private int resistance;

    private CardioEquipment(CardioBuilder builder) {
        super(builder);
        this.resistance = builder.resistance;
    }

    /**
     * Отримати рівень опору
     *
     * @return Рівень опору
     */
    public int getResistance() {
        return resistance;
    }

    /**
     * Перевизначений метод toString для представлення об'єкту CardioEquipment у вигляді рядка.
     *
     * @return Рядок, який представляє об'єкт CardioEquipment
     */
    @Override
    public String toString() {
        return "CardioEquipment{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", resistance=" + getResistance() +
                '}';
    }

    /**
     * Внутрішній клас CardioBuilder для створення об'єкту CardioEquipment
     */
    public static class CardioBuilder extends Equipment.Builder {
        protected int resistance;

        /**
         * Встановити рівень опору
         *
         * @param resistance Рівень опору
         * @return Посилання на самого себе для подальшої конфігурації
         */
        public CardioBuilder resistance(int resistance) {
            this.resistance = resistance;
            return this;
        }

        /**
         * Перевизначений метод build для створення об'єкту CardioEquipment з заданими параметрами.
         *
         * @return Новий об'єкт CardioEquipment
         */
        @Override
        public CardioEquipment build() {
            return new CardioEquipment(this);
        }
    }
}
