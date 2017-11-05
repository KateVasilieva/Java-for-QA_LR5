package com.company;

public class Main {
    public static void main(String[] args) {

        //создаем объект (экземпл€р класса Contact)
        Contact contact=new Contact();
        //лева€ часть - выделение места пам€ти под объект
        //права€ часть - создание объекта по шаблону класса
        //середина - присваивание значений адреса ссылки на объект переменной
        String returnedName = contact.getName();
        System.out.println(returnedName);
        contact.setName("Boris");
        System.out.println(contact.getName());

        Contact contact2=new Contact();
        String returnedName2 = contact2.getName();
        System.out.println(returnedName2);

    }
}
