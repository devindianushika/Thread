class ChildThread1 extends Thread{
	
CharacterPrinter p;
ChildThread1(CharacterPrinter p){
	super();
this.p=this.p;
}
public void run(){
p.printNumber();

}

}


class ChildThread2 extends Thread{
	
CharacterPrinter p;
ChildThread2(CharacterPrinter p){
	super();
this.p=this.p;
}
public void run(){
p.printCharacter();
}
}

class CharacterPrinter{
	public void printCharacter(){
	for(int i=65;i<=70;i++) {
System.out.print((char)i);
	}
	}

public void printNumber(){
	for(int i=1;i<=5;i++) {
System.out.print(i);
	}
	}
}	

class Thread{
public static void main(String []args){
	CharacterPrinter p = new CharacterPrinter();
	ChildThread1 t1 = new ChildThread1(p);
	ChildThread2 t2 = new ChildThread2(p);
	t1.start();
	t2.start();
}
}
