import java.util.*;
import java.io.*;
 
class S 
{
  public static void main(String[] args) throws IOException 
  {
 
    File file = new File("input.txt");
    Scanner input = new Scanner(file); 
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));  

    for(int j=0;j<20;j++)
    {
    	String word[]= new String[20];
 		int i=0;
   		int count = 0;
    	while (input.hasNext() && i<20) 
    	{
	    	word[count] = input.next();
	    	i++;
	      	count = count + 1;
   		}
   		Arrays.sort(word);
    	File temp = new File("Level1_myTempFile"+j+".txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        //System.out.println("Written to Temp file : " + temp.getAbsolutePath());
    	for(i=0;i<20;i++)
    	{
    	//System.out.println(word[i]);
    	//writer.write(word[i]+"\n");
    	bw.write(word[i]);
    	bw.write("\n");
   		}
   		bw.close();
    }
    for(int j=0;j<20;j=j+2)
    {	
    	File inlevel1 = new File("Level1_myTempFile"+j+".txt");
    	File inlevel1_0 = new File("Level1_myTempFile"+(j+1)+".txt");
    	File temp = new File("Level2_myTempFile"+(j/2)+".txt");
    	Scanner input_0 = new Scanner(inlevel1); 
    	Scanner input_1 = new Scanner(inlevel1_0);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    	ArrayList<String> word = new ArrayList<String>();
   		
    	while (input_0.hasNext() ) 
    	{
	    	word.add(input_0.next());
   		}
   		while (input_1.hasNext() ) 
    	{
	    	word.add(input_1.next());	
	    }
   		Collections.sort(word);	

   		for (int i=0; i<word.size(); i++) 
   		{
   			bw.write(word.get(i)); 
        	bw.write("\n");
   		}
   		bw.close();        
    }
    for(int j=0;j<10;j=j+2)
    {	
    	File inlevel1 = new File("Level2_myTempFile"+j+".txt");
    	File inlevel1_0 = new File("Level2_myTempFile"+(j+1)+".txt");
    	File temp = new File("Level3_myTempFile"+(j/2)+".txt");
    	Scanner input_0 = new Scanner(inlevel1); 
    	Scanner input_1 = new Scanner(inlevel1_0);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    	ArrayList<String> word = new ArrayList<String>();
   		
    	while (input_0.hasNext() ) 
    	{
	    	word.add(input_0.next());
   		}
   		while (input_1.hasNext() ) 
    	{
	    	word.add(input_1.next());	
	    }
   		Collections.sort(word);	

   		for (int i=0; i<word.size(); i++) 
   		{
   			bw.write(word.get(i)); 
        	bw.write("\n");
   		}
   		bw.close();        
    }
    for(int j=0;j<4;j=j+2)
    {	
    	File inlevel1 = new File("Level3_myTempFile"+j+".txt");
    	File inlevel1_0 = new File("Level3_myTempFile"+(j+1)+".txt");
    	File temp = new File("Level4_myTempFile"+(j/2)+".txt");
    	Scanner input_0 = new Scanner(inlevel1); 
    	Scanner input_1 = new Scanner(inlevel1_0);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    	ArrayList<String> word = new ArrayList<String>();
   		
    	while (input_0.hasNext() ) 
    	{
	    	word.add(input_0.next());
   		}
   		while (input_1.hasNext() ) 
    	{
	    	word.add(input_1.next());	
	    }
   		Collections.sort(word);	

   		for (int i=0; i<word.size(); i++) 
   		{
   			bw.write(word.get(i)); 
        	bw.write("\n");
   		}
   		bw.close();        
    }
    for(int j=0;j<2;j=j+2)
    {	
    	File inlevel1 = new File("Level4_myTempFile"+j+".txt");
    	File inlevel1_0 = new File("Level4_myTempFile"+(j+1)+".txt");
    	File temp = new File("Level5_myTempFile"+(j/2)+".txt");
    	Scanner input_0 = new Scanner(inlevel1); 
    	Scanner input_1 = new Scanner(inlevel1_0);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    	ArrayList<String> word = new ArrayList<String>();
   		
    	while (input_0.hasNext() ) 
    	{
	    	word.add(input_0.next());
   		}
   		while (input_1.hasNext() ) 
    	{
	    	word.add(input_1.next());	
	    }
   		Collections.sort(word);	

   		for (int i=0; i<word.size(); i++) 
   		{
   			bw.write(word.get(i)); 
        	bw.write("\n");
   		}
   		bw.close();        
    }
    	File inlevel1 = new File("Level5_myTempFile0.txt");
    	File inlevel1_0 = new File("Level3_myTempFile4.txt");
    	File temp = new File("output.txt");
    	Scanner input_0 = new Scanner(inlevel1); 
    	Scanner input_1 = new Scanner(inlevel1_0);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    	ArrayList<String> word = new ArrayList<String>();
   		
    	while (input_0.hasNext() ) 
    	{
	    	word.add(input_0.next());
   		}
   		while (input_1.hasNext() ) 
    	{
	    	word.add(input_1.next());	
	    }
   		Collections.sort(word);	

   		for (int i=0; i<word.size(); i++) 
   		{
   			bw.write(word.get(i)); 
        	bw.write("\n");
   		}
   		bw.close();        
    //System.out.println("Word count: " + count);
    writer.close();
    
    //file.close();
  }
}