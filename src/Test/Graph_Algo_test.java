package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algorithms.Graph_Algo;
import dataStructure.DGraph;
import dataStructure.Vertex;
import utils.Point3D;

public class Graph_Algo_test 
{
	DGraph g ;
	Graph_Algo gAlgo;
	@BeforeEach
	void init() {
		g= new DGraph();
		g.addNode(new Vertex(1,new Point3D(30,500)));
		g.addNode(new Vertex(2,new Point3D(270,80)));
		g.addNode(new Vertex(3,new Point3D(50,100)));
		g.addNode(new Vertex(4,new Point3D(250,250)));
		g.addNode(new Vertex(5,new Point3D(500,250)));
		g.addNode(new Vertex(6,new Point3D(450,550)));
		g.connect(1,3,14);
		g.connect(1,4,9);
		g.connect(1,6,7);
		g.connect(3,1,14);
		g.connect(3,2,9);
		g.connect(3,4,2);
		g.connect(4,5,11);
		g.connect(4,3,2);
		g.connect(4,6,5);
		g.connect(4,1,9);
		g.connect(6,4,10);
		g.connect(6,5,15);
		g.connect(3,2,9);
		
		gAlgo = new Graph_Algo();
		gAlgo.init(g);
	}
	
	@Test
	public void isConnected_test()
	{
		assertEquals(false,gAlgo.isConnected());
		//make well connected
		g.connect(5,2,6);
		g.connect(5,4,5);
		g.connect(5,6,5);
		g.connect(2,3,5);
		g.connect(2,5,5);
		gAlgo.init(g);
		assertEquals(true,gAlgo.isConnected());
	}
	
	
}