// Write ConsistentChick, a subclass of Chick. A ConsistentChick decides at birth whether to chirp or cheep and stands by that 
// decision forever. Its type is still Chick.

package animal;

public class ConsistentChick extends Chick{
	
	private final String sound;

	public ConsistentChick() {
	    super();
	    if (Math.random() < 0.5) {
	        sound = "Chirp";
	    } else {
	        sound = "Cheep";
	    }
	}

	@Override
	public String getSound() {
	    return sound;
	}

}

  
// Write DoubleDog, a subclass of Dog. A DoubleDog says whatever a dog says, but twice in a row. Its type is still Dog./
