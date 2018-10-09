package multithreading;

public class StringObjectsConversion {
    //String
    String s= "A";

    //Converting to StringBuffer
    StringBuffer sb= new StringBuffer(s);

    //Converting to StringBuilder
    StringBuilder sbl = new StringBuilder(s);

    //sbf to s
    String s2= sb.toString();

    //sbl to s
    String s3= sbl.toString();

    //sbr to sbl
    String s4 = sb.toString();
    StringBuilder sbl1 = new StringBuilder(s4);


}
/*

Conclusion:

Objects of String are immutable, and objects of StringBuffer and StringBuilder are mutable.
StringBuffer and StringBuilder are similar, but StringBuilder is faster and preferred over
StringBuffer for single threaded program. If thread safety is needed, then StringBuffer is used.

 */