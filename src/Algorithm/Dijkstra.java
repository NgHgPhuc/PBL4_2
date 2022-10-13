package Algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Dijkstra {
    public static void main(String[] args) {
    	double matrix[][];
    	try {
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\ASUS\\Desktop\\matrix.txt")));
			int c;
			String s="";
			while((c=br.read())!= -1) {
				s += String.valueOf((char)c);
			}
			String[] p = s.split(" ");
			for(int i = 0; i < p.length; i++) {
				//System.out.println(p[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	int c;
    	
    	
        Vert vA = new Vert("A");
        Vert vB = new Vert("B");
        Vert vC = new Vert("C");
        Vert vD = new Vert("D");
        Vert vE = new Vert("E");
        Vert vF = new Vert("F");
        
        vA.addNeighbour(new Edge(4, vA, vB));
        vA.addNeighbour(new Edge(2, vA, vF));
        vB.addNeighbour(new Edge(4, vB, vA));
        vB.addNeighbour(new Edge(3, vB, vC));
        vB.addNeighbour(new Edge(3, vB, vE));
        vC.addNeighbour(new Edge(3, vC, vB));
        vC.addNeighbour(new Edge(2, vC, vD));
        vD.addNeighbour(new Edge(3, vD, vC));
        vD.addNeighbour(new Edge(1, vD, vE));
        vE.addNeighbour(new Edge(3, vE, vB));
        vE.addNeighbour(new Edge(1, vE, vD));
        vF.addNeighbour(new Edge(3, vF, vE));
        vF.addNeighbour(new Edge(2, vF, vA));

        PathFinder shortestPath = new PathFinder();
        shortestPath.ShortestP(vA);
        System.out.println("khoang cach:");
        System.out.println("A -> B: " + vB.getDist());
        System.out.println("A -> C: " + vC.getDist());
        System.out.println("A -> D: " + vD.getDist());
        System.out.println("A -> E: " + vE.getDist());
        System.out.println("A -> F: " + vF.getDist());
        System.out.println("duong di ngan nhat:");
        System.out.println("A -> B: " + shortestPath.getShortestP(vB));
        System.out.println("A -> C: " + shortestPath.getShortestP(vC));
        System.out.println("A -> D: " + shortestPath.getShortestP(vD));
        System.out.println("A -> E: " + shortestPath.getShortestP(vE));
        System.out.println("A -> F: " + shortestPath.getShortestP(vF));
        
        
    }
}
