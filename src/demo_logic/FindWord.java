package demo_logic;


public class FindWord {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		String input1="thi_";
		String input2="thin:that:those:this:what:thi:why:whap:than:thar:thick";
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		int index=input1.indexOf('_');
		String str1=input1.substring(0,index);
		String str2=input1.substring(index+1);
		String words[]=input2.split(":");
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()==input1.length())
			{
				if(words[i].startsWith(str1) && words[i].endsWith(str2))
				{
					sb.append(words[i]+":");
				}
			}
		}
		sb.deleteCharAt(sb.length()-1);
		String output=sb.toString();
		System.out.println(output);
	}

}
