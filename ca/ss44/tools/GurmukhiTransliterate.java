/**
 * Transliteratation class, to convert a string of Gurmuhki text
 * into it's english/romanized equiavelent.
 * 
 * @author Shajinder Singh <ss@ss44.ca>
 * @created 22-Feb-2012
 */
public class GurmukhiTransliterate{
	
	/**
   	 * Represents the Gurmukhi Webakhar / WebThick font type faces.
	 */
	public static final int GURMUKHI_WEBAKHAR = 1;
	
	/**
	 * Represents the transliteration style to be phonic i.e where all 
	 * characters are spelt out to sound exactly as they appear.
	 */
	public static final int TRANSLITERATE_PHONICS = 1;
	
	
	private int gurmukhiFace, transliterateStyle;

	/**
	 * Creates a new instance of Gurmukhi Transliterate
	 * 
	 * @param int Gurmukhi type face to use as input.
	 * @param int Transliteration style to use.
	 */
	public GurmukhiTransliterate(int gurmukhiFace, int transliterateStyle){
		
		setTypeFace( gurmukhiFace );
		setTransliterateStyle( transliterateStyle );
	}

	/**
	 * Sets the type face being used for input.
	 * 
	 * @param The gurmukhi type face being used. Valid values are those defined by the GURMUKH_* constants.
	 * 	
	 */
	public void setTypeFace( int gurmukhiFace ) throws IllegalArgumentException{
		
		switch ( gurmukhiFace ){
			
			case GURMUKHI_WEBAKHAR:
				this.gurmukhiFace = gurmukhiFace;
				return;
			default:
				throw new IllegalArgumentException( "Invalid or unsupported type face specified");
		}

	}

	public void setTransliterateStyle( int transliterateStyle ){
		
		switch ( transliterateStyle ){
			
			case TRANSLITERATE_PHONICS:
				this.transliterateStyle = transliterateStyle;
				return;
			
			default:
				break;
		}
	}
	
	

	/**
	 * Transliterates the given string based on the rules provided or set.
	 * 
	 * @param The string that we want to transliterate. Expected to be in the gurmukhi type face provided.
	 * @return Transliterated string in the style set by setTransliterateStyle.
	 */
	public String transliterate( String toConvert ){
		
		//Based on what the type face is and what string we want to convert to
		//call the appropriate conversion method.
		
		if ( this.gurmukhiFace == GURMUKHI_WEBAKHAR ){
			switch ( transliterateStyle ){
				case TRANSLITERATE_PHONICS:
					return transWebAkharPhonics( toConvert );
			}
		}

		return "";
	}

	/**
	 * Handles specific case of converting where the typeface is GURMUKHI_WEBAKHAR
	 * and the transliteration style is phonics.
	 * 
	 * @see transliterate
	 */
	protected String transWebAkharPhonics( String toConvert ){
		return "";
	}
}
