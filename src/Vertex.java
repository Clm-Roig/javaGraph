public class Vertex {
	// ---- Attributes ---- //
	Object value;
	Graph graph;

	// ---- Constructors ---- //

	public Vertex(){}

	public Vertex(Object obj){
		this.value = obj;
	}

	// ---- Get / Set ---- //
	public Object getValue() {
		return this.value;
	}

	public void setValue(Object o) {
		this.value = o;
	}

	public void setGraph(Graph g){
		this.graph = g;
	}
	// ---- Methods ---- //


}