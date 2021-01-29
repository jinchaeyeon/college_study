
public class Sort{
	
    public int size; 
    String [] Array;

	public Sort() {
        Array = new String[2];
	}
	
    public void resize(int n) {
        String [] newArray = new String[n];
        
        for (int i = 0; i< size; i++) {
        		newArray[i] = Array[i];
        }
        Array = newArray;
    }
    
    public void insert(String name){
    	if(size == Array.length) {
    		resize(Array.length+1);
    	}
    	Array[size] = name;
    	size++;
    }
}