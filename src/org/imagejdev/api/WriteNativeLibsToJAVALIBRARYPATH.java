package org.imagejdev.api;

/*
 * This class
 */
public class WriteNativeLibsToJAVALIBRARYPATH 
{
	// Given an OS, copy the native libs to the build path
	public enum OSCHOICE 
	{
		APPLE, LINUX64, LINUX32, WINDOWS64, WINDOWS32
	};

	public static void copyNativeLibs(OSCHOICE os) 
	{
		
		switch (os) {
			case APPLE: 
			{

			}

			default: 
			{
				break;
			}
		} // end switch
		
	}
}
