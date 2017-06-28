package demo_logic;

public class Sample {

	public static void main(String[] args) {
		int flag=0;	
		String input1="thi_".toUpperCase();
		String input2="Thin:That:Those:this:what:thi:while:Whap:Than:THAR:thick".toUpperCase();
	    String output="";
	    String[] split=input2.split(":");
	    String[] duplicate=new String[split.length];
	    System.arraycopy(split, 0, duplicate, 0, split.length);
	    int index=input1.indexOf("_");
	    for(int i=0;i<duplicate.length;i++){
	    	if(input1.length()==duplicate[i].length()){
	    		
	    	      duplicate[i]=duplicate[i].replace(duplicate[i].charAt(index),'_');
	    	}
	    		}
	    for(int i=0;i<duplicate.length;i++){
	    	if(input1.equals(duplicate[i])){	
	    		flag=1;
	    		output+=split[i];
	    		output+=":";
	    	}
	    	
	    }
	    if(flag==0)
	    	System.out.println("ERROR-009");
	    else
	    System.out.print(output.substring(0, output.length()-1).trim());
	   
	}

}
