package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class List1 {

	public static void main(String[] args) {

List <String > LS=new ArrayList<>();
List <Integer> LI=new LinkedList<>();
List <Character> LC=new Vector<>();


LS.add("ZakerLS1");
LS.add("ZakerLS2");
LS.add("ZakerLS3");
LS.add("ZakerLS4");
LS.add("ZakerLS5");

LI.add(123);
LI.add(456);
LI.add(789);
LI.add(1011);
LI.add(1122);


LC.add('Z');
LC.add('A');
LC.add('K');
LC.add('E');
LC.add('R');


System.out.println(LS);
System.out.println(LI);
System.out.println(LC);

	}

}
