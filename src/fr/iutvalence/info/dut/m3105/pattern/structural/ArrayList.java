package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E>
{
	private E[] arrayList;
	private int nbElements;
	
	public ArrayList()
	{
		this.arrayList=(E[]) new Object[10];
		this.nbElements=0;
	}

	@Override
	public void add(int indice, E element)
	{
		this.arrayList[indice]=element;
		this.nbElements++;
	}

	@Override
	public E remove(int indice)
	{
		E element = this.arrayList[indice];
		this.arrayList[indice]=null;
		this.nbElements--;
		return element;
	}

	@Override
	public E get(int indice)
	{
		return this.arrayList[indice];
	}

	@Override
	public int size()
	{
		return this.nbElements;
	}

}
