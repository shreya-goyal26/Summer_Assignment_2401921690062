class Solution {
public:
    string decodeString(string s) {
        stack<int> num;
        stack<string> st;
        string cur="";
        int k=0;

        for(char c:s){
            if(isdigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
                num.push(k);
                st.push(cur);
                k=0;
                cur="";
            }
            else if(c==']'){
                string temp=cur;
                cur=st.top();
                st.pop();

                int cnt=num.top();
                num.pop();

                while(cnt--){
                    cur+=temp;
                }
            }
            else{
                cur+=c;
            }
        }

        return cur;
    }
};
