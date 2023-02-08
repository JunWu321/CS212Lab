public static String findSingletons(String str){
		String singletons = "";
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i + 1);
			int count = 0;
			for (int j = 0; j < str.length(); j++){
				if (str.substring(j, j + 1).equalsIgnoreCase(letter)){
					count++;
				}
			}
			if (count == 1){
				singletons += letter;
			}
		}
  return singletons;
	}
 
