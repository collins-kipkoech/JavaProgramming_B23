package day12_scanner;

public class PeopleInAShip {

    public static void main(String[] args) {
        int people = 75;
        String message = "";

        switch(people){
            case 50:
                message = "20 crew, 30 passengers";
                break;
            case 75:
                message = "25 crew 50 passengers";
                break;
            case 100:
                message = "30 crew, 70 passengers";
                break;
            default:
                message = "Invalid";
                break;
        }
        System.out.println(message);

    }
}
/*
3. Given a number of people on the ship determine how many need to be crew members
and how many can be passengers. Print how many of each type there should be.

            Total: 50 | 20 crew, 30 passengers
            Total: 75 | 25 crew, 50 passengers
            Total: 100 | 30 crew, 70 passengers
            Any other number of people on the ship is not valid
* */
