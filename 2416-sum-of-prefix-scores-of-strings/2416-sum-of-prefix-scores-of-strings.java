class Solution {
    public int[] sumPrefixScores(String[] words) {
        Tries trie = new Tries(); 
        int count[] = new int[words.length]; 
        for(String word: words){
            trie.addWord(word); 
        }
        int index = 0; 
        for(String word: words){
            count[index]=trie.findPrefixCount(word); 
            index++; 
        }
        return count; 
    }
}

class Node{
    Node child[]; 
    int count; 
    Node(){
        child=new Node[26]; 
        count =0; 
    }
}

class Tries{
    Node root; 
    Tries(){
        root = new Node(); 
    }

    public void addWord(String word){
        Node temp = root; 
        for(char ch: word.toCharArray()){
            int index = ch-'a'; 
            if(temp.child[index]==null){
                temp.child[index]=new Node(); 
            }
            temp.child[index].count++; 
            temp = temp.child[index]; 
        }
    }

    public int findPrefixCount(String word){
        Node temp = root; 
        int count = 0; 
        for(char ch: word.toCharArray()){
            int index = ch - 'a'; 
            count += temp.child[index].count; 
            temp = temp.child[index]; 
        }
        return count; 
    }
}