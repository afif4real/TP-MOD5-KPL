import java.util.Random;


public class SayaTubeVideo { //1302204076
    private int id;
    private String title;
    private int playCount;

    public SayaTubeVideo(String x) {
        Random y = new Random();
        this.id = y.nextInt(99999);
        this.title = x;
        playCount = 0;
    }

    public void IncreasePlayCount(int x) {
        playCount ++;
        try {
            this.playCount += x;
        }
        catch (Exception exception) {
            System.out.print(exception.toString());
        }
    }

    public void PrintVideoDetails() {
        System.out.println("Id : " + id);
        System.out.println("Title : " + title);
        System.out.println("PlayCount : " + playCount);
    }
//    public static void main(String[] args)
//    {
//        SayaTubeVideo a = new SayaTubeVideo("Tutorial Design By Contract – Afif Fajar Rayhan");
//        a.PrintVideoDetails();
//        for (int i = 0; i < 1; i++)
//        {
//            a.IncreasePlayCount(0);
//        }
//        a.PrintVideoDetails();
//    }
}
