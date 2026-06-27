class Solution {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        int bestIndex = -1;
    }
    TrieNode root = new TrieNode();
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        root.bestIndex = getBI(wordsContainer);

        int n = wordsQuery.length;
        int wc = wordsContainer.length;

        for(int i=0;i<wc;i++){
            // insert krenge - Trie construction
            ins(wordsContainer[i],i,wordsContainer);
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            // search krenge in Trie
            ans[i] = solSer(wordsQuery[i]);
        }
        return ans;
    }
    int solSer(String s){
        int n=s.length();
        TrieNode node = root;
        for(int i=n-1;i>=0;i--){
            int ch=s.charAt(i)-'a';
            if(node.children[ch]==null)break;

            node = node.children[ch];
        }
        return node.bestIndex;
    }
    void ins(String w, int ind, String[] wC){
        TrieNode n = root;
        /// update krenge bestIndex ko
        updateBest(n, ind, wC);
        for(int i=w.length()-1; i>=0; i--){
            int ch = w.charAt(i) - 'a';
            if(n.children[ch] == null){
                n.children[ch]=new TrieNode();
            }
            n = n.children[ch];
            updateBest(n, ind, wC);
        }

    }
    void updateBest(TrieNode node, int newInd, String[] wC){
        int oldInd = node.bestIndex;
        if(oldInd == -1 ||
       wC[newInd].length() < wC[oldInd].length() ||
      (wC[newInd].length() == wC[oldInd].length()
       && newInd < oldInd)){
            node.bestIndex = newInd;
        }
    }
    int getBI(String[] wC){
        int bI=0;
        for(int i=1;i<wC.length;i++){
            if(wC[i].length() < wC[bI].length()){
                bI=i;
            }
        }
        return bI;
    }
}