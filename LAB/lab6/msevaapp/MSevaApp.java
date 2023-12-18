import MSeva.*;
import java.util.*;

public class MSevaApp
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Welcome to M-Seva");
     System.out.print("Enter your symptoms:");
     String symptoms=s.nextLine();
     String[] userSymptoms=symptoms.split(",\\s*");
     List<Disease> possibleDiseases = identify(userSymptoms);
     if (!possibleDiseases.isEmpty()) {
            System.out.println("Possible diseases based on symptoms:");

            for (Disease disease : possibleDiseases) {
                System.out.println(disease.getDiseaseName());
            }
        } else {
            System.out.println("No matching diseases found.");
        }

        s.close();
     }
  
    public static List<Disease> identify(String[] userSymptoms)
     {
        List<Disease> possiblediseases = new ArrayList<>();
        Disease[] diseases={new A(),new AP(),new BC(),new PC()};
        for(Disease d:diseases)
     {
          String[] symptoms=d.getSymptoms();
     
         if(containsAll(symptoms,userSymptoms))
         {
           possiblediseases.add(d);
         }
         }
         return possiblediseases;
     }
    private static boolean containsAll(String[] array1, String[] array2) {
        return Arrays.asList(array1).containsAll(Arrays.asList(array2));
    }
  }   
