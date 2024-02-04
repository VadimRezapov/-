package Classes;

import Interfaces.iCommand;

public abstract class Animal implements iCommand
{

    /**
     * Поле "Имя животного"
     */
    protected String name;

    /**
     * Поле "Дата рождения животного"
     */
    protected String dateOfBirthday;

}