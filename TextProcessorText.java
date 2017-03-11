public class TextProcessorText {
    public static void main(String[] args){
       if(args.length != 1)
        {
           System.out.println("Please enter one sentence enclosed in the Double Quotes");
        }
        String string = args[0];
       TextProcessor TP = TextProcessor.getInstance();
       String[] temp =  TP.getWords(string);
       System.out.println("The words in the input string are - ");
       for(int i=0;i<temp.length;i++)
       {
          System.out.println(temp[i]);
       }
       int i = TP.getWordCount(string);
       System.out.println("The no of words in the string are - "+i);
       int j[] = TP.getWordLengths(string);
       System.out.println("The lengths of individual words is - ");
       for(int k=0;k<i;k++)
       {
          System.out.print(j[k]+" ");
       }  
    } 
}

