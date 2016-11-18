package com.almi.pgs.client;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * Created by Almi on 2016-10-09.
 */
public class FPSClient extends SimpleApplication {

    public static void main(String[] args) {
        FPSClient fpsClient = new FPSClient();
        fpsClient.start();
    }

    public void simpleInitApp() {
        Box b = new Box(1, 1, 1); // create cube shape
        Geometry geom = new Geometry("Box", b);  // create cube geometry from the shape
        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/ShowNormals.j3md");  // create a simple material
//        mat.setColor("Color", ColorRGBA.Blue);   // set color of material to blue
        geom.setMaterial(mat);                   // set the cube's material
        rootNode.attachChild(geom);              // make the cube appear in the scene
    }
}
