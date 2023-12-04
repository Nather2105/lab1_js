package org.example;

/**
 * Базовий клас, що представляє обладнання в спортзалі
 */
public abstract class Equipment {
    protected String name;
    protected int quantity;

    /**
     * Конструктор класу Equipment.
     *
     * @param builder Об'єкт класу Builder для конфігурації Equipment
     */
    protected Equipment(Builder builder) {
        this.name = builder.name;
        this.quantity = builder.quantity;
    }

    /**
     * Повертає рядок, який представляє поточний об'єкт в розгорнутому вигляді.
     *
     * @return Рядок, який представляє об'єкт Equipment
     */
    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    /**
     * Визначає, чи є об'єкт, рівний іншому об'єкту.
     *
     * @param obj Об'єкт, який порівнюється
     * @return true, якщо об'єкти рівні, інакше false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Equipment equipment = (Equipment) obj;

        if (quantity != equipment.quantity) return false;
        return name != null ? name.equals(equipment.name) : equipment.name == null;
    }

    /**
     * Визначає хеш-код об'єкта.
     *
     * @return Хеш-код об'єкта
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + quantity;
        return result;
    }

    /**
     * Клас для створення об'єкту Equipment за допомогою патерну Builder
     */
    public static class Builder {
        String name;
        int quantity;

        /**
         * Встановлює назву обладнання.
         *
         * @param name Назва обладнання
         * @return Посилання на самого себе для подальшої конфігурації
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Встановлює кількість обладнання.
         *
         * @param quantity Кількість обладнання
         * @return Посилання на самого себе для подальшої конфігурації
         */
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Метод для створення об'єкту Equipment з заданими параметрами.
         *
         * @return Новий об'єкт Equipment
         */
        public Equipment build() {
            return new Equipment(this) {
                // Порожній тіло для анонімного внутрішнього класу
            };
        }


    }
}
