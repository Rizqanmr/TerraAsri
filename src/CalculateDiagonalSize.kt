fun calculateDiagonalSum(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    return (4*n*n - 6*n + 6 + calculateDiagonalSum(n-2))
}
/**
 * Prompt: Create a function calculate_diagonal_sum(grid_size) that generates a spiral matrix of numbers
 * and returns the sum of its diagonals.
 * 
 * Input: Spiral size (n)
 * Output: Sum of diagonal numbers
 *
 * Constraints: Each cell contains a unique integer.
 *
 * Example:
 * 7 8 9
 * 6 1 2
 * 5 4 3
 *
 * The Diagonals will be:
 * Top-left to bottom-right: 7 + 1 + 3 = 11
 * Top-right to bottom-left: 3 + 9 = 14
 * Therefore, the sum of the diagonals is 11 + 14 = 25.
 *
 */

