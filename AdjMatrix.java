public class AdjMatrix{
    int v;
    int[][] matrix;
    AdjMatrix(int v){
        this.v=v;
        matrix =new int[v][v];
    }
void addEdge(int source,int destination){
    matrix[source][destination]=1;
    matrix[destination][source]=1;
}
void printGraph(){
    for(int i=0;i<v;i++){
        System.out.print(i+"is connected to=");
        for(int j=0;j<v;j++){
          if(matrix[i][j]!=0){
            System.out.print(j+"");
          }
        }
        System.out.println();
    }
}
public static void main(String[]args){
    AdjMatrix a=new AdjMatrix(6);
    a.addEdge(0,1);
    a.addEdge(0,2);
    a.addEdge(0,5);
    a.addEdge(1,3);
    a.addEdge(2,3);
    a.addEdge(2,4);
    a.addEdge(3,5);
    a.addEdge(4,5);
    a.printGraph();
   }
}