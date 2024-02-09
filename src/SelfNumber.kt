fun d(n: Int): Int {
    var sum = n
    var num = n

    while (num > 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}

fun isSelfNumber(n: Int): Boolean {
    for (i in 1..<n) {
        if (d(i) == n) {
            return false
        }
    }
    return true
}

/**
 * In 1949, D.R. Kaprekar, a renowned Indian mathematician, stumbled upon a fascinating group of numbers
 * known as "self-numbers." These elusive entities hold a peculiar property – they cannot be generated
 * by adding the number itself and the sum of its digits. Your mission, codebreaker,
 * is to embark on a journey to discover these self-numbers and calculate their sum,
 * venturing beyond the realm of 100 and into the vast landscape of numbers up to 5000.
 *
 * input: N/A (No specific input required)
 * output: The sum of all self-numbers greater than 0 and less than 5000.
 *
 * example:
 * d(75) = 75 + 7 + 5 = 87
 * The number n is called a generator of d(n).
 *
 * Some numbers have more than one generator: for example, 101 has two generators, 91 and
 * 100. A number with no generators is a self-number.
 * There are thirteen self-numbers less than 100: 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, and 97.
 *
 * hints:
 * - Define a function d(n) that calculates the sum of a number and its digits.
 * - Iterate through all numbers from 1 to 4999 and check if they are self-numbers using your d(n) function.
 * - Iterate through all numbers from 1 to 4999 and check if they are self-numbers using your d(n) function.
 * - Remember to handle edge cases like single-digit numbers and numbers with leading zeros.
 */