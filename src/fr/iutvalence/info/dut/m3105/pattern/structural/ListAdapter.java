package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<E> implements Stack<E>
{
	private List<E> list;
	
	public ListAdapter(List<E> list)
	{
		this.list=list;
		
	}
	@Override
	public void push(E e)
	{
		this.list.add(this.list.size(),e);
	}

	@Override
	public int size()
	{
		return this.list.size();
	}
	@Override
	public E pop()
	{
		return this.list.remove(this.list.size()-1);

	}
	@Override
	public E peek()
	{
		return this.list.get(this.list.size()-1);
	}

}
