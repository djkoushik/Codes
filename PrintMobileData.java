package Question.Mobile;
import Project.Mobiles.MobileWorld;
import java.io.IOException;

public class PrintMobileData{
    public static void main(String argv[])throws IOException
    {
        String mob[] = {"Yuphoria","MiNote5pro","AsusZenfoneMaxProM1","RealME1","LGg7+thinQ","Samsungs9Plus","HonorPlay","AsusZenfone5Z","SamsungNote9"};
        System.out.println("Enter the Mobile name");
        for(int i=0; i< mob.length; i++)
        {
            System.out.println(mob[i]);
        }

        MobileWorld.name.searchMobileSpecs();
    }
}