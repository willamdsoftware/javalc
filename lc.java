/*
 * lc.java
 * 
 * Copyright 2020 Unknown <will@archz50>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.io.*;
import java.lang.*;
import java.util.*;

public class lc {
	
	public static void main (String[] args) {
		
		int x = 0;
		int y = 0;
		int wordcount = 0;
		String[][] Words = new String[10001][2];
		
		for (y = 0; y < 10001; y++){
			Words[y][0] = "";
			Words[y][1] = "";
		}
		//System.out.println("".equals(Words[10][0]));
		//System.out.println(Words[10][0].equals(""));
		
		try {
			File f = new File("/home/will/words");
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				Words[x][0] = s.nextLine();
				Words[x][1] = s.nextLine();
				x++;
				wordcount++;
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		int result;
		int a;
		int b;
		int d = 0;
		int eb;
		String uc;
		
		String thestr3;
		thestr3 = args[0];
		//en = Integer.parseInt(thestr3);
		
		if (thestr3.equals("en")){
		int theval;
		theval = Integer.parseInt(args[1]);
		
		System.out.println("Squared: " + Math.pow(theval, 2) + " Square root: " + Math.sqrt(theval));
		System.out.println("Cubed: " + Math.pow(theval, 3) + " Cube root: " + Math.cbrt(theval));
		System.out.println("^4: " + Math.pow(theval, 4) + " Fourth root: " + Math.pow(theval, 1.0 / 4.0));
		System.out.println("^5: " + Math.pow(theval, 5) + " Fifth root: " + Math.pow(theval, 1.0 / 5.0));
		System.out.println("^6: " + Math.pow(theval, 6) + " Sixth root: " + Math.pow(theval, 1.0 / 6.0));
		System.out.println("^7: " + Math.pow(theval, 7) + " Seventh root: " + Math.pow(theval, 1.0 / 7.0));
		
		for(y = 0; y < 10001; y++){
			if (Words[y][1].equals("")) { break; }
			if (Integer.parseInt(Words[y][1]) == theval) {
				System.out.println("Same result: " + Words[y][0]);
			}
        }
		
		}
		else if (thestr3.equals("add")){
			a = Integer.parseInt(args[1]);
			b = Integer.parseInt(args[2]);
			result = a + b;
			System.out.println("Result: " + result);
		}
		else if (thestr3.equals("base")){
		
			int bs;
			int n;
			
			n = Integer.parseInt(args[1]);
			bs = Integer.parseInt(args[2]);
			
			long base;
			long num;
			
			base = (long) bs;
			num = (long) n;
			
			long Na;
			long Nb;
			long Nc;
			long Nd;
			long Ne;
			long Nf;
			long Ng;
			long Column4 = 0;
			long Column3 = 0;
			long Column2 = 0;
			long Column1 = 0;
			long Column8 = 0;
			long Column7 = 0;
			long Column6 = 0;
			long Column5 = 0;
			long Column4Denary;
			long Column3Denary;
			long Column5Denary;
			long Column6Denary;
			long Column7Denary;
			long Column8Denary;
			
			if (base > 256) {
            Na = base;
            Nb = (long) Math.pow(base, 2);
            Nc = (long) Math.pow(base, 3);
            Column4 = num / Nc;
            Column4Denary = Column4 * Nc;
            Column3 = (num - Column4Denary) / Nb;
            Column3Denary = Column3 * Nb;
            Column2 = (num - (Column4Denary + Column3Denary)) / Na;
            Column1 = num - (Column4Denary + Column3Denary + (Column2 * Na));
			}
			else{
            Na = base;
            Nb = (long) Math.pow(base, 2);
            Nc = (long) Math.pow(base, 3);
            Nd = (long) Math.pow(base, 4);
            Ne = (long) Math.pow(base, 5);
            Nf = (long) Math.pow(base, 6);
            Ng = (long) Math.pow(base, 7);
            Column8 = num / Ng;
            Column8Denary = Column8 * Ng;
            Column7 = (num - Column8Denary) / Nf;
            Column7Denary = Column7 * Nf;
            Column6 = (num - (Column8Denary + Column7Denary)) / Ne;
            Column6Denary = Column6 * Ne;
            Column5 = (num - (Column8Denary + Column7Denary + Column6Denary)) / Nd;
            Column5Denary = Column5 * Nd;
            Column4 = (num - (Column8Denary + Column7Denary + Column6Denary + Column5Denary)) / Nc;
            Column4Denary = Column4 * Nc;
            Column3 = (num - (Column8Denary + Column7Denary + Column6Denary + Column5Denary + Column4Denary)) / Nb;
            Column3Denary = Column3 * Nb;
            Column2 = (num - (Column8Denary + Column7Denary + Column6Denary + Column5Denary + Column4Denary + Column3Denary)) / Na;
            Column1 = num - (Column8Denary + Column7Denary + Column6Denary + Column5Denary + Column4Denary + Column3Denary + (Column2 * Na));
			}
        
		System.out.println(Column8 + " " + Column7 + " " + Column6 + " " + Column5 + " " + Column4 + " " + Column3 + " " + Column2 + " " + Column1);
		}
		else if (thestr3.equals("list")) {
			for(y = 0; y < 10001; y++){
				if (Words[y][0].equals("")) { break; }
				System.out.println("Word: " + Words[y][0] + " Result: " + Words[y][1]);
			}
			System.out.println("Words: " + wordcount);
		}
		else if (thestr3.equals("d")) {
			System.out.println("Deleting word: " + args[1]);
			for (y = 0; y < 10001; y++){
				uc = Words[y][0].toUpperCase();
				if (uc.equals(args[1].toUpperCase())) {
					Words[y][0] = "";
					Words[y][1] = "";
                    d = y;
                    break;
                }
                d = y;
            }
            if (d == 10000) {
				System.out.println("Word not found.");
			}
            else {
				for (eb = d; eb < 10000; eb++){
					Words[eb][0] = Words[eb + 1][0];
                    Words[eb][1] = Words[eb + 1][1];
                }
            }
		}
		else if (thestr3.equals("time")) {
			Calendar calendar = Calendar.getInstance();
			int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
			int year = calendar.get(Calendar.YEAR);
			
					

                    double OneMinute = 0.164383562;
                    double TheMinute;
                    double OneSecond;
                    double TheSecond;
                    
                    
                    //Calendar cal = Calendar.getInstance();
					//cal.set(Calendar.YEAR, year);
  					if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
                        OneMinute = 60.0 / 366.0;
					}
                    else {
                        OneMinute = 60.0 / 365.0;
                    }

                    OneSecond = 60.0 / 100.0;
                    

                    TheMinute = OneMinute * ((double) dayOfYear - 1.0);
                    
					
					String MinString = "";
					String yr = "";
					String sec = "";
					
					MinString = Double.toString(TheMinute);
                    int minlen = MinString.length();
					
                    if (TheMinute < 10.0) {
                        //'9.54673'
                        //'9'
                        //9.0
                        //'9.1'
                        
                        if (minlen == 1) {
                            TheSecond = 0.0;
						}
                        else if (minlen == 3) {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(MinString.length() - 1) + "0");
						}
                        else {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(2, 4));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                        if (TheSecond < 10.0) {
                            System.out.println("Time: " + yr.substring(2) + ":0" + MinString.substring(0, 1) + ":0" + sec.substring(0, 1));
                        }
                        else {
                            System.out.println("Time: " + yr.substring(2) + ":0" + MinString.substring(0, 1) + ":" + sec.substring(0, 2));
                        }
                    }
                    else {
                        //'15.4736378'
                        //'15'
                        //15.0
                        //'15.1'
                        
                        
                        if (minlen == 2) {
                            TheSecond = 0.0;
						}
                        else if (minlen == 4) {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(MinString.length() - 1) + "0");
						}
                        else {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(3, 5));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                        if (TheSecond < 10.0) {
                            System.out.println("Time: " + yr.substring(2) + ":" + MinString.substring(0, 2) + ":0" + sec.substring(0, 1));
                        }
                        else {
                            System.out.println("Time: " + yr.substring(2) + ":" + MinString.substring(0, 2) + ":" + sec.substring(0, 2));
                        }
                    }
                        
            
                    TheMinute = OneMinute * (double) dayOfYear;
                    
                    MinString = Double.toString(TheMinute);
                    minlen = MinString.length();
					
					if (TheMinute < 10.0) {
                        //'9.54673'
                        //'9'
                        //'9.1'
                     
                        if (minlen == 1) {
                            TheSecond = 0.0;
						}
                        else if (minlen == 3) {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(MinString.length() - 1) + "0");
						}
                        else {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(2, 4));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                        if (TheSecond < 10.0) {
                            System.out.println("Time: " + yr.substring(2) + ":0" + MinString.substring(0, 1) + ":0" + sec.substring(0, 1));
                        }
                        else {
                            System.out.println("Time: " + yr.substring(2) + ":0" + MinString.substring(0, 1) + ":" + sec.substring(0, 2));
                        }
                    }
                    else {
                        //'15.4736378'
                        //'15'
                        //'15.1'
                        
                       
                        if (minlen == 2) {
                            TheSecond = 0.0;
						}
                        else if (minlen == 4) {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(MinString.length() - 1) + "0");
						}
                        else {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(3, 5));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                        if (TheSecond < 10.0) {
                            System.out.println("Time: " + yr.substring(2) + ":" + MinString.substring(0, 2) + ":0" + sec.substring(0, 1));
                        }
                        else {
                            System.out.println("Time: " + yr.substring(2) + ":" + MinString.substring(0, 2) + ":" + sec.substring(0, 2));
                        }
                    }
			
		}
		
		
		else if (thestr3.equals("time2")) {
			Calendar calendar = Calendar.getInstance();
			int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
			int year = calendar.get(Calendar.YEAR);
			
					

                    double OneMinute = 0.164383562;
                    double TheMinute;
                    double NextMinute;
                    double OneSecond;
                    double TheSecond;
                    double NextSecond;
                    double OneHour;
                    double TheHour;
                    int hour;
                    
                    //Calendar cal = Calendar.getInstance();
					//cal.set(Calendar.YEAR, year);
  					if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
                        OneMinute = 60.0 / 366.0;
					}
                    else {
                        OneMinute = 60.0 / 365.0;
                    }

                    OneSecond = 60.0 / 100.0;
                    

                    TheMinute = OneMinute * ((double) dayOfYear - 1.0);
                    NextMinute = OneMinute * (double) dayOfYear;
                    
					
					String MinString = "";
					String MinString2 = "";
					String yr = "";
					String sec = "";
					String HourString = "";
					
					MinString = Double.toString(TheMinute);
                    int minlen = MinString.length();
					
					hour = calendar.get(Calendar.HOUR_OF_DAY);
					
					double SecondDifference;
                    //'58.5 08.5'
                    //'50'
                    
					
                    if (TheMinute < 10.0) {
                        //'9.54673'
                        //'9'
                        //9.0
                        //'9.1'
                        
                        if (minlen == 1) {
                            TheSecond = 0.0;
						}
                        else if (minlen == 3) {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(MinString.length() - 1) + "0");
						}
                        else {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(2, 4));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                        
                    }
                    else {
                        //'15.4736378'
                        //'15'
                        //15.0
                        //'15.1'
                        
                        
                        if (minlen == 2) {
                            TheSecond = 0.0;
						}
                        else if (minlen == 4) {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(MinString.length() - 1) + "0");
						}
                        else {
                            TheSecond = OneSecond * Double.parseDouble(MinString.substring(3, 5));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                       
                    }
                        
                        
                        
            
                    
                    
                    MinString2 = Double.toString(NextMinute);
                    int minlen2 = MinString2.length();
					
					if (NextMinute < 10.0) {
                        //'9.54673'
                        //'9'
                        //'9.1'
                     
                        if (minlen2 == 1) {
                            NextSecond = 0.0;
						}
                        else if (minlen2 == 3) {
                            NextSecond = OneSecond * Double.parseDouble(MinString2.substring(MinString2.length() - 1) + "0");
						}
                        else {
                            NextSecond = OneSecond * Double.parseDouble(MinString2.substring(2, 4));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                        
                    }
                    else {
                        //'15.4736378'
                        //'15'
                        //'15.1'
                        
                       
                        if (minlen2 == 2) {
                            NextSecond = 0.0;
						}
                        else if (minlen2 == 4) {
                            NextSecond = OneSecond * Double.parseDouble(MinString2.substring(MinString2.length() - 1) + "0");
						}
                        else {
                            NextSecond = OneSecond * Double.parseDouble(MinString2.substring(3, 5));
                        }
                        
                        yr = Integer.toString(year);
                        sec = Double.toString(TheSecond);
                        
                    }
                    
                    if (NextSecond < TheSecond) {
                        SecondDifference = TheSecond - 60.0;
                        TheSecond = 0.0;
                        TheMinute += 1.0;
                        OneHour = (NextSecond - TheSecond) / 24.0;
                        TheHour = TheSecond + (OneHour * (double) hour);
					}
                    else {
                        OneHour = (NextSecond - TheSecond) / 24.0;
                        TheHour = TheSecond + (OneHour * (double) hour);

					}
					
					String MinString3 = "";
					MinString3 = Double.toString(TheMinute);
					HourString = Double.toString(TheHour);
					
                        
                   if (TheMinute < 10.0) {
                        //'9.54673'
                        //'9'
                        //'9.1'

                        if (TheHour < 10.0) {
                            System.out.println("Time: " + yr.substring(2) + ":0" + MinString3.substring(0, 1) + ":0" + HourString.substring(0, 1));
                        }
                        else {
                            System.out.println("Time: " + yr.substring(2) + ":0" + MinString3.substring(0, 1) + ":" + HourString.substring(0, 2));
						}
                    }
                    else {
                        //'15.4736378'
                        //'15'
                        //'15.1'
                        if (TheHour < 10.0) {
                            System.out.println("Time: " + yr.substring(2) + ":" + MinString3.substring(0, 2) + ":0" + HourString.substring(0, 1));
                        }
                        else {
                            System.out.println("Time: " + yr.substring(2) + ":" + MinString3.substring(0, 2) + ":" + HourString.substring(0, 2));
                        }
                    }
			
		}
		
		else if (thestr3.equals("ds")) {
			
			String thestr;
			String thestr2;
			int count = 0;
		
		
		int i;
		int strlen;
		thestr = args[1];
		strlen = thestr.length();
		thestr2 = thestr.toUpperCase();
		//System.out.println(strlen);
		for (i = 0; i < strlen; i++){
			
			char character = thestr2.charAt(i);
			int ascii = (int) character;
			
			count += (ascii - 64);
		
		}
		System.out.println("Result: " + count);
		System.out.println("Cubed: " + Math.pow(count, 3) + " Cube root: " + Math.cbrt(count));
		
		
		
		for(y = 0; y < 10001; y++){
			uc = Words[y][0].toUpperCase();
			if (Words[y][1].equals("")) { break; }
			if ((!uc.equals(thestr2)) && (Integer.parseInt(Words[y][1]) == count)) {
				System.out.println("Same result: " + Words[y][0]);
			}
        }
		}
		else {
		 
		String thestr;
		String thestr2;
		int count = 0;
		
		
		int i;
		int strlen;
		thestr = args[0];
		strlen = thestr.length();
		thestr2 = thestr.toUpperCase();
		//System.out.println(strlen);
		for (i = 0; i < strlen; i++){
			
			char character = thestr2.charAt(i);
			int ascii = (int) character;
			
			count += (ascii - 64);
		
		}
		System.out.println("Result: " + count);
		System.out.println("Cubed: " + Math.pow(count, 3) + " Cube root: " + Math.cbrt(count));
		
		
		
		for(y = 0; y < 10001; y++){
			uc = Words[y][0].toUpperCase();
			if (Words[y][1].equals("")) { break; }
			if ((!uc.equals(thestr2)) && (Integer.parseInt(Words[y][1]) == count)) {
				System.out.println("Same result: " + Words[y][0]);
			}
        }
		
		for (y = 0; y < 10001; y++) {
			uc = Words[y][0].toUpperCase();
			if (uc.equals(thestr2)) { break; }
			if (Words[y][0].equals("")) {
				Words[y][0] = args[0];
                Words[y][1] = Integer.toString(count);
				break;
            }
        }
		
	}
	try {
			FileWriter fw = new FileWriter("/home/will/words");
			
			for ( y = 0; y < 10001; y++) {
                if (Words[y][0].equals("")) { break;}
                fw.write(Words[y][0] + "\n");
                fw.write(Words[y][1] + "\n");
            }
			
			fw.close();
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.print("Press enter to quit");
		String inputstr;
		inputstr = System.console().readLine(); 
	}
}

