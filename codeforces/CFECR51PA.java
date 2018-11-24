package codeforces;
import java.util.*;

public class CFECR51PA {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int t = in .nextInt(); in .nextLine();
  while (t != 0) {
   String s = in .nextLine();
   String res = modifiedString(s);
   System.out.println(res);
   t--;
  }

 }

 public static String modifiedString(String s) {
  if (isValid(s) == true) {
   return s;
  }

  int digitCount = 0;
  int lowerCaseCount = 0;
  int upperCaseCount = 0;
  for (int i = 0; i < s.length(); i++) {
   if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
    lowerCaseCount++;
   } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
    upperCaseCount++;
   } else {
    digitCount++;
   }
  }
  String res = "";
  if (digitCount == 0 && lowerCaseCount == 0) {
   res = "1a" + s.substring(2);
  } else if (digitCount == 0 && upperCaseCount == 0) {
   res = "1A" + s.substring(2);
  } else if (upperCaseCount == 0 && lowerCaseCount == 0) {
   res = "aA" + s.substring(2);
  } else if (lowerCaseCount == 0) {
   res = modifyString(s, lowerCaseCount, upperCaseCount, digitCount);
  } else if (upperCaseCount == 0) {
   res = modifyString(s, lowerCaseCount, upperCaseCount, digitCount);
  } else if (digitCount == 0) {
   res = modifyString(s, lowerCaseCount, upperCaseCount, digitCount);
  }
  return res;
 }

 public static boolean isValid(String s) {
  Set < Character > set = new HashSet < Character > ();
  for (int i = 0; i < s.length(); i++) {
   if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
    set.add('a');
   } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
    set.add('A');
   } else {
    set.add('1');
   }
  }
  if (set.size() == 3) {
   return true;
  } else {
   return false;
  }
 }

 public static String modifyString(String s, int lowerCaseCount, int upperCaseCount, int digitCount) {
  String res = "";
  if (digitCount == 0) {
   if (upperCaseCount > 1) {
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && flag == false) {
      res += "1";
      flag = true;
     } else {
      res += s.charAt(i) + "";
     }
    }
   } else {
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && flag == false) {
      res += "1";
      flag = true;
     } else {
      res += s.charAt(i) + "";
     }
    }
   }
  } else if (lowerCaseCount == 0) {
   if (upperCaseCount > 1) {
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && flag == false) {
      res += "a";
      flag = true;
     } else {
      res += s.charAt(i) + "";
     }
    }
   } else {
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag == false) {
      res += "a";
      flag = true;
     } else {
      res += s.charAt(i) + "";
     }
    }
   }
  } else {
   if (lowerCaseCount > 1) {
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && flag == false) {
      res += "A";
      flag = true;
     } else {
      res += s.charAt(i) + "";
     }
    }
   } else {
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag == false) {
      res += "A";
      flag = true;
     } else {
      res += s.charAt(i) + "";
     }
    }
   }
  }

  return res;
 }
}
