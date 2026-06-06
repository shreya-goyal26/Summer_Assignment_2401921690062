class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";

        string prefix = strs[0];

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix[i];

            for (int j = 1; j < strs.size(); j++) {
                // check bounds OR mismatch
                if (i >= strs[j].length() || strs[j][i] != ch) {
                    return prefix.substr(0, i);
                }
            }
        }

        return prefix;
    }
};
