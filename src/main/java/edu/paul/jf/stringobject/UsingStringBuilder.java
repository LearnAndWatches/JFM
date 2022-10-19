package edu.paul.jf.stringobject;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class UsingStringBuilder {
	
	
	
	public static void main(String args[])
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-YYYY");		
		StringBuilder strBuilder = new StringBuilder();
		
		
		//CONTOH YANG SALAH, JANGAN DITIRU !!!!
		String reportProblem = "";
		int intVictims = 253;
		
		reportProblem = "Hari ini pada tanggal "+sdf.format(timestamp)+" Telah meninggal "
						+intVictims+" orang di daerah San Fransisco karena bencana alam tsunami"; 
		System.out.println(reportProblem);
		System.out.println("==================================================================");
		
		
		strBuilder.setLength(0);//UNTUK MENGHILANGKAN ISI SEBELUMNYA
		reportProblem = strBuilder.append("Hari ini pada tanggal").append(sdf.format(timestamp)).append(" telah meninggal ").
						append(intVictims).append(" orang di daerah San Fransisco karena bencana alam tsunami").toString();
		
		System.out.println(reportProblem);
		System.out.println("==================================================================");
		
		strBuilder.setLength(0);
		reportProblem = strBuilder.append("Hari ini adalah tanggal ").append(sdf.format(timestamp)).toString();
		
		System.out.println(reportProblem);
		strBuilder.setLength(0);
	}	
}