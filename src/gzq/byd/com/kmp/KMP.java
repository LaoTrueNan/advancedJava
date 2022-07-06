package gzq.byd.com.kmp;

public class KMP {
    private char[] target;
    private char[] match;

    public KMP(String target, String match) {
        this.target = target.toCharArray();
        this.match = match.toCharArray();
    }

    public char[] getTarget(){
        return this.target;
    }

    public char[] getMatch(){
        return this.match;
    }
    
    public int[] getNext(){
        char[] p = this.getMatch();
        int j=0;
        int k=-1;
        int next[] = new int[this.getMatch().length];
        next[0]=-1;
        while (j<p.length-1) {
            if(k==-1 || p[j]==p[k]){
                if(p[++j]==p[++k]){
                    next[j]=next[k];//next[1] = next[0]
                }else{
                    next[j] = k;
                }
            }else{
                k=next[k];
            }
        }
        return next;
    }

    public int res(){
        int res;
        char[] target = this.getTarget();
        char[] match = this.getMatch();
        int i = 0;
        int j = 0;
        int[] next = getNext();
        while (i<target.length && j<match.length) {
            if(j==-1 || target[i] == match[j]){
                j++;
                i++;
            }else{
                j=next[j];
            }
        }
        if(j == match.length){
            res = i-j;
        }else{
            res = -1;
        }
        return res;
    }
}

