class Percobaan3 {
public static void main (String args[])
{
	System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra"); char hrfAwal = 'a';
System.out.print("Sebutkan huruf awal hewan kesukaanmu: ");
try {hrfAwal = (char)System.in.read(); }
catch (Exception e)
{System.out.println("Error: " + e.toString()); }
switch (hrfAwal) {
case 'a' :
System.out.println("Anjing- Anda seorang yang setia!");
case 'b' :
System.out.println("Beo- Anda peniru ulung!");
case 'k' :
System.out.println("Kucing-Anda cute deh!");
default : System.out.println("Tebak sendiri ya..!");
}
}
}