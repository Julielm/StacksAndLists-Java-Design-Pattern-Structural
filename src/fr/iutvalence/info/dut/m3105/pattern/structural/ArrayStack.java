package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E>
{
	private E[] arrayStack;
	private int nbElements;
	
	public ArrayStack()
	{
		this.arrayStack=(E[]) new Object[10];
		this.nbElements=0;
	}
	
	@Override
	public void push(E e)
	{
		this.arrayStack[this.nbElements]=e;
		this.nbElements++;
	}

	@Override
	public E pop()
	{
		E element=this.arrayStack[this.nbElements-1];
		this.arrayStack[this.nbElements-1]=null;
		this.nbElements--;
		return element;
	}

	@Override
	public E peek()
	{
		return this.arrayStack[this.nbElements-1];
	}

	@Override
	public int size()
	{
		return this.nbElements;
	}



}
