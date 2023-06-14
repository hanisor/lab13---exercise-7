package server;

/**
 * This class generates word count.
 * 
 * @author hanis sorhana
 *
 */
public class Translation {

	
	/**
	 * This method generates word count.
	 * 
	 * @return word count
	 */
	public String getTranslate(String targetLanguage) {
		
		if (targetLanguage == "Bahasa Malaysia") {
			
			return "Terima Kasih";
		}
		else 
			
			return "error";
        
		
	}
	
	public String getTranslate2(String targetLanguage2) {
		
		if (targetLanguage2 == "Arabic") {
			
			return "لك ش";
		}
		else 
			
			return "error";
        
		
	}
	
	public String getTranslate3(String targetLanguage3) {
		
		if (targetLanguage3 == "Korean") {
			
			return " 감사합니다 ";
		}
		else 
			
			return "error";
        
		
	}
	
}
