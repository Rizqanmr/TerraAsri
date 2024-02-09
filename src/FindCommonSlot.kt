fun findCommonSlot(vararg meetings: List<Pair<Int, Int>>): Any {
    val mergedAvailability = mutableListOf<Pair<Int, Int>>()

    // Merge the availability of the participants
    for (meeting in meetings) {
        mergedAvailability.addAll(meeting)
    }

    // Sort the merged availability by start time
    val sortedAvailability = mergedAvailability.sortedBy { it.first }

    // Iterate through the sorted availability to find common time slot
    for (i in 0 until sortedAvailability.size - 1) {
        val start = sortedAvailability[i].second
        val end = sortedAvailability[i + 1].first

        if (end - start >= 1) {
            return listOf(start, end)
        }
    }

    return "[No common slot available]"
}

/**
 * Create a function find_common_slot(meetings) that takes a list of meeting time ranges and determines
 * the shortest common time slot where everyone can meet.
 *
 * input: A list of available time for each diplomat to be able to meet, represented as tuples of start and end times
 *
 * output: The shortest common time slot where all three diplomats are available,
 * expressed as a time range if a solution exists, or a message indicating no suitable slot is found.
 *
 * example:
 * Input: [[9, 12], [14, 16]], [[10, 12], [15, 17]], [[11, 13], [16, 18]]
 * Output: [11, 12]
 *
 * Input: [[8, 10], [12, 14], [9, 11]]
 * Output: [No common slot available]
 *
 * constraint:
 * - Meeting times are given in 24-hour format (e.g., 09:00 for 9 am).
 * - Meeting durations can vary.
 * - There might be no common time slot available.
 *
 * hints:
 * - Consider various time-manipulation techniques at your disposal.
 * - Leverage your understanding of scheduling algorithms and data structures.
 * - Remember, efficiency is key in finding the shortest possible common slot.
 */
