import java.util.*

fun isCircularPalindrome(word: String): Boolean {
    if (word.length <= 1) {
        return false
    }

    val lowercasedWord = word.lowercase(Locale.getDefault())
    val reversed = lowercasedWord.reversed()

    return (lowercasedWord + lowercasedWord).contains(reversed)
}

/**
 * Prompt: Create a function isCircularPalindrome(word) that takes a word representing potential
 * of circular palindrome and return a boolean true or false
 *
 * Input: A string representing the potential circular palindrome (e.g.,"level","madamimadam","rotor")
 * Output: A boolean value indicating whether the string is a circular palindrome (True) or not (False)
 *
 * Constraints:
 * - The input string can contain upper and lowercase letters,numbers,and special characters.
 * - Empty strings and single-character strings are not considered palindromes.
 */