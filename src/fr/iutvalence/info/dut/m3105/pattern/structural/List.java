package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E>
{

	public void add(int indice, E element);
	public E remove(int indice);
	public E get(int indice);
	public int size();
}
