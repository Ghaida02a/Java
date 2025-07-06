public class NamesReverser  {
	public static void main(String[] args) {
		String[] names = {"Nasser", "Haitham", "Manal", "Hanin"}; //the output should be {"ressaN", "mahtiaH", "lanaM", "ninaH"}
		String[] reversedNames = reverseAllNames(names); //will call reverseAllNames method& save update

	
	System.out.print("{");//use print(does not create line break) instead of println
	
	for (int i = 0; i < reversedNames.length; i++){
		System.out.print(reversedNames[i]);
		
		if (i < reversedNames.length - 1) { // add (,) between names except after the last name
                System.out.print(", ");
		}
	}
	System.out.print("}");
	}
	
	public static String[] reverseAllNames(String[] names){
		String[] reversed = new String[names.length];
		for (int i = 0; i < names.length; i++) { //this will go for every name and reverse it
            // Reverse each name in the arrayList and store it into the new array (reversed)
            reversed[i] = new StringBuilder(names[i]).reverse().toString();
        }
		 return reversed;
	}
}