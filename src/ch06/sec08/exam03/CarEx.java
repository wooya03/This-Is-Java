package ch06.sec08.exam03;

import java.sql.SQLOutput;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);
        if(myCar.isLeftGas()){
            System.out.println("출발합니다");
            myCar.run();
        }
        System.out.println("가스를 주입하세요.");
    }
}
