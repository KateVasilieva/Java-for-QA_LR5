package com.company;

class Contact {

    String name="Serj"; //������ �������� �� ���������
    int id;

    //����� - ��������
     private String privateMetod(){ //��������� �����
    //���� ������ - �������� ����� ��������
         return ""; //������ ������ ������
}
    //������ ���� - �������� ������, ��������� ������� ��������� ��� ��� ����� ������
    // void - ������ �� ������
    // ������� - ����� ������ �� ������
    public void setName(String name){
         this.name = name;
         this.id = 0;

}
    //����� ������ ������ (string)
    //�� �����, ���� ����� - �� int
    public String getName() { //�������� �����
        return name; //���������� ���, ������� ��� �������
    }
}
