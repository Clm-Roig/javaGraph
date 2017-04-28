package graph;

public class TestGraph implements Graph {
	// ---- Attributes ---- //
	private Edge[] listEdge;
	private Vertex[] listVertex;

	// ---- Constructors ---- //
	public TestGraph(){}

	public TestGraph(Edge[] edges, Vertex[] vertex){
		this.listEdge = edges;
		this.listVertex = vertex;
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

	}

	public void rmvEdge(Edge e) {

	}

	public void addVertex(Vertex v){

	}

	public void rmvVertex(Vertex v){

	}
}