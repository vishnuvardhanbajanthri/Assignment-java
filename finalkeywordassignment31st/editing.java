package finalkeywordassignment31st;

class editing extends FinallKeyword{
	 void finallkey() {
		 System.out.println("We cant override because of using final keyword use in previous method ");
	 }
	 public static void main(String[] args) {
		editing editing=new editing();
		editing.finallkey();
	}
}


/*
o/p error message

Error: LinkageError occurred while loading main class finalkeywordassignment31st.editing
java.lang.IncompatibleClassChangeError: class finalkeywordassignment31st.editing overrides final method finalkeywordassignment31st.FinallKeyword.finallkey()V

*/