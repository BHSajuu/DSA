public class uppercase_characters_to_lowercase_using_bits {
  public static void main(String[] args) {
    for(char ch ='A' ; ch<='Z'; ch++){
        System.out.println((char)(ch | ' ')); // (char) this for type casting...................
    }
  }
}
