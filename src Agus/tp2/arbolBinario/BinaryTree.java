package arbolBinario;

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

	// Método para crear un árbol binario con valores ingresados desde el teclado
	public void createTreeFromInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter root value:");
		this.data = (T) Integer.valueOf(scanner.nextInt());
		createSubTreeFromInput(this, scanner, "left");
		createSubTreeFromInput(this, scanner, "right");
	}

	private void createSubTreeFromInput(BinaryTree<T> parent, Scanner scanner, String side) {
		System.out.println("Enter " + side + " child of " + parent.getData() + " (or -1 to skip):");
		int value = scanner.nextInt();
		if (value != -1) {
			BinaryTree<T> child = new BinaryTree<>((T) Integer.valueOf(value));
			if (side.equals("left")) {
				parent.addLeftChild(child);
			} else {
				parent.addRightChild(child);
			}
			createSubTreeFromInput(child, scanner, "left");
			createSubTreeFromInput(child, scanner, "right");
		}
	}

	// Método para crear un árbol binario con un número aleatorio de valores
	// aleatorios
	public void createTreeWithRandomValues(int maxNodes, int maxValue) {
		if (maxNodes <= 0)
			return;
		Random random = new Random();
		int numNodes = random.nextInt(maxNodes) + 1; // Número aleatorio de nodos entre 1 y maxNodes
		this.data = (T) Integer.valueOf(random.nextInt(maxValue));
		createSubTreeWithRandomValues(this, random, numNodes - 1, maxValue);
	}

	private void createSubTreeWithRandomValues(BinaryTree<T> parent, Random random, int numNodes, int maxValue) {
		if (numNodes <= 0)
			return;
		int leftNodes = random.nextInt(numNodes + 1); // Número aleatorio de nodos para el hijo izquierdo
		int rightNodes = numNodes - leftNodes; // El resto de nodos para el hijo derecho

		if (leftNodes > 0) {
			BinaryTree<T> leftChild = new BinaryTree<>((T) Integer.valueOf(random.nextInt(maxValue)));
			parent.addLeftChild(leftChild);
			createSubTreeWithRandomValues(leftChild, random, leftNodes - 1, maxValue);
		}

		if (rightNodes > 0) {
			BinaryTree<T> rightChild = new BinaryTree<>((T) Integer.valueOf(random.nextInt(maxValue)));
			parent.addRightChild(rightChild);
			createSubTreeWithRandomValues(rightChild, random, rightNodes - 1, maxValue);
		}
	}

	public void printPreorden() {
		System.out.println(this.getData());
		if (this.hasLeftChild()) {
			this.getLeftChild().printPreorden();
		}
		if (this.hasRightChild()) {
			this.getRightChild().printPreorden();
		}
	}
	public void printInorden() {
		if (this.hasLeftChild()) {
			this.getLeftChild().printInorden();
		}
		System.out.println(this.getData());
		if (this.hasRightChild()) {
			this.getRightChild().printInorden();
		}
	}

	public int contarHojas() {
		int i = this.contarPreOrden(0);
		return i;
	}

	public int contarPreOrden(int i) {
		if (this.isLeaf())
			i++;
		else {
			if (this.hasLeftChild()) {
				i = this.getLeftChild().contarPreOrden(i);
			}
			if (this.hasRightChild()) {
				i = this.getRightChild().contarPreOrden(i);
			}
		}
		return i;
	}

	public BinaryTree<T> espejo() {
		BinaryTree<T> aux = new BinaryTree<T>();
		aux.setData(this.data);
		
		if (this.hasLeftChild()) {
			aux.rightChild = this.getLeftChild().espejo();
		}
		if (this.hasRightChild()) {
			aux.leftChild = this.getRightChild().espejo();
		}

		return aux;

	}
	
	// Falta implementar la clase Queue en el tp1
	
	public void printLevelTraversal() { 
	   	 BinaryTree<T> ab = null;
	   	 Queue<BinaryTree<T>> cola = new LinkedList<BinaryTree<T>>();
	   	 cola.add(this);
	      cola.add(null);
	   	 while (!cola.isEmpty()) {
	   		 ab = cola.poll();
	   		 if (ab != null) {
	   			 System.out.print(ab.getData());
	   			 if (ab.hasLeftChild()) {
	   				 cola.add(ab.getLeftChild());
	   			 }
	   			 if (ab.hasRightChild()) {
	   				 cola.add(ab.getRightChild());
	   			 }
	   		 } else if (!cola.isEmpty()) {
	   			 System.out.println();
	   			 cola.add(null);
	   		 }
	   	 }
	   
	}
	

}
