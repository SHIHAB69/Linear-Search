import java.util.Scanner;

public class MethodOverLoading {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(23);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

    while(n1 != null){
        System.out.println(n1);
        n1 = n1.next;

    }
    }

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

}

