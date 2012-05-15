package it.geomad89.work;

public class Support {
  
  public static String convertCharacter(char c) {
    
    String s = Character.toString(c);
    if (s.equals(" ")) {s = "&nbsp;"; return s;}
    if (s.equals("\"")) {s = "&quot;"; return s;}
    if (s.equals("&")) {s = "&amp;"; return s;}
    if (s.equals("<")) {s = "&lt;"; return s;}
    if (s.equals(">")) {s = "&gt;"; return s;}
    if (s.equals("©")) {s = "&copy;"; return s;}
    if (s.equals("®")) {s = "&reg;"; return s;}
    if (s.equals("´")) {s = "&acute;"; return s;}
    if (s.equals("«")) {s = "&laquo;"; return s;}
    if (s.equals("»")) {s = "&raquo;"; return s;}
    if (s.equals("¡")) {s = "&iexcl;"; return s;}
    if (s.equals("¿")) {s = "&iquest;"; return s;}
    if (s.equals("À")) {s = "&Agrave;"; return s;}
    if (s.equals("à")) {s = "&agrave;"; return s;}
    if (s.equals("Á")) {s = "&Aacute;"; return s;}
    if (s.equals("á")) {s = "&aacute;"; return s;}
    if (s.equals("Â")) {s = "&Acirc;"; return s;}
    if (s.equals("â")) {s = "&acirc;"; return s;}
    if (s.equals("Ã")) {s = "&Atilde;"; return s;}
    if (s.equals("ã")) {s = "&atilde;"; return s;}
    if (s.equals("Ä")) {s = "&Auml;"; return s;}
    if (s.equals("ä")) {s = "&auml;"; return s;}
    if (s.equals("Å")) {s = "&Aring;"; return s;}
    if (s.equals("å")) {s = "&aring;"; return s;}
    if (s.equals("Æ")) {s = "&AElig;"; return s;}
    if (s.equals("æ")) {s = "&aelig;"; return s;}
    if (s.equals("Ç")) {s = "&Ccedil;"; return s;}
    if (s.equals("ç")) {s = "&ccedil;"; return s;}
    if (s.equals("Ð")) {s = "&ETH;"; return s;}
    if (s.equals("ð")) {s = "&eth;"; return s;}
    if (s.equals("È")) {s = "&Egrave;"; return s;}
    if (s.equals("è")) {s = "&egrave;"; return s;}
    if (s.equals("É")) {s = "&Eacute;"; return s;}
    if (s.equals("é")) {s = "&eacute;"; return s;}
    if (s.equals("Ê")) {s = "&Ecirc;"; return s;}
    if (s.equals("ê")) {s = "&ecirc;"; return s;}
    if (s.equals("Ë")) {s = "&Euml;"; return s;}
    if (s.equals("ë")) {s = "&euml;"; return s;}
    if (s.equals("Ì")) {s = "&Igrave;"; return s;}
    if (s.equals("ì")) {s = "&igrave;"; return s;}
    if (s.equals("Í")) {s = "&Iacute;"; return s;}
    if (s.equals("í")) {s = "&iacute;"; return s;}
    if (s.equals("Î")) {s = "&Icirc;"; return s;}
    if (s.equals("î")) {s = "&icirc;"; return s;}
    if (s.equals("Ï")) {s = "&Iuml;"; return s;}
    if (s.equals("ï")) {s = "&iuml;"; return s;}
    if (s.equals("Ñ")) {s = "&Ntilde;"; return s;}
    if (s.equals("ñ")) {s = "&ntilde;"; return s;}
    if (s.equals("Ò")) {s = "&Ograve;"; return s;}
    if (s.equals("ò")) {s = "&ograve;"; return s;}
    if (s.equals("Ó")) {s = "&Oacute;"; return s;}
    if (s.equals("ó")) {s = "&oacute;"; return s;}
    if (s.equals("Ô")) {s = "&Ocirc;"; return s;}
    if (s.equals("ô")) {s = "&ocirc;"; return s;}
    if (s.equals("Õ")) {s = "&Otilde;"; return s;}
    if (s.equals("õ")) {s = "&otilde;"; return s;}
    if (s.equals("Ö")) {s = "&Ouml;"; return s;}
    if (s.equals("ö")) {s = "&ouml;"; return s;}
    if (s.equals("Ø")) {s = "&Oslash;"; return s;}
    if (s.equals("ø")) {s = "&oslash;"; return s;}
    if (s.equals("Ù")) {s = "&Ugrave;"; return s;}
    if (s.equals("ù")) {s = "&ugrave;"; return s;}
    if (s.equals("Ú")) {s = "&Uacute;"; return s;}
    if (s.equals("ú")) {s = "&uacute;"; return s;}
    if (s.equals("Û")) {s = "&Ucirc;"; return s;}
    if (s.equals("û")) {s = "&ucirc;"; return s;}
    if (s.equals("Ü")) {s = "&Uuml;"; return s;}
    if (s.equals("ü")) {s = "&uuml;"; return s;}
    if (s.equals("Ý")) {s = "&Yacute;"; return s;}
    if (s.equals("ý")) {s = "&yacute;"; return s;}
    if (s.equals("ÿ")) {s = "&yuml;"; return s;}
    if (s.equals("Þ")) {s = "&THORN;"; return s;}
    if (s.equals("þ")) {s = "&thorn;"; return s;}
    if (s.equals("ß")) {s = "&szlig;"; return s;}
    if (s.equals("§")) {s = "&sect;"; return s;}
    if (s.equals("¶")) {s = "&para;"; return s;}
    if (s.equals("µ")) {s = "&micro;"; return s;}
    if (s.equals("¦")) {s = "&brvbar;"; return s;}
    if (s.equals("±")) {s = "&plusmn;"; return s;}
    if (s.equals("·")) {s = "&middot;"; return s;}
    if (s.equals("¨")) {s = "&uml;"; return s;}
    if (s.equals("¸")) {s = "&cedil;"; return s;}
    if (s.equals("ª")) {s = "&ordf;"; return s;}
    if (s.equals("º")) {s = "&ordm;"; return s;}
    if (s.equals("¬")) {s = "&not;"; return s;}
    if (s.equals("_")) {s = "&shy;"; return s;}
    if (s.equals("¯")) {s = "&macr;"; return s;}
    if (s.equals("°")) {s = "&deg;"; return s;}
    if (s.equals("¹")) {s = "&sup1;"; return s;}
    if (s.equals("²")) {s = "&sup2;"; return s;}
    if (s.equals("³")) {s = "&sup3;"; return s;}
    if (s.equals("¼")) {s = "&frac14;"; return s;}
    if (s.equals("½")) {s = "&frac12;"; return s;}
    if (s.equals("¾")) {s = "&frac34;"; return s;}
    if (s.equals("×")) {s = "&times;"; return s;}
    if (s.equals("÷")) {s = "&divide;"; return s;}
    if (s.equals("¢")) {s = "&cent;"; return s;}
    if (s.equals("£")) {s = "&pound;"; return s;}
    if (s.equals("¤")) {s = "&curren;"; return s;}
    if (s.equals("¥")) {s = "&yen;"; return s;}
    return s;
  }
  
  public static String convertString(String s) {
	  
	  String finalString = "";
	  int l = s.length();
	  for (int i = 0; i < l; i++) {
		  finalString += convertCharacter(s.charAt(i));
	  }
	  return finalString;
  }
}
