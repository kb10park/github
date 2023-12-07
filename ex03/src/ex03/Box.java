package ex03;

public class Box {
	private int a;
	private int b;
	private int c;
	private int multi;
	Box(int width, int height, int depth){
		a=width;
		b=height;
		c=depth;
		this.volume();
	}
	private void volume() {
		multi=a*b*c;
	}
	public int getVolume() {
		return multi;
	}
    public int getWidth() {
    	return a;
    }
    public int getHeight() {
    	return b;
    }
    public int getDepth() {
    	return c;
    }
    public void setWidth(int wi) {
    	a=wi;
    }
    public void setHeight(int he) {
    	b=he;
    }
    public void setDepth(int de) {
    	c=de;
    }
    public void setVolume() {
    	multi=a*b*c;
    }
   
    }

