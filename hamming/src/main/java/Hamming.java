class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {

       this.rightStrand = rightStrand;
       this.leftStrand = leftStrand;
       this.validate();
    }

    int getHammingDistance() {
        int distance = 0;

        for(int i = 0 ; i < this.leftStrand.length() ; i ++) {
            if(this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                distance += 1;
            }
        }

        return distance;
    }

     void validate()
    {
        if(this.leftStrand.isEmpty() && !this.rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }else if(this.rightStrand.isEmpty() && !this.leftStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }else if(this.leftStrand.length() != this.rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

}
