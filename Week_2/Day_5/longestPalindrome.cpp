class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.length();

        if (n <= 1)
            return s;

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < n && s[left] == s[right]) {
                int currLength = right - left + 1;

                if (currLength > maxLength) {
                    maxLength = currLength;
                    start = left;
                }

                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < n && s[left] == s[right]) {
                int currLength = right - left + 1;

                if (currLength > maxLength) {
                    maxLength = currLength;
                    start = left;
                }

                left--;
                right++;
            }
        }

        return s.substr(start, maxLength);
    }
};
