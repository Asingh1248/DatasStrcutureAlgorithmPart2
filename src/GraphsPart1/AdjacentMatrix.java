package GraphsPart1;

public class AdjacentMatrix {

    public static void main(String[] args) {
        int n=3; //No of Nodes
        int m=3; //No of Edges

        int adj[][] = new int [n+1][n+1];

        //edge 1-->2
        adj[1][2]=1;
        adj[2][1]=1;

        //edge 2-->3
        adj[2][3]=1;
        adj[3][2]=1;

        //edge 1-->3
        adj[1][3]=1;
        adj[3][1]=1;

        

    }

}
