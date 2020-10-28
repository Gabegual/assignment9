
public class isNameQ {
	public static boolean main(String[] args) {
		String name = readLine("Enter name: ");
		char ch = name.charAt(0);
		return((ch =="Q") && (name.length()== 1));
	}
	// This Method looks specifically for the character Q at the beginning when a user types a name while
	// the other doesn`t, just returns a value if it has Q

}
