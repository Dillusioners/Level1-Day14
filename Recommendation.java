/*
 * Author - blueBoi101
 * Purpose - recommendation site
 * Date - 5.5.2023
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//Creating class for holding methods
public class Recommendation {

    //Boolean for signup status
    static boolean SignedUp = false;
    //Name and age for registration
    static String Username;
    static int Userage;;

    //Static reader object for versatile input scope
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Music choice 1
    static void Music() throws IOException {

        //Checking signup statsu
        if (!SignedUp)
            SignUp();
        //Once signed up printing recommendation
        System.out.println(">>Blow your headphones!\n>>Choose one among from what you like=>\n "
                + "1.Rap\n"
                + "2.Lo-fi\n"
                + "3.Indie Pop\n"
                + "4.Others\n"
                + ">>Enter your choice => \n");
        try {
            //Switching over recommendations
            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                //Case rap
                    System.out
                            .println(">> So you have chosen rap! We would like to recommend the following songs :\n"
                                    + "1.Goosebumps - Travis Scott\n"
                                    + "2.Relax and take notes - Biggie Smalls\n"
                                    + "3.Big Poppa - Biggie Smalls");
                    break;
                case 2:
                //Case Lofi
                    System.out.println(
                            ">> So you have chosen Lofi! We would like to recommend the following songs :\n"
                                    + "1.Dandelions - B.Ruth\n"
                                    + "2.ILY - Biggie Smalls\n"
                                    + "3.Toxic - BoyWithUke");
                    break;
                case 3:
                //case Indie Pop
                    System.out.println(
                            ">> So you have chosen Indie Pop! We would like to recommend the following songs :\n"
                                    + "1.Heart to Heart - Mac DeMarco\n"
                                    + "2.Freaks - Surf Curse\n"
                                    + "3.Homage - Mild High School");
                    break;
                case 4:
                //Case Miscellaneous
                    System.out
                            .println(">> So you have chosen Others! We would like to recommend the following songs :\n"
                                    + "1.Metamorphosis - Interworld\n"
                                    + "2.Double Take - Dhurv\n"
                                    + "3.Slim Shady - Eminem");
                    break;
                default:
                //if not in list invalid input
                    System.out.println(">> Invalid Input !!");
            }
        } catch (Exception e) {
            //Catching errors and throwing them
            System.out.println(">> Uh Huh something is wrong :(");
            System.exit(0);
        }

    }

    //Gaming section choice 2
    static void Gaming() throws IOException {
        //Sign up status check
        if (!SignedUp)
            SignUp();
        //Once signed up displaying options
        System.out.println(">>Welcome to the Gaming section!\n>>Choose one among from what you like=>\n "
                + "1.Horror\n"
                + "2.Arcade\n"
                + "3.Action\n"
                + "4.Others\n"
                + ">>Enter your choice => \n");
        try {
            //Switching over options
            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                //Case 1 Horror
                    System.out
                            .println(">> So you have chosen Horror! We would like to recommend the following songs :\n"
                                    + "1.Ghost of Tsushima\n"
                                    + "2.7-Days\n"
                                    + "3.Resident Evil");
                    break;
                case 2:
                //case 2 Arcade games
                    System.out.println(
                            ">> So you have chosen Arcade! We would like to recommend the following songs :\n"
                                    + "1.Mario kart\n"
                                    + "2.Fruit Ninja\n"
                                    + "3.SubWay Surferse");
                    break;
                case 3:
                //case 3 Action games
                    System.out.println(
                            ">> So you have chosen Action! We would like to recommend the following songs :\n"
                                    + "1.Minecraft\n"
                                    + "2.Resident Evil\n"
                                    + "3.Clash of clans");
                    break;
                case 4:
                //Miscellaneous games
                    System.out
                            .println(">> So you have chosen others! We would like to recommend the following songs :\n"
                                    + "1.Detroit Becomes Human\n"
                                    + "2.RDR2\n"
                                    + "3.GTA Sa");
                    break;
                default:
                //If not in option list
                    System.out.println(">> Invalid Input !!");
            }
        } catch (Exception e) {
            //catching errors
            System.out.println(">> Uh Huh something is wrong :(");
            System.exit(0);
        }
    }

    //Coding choice 3
    static void Coding() throws IOException {
        //Checking signup statsu
        if (!SignedUp)
            SignUp();
        //Once signed up displaying options
        System.out.println(">>Welcome to the Coding section!\n>>Choose one among from what you like=>\n "
                + "1.Web Dev\n"
                + "2.General Purpose\n"
                + "3.Low Level\n"
                + "4.Others\n"
                + ">>Enter your choice => \n");
        try {
            //Web Dev
            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                    System.out
                            .println(">> So you have chosen web dev! We would like to recommend the following songs :\n"
                                    + "1.HTML\n"
                                    + "2.CSS\n"
                                    + "3.PHP");
                    break;
                case 2:
                //For general purpose
                    System.out.println(
                            ">> So you have chosen general purpose! We would like to recommend the following songs :\n"
                                    + "1.Java\n"
                                    + "2.JavaScript\n"
                                    + "3.Python");
                    break;
                case 3:
                //For low level
                    System.out.println(
                            ">> So you have chosen Low Level! We would like to recommend the following songs :\n"
                                    + "1.C\n"
                                    + "2.C++\n"
                                    + "3.Rust");
                    break;
                case 4:
                //For weird ones
                    System.out
                            .println(">> So you have chosen others! We would like to recommend the following songs :\n"
                                    + "1.Malbolge\n"
                                    + "2.BrainFuck\n"
                                    + "3.Ruby");
                    break;
                default:
                //Default for not in list
                    System.out.println(">> Invalid Input !!");
            }
        } catch (Exception e) {
            //Catching errors
            System.out.println(">> Uh Huh something is wrong :(");
            System.exit(0);
        }

    }

    //Final Choice food choice 4
    static void Food() throws IOException {
        if (!SignedUp)
            SignUp();

            //Displaying menu after signing up
        System.out.println(">>Welcome to the Food section!\n>>Choose one among from what you like=>\n "
                + "1.Bengali\n"
                + "2.South Indian\n"
                + "3.North Indian\n"
                + "4.Others\n"
                + ">>Enter your choice => \n");
        try {
            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                //case 1 bengali
                    System.out
                            .println(">> So you have chosen Bengali! We would like to recommend the following songs :\n"
                                    + "1.Mach Bhat\n"
                                    + "2.Mangsho kosa\n"
                                    + "3.Nunur jhol");
                    break;
                case 2:
                //case 2 South Indian
                    System.out.println(
                            ">> So you have chosen South Indian! We would like to recommend the following songs :\n"
                                    + "1.Idli\n"
                                    + "2.Dosa\n"
                                    + "3.Uttapam");
                    break;
                case 3:
                //North Indian
                    System.out.println(
                            ">> So you have chosen North Indian! We would like to recommend the following songs :\n"
                                    + "1.Naan\n"
                                    + "2.Butter Chicken\n"
                                    + "3.Lamb Kofta");
                    break;
                case 4:
                //Radndom
                    System.out
                            .println(">> So you have chosen others! We would like to recommend the following songs :\n"
                                    + "1.Biraler Dim\n"
                                    + "2.Uther Dud\n"
                                    + "3.Gobar");
                    break;
                default:
                //Default for invalid entrance
                    System.out.println(">> Invalid Input !!");
            }
        } catch (Exception e) {
            //Handling errors
            System.out.println(">> Uh Huh something is wrong :(");
            System.exit(0);
        }
    }

    //The renowed sign up function
    static void SignUp() throws IOException {
        try {
            //Asking name and age in try catch
            System.out.println(">> Enter your name : ");
            Username = reader.readLine();
            System.out.println(">> Enter your age : ");
            Userage = Integer.parseInt(reader.readLine());
            //Displaying the credentials once signed in
            

            System.out.println(">> Successfully registered !\n"
                    + "NAME => " + Username + "\n"
                    + "AGE => " + Userage + "\n");
        } catch (Exception e) {
            //Catcing errors
            System.out.println(">> Something went wrong :()");
            System.exit(0);
        }
    }

    public static void display() {
        //Display method for initial menu
        System.out.println(">>Welcome to the recommendation site!\n>>Choose one among from what you like=>\n "
                + "1.Music\n"
                + "2.Gaming\n"
                + "3.Coding\n"
                + "4.Food\n"
                + ">>Enter your choice => \n");
    }

    public static void main(String[] args) throws IOException {
        //Calling display method
        display();
        try {
            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                //Switching over methods and calling them respectively
                //Music
                    Music();
                    break;
                case 2:
                //Gaming
                    Gaming();
                    break;
                case 3:
                //Coding
                    Coding();
                    break;
                case 4:
                //Food
                    Food();
                    break;
                default:
                //if not in list we exit code
                    System.out.println(">> Bye Bye!! ");
            }
        } catch (Exception e) {
            //catching exceptions
            System.out.println(">> Something went wrong !!");
            System.exit(0);
        }

    }
}
