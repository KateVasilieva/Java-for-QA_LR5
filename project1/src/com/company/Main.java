package com.company;

public class Main {
    public static void main(String[] args) {

        //������� ������ (��������� ������ Contact)
        Contact contact=new Contact();
        //����� ����� - ��������� ����� ������ ��� ������
        //������ ����� - �������� ������� �� ������� ������
        //�������� - ������������ �������� ������ ������ �� ������ ����������
        String returnedName = contact.getName();
        System.out.println(returnedName);
        contact.setName("Boris");
        System.out.println(contact.getName());

        Contact contact2=new Contact();
        String returnedName2 = contact2.getName();
        System.out.println(returnedName2);

    }
}
