public class AdjList {
    int v;
    SinglyLinkedList adjList[];

    public AdjList(int v) {
        this.v = v;
        adjList = new SinglyLinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new SinglyLinkedList();
        }
    }
    void addEdge(int source, int destination) {
        adjList[source].addNode(destination);
        adjList[destination].addNode(source);
    }
    void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " is connected to: ");
            SinglyLinkedList.Node current = adjList[i].head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjList a = new AdjList(6);
        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(0, 5);
        a.addEdge(1, 3);
        a.addEdge(2, 3);
        a.addEdge(2, 4);
        a.addEdge(3, 5);
        a.addEdge(4, 5);
        a.printGraph();
    }
}
