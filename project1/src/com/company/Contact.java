package com.company;

class Contact {

    String name="Serj"; //задали значение по умолчанию
    int id;

    //метод - действие
     private String privateMetod(){ //приватный метод
    //тело метода - содержит набор действий
         return ""; //вернет пустую строку
}
    //стринг нейм - параметр метода, принимает значени переданые там где метод вызван
    // void - ничего не вернет
    // мстринг - метод ничего не вернет
    public void setName(String name){
         this.name = name;
         this.id = 0;

}
    //метод вернет строку (string)
    //не число, если число - то int
    public String getName() { //открытый метод
        return name; //возвращает имя, которое явл строкой
    }
}
