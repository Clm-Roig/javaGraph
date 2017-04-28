public class DirectedEdge extends Edge {
	// ---- Attributes ---- //
	private Vertex directedTo;

	// ---- Constructors ---- //
	public DirectedEdge() {
		super();
	}

	// By default, the DirectedEdge is directed from v1 to v2
	public DirectedEdge(Vertex v1, Vertex v2){
		super(v1,v2);
		this.directedTo = v2;
	}
	// ---- Get / Set ---- //
	public Vertex getDirectedTo() {
		return this.directedTo;
	}

	// ---- Methods ---- //
	public void changeDirection() {
		if(this.directedTo == super.v1) {
			this.directedTo = super.v2;
		} 
		else {
			this.directedTo = super.v1;
		}
	}
}