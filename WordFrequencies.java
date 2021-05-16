import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      var text = scnr.nextLine();
      String[] keys = text.split(" ");
        String[] uniqueKeys;
        int count = 0;
        uniqueKeys = getUniqueKeys(keys);

        for(String key: uniqueKeys)
        {
            if(null == key)
            {
                break;
            }           
            for(String s : keys)
            {
                if(key.equals(s))
                {
                    count++;
                }               
            }
            System.out.println(key+" - "+count);
            count=0;
        }
        scnr.close();
    }

    private static String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }           

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;               
            }
            keyAlreadyExists = false;
        }       
        return uniqueKeys;
   }
}