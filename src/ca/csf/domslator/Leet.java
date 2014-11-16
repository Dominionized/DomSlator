package ca.csf.domslator;

public class Leet {

	/*
	 * Adapted from Kim Togo's original C# version : http://www.codeproject.com/Tips/207582/L-t-Tr-nsl-t-r-Leet-Translator
	 */
	public static String toLeet(String text, int degree) {
		return translate(text, degree);
	}

	public static String toLeet(String text) {
		return toLeet(text, 30);
	}

    public static String translate(String text, int degree)
    {
      // Adjust degree between 0 - 100
      degree = degree >= 100 ? 100 : degree <= 0 ? 0 : degree;
      // No Leet Translator
      if (degree == 0)
        return text;
      // StringBuilder to store result.
      StringBuilder sb = new StringBuilder(text.length());
      for (char c : text.toCharArray())
      {
        if (degree < 17 && degree > 0)
        {
          switch (c)
          {
            case 'e': sb.append("3"); break;
            case 'E': sb.append("3"); break;
            default: sb.append(c); break;
          }
        }
        else if (degree < 33 && degree > 16)
        {
          switch (c)
          {
            case 'a': sb.append("4"); break;
            case 'e': sb.append("3"); break;
            case 'i': sb.append("1"); break;
            case 'o': sb.append("0"); break;
            case 'A': sb.append("4"); break;
            case 'E': sb.append("3"); break;
            case 'I': sb.append("1"); break;
            case 'O': sb.append("0"); break;
            default: sb.append(c); break;
          }
        }
        else if (degree < 49 && degree > 32)
        {
          switch (c)
          {
            case 'a': sb.append("4"); break;
            case 'e': sb.append("3"); break;
            case 'i': sb.append("1"); break;
            case 'o': sb.append("0"); break;
            case 'A': sb.append("4"); break;
            case 'E': sb.append("3"); break;
            case 'I': sb.append("1"); break;
            case 'O': sb.append("0"); break;
            case 's': sb.append("$"); break;
            case 'S': sb.append("$"); break;
            case 'l': sb.append("£"); break;
            case 'L': sb.append("£"); break;
            case 'c': sb.append("("); break;
            case 'C': sb.append("("); break;
            case 'y': sb.append("¥"); break;
            case 'Y': sb.append("¥"); break;
            case 'u': sb.append("µ"); break;
            case 'U': sb.append("µ"); break;
            case 'd': sb.append("Ğ"); break;
            case 'D': sb.append("Ğ"); break;
            default: sb.append(c); break;
          }
        }
        else if (degree < 65 && degree > 48)
        {
          switch (c)
          {
            case 'a': sb.append("4"); break;
            case 'e': sb.append("3"); break;
            case 'i': sb.append("1"); break;
            case 'o': sb.append("0"); break;
            case 'A': sb.append("4"); break;
            case 'E': sb.append("3"); break;
            case 'I': sb.append("1"); break;
            case 'O': sb.append("0"); break;
            case 'k': sb.append("|{"); break;
            case 'K': sb.append("|{"); break;
            case 's': sb.append("$"); break;
            case 'S': sb.append("$"); break;
            case 'g': sb.append("9"); break;
            case 'G': sb.append("9"); break;
            case 'l': sb.append("£"); break;
            case 'L': sb.append("£"); break;
            case 'c': sb.append("("); break;
            case 'C': sb.append("("); break;
            case 't': sb.append("7"); break;
            case 'T': sb.append("7"); break;
            case 'z': sb.append("2"); break;
            case 'Z': sb.append("2"); break;
            case 'y': sb.append("¥"); break;
            case 'Y': sb.append("¥"); break;
            case 'u': sb.append("µ"); break;
            case 'U': sb.append("µ"); break;
            case 'f': sb.append("ƒ"); break;
            case 'F': sb.append("ƒ"); break;
            case 'd': sb.append("Ğ"); break;
            case 'D': sb.append("Ğ"); break;
            default: sb.append(c); break;
          }
        }
        else if (degree < 81 && degree > 64)
        {
          switch (c)
          {
            case 'a': sb.append("4"); break;
            case 'e': sb.append("3"); break;
            case 'i': sb.append("1"); break;
            case 'o': sb.append("0"); break;
            case 'A': sb.append("4"); break;
            case 'E': sb.append("3"); break;
            case 'I': sb.append("1"); break;
            case 'O': sb.append("0"); break;
            case 'k': sb.append("|{"); break;
            case 'K': sb.append("|{"); break;
            case 's': sb.append("$"); break;
            case 'S': sb.append("$"); break;
            case 'g': sb.append("9"); break;
            case 'G': sb.append("9"); break;
            case 'l': sb.append("£"); break;
            case 'L': sb.append("£"); break;
            case 'c': sb.append("("); break;
            case 'C': sb.append("("); break;
            case 't': sb.append("7"); break;
            case 'T': sb.append("7"); break;
            case 'z': sb.append("2"); break;
            case 'Z': sb.append("2"); break;
            case 'y': sb.append("¥"); break;
            case 'Y': sb.append("¥"); break;
            case 'u': sb.append("µ"); break;
            case 'U': sb.append("µ"); break;
            case 'f': sb.append("ƒ"); break;
            case 'F': sb.append("ƒ"); break;
            case 'd': sb.append("Ğ"); break;
            case 'D': sb.append("Ğ"); break;
            case 'n': sb.append("|\\|"); break;
            case 'N': sb.append("|\\|"); break;
            case 'w': sb.append("\\/\\/"); break;
            case 'W': sb.append("\\/\\/"); break;
            case 'h': sb.append("|-|"); break;
            case 'H': sb.append("|-|"); break;
            case 'v': sb.append("\\/"); break;
            case 'V': sb.append("\\/"); break;
            case 'm': sb.append("|\\/|"); break;
            case 'M': sb.append("|\\/|"); break;
            default: sb.append(c); break;
          }
        }
        else if (degree > 80 && degree < 100)
        {
          switch (c)
          {
            case 'a': sb.append("4"); break;
            case 'e': sb.append("3"); break;
            case 'i': sb.append("1"); break;
            case 'o': sb.append("0"); break;
            case 'A': sb.append("4"); break;
            case 'E': sb.append("3"); break;
            case 'I': sb.append("1"); break;
            case 'O': sb.append("0"); break;
            case 's': sb.append("$"); break;
            case 'S': sb.append("$"); break;
            case 'g': sb.append("9"); break;
            case 'G': sb.append("9"); break;
            case 'l': sb.append("£"); break;
            case 'L': sb.append("£"); break;
            case 'c': sb.append("("); break;
            case 'C': sb.append("("); break;
            case 't': sb.append("7"); break;
            case 'T': sb.append("7"); break;
            case 'z': sb.append("2"); break;
            case 'Z': sb.append("2"); break;
            case 'y': sb.append("¥"); break;
            case 'Y': sb.append("¥"); break;
            case 'u': sb.append("µ"); break;
            case 'U': sb.append("µ"); break;
            case 'f': sb.append("ƒ"); break;
            case 'F': sb.append("ƒ"); break;
            case 'd': sb.append("Ğ"); break;
            case 'D': sb.append("Ğ"); break;
            case 'n': sb.append("|\\|"); break;
            case 'N': sb.append("|\\|"); break;
            case 'w': sb.append("\\/\\/"); break;
            case 'W': sb.append("\\/\\/"); break;
            case 'h': sb.append("|-|"); break;
            case 'H': sb.append("|-|"); break;
            case 'v': sb.append("\\/"); break;
            case 'V': sb.append("\\/"); break;
            case 'k': sb.append("|{"); break;
            case 'K': sb.append("|{"); break;
            case 'r': sb.append("®"); break;
            case 'R': sb.append("®"); break;
            case 'm': sb.append("|\\/|"); break;
            case 'M': sb.append("|\\/|"); break;
            case 'b': sb.append("ß"); break;
            case 'B': sb.append("ß"); break;
            case 'q': sb.append("Q"); break;
            case 'Q': sb.append("Q¸"); break;
            case 'x': sb.append(")("); break;
            case 'X': sb.append(")("); break;
            default: sb.append(c); break;
          }
        }
        else if (degree > 99)
        {
          switch (c)
          {
            case 'a': sb.append("4"); break;
            case 'e': sb.append("3"); break;
            case 'i': sb.append("1"); break;
            case 'o': sb.append("0"); break;
            case 'A': sb.append("4"); break;
            case 'E': sb.append("3"); break;
            case 'I': sb.append("1"); break;
            case 'O': sb.append("0"); break;
            case 's': sb.append("$"); break;
            case 'S': sb.append("$"); break;
            case 'g': sb.append("9"); break;
            case 'G': sb.append("9"); break;
            case 'l': sb.append("£"); break;
            case 'L': sb.append("£"); break;
            case 'c': sb.append("("); break;
            case 'C': sb.append("("); break;
            case 't': sb.append("7"); break;
            case 'T': sb.append("7"); break;
            case 'z': sb.append("2"); break;
            case 'Z': sb.append("2"); break;
            case 'y': sb.append("¥"); break;
            case 'Y': sb.append("¥"); break;
            case 'u': sb.append("µ"); break;
            case 'U': sb.append("µ"); break;
            case 'f': sb.append("ƒ"); break;
            case 'F': sb.append("ƒ"); break;
            case 'd': sb.append("Ğ"); break;
            case 'D': sb.append("Ğ"); break;
            case 'n': sb.append("|\\|"); break;
            case 'N': sb.append("|\\|"); break;
            case 'w': sb.append("\\/\\/"); break;
            case 'W': sb.append("\\/\\/"); break;
            case 'h': sb.append("|-|"); break;
            case 'H': sb.append("|-|"); break;
            case 'v': sb.append("\\/"); break;
            case 'V': sb.append("\\/"); break;
            case 'k': sb.append("|{"); break;
            case 'K': sb.append("|{"); break;
            case 'r': sb.append("®"); break;
            case 'R': sb.append("®"); break;
            case 'm': sb.append("|\\/|"); break;
            case 'M': sb.append("|\\/|"); break;
            case 'b': sb.append("ß"); break;
            case 'B': sb.append("ß"); break;
            case 'j': sb.append("_|"); break;
            case 'J': sb.append("_|"); break;
            case 'P': sb.append("|°"); break;
            case 'q': sb.append("¶"); break;
            case 'Q': sb.append("¶¸"); break;
            case 'x': sb.append(")("); break;
            case 'X': sb.append(")("); break;
            default: sb.append(c); break;
          }
        }
      }
      return sb.toString(); // Return result.
    }
}