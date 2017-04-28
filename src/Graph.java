package graph;

public interface Graph {
	// ---- Methods ---- //

	/* ajoute un  élément Edge (arête) à la liste d'Edge du graphe correspondant*/
	public void addEdge(Edge e);
	/* supprime un élément Edge ( arête ) à la liste du graphe correspondant */
	public void rmvEdge(Edge e);
	/* ajoute un élément Vertex( sommet ) à la liste du graphe correspondant */
	public void addVertex(Vertex v);
	/* supprime un élément Vertex ( sommet ) à la liste du graphe correspondant */
	public void rmvVertex(Vertex v);

}
