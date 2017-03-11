import java.util.ArrayList;
public class TextProcessor {
    /**
     * Defining the singleton class "TextProcessor"
     * which provides other classes with some methods.
     */
    /**
     * A private TextProcessor Field so as to maintain the
     * no of instances to atmost one .
     */
    private static TextProcessor textProcessor = null;
    /** A private constructer so that no one can initialize
     *  the class directly
     */
    private TextProcessor(){}
    /** A static method which makes sure the private 
     * constructer is called iff the class field 
     * textProcessor == null ,i.e if it is the first time
     * and only time it is used
     */
    public static TextProcessor getInstance() { 
       if(textProcessor == null)
         {
           textProcessor = new TextProcessor();
         }
       return textProcessor;
    }
    /**
     *Get the words present in the input String
     *@return An array containing all the
     *        words from the input string.
     */
    public String[] getWords(String string){
        System.out.println("getWords() method is called.");
        ArrayList<String> temp = new ArrayList<String>();
        int i,j = 0,n;
        n = string.length();
        for(i=0;i<n;i++)
        {
          if(string.charAt(i) == ' ') 
           { 
              temp.add(string.substring(j,i));
              j = i + 1;
           }
          else if(i==(n-1))
                {
                   temp.add(string.substring(j,(i+1)));
                }        
        }
        n = temp.size(); 
        String[] temp2 = new String[n];
        for(i=0;i<n;i++)
        {
           temp2[i] = temp.get(i);
        }
        return temp2;
    }
    /** 
     *Get the no of words in the input string
     *@return The number of words present
     *         in the input string. 
     */
    public int getWordCount(String string){
       System.out.println("getWordCount() method is called.");
       String[] temp;
       temp = this.getWords(string);
       return temp.length; 
    }
    /** 
     *Get the no of words in the input string
     *@return an Array  containing
     *          the length of each word from the input string.
     */
    public int[] getWordLengths(String string){
       System.out.println("getWordLengths() method is called.");
       String[] temp;
       temp = this.getWords(string);
       int i = 0,n = temp.length;
       int[] tempnum = new int[n];
       for(String s : temp)
       {
          tempnum[i] = s.length();
          i++; 
       }
       return tempnum;
    }
    
}
