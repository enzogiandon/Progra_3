package tp2.ej1;

import java.util.Random;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	public BinaryTree<T> getRightChild() {
		return rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty() {
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}

	public boolean hasLeftChild() {
		return this.leftChild != null;
	}

	public boolean hasRightChild() {
		return this.rightChild != null;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}

	// EJERCICIO 2

	public int contarHojas() {
		int cantHojas = 0;
		if (this.isLeaf())
			return 1;
        //si no es una hoja: 
		if (this.hasLeftChild())
			cantHojas += leftChild.contarHojas();
		if (this.hasRightChild())
			cantHojas += rightChild.contarHojas();
		return cantHojas;

	}
	
	public BinaryTree<T> espejo(){

		BinaryTree<T> esp = new BinaryTree<T>(data);
		
		if (this.hasLeftChild())
			leftChild.espejo();
		if (this.hasRightChild())
			rightChild.espejo();
			
		
		
		
		esp.addLeftChild(rightChild);
		esp.addRightChild(leftChild);
		return esp;								
	}

}
