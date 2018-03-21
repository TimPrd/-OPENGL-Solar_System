/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;


import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

/**
 *
 * @author licence
 */
public class Cube implements GLEventListener {
    private int angle = 0;
    
    public void init(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); 
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        //gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"

        // Move the "drawing cursor" around
        gl.glTranslatef(-.5f, 0.0f, -6.0f);
        angle = (++angle)*(++angle);
        gl.glRotatef(angle, 0, 30, 0);

     // White side - BACK
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(   1.0f,  .3f, 0.0f );
        gl.glVertex3f(  0.5f, -0.5f, 0.5f );
        gl.glVertex3f(  0.5f,  0.5f, 0.5f );
        gl.glVertex3f( -0.5f,  0.5f, 0.5f );
        gl.glVertex3f( -0.5f, -0.5f, 0.5f );
        gl.glEnd();

        // Purple side - RIGHT
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(  1.0f,  0.0f,  1.0f );
        gl.glVertex3f( 0.5f, -0.5f, -0.5f );
        gl.glVertex3f( 0.5f,  0.5f, -0.5f );
        gl.glVertex3f( 0.5f,  0.5f,  0.5f );
        gl.glVertex3f( 0.5f, -0.5f,  0.5f );
        gl.glEnd();

        // Green side - LEFT
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(   0.0f,  1.0f,  0.0f );
        gl.glVertex3f( -0.5f, -0.5f,  0.5f );
        gl.glVertex3f( -0.5f,  0.5f,  0.5f );
        gl.glVertex3f( -0.5f,  0.5f, -0.5f );
        gl.glVertex3f( -0.5f, -0.5f, -0.5f );
        gl.glEnd();

        // Blue side - TOP
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(   0.0f,  0.0f,  1.0f);
        gl.glVertex3f(  0.5f,  0.5f,  0.5f);
        gl.glVertex3f(  0.5f,  0.5f, -0.5f);
        gl.glVertex3f( -0.5f,  0.5f, -0.5f);
        gl.glVertex3f( -0.5f,  0.5f,  0.5f);
        gl.glEnd();

        // Red side - BOTTOM
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(   1.0f,  0.0f,  0.0f );
        gl.glVertex3f(  0.5f, -0.5f, -0.5f );
        gl.glVertex3f(  0.5f, -0.5f,  0.5f );
        gl.glVertex3f( -0.5f, -0.5f,  0.5f );
        gl.glVertex3f( -0.5f, -0.5f, -0.5f );
        gl.glEnd();
        

    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
