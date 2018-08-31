package Project.Mobiles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Specifications {
    private String Name;
    private double Price;
    private double ScreenSize;
    private int Ram;
    private int Internal_Storage;
    private String External_Storage;
    private int Front_camera;
    private String Rear_camera;
    private int Battery;
    private String Processor;
    private String Soc;
    private String Fingerprint_Sensor;
    private String FaceUnlock_Sensor;
    private String OS;
    Specifications(String Name, double Price, double ScreenSize, int Ram, int Internal_Storage, String External_Storage, int Front_Camera, String Rear_Camera, int Battery, String Processor, String Soc, String Fingerprint_Sensor, String FaceUnlock_Sensor, String OS)
    {
        this.Name = Name;
        this.Price = Price;
        this.ScreenSize = ScreenSize;
        this.Ram = Ram;
        this.Internal_Storage = Internal_Storage;
        this.External_Storage = External_Storage;
        this.Front_camera = Front_Camera;
        this.Rear_camera = Rear_Camera;
        this.Battery = Battery;
        this.Processor = Processor;
        this.Soc = Soc;
        this.Fingerprint_Sensor = Fingerprint_Sensor;
        this.FaceUnlock_Sensor = FaceUnlock_Sensor;
        this.OS = OS;
    }
    void PrintInfo()
    {
        System.out.println("Name of the Mobile : "+Name);
        System.out.println("Price of the Mobile : "+Price+"Rs/- only");
        System.out.println("Screen Size of the mobile : "+ScreenSize+" inches");
        System.out.println("Ram = "+Ram+" GB");
        System.out.println("Internal_Storage = "+Internal_Storage+" GB");
        System.out.println("External_Storage = "+External_Storage);
        System.out.println("Front_Camera = "+Front_camera+" MP");
        System.out.println("Rear_Camera = "+Rear_camera);
        System.out.println("Battery = "+Battery+" Mah");
        System.out.println("Processor = "+Processor);
        System.out.println("Soc = "+Soc);
        System.out.println("Fingerprint_Sensor = "+Fingerprint_Sensor);
        System.out.println("FaceUnlock_Sensor = "+FaceUnlock_Sensor);
        System.out.println("OS = "+OS);
    }
}
class Data
{
    private Specifications YUPHORIA = new Specifications("Yuphoria",7000.00,5.7, 2,16,"Expandable upto 32GB",5,"Single camera with 8MP",2230,"Qualcomm Snapdragon 450 1.2GHz","Soc","No","No", "Cyanogen with Android version 5.1");
    private Specifications MINOTE5PRO = new Specifications("Mi_note_5Pro",16737, 5.99,4,64,"Expandable upto 128GB", 20, "Dual camera with 12MP+5MP", 4000, "Qualcomm Snapdragon 636 1.8GHZ","Soc ", "Yes","Yes", "MIUI 9 with Android version 8.1");
    private Specifications ASUSZENFONEMAXPROM1 = new Specifications("Asus_Zenfone_Max_Pro_M1",12999,5.99,4,32,"Expandable upto 2TP", 8,"Dual camera with 13MP+5MP",5000, "Qualcomm Snapdragon 636 1.8GHz", "Soc", "Yes","Yes", "ZenUI with android version 8.1");
    private Specifications REALME1 = new Specifications("Real_Me_1", 13990, 6, 6,128,"expandable upto 256GB", 8,"Single camera 13MP with AI capability", 3410, "MediaTek Helio P-60 Chipset 2.0GHz","Soc", "No","Yes", "ColorOS with android version 8.1");
    private Specifications SAMSUNGS9PLUS =  new Specifications("Samsung_S8_Plus", 51990, 6.2, 4, 64,"Expandable upto 256GB",8,"Single camera 8MP with Dual Aperture", 3500,"Samsung Exynos 8895 Chipset 2.3GHz","Soc", "Yes", "Yes","Samsung custom skin Android version 8.1");
    private Specifications LGG7PLUSTHINQ = new Specifications("LG_g7+_ThinQ",39990, 6.1, 6, 128,"Expandable upto 2TB", 8,"Dual Camera 16MP(Normal Lens)+16MP(Wide Angle lens) with AI capability", 3000, "Qualcomm Snapdragon 845 chipset", "Soc","Yes", "Yes", "LG Custom UI with Android version 8.1" );
    private Specifications HONORPLAY = new Specifications("Honor_Play", 32999,6.3, 6,64,"Expandable upto 256GB Hybrid Type", 16,"Dual Camera 16MP + 2MP(Depth Sensing)",3750, "Huawei HiSilicon Kirin 970 Chiset", "Soc", "Yes","Yes", "Honor Custom UI with Android version 8.1");
    private Specifications ASUSZENFONE5Z = new Specifications("Asus_Zenfone_5Z",29999,6.2,6,64,"Expandable upto 2TB",8,"Dual Camera with 12MP(Normal Lens)+8MP(Wider Lens)",3300,"Qualcomm_Snapdragon 845 Chipset with Adreno 630 GPU","SOC","yes","Yes", "ZENUI Custom rom with Android version 8.0");
    private Specifications SAMSUNGNOTE9 = new Specifications("Samsung_Galaxy_Note_9", 84900,6.4,8,512,"Expandable upto 512GB",8,"Dual Camera with 12MP(Noraml Lens with dual Aperture f1.5,f2.4)+12MP(Telephoto Lens)",4000,"Samsung_Exynos 9810 Chipset with Mali G72 MP18 Octacore GPU", "SOC", "Yes","Yes","Samsung Custom Rom version 9.5 with Android Version 8.1");

    void Input(String input)
    {
        switch (input)
        {
            case "YUPHORIA":
                YUPHORIA.PrintInfo();
                break;
            case "MINOTE5PRO":
                MINOTE5PRO.PrintInfo();
                break;
            case "ASUSZENFONEMAXPROM1":
                ASUSZENFONEMAXPROM1.PrintInfo();
                break;
            case "REALME1":
                REALME1.PrintInfo();
                break;
            case "SAMSUNGS9PLUS":
                SAMSUNGS9PLUS.PrintInfo();
                break;
            case "LGG7+THINQ":
                LGG7PLUSTHINQ.PrintInfo();
                break;
            case "HONORPLAY":
                HONORPLAY.PrintInfo();
                break;
            case "ASUSZENFONE5Z":
                ASUSZENFONE5Z.PrintInfo();
                break;
            case "SAMSUNGNOTE9":
                SAMSUNGNOTE9.PrintInfo();
                break;
            default:
                System.out.println("Please Enter the valid Mobile Name in Specified format");

        }

    }
}

public class MobileWorld
{
    public static MobileWorld name = new MobileWorld();
    final public void  searchMobileSpecs()throws IOException
    {
        Data d1 = new Data();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true)
        {
            try
            {
                String input = br.readLine().toUpperCase();
                if(input.equals("QUIT"))
                {
                    System.out.println("Thank you for valuable Time");
                    break;
                }
                else
                    d1.Input(input);
            }
            catch (Exception e2)
            {
                System.out.println("Error: " +e2);
            }

        }
    }
}