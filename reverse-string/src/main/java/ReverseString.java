class ReverseString {

    String reverse(String inputString) {

        byte[] inputStringBytes = inputString.getBytes();
        int length = inputStringBytes.length ;
        byte[] revesedByetes = new byte[length];
        for (int i = 0 ; i < length ; i++){
            revesedByetes[i] = inputStringBytes[length -1 -i];
        }
        return new String(revesedByetes);
    }
  
}