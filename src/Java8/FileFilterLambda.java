package Java8;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
	public static void main(String[] args) {
		
		
		//The traditional way
//		FileFilter fileFilter = new FileFilter() {
//			
//			@Override
//			public boolean accept(File pathname) {
//				// TODO Auto-generated method stub
//				return pathname.getName().endsWith(".java");
//			}
//		};
//		
		File directoryFile = new File("path");
//		File[] files = directoryFile.listFiles(fileFilter);
//		for (File file: files) {
//			System.out.println(file.getName());
//		}
		
		FileFilter fileFilter = (File pathname) -> pathname.getName().endsWith(".java");
		File[] files = directoryFile.listFiles(fileFilter);
		
	}

}
