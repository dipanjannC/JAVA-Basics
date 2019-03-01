public class Test {
	
	int width;

	int height;

	int length;

	int volume;

	void volume() {

	volume = width*height*length;

	}

	

	public static void main(String args[])

	{

	Test obj = new Test();

	obj.height = 1;

	obj.length = 5;

	obj.width = 5;

	obj.volume();

	System.out.println(obj.volume);

	}


}
