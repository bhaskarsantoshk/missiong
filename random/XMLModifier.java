package random;

public class XMLModifier {
    public static void main(String[] args){
       String s= "<A><C><D><a>a</a><b>b</b></C></D></A><B><a>a</a><b>b</b></B></X></Y></Z>";

        String res="";

        boolean flag= false;
        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i)=='<' && s.charAt(i+1)=='/' && flag==false){
               if(res.charAt(res.length()-1)!='>' ){

                   i+=2;
                   while(s.charAt(i)!='>'){
                      // res+=s.charAt(i)+"";
                       i++;
                   }
                   flag= true;

               }
           }
           else if(s.charAt(i)=='<' && s.charAt(i+1)=='/' && flag==true){
               while(s.charAt(i)!='>'){
                   res+=s.charAt(i)+"";
                   i++;
               }
               res+=s.charAt(i)+"";
               //flag= false;
           }
           else{
               res+=s.charAt(i)+"";
               if(s.charAt(i)=='>'){
                   flag= false;
               }
           }

        }
        System.out.println(res);

    }
}
