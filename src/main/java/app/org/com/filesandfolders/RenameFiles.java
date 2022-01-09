package app.org.com.filesandfolders;

import java.io.File;
import java.io.IOException;

public class RenameFiles {
	
	public static void main(String[] argv) throws IOException {
		// Path of folder where files are located
		String folder_path = "C:\\Users\\root@manish\\OneDrive\\Pictures\\Screenshots\\BigShyft";
		String ext = ".png";
		methodCallC(folder_path, ext, null);
		
	}
	private static int count = 0; 
	
	private static void methodCallC(String folder_path, String ext, String dirName) { //, String name) {

		File myfolder = new File(folder_path);

		File[] file_array = myfolder.listFiles();
		String long_file_name = "FALSE";
		String extension = null;
		
		for (int i = 0; i < file_array.length; i++) {
			try {
				if (file_array[i].isDirectory()) {
					String sub_folder_path = file_array[i]+ "";;
					methodCallC(sub_folder_path, ext, file_array[i].getName());
				} else {
					long_file_name = file_array[i].getName();
					File myfile = new File(folder_path + "\\" + long_file_name);
					
					String new_file_name = (null != dirName) ? (dirName) : ("new_file_name" + count++);
					int extensionIndex = long_file_name.lastIndexOf('.');
					if (extensionIndex > 0) {
						extension = long_file_name.substring(extensionIndex);
						if (ext.equals(extension)) {
							myfile.renameTo(new File(folder_path + "\\" + new_file_name + ext));
						}
					} else {
						myfile.renameTo(new File(folder_path + "\\" + new_file_name + ext));
					}
					System.out.print("Old file name : " + long_file_name);
					System.out.print(" : New file name :" + new_file_name);
					System.out.println(" : Extension : " + ext);
					
				}

			} catch (Exception ex) {
				System.out.println(folder_path + "\\" + long_file_name + " >> exception : " + ex.getMessage());
			}
		}
		count = 0;
	}

}
