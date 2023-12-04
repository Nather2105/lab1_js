package org.example;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт CardioEquipment за допомогою патерну Builder
        CardioEquipment cardioEquipment = new CardioEquipment.Builder()
                .name("Treadmill")
                .quantity(2)
                .resistance(10)
                .build();

        // Виводимо інформацію про CardioEquipment
        System.out.println(cardioEquipment);
    }
}
