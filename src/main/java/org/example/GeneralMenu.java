package org.example;

public class GeneralMenu extends Menu{

    private final MenuSelectAnimal menuSelectAnimal = new MenuSelectAnimal(super.dataBase);

    public GeneralMenu() {
    }

    public void generalMenu(){
        while (true){
            System.out.println("Выберите действие");
            System.out.println( "1 - Добавить животное, " +
                    "2 - Список команд животного и обучение животного новым командам " +
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
                    System.out.println("Выберите тип животного: 1 - Домашнее животное, 2 - Вьючное животное");
                    String select = scanner.nextLine();
                    System.out.println("Введите Id животного");
                    String id = scanner.nextLine();

                    while (true){
                        System.out.println("Выберите действие: " +
                                "1 - Просмотр команд животного, " +
                                "2 - Добавить новую команду, " +
                                "0 - Выход в предыдущее меню");

                        String command = scanner.nextLine();

                        switch (select){
                            case "1":
                                switch (command){
                                    case "1":
                                        System.out.println("Действующие команды: ");
                                        super.dataBase.listCommands(id, "pets");
                                        continue;

                                    case "2":
                                        System.out.println("Выберите новые команды");
                                        String newCommands = scanner.nextLine();
                                        super.dataBase.addCommand(id, newCommands, "pets");
                                        continue;

                                    case "0":
                                        break;

                                    default:
                                        System.out.println("Сделайте корректный выбор");
                                }
                                break;

                            case "2":
                                switch (command){
                                    case "1":
                                        System.out.println("Действующие команды: ");
                                        super.dataBase.listCommands(id, "packAnimals");
                                        continue;

                                    case "2":
                                        System.out.println("Добавить новую команду");
                                        String newCommands = scanner.nextLine();
                                        super.dataBase.addCommand(id, newCommands, "packAnimals");
                                        continue;

                                    case "0":
                                        continue;

                                    default:
                                        System.out.println("Сделайте корректный выбор");
                                }
                                break;
                            default:
                                System.out.println("Сделайте корректный выбор");
                        }
                        break;
                    }

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
