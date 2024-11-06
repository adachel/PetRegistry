package org.example.View;

public class GeneralMenu extends Menu {

    private final MenuSelectAnimal menuSelectAnimal = new MenuSelectAnimal(super.dataBase);
    private final MenuCommands menuCommands = new MenuCommands(super.dataBase);

    public GeneralMenu() {
    }

    public void generalMenu(){
        while (true){
            System.out.println("Выберите действие");
            System.out.println( "1 - Добавить животное, " +
                    "2 - Меню команд животного " +
                    "3 - Всего животных " +
                    "4 - Список всех животных по дате рождения, " +
                    "5 - Список домашних животных, " +
                    "6 - Список вьючных животных, " +
                    "0 - Выход из программы");

            String ch = scanner.nextLine();

            switch (ch){
                case "1":
                    menuSelectAnimal.selectAnimal();
                    continue;

                case "2":
                    menuCommands.selectCommands();
                    continue;

                case "3":
                    System.out.println(pets.getCount() + packAnimals.getCount());
                    continue;

                case "4":
                    super.dataBase.listAnimalByDateOfBirth();
                    continue;

                case "5":
                    super.dataBase.printDB("pets");
                    continue;

                case "6":
                    super.dataBase.printDB("packAnimals");
                    continue;

                case "0":
                    System.out.println("Выход из программы");
                    return;

                default:
                    System.out.println("Сделайте корректный выбор");
            }
        }
    }
}
