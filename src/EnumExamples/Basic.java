package EnumExamples;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //public, static and final
        //since its final you can create child enums
        //type is week
        Week(){
            System.out.println("This is the week of monday"+this);
        }
        //this is not public or protected,only private or default
        //why? we don't want to create new objects
        //this is not the enum concept,that's why

    }
    //we cannot access explicitly

    public static void main(String[] args) {
        Week = week;
        week=Week.Monday;
        for(Week day:Week.values()){
            System.out.println(day);
        }
    }
}
