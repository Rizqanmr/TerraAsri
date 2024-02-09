fun decodeEmojis(text: String, emojiMapping: Map<String, String>): String {
    val regex = Regex("[\\uD83C-\\uDBFF\\uDC00-\\uDFFF]+")
    var decodedText = text

    regex.findAll(text).forEach { matchResult ->
        val emoji = matchResult.value
        val decodedWord = emojiMapping[emoji]

        if (decodedWord != null) {
            decodedText = decodedText.replace(emoji, decodedWord)
        }
    }

    return decodedText
}

/**
 * Decoding emoji to word
 * input:
 * - A text message or document containing a combination of text and emojis.
 * - A dictionary or mapping of emojis to their corresponding words or phrases (your defined encoding scheme).
 *
 * output: A dictionary or mapping of emojis to their corresponding words or phrases (your defined encoding scheme).
 *
 * constraints:
 * - Emojis can be combined to represent longer phrases (e.g., 🍔 = "burger fries pizza").
 * - The encoding scheme can be flexible, allowing for variations in word choice and emoji usage.
 * - The program should handle cases where emojis are not part of the code and should leave them unchanged.
 *
 * hints:
 * - Use regular expressions or string manipulation techniques to extract emojis from the text.
 * - Implement a function to translate emojis based on the provided encoding scheme.
 * - Incorporate error handling to address invalid emojis or missing mappings.
 * - Consider using a database or JSON file to store the encoding scheme for easy updates.
 */