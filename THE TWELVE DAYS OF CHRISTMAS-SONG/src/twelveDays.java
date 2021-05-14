import java.util.Scanner;
public class twelveDays {
    private String FirstDisplay;
    private int total;
    private int increment;


    public twelveDays(String name) {
        FirstDisplay = name;
    }

    public void setFirstDisplay(String name) {
        FirstDisplay = name;
    }

    public String getFirstDisplay() {
        return FirstDisplay;
    }

    public void display() {
        System.out.printf("Title of song \n%s!\n\n", getFirstDisplay());
    }

    public void inputDays() {
        Scanner input = new Scanner(System.in);
        int Day;

        System.out.printf("THE LYRICS OF THE SONG");

        System.out.print("\n Enter the day here: ");
        Day= input.nextInt();
    }

    public void lyricsOfTheSong() {
        int Day = 12;
        switch (Day) {
            case 1:
                System.out.print("On the first day of Christmas my true love gave to me \n A partridge in a pear tree");
                break;
            case 2:
                System.out.print("On the second day of Christmas my true love gave to me \n Two turtle doves and a partridge in a pear tree");
                break;
            case 3:
                System.out.print("On the third day of Christmas my true love gave to me \n Three french hens, two turtle doves and a partridge in a pear tree");
                break;
            case 4:
                System.out.print("On the fourth day of Christmas my true love gave to me \n Four calling birds, three french hens, two turtle doves and a partridge in a pear tree");
                break;
            case 5:
                System.out.print("On the fifth day of Christmas my true love gave to me \n Five gold rings, four calling birds, three french hens, \n two turtle doves and a partridge in a pear tree");
                break;
            case 6:
                System.out.print("On the sixth day of Christmas my true love gave to me \n Six geese a laying, five gold ring, four calling birds,\n three french hens, two turtle doves, and a partridge in a pear tree");
                break;
            case 7:
                System.out.print("On the seventh day of Christmas my true love gave to me \n Seven swans a swimming, six geese a laying, five gold rings,\n four calling birds, three french hens, two turtle doves,\n and a partridge in a pear tree");
                break;
            case 8:
                System.out.print("On the eighth of Christmas my true love gave to me \n Eight maids a milking, seven swans a swimming, six geese a laying, \n five gold rings, four calling birds, three french hens,\n two turtle doves, and a partridge in a pear tree");
                break;
            case 9:
                System.out.print("On the ninth day of Christmas my true love gave to me \n Nine ladies dancing, eight maids a milking, seven swans a swimming, \n six geese a laying, five gold rings, four calling birds,\n three french hens, two turtle doves and a partridge in a pear tree");
            case 10:
                System.out.print("On the tenth day of Christmas my true love gave to me\n Ten lords a leaping, nine ladies dancing, eight maids a milking, \n seven swans a swimming,six geese a laying, five gold rings, \n four calling birds, three french hens, to turtle doves and a partridge in a pear tree");
                break;
            case 11:
                System.out.print("On the eleventh day of Christmas my true love gave to me \nEleven pipers piping, ten lords a leaping, nine ladies dancing, \n eight maids a milking, seven swans a swimming, six geese a laying,\n five gold rings, four calling birds, three french hens,\n two turtle doves and a partridge in a pear tree");
                break;
            case 12:
                System.out.print("On the twelfth day of Christmas my true love gave to me \nTwelve drummers drumming, eleven pipers piping, ten lords a leaping,\n nine ladies dancing, eight maids a milking, seven swans a swimming, \n six geese a laying, five gold rings, four calling birds,\n three french hens, two turtle doves and a partridge in a pear tree");
                break;
            default:
                System.out.print("Pick a day!");
        }
    }

    public static void main(String[] args) {
        twelveDays myDays = new twelveDays("This is it!");
        myDays.display();
        myDays.inputDays();
        myDays.lyricsOfTheSong();
        
    }
}



