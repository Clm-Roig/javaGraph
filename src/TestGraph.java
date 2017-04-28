public class TestGraph implements Graph {
	// ---- Attributes ---- //
	private Edge[] listEdge;
	private Vertex[] listVertex;

	// ---- Constructors ---- //
	public TestGraph(){}

	public TestGraph(Edge[] edges, Vertex[] vertex){
		this.listEdge = Arrays.copyOf(edges,edges.length);
		this.listVertex = Arrays.copyOf(vertex,vertex.length);
	}

	// ---- Get / Set ---- //

	public Edge[] getEdge(){
		return this.listEdge;
	}

	public Vertex[] getVertex(){
		return this.listVertex;
	}

	// ---- Methods ---- //

	public void addEdge(Edge e) {
		this.listEdge.add(e);
		e.setGraph(this);
	}

	public void rmvEdge(Edge e) {
		Edge[] newEdges;
		for (Edge edge : this.listEdge){
			if (!edge.equals(e)){
				newEdges.add(e); 
			}
		}
		this.listEdge = Arrays.copyOf(newEdges,newEdges.length);
	}

	public void addVertex(Vertex v){
		this.listEdge.add(v);
		v.setGraph(this);
	}

	public void rmvVertex(Vertex v){
		Vertex[] newVertex;
		for (Vertex vertex : this.listVertex){
			if (!vertex.equals(v)) {
				newVertex.add(v); 
			}
		}
		this.newVertex = Arrays.copyOf(newVertex,newVertex.length);
	}
}