//package exception_demo;
//
///* Codul o sa crape pentru ca nu exista CryingBabyException, dar scopul lui nu era oricum sa compileze*/
//
//public class Shopping {
//	public static void main(String[] args) {
//		try {// ce incerci sa faci, cu riscul ca o exceptie sa apara:
//				// mergi la cumparaturi cu copilul -> cod care nu arunca o exceptie
//				// la un moment dat, copilul vede o jucarie si incepe sa planga, fiindca o vrea
//				// -> cod care arunca o exceptie
//		} catch (CryingBabyException ex) {// tratarea exceptiei:
//			// ii cumperi jucaria, ca sa nu mai planga -> tratarea exceptiei
//		} finally {// cod de curatare a resurselor
//			// ii dai un servetel sa isi sufle nasul dupa plans si mergeti acasa -> cod care
//			// se executa mereu, orice s-ar fi intamplat inainte
//		}
//	}
//}
