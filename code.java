import java.io.*;
public class COPY {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream i=null;
   FileOutputStream o=null;
   if (args.length!=2) {
	   System.out.print("we don't found length =2");
	   return;
   }
   int sh;
   try {
	   i=new  FileInputStream(args[0]);
	   o=new  FileOutputStream(args[1]);
	   do {
		sh=i.read()	; 
		if(sh!=-1)
			o.write(sh); }
	   while(sh!=-1);
	   System.out.print("successfully add");}
   catch(IOException s)
   {
	   System.out.print("error s");
   }
   finally {
	   try {
		   if(i!=null)i.close();
		   
	   }
	   catch(IOException s2) {
		   System.out.print("file not open");
	   }
	   try {
		   if(o!=null)o.close();
		   
	   }
	   catch(IOException s2) {
		   System.out.print("file not close");
	   }
   }
	   
  
	}

}
