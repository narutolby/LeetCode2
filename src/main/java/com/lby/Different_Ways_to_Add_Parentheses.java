public List<Integer> diffWaysToCompute(String input) {

        List<Integer> ret = new ArrayList<Integer>();

        if(input == null || input.length() == 0)return ret;

        int dx = 0;

        Integer var = 0;

        while(dx < input.length() && isDigit(input.charAt(dx))){

                var = (var * 10 + digit(input.charAt(dx++)));

        }

        if(String.valueOf(var).length() == input.length()){

                ret.add(var);

                return ret;

        }

        for(int i = 0;i<input.length();i++){

                if(!isDigit(input.charAt(i))){

                        List<Integer> left = diffWaysToCompute(input.substring(0,i));

                        List<Integer> right = diffWaysToCompute(input.substring(i+1,input.length()));

                        for(int x=0;x<left.size();x++){

                                for(int y=0;y<right.size();y++){

                                        ret.add(compute(input.charAt(i),left.get(x),right.get(y)));

                                }

                        }

                }

        }

        return ret;



}



private boolean isDigit(char a){

        if(a -'0' >= 0 && a - '0' <=9){

                return true;

        }

        return false;

}



private int digit(char a){

        return a - '0';

}

private int compute(char op,int a,int b){

        if(op == '+'){

                return a + b;

        }else if(op == '*'){

                return a * b;

        }else{

                return a - b;

        }
}
