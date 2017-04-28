import java.util.ArrayList;

public class TestGraph implements Graph {
	// ---- Attributes ---- //
	private ArrayList<Edge> listEdge;
	private ArrayList<Vertex> listVertex;

	// ---- Constructors ---- //
	public TestGraph(){}

	public TestGraph(ArrayList<Edge> edges, ArrayList<Vertex> vertex){
		this.listEdge = edges;
		this.listVertex = vertex;
	}

	// ---- Get / Set ---- //

	public ArrayList<Edge> getEdge(){
		return this.listEdge;
	}

	public ArrayList<Vertex> getVertex(){
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