//create car class with some methods as described..

import java.util.Scanner;
class Car{
    int speed;
    int distance = 300;
    int duration;
    
    void startTheCar(){
        System.out.println("VIT CHENNAI");
    }
    void stopTheCar(){
        System.out.println("GOOGLE BANGALORE");
    }
    
    void calculateTravelTime(int s){
        speed = s;
        duration = distance/speed;
    }
}

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Car car1 = new Car();
        
        int i = input.nextInt();
        car1.calculateTravelTime(i);
        car1.startTheCar();
        System.out.println(car1.duration + " hours");
        car1.stopTheCar();
        input.close();
    }
}