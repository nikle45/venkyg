package venky;

public class MegaBytesConverter {

	public static void printMegaBytesAndKiloBytes(int KiloBytes) {
		if(KiloBytes<0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(KiloBytes+" KB = "+ (KiloBytes/1024)+" MB and "+(KiloBytes%1024)+" KB");
		}
	}
}
