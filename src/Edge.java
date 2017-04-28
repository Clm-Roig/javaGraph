package graph;

public abstract class Edge {
	// ---- Attributes ---- //
	private Vertex vert1;
	private Vertex vert2;

	// ---- Constructors ---- //
	public Edge(){}

	public Edge(Vertex v1, Vertex v2){
		this.vert1 = v1;
		this.vert2 = v2;
	}

	// ---- Get / Set ---- //
	public Vertex getVert1() {
		return this.vert1;
	}

	public Vertex getVert2() {
		return this.vert2;
	}

	public void setVert1(Vertex v) {
		this.vert1 = v;
	}

	public void setVert2(Vertex v) {
		this.vert2 = v;
	}


	// ---- Methods ---- //


}