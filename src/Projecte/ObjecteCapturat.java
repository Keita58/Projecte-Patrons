package Projecte;

public class ObjecteCapturat {
public void Capturat(Nau n, Recurs r) {
	RecolectorPunts a = new RecolectorPunts();
	if(n instanceof NauPesada) {
		NauPesada n2 = (NauPesada) n;
		a.addPropertyChangeListener(n2);
		a.setPunts(r.puntsASumar());
		a.removePropertyChangeListener(n2);
	}
	else if(n instanceof NauLleugera) {
		NauLleugera n2 = (NauLleugera) n;
		a.addPropertyChangeListener(n2);
		a.setPunts(r.puntsASumar());
		a.removePropertyChangeListener(n2);
	}
	else if(n instanceof NauExploracio) {
		NauExploracio n2 = (NauExploracio) n;
		a.addPropertyChangeListener(n2);
		a.setPunts(r.puntsASumar());
		a.removePropertyChangeListener(n2);
	}
}
}
