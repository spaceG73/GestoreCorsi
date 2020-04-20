package it.polito.tdp.corsi.model;

public class TestMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model=new Model();
		System.out.println(model.getCorsiByPeriodo(1));
		System.out.println(model.getIscrittiByPeriodo(2));
//		System.out.println(model.getStudentiByCorso("01KSUPG"));
	}

}
