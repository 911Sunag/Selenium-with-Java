package l04;

import java.util.Arrays;

public class Strings_16 {

	public static void main(String[] args) 
	{
		String a="Your name";
		String b="  Your name   ";
		String c="YOUr nAme";
		String d="testing tools";
		String e="Testing Tools";
		String f="Testing Tools";
		String g="Testing Tools";
		String h="Testing Tools";
		String i="Testing Tools";
		String j="Testing Tools";
		String K="Testing Tools";
		String l="Testing Tools";
		String m="Testing Tools";
		String n="Testing Tools";
		String o="Testing Tools";
		System.out.print(
		"1."+a.length()+
		"\n2."+b.trim()+
		"\n3."+c.toUpperCase()+
		"\n4."+d.toLowerCase()+
		"\n5."+e.startsWith("Tes")+" "+e.endsWith("he")+
		"\n6."+f.indexOf("T")+
		"\n7."+g.lastIndexOf("T")+
		"\n8."+h.charAt(5)+
		"\n9."+i.replace("s", "k")+
		"\n10."+j.contains("G")+
		"\n11."+K.contains("g")+
		"\n12."+(Arrays.toString(l.split(">"))+
	    "\n13."+m.substring(0, 5))+
		"\n14."+n.substring(8)+
		"\n15."+o.replaceAll(o, "Manual Testing"));
	}

}
