package dsa.Comparator.sample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mainclass {
		public static void main(String[] args) {

			Comparator<Station> com = (i, j) -> i.station_name.compareTo(j.station_name) > 0 ? 1 : -1;
			List<Station> l1 = new ArrayList<Station>();

			l1.add(new Station("RAMPALLI (HP)", 27.05, 7.20, 289.11, 1.22));
			l1.add(new Station("ETHUR (HP)", 27.62, 7.70, 286.35, 1.23));
			l1.add(new Station("EDAGAPLLI (HP)", 28.97, 7.89, 348.62, 0.81));
			l1.add(new Station("SUGALMITTA", 28.91, 8.02, 45.91, 0.82));
			l1.add(new Station("DANDUPALYAM", 28.75, 8.10, 40.64, 0.55));
			l1.add(new Station("MELAPATULA", 29.50, 7.40, 75.20, 1.71));
			l1.add(new Station("ARADIGUNTA", 29.82, 7.57, 80.50, 2.00));
			l1.add(new Station("BHEMIGANPALLI", 29.67, 8.40, 88.12, 1.96));
			l1.add(new Station("BANDLAPALLE", 28.70, 7.07, 156.01, 3.01));
			l1.add(new Station("MANGALAM", 28.96, 7.88, 124.98, 1.97));
			l1.add(new Station("MELUMODODDI", 26.25, 7.40, 250.02, 1.01));
			l1.add(new Station("NEKKONDI", 29.85, 7.57, 232.84, 1.85));
			l1.add(new Station("PALYAMPALLE", 27.50, 8.40, 157.27, 1.97));
			l1.add(new Station("RAGANIPALLE", 28.60, 7.07, 98.58, 1.67));
			l1.add(new Station("VANAMALADINNE", 28.58, 7.88, 89.69, 1.46));
			l1.add(new Station("NS PET OH TANK", 29.55, 7.20, 238.05, 1.38));
			l1.add(new Station("GOKUL OH TANK", 27.72, 7.70, 249.87, 1.22));
			l1.add(new Station("VBHS OH TANK", 28.87, 7.89, 246.89, 1.25));
			l1.add(new Station("KK PALYAM (TW)", 29.85, 8.02, 236.25, 0.36));
			l1.add(new Station("KK STREET (TW)", 27.05, 8.10, 238.92, 0.48));
			l1.add(new Station("AN KUNTA (BW)", 27.62, 7.40, 222.98, 1.22));
			l1.add(new Station("NAKABANDA(BW)", 28.97, 7.57, 224.95, 1.35));
			l1.add(new Station("GUDURPALLI(BW)", 28.91, 8.40, 196.25, 1.17));
			l1.add(new Station("LAKKUNTA(BW)", 28.75, 7.72, 187.25, 1.79));
			l1.add(new Station("DHOBICOLONY(BW)", 29.50, 7.40, 211.96, 1.58));
			l1.add(new Station("NO PALYAM (BW)", 29.82, 7.57, 210.02, 1.76));
			l1.add(new Station("HS STREET (BW)", 29.67, 8.40, 208.52, 1.82));
			l1.add(new Station("BODEVARIPALLE(BW)", 28.70, 7.07, 196.26, 1.95));
			l1.add(new Station("CHADALLA (BW)", 28.96, 7.88, 190.29, 1.42));
			l1.add(new Station("ETAVAKAIL1 (BW)", 27.02, 8.20, 198.43, 1.14));

			System.out.println(" ");
			System.out.println("");
			System.out.println("this is based station names ");
			System.out.println("");
			System.out.println(" ");

			Collections.sort(l1, com);
			for (Station s : l1) {
				System.out.println(s);
			}

			System.out.println(" ");
			System.out.println("########################################################################");
			System.out.println("this is based on ph value ");
			System.out.println("########################################################################");
			System.out.println(" ");

			Comparator<Station> com1 = (i, j) -> i.ph_value > j.ph_value ? 1 : -1;
			// List<Station> l2 = new ArrayList<Station>();

			Collections.sort(l1, com1);
			for (Station s : l1) {
				System.out.println(s);
			}

			System.out.println(" ");
			System.out.println("########################################################################");
			System.out.println("this is based on temperature ");
			System.out.println("########################################################################");
			System.out.println(" ");

			Comparator<Station> com2 = (i, j) -> i.temperature > j.temperature ? 1 : -1;
			// List<Station> l2 = new ArrayList<Station>();

			Collections.sort(l1, com2);
			for (Station s : l1) {
				System.out.println(s);
			}

			System.out.println(" ");
			System.out.println("########################################################################");
			System.out.println("this is based on chloride ");
			System.out.println("########################################################################");
			System.out.println(" ");

			Comparator<Station> com3 = (i, j) -> i.chloride > j.chloride ? 1 : -1;
			// List<Station> l2 = new ArrayList<Station>();

			Collections.sort(l1, com3);
			for (Station s : l1) {
				System.out.println(s);
			}

			System.out.println(" ");
			System.out.println("########################################################################");
			System.out.println("this is based on flouride ");
			System.out.println("########################################################################");
			System.out.println(" ");

			Comparator<Station> com4 = (i, j) -> i.flouride > j.flouride ? 1 : -1;
			// List<Station> l2 = new ArrayList<Station>();

			Collections.sort(l1, com4);
			for (Station s : l1) {
				System.out.println(s);
			}

		}
	}


