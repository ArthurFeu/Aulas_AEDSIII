class Main {
  public static void main(String[] args) {
    Graph g1 = new Graph(4);
    g1.addEdge(0, 1, 3);
    g1.addEdge(1, 0, 3);
    g1.addEdge(0, 3, 4);
    g1.addEdge(3, 0, 5);

    g1.addEdge(3, 4, 2);

    System.out.println(g1.toString());
    System.out.println(g1.degree(3));
  }
}
