package com.acloudysky.ui;

/**
 * @author mmiele
 *
 */

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Defines fields and methods to implement the {@link UserInterface} class.
 * @see UserInterface
 * @author Michael Miele
 *
 */
public interface IUserInterface {
	

	// The divider length used in displaying menu and other.
	int DIVIDER_LENGTH = 66;
		
	// OS specific new line.
	String newline = System.getProperty("line.separator");
	
	
	/**
	 * Environment parameters such as OS name, user's home directory. 
	 */
	ArrayList<String> environment = new  ArrayList<String>(
			Arrays.asList(
					System.getProperty("os.name"), 		// OS name.
					System.getProperty("user.home")		// User home directory.
			)
	);
	
	/**
	 * When using MIME types, you must distinguish between types to use when uploading files to the Drive 
	 * and types to use when downloading files from the Drive. 
	 * In the following array, in each sub-array, the fist element is the file type (extension), the second element is the upload (Google Drive) type, 
	 * the third is the download type. 
	 * When downloading a file from the Drive, if the upload type is different from the download type you should use the export function
	 * and instruct the Drive service to make a conversion. The following is an example:
	 * <pre>
	 * 		Export request = authenticatedClient.files().export(fileID, downloadMimeType);
	 * 		request.executeMediaAndDownloadTo(outputStream); 
	 * </pre>
	 * For more information see <a href="https://developers.google.com/drive/v3/web/mime-types" target="_blank">upload types</a> and 
	 * <a href="https://developers.google.com/drive/v3/web/manage-downloads#downloading_google_documents" target="_blank">dowload types</a>
	 */
	String mimeTypes[][] = 
	{	  
			/* Microsoft */
			{"docx", "application/vnd.google-apps.document", "application/vnd.openxmlformats-officedocument.wordprocessingml.document" },
			{"pptx", "application/vnd.google-apps.presentation", "application/vnd.openxmlformats-officedocument.presentationml.presentation"},
			{"xlsx", "application/vnd.google-apps.spreadsheet", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"},
	      
			/* Others */
			{"txt", "text/plain", "text/plain"},
			{"pdf", "application/pdf", "application/pdf"},
			{"jpeg", "image/jpeg", "image/jpeg"},
			{"json", "application/vnd.google-apps.script", "application/vnd.google-apps.script+json"},

	};
	
	/**
	 * Storage Client Application menu entries.
	 */
	ArrayList<String> storageMenuEntries = new  ArrayList<String>(
			Arrays.asList(
							"cb - Create bucket", 
							"lb - List buckets",
							"gb - Get bucket info",
							"db - Delete bucket",
							"uo - Upload object",
							"do - Download object",
							"lo - List objects",
							"xo - Delete object",
							"m  - Display menu",
							"x  - Quit the application"
						)
	);
	
	/**
	 * Drive Client Application menu entries.
	 */
	ArrayList<String> driveMenuEntries = new  ArrayList<String>(
			Arrays.asList(
							"lf  		- List files", 
							"lft 		- List files of specified type",
							"lfc 		- List comments for specified doc file",
							"ifc 		- Insert comments in specified doc file",
							"up_txt		- Upload text file",
							"up_docx 	- Upload doc file",
							"up_pptx 	- Upload presentation file",
							"up_xlsx 	- Upload spreadsheet file",
							"up_jpeg 	- Upload image file",
							"dw_txt		- Download text file",
							"dw_docx 	- Download doc file",
							"dw_pptx 	- Download presentation file",
							"dw_xlsx 	- Download spreadsheet file",
							"dw_jpeg 	- Download image file",
							"fp  		- Get a file's parents",
							"test 		- Test before deploying",
							"m   		- Display menu",
							"x   		- Exit the application"
						)
	);
	

	/**
	 * Storage Client Application menu entries.
	 */
	ArrayList<String> youtubeMenuEntries = new  ArrayList<String>(
			Arrays.asList(
							"lv  - List uploaded videos", 
							"sv  - Search video",
							"uv  - Upload video",
							"udv - Update video",
							"m   - Display menu",
							"x   - Quit the application"
						)
	);
}

