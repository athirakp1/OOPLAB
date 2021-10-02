import java.io.*;

class CO4Q7
{
    public static void main(String arg[]) throws Exception
    {
        char txt;
        int wordCount = 0, lineCount = 1, characterCount;
        File co4q7 = new File("CO4Q7.txt");
        FileInputStream fis = new FileInputStream(co4q7);
        characterCount = fis.available();
        for(int i = 0; i<characterCount; i++)
        {
            txt = (char)fis.read();
            if(txt == '\n')
                lineCount++;
            else if(txt == ' ')
                wordCount++;
        }
        System.out.println("Number of words      : " + (wordCount + lineCount));
        System.out.println("Number of characters : " + characterCount);
        System.out.println("Number of lines      : " + lineCount);
    }
}