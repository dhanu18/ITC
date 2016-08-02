package com.se.image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
 
public class ByteArray {
	
	 
	
		public static void main(String[] args) throws IOException{
			String dirName="C:\\Users\\user\\source1";
			String dirName1="C:\\Users\\user\\source2";
			ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
			BufferedImage img=ImageIO.read(new File(dirName,"snap.jpg"));
			ImageIO.write(img, "jpg", baos);
			baos.flush();
	 
			String base64String=Base64.encode(baos.toByteArray());
			baos.close();
		
	 		
			byte[] bytearray = Base64.decode(base64String);
			

			ByteArrayOutputStream baos1=new ByteArrayOutputStream(1000);
			BufferedImage img1=ImageIO.read(new File(dirName1,"Chrysanthemum.jpg"));
			ImageIO.write(img1, "jpg", baos1);
			baos1.flush();
			

			String base64String1=Base64.encode(baos1.toByteArray());
			baos1.close();
		
	 		
			byte[] bytearray1 = Base64.decode(base64String1);
			
			
			System.out.println(Arrays.equals(bytearray, bytearray1));
			
	 /*
			BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
			ImageIO.write(imag, "jpg", new File(dirName,"snap1.jpg"));*/
		}
	}

