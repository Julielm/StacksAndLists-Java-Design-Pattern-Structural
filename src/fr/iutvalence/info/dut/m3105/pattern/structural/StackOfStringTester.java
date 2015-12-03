package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester
{
	private Stack<String> stack;

	public StackOfStringTester(Stack<String> stack)
	{
		this.stack=stack;
	}

	public void testStack()
	{
		System.out.println("La taille de la pile est : "+this.stack.size());
		this.stack.push("a");
		System.out.println("J'ai empilé l'élement 'a'");
		System.out.println("La taille de la pile est : "+this.stack.size());
		this.stack.push("b");
		System.out.println("J'ai empilé l'élement 'b'");
		System.out.println("La taille de la pile est : "+this.stack.size());
		System.out.println("Le dernier élément de la pile est : "+this.stack.peek());
		System.out.println("La taille de la pile est : "+this.stack.size());
		System.out.println("Le dernier élément de la pile "+this.stack.pop()+" a été supprimé");
		System.out.println("La taille de la pile est : "+this.stack.size());
		System.out.println("Le dernier élément de la pile "+this.stack.pop()+" a été supprimé");
		System.out.println("La taille de la pile est : "+this.stack.size());		
	}

}
