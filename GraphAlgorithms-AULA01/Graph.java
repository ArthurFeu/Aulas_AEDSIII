public class Graph {
  private int countNodes;
  private int countEdges;
  private int[][] adjMatrix;

  public int getCountNodes() {
    return this.countNodes;
  }

  public int getCountEdges() {
    return this.countEdges;
  }

  public int[][] getAdjMatrix() {
    return this.adjMatrix;
  }

  public void addEdge(int source, int sink, int weight) {
    if (source < 0 || sink < 0 || source > this.countNodes - 1 ||
        sink > this.countNodes - 1) {
      System.out.println("\nERROR: Cannot add edge with this source or sink.\n-> SOURCE: " + source
          + " | SINK: " + sink + "\n");
      return;
    }
    if (weight <= 0) {
      System.out.println("\nERROR: Weight have to be greater than zero.\n-> SOURCE: " + source
          + " | SINK: " + sink + "\n");
    }

    this.adjMatrix[source][sink] = weight;
    this.countEdges++;
  }

  public int degree(int node) {
    int count = 0;
    for (int j = 0; j < this.adjMatrix.length; j++) {
      if (adjMatrix[node][j] != 0)
        count++;
    }
    return count;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjMatrix.length; i++) {
      for (int j = 0; j < this.adjMatrix.length; j++) {
        str += this.adjMatrix[i][j] + "\t";
      }
      str += "\n";
    }
    return str;
  }

  public Graph(int countNodes) {
    this.countNodes = countNodes;
    this.adjMatrix = new int[countNodes][countNodes];
  }
}