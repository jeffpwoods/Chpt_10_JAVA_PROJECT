/*
* 10.25 (New string split method) The split method in String
* class returns an array of strings consisting of the 
* substrings split by the delimiters. However, the delimiters
* are not returned. Implement the following new method that 
* returns an array of strings consisting of the substrings
* split by the matching delimiters, including the matching
* delimiters
* ex: split("ab#12#453", "#") returns ab, #, 12, #, 453
* to where normally, just using the built in split method
* this would return ab, 12, 453
*/ 

package toolkit;
import java.util.ArrayList;

public class Split {
    private String s; 
    private String regex; 

    public Split() {

    }

    public Split(String s, String regex) {
        this.s = s; 
        this.regex = regex; 
    }

    public void setS(String s) {
        this.s = s; 
    }

    public void setRegex(String regex) {
        this.regex = regex; 
    }

    public String getS() {
        return s; 
    }

    public String getRegex() {
        return regex; 
    }

    public String[] split(String s, String regex) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.split(regex).length; i++) {
            list.add(s.split(regex)[i]);
            if (i != s.split(regex).length - 1)
                list.add(regex);  
        }

        if (s.charAt(s.length() - 1) == regex.charAt(0))
            list.add(regex);

        String[] splitArray = new String[list.size()]; 
        
        for (int i = 0; i < list.size(); i++) {
            splitArray[i] = list.get(i); 
        }
        return splitArray; 
        }

    
    public void displayStringArray() {

        for (int i = 0; i < split(s, regex).length; i++) {
            System.out.print(split(s, regex)[i] + " "); 
        }

    }
    
    
}
