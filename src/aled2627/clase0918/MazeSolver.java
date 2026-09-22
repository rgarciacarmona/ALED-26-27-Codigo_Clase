package aled2627.clase0918;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Clase MazeSolver para resolver laberintos (no devuelve necesariamente la mejor
// solución, búsqueda DFS)
public class MazeSolver {

	// Información que necesitamos para resolver el laberinto
	private String[] maze;
	private char wall;
	private Coordinate start;
	private Coordinate end;
	// Lista de coordenadas que conducen a la salida
	private List<Coordinate> path;
	// Lista de coordenadas visitadas
	// Necesaria para no ir yendo para adelante y para atrás una y otra vez
	private Set<Coordinate> visited;

	// Constructor
	public MazeSolver(String[] maze, char wall, Coordinate start, Coordinate end) {
		this.maze = maze;
		this.wall = wall;
		this.start = start;
		this.end = end;
		this.path = new ArrayList<Coordinate>();
		this.visited = new HashSet<Coordinate>();
	}

	// Método auxiliar, que implementa la recursividad
	// Devuelve un boolean, que indica si el camino conduce a la salida
	private boolean walk(Coordinate current) {
		// 2. Caso base
		// ¿Estoy dentro del laberinto?
		if (current.getX() < 0 || current.getX() >= maze[0].length()
				|| current.getY() < 0 || current.getY() >= maze.length) {
			// Si no, devuelvo false
			return false;
		}
		// ¿Estoy en un muro?
		if (maze[current.getY()].charAt(current.getX()) == wall) {
			// Si lo estoy, devuelvo false
			return false;
		}
		// ¿He visitado antes este lugar?
		if (visited.contains(current)) {
			// Si lo hice, devuelvo false
			return false;
		}

		// 1. Código general
		// Si he llegado a este punto, la coordenada es "procesable"
		// Añado la coordenada actual al camino y a la lista de visitadas
		path.add(current);
		visited.add(current);

		// 2. Caso base
		// ¿He llegado a la salida?
		if (current.getX() == end.getX() && current.getY() == end.getY()) {
			// Si es así, ¡devuelvo true!
			return true;
		}

		// 3. Paso recursivo
		// 3.1 Pre: Preparo las cuatro coordenadas a visitar:
		// arriba, derecho, abajo e izquierda
		Coordinate up = new Coordinate(current.getX(), current.getY() - 1);
		Coordinate right = new Coordinate(current.getX() + 1, current.getY());
		Coordinate down = new Coordinate(current.getX(), current.getY() + 1);
		Coordinate left = new Coordinate(current.getX() - 1, current.getY());
		Coordinate[] toVisit = new Coordinate[4];
		toVisit[0] = up;
		toVisit[1] = right;
		toVisit[2] = down;
		toVisit[3] = left;
		// 3.2 Las visito
		for (Coordinate coordinate : toVisit) {
			// Si alguna conduce al final, ¡devuelvo true!
			if (this.walk(coordinate)) {
				return true;
			}
		}
		// 3.3 Post: Si he llegado hasta aquí, es que ninguno de los caminos que
		// parten de esta coordenada conduce a la salida.
		// Elimino la coordenada actual del camino y devuelvo false
		path.remove(current); // O(n); debería usarse path.remove(path.size() - 1)
		return false;

	}

	// Método para resolver el laberinto, que devuelve la lista de coordenadas
	// a recorrer, en orden.
	public List<Coordinate> solve() {
		// Limpia ejecuciones anteriores
		this.path = new ArrayList<Coordinate>();
		this.visited = new HashSet<Coordinate>();
		// Llama al método auxiliar
		this.walk(start);
		// Devuelve la lista de coordenadas
		return path;
	}

	// Método main
	public static void main(String[] args) throws IOException {
		// Convierte el fichero en String[]
		Path filePath = Paths.get(args[0]);
		List<String> mazeList = Files.readAllLines(filePath);
		String[] maze = mazeList.toArray(new String[0]);
		// Busca el principio (A) y el final (B) del laberinto
		Coordinate start = null, end = null;
		for (int i = 0; i < maze.length; i++) {
			String string = maze[i];
			int startX = string.indexOf('A');
			int endX = string.indexOf('B');
			if (startX != -1) {
				start = new Coordinate(startX, i);
			}
			if (endX != -1) {
				end = new Coordinate(endX, i);
			}
		}
		// Crea el resolvedor de laberintos
		MazeSolver solver = new MazeSolver(maze, '#', start, end);
		// Lo ejecuta
		System.out.println(solver.solve());
	}

}