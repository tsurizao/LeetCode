(function () {
    // Given an integer x, return true if x is a
    // palindrome, and false otherwise.

    /**
     * @param {number} x
     * @return {boolean}
     */
    let isPalindrome = function(x) {
        return x == x.toString().split("").reverse().join("");
    };

    console.log(isPalindrome(121));
    console.log(isPalindrome(-121));
    console.log(isPalindrome(10));
}());