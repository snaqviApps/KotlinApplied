package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

import kotlin.system.exitProcess


/** You are running a classroom and suspect that some of your students are passing around the answers to multiple choice questions disguised as random strings.

Your task is to write a function that, given a list of words and a string, finds and returns the word in the list that is scrambled up inside the string, if any exists. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:
words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
string1 = 'tcabnihjs'
find_embedded_word(words, string1) -> cat (the letters do not have to be in order)

string2 = 'tbcanihjs'
find_embedded_word(words, string2) -> cat (the letters do not have to be together)

string3 = 'baykkjl'
find_embedded_word(words, string3) -> None / null (the letters cannot be reused)

string4 = 'bbabylkkj'
find_embedded_word(words, string4) -> baby

string5 = 'ccc'
find_embedded_word(words, string5) -> None / null

string6 = 'breadmaking'
find_embedded_word(words, string6) -> bird

Complexity analysis variables:

W = number of words in `words`
S = maximal length of each word or string

 */


class InterviewSolutionsTwo {

    companion object {
        fun findEmbeddedWord(words: Array<String>, string: MutableList<Char>): String? {

//            var stringInRef  = arrayOf<Char>()
            val refString: Array<Char> = string.toList().toTypedArray()
            var stringIn = string
            var count = 0
                words.forEach {word ->

                        /** main iterator "it" for 'words' Array */
                        for (letter in word) {
                            if (stringIn.contains(letter)) {
                                stringIn.remove(letter)
                                count += 1
                            }
                        }
                        if (count == word.length) {
                            return word
                        }
                        count = 0
                        stringIn = refString.toMutableList()    /** resets to current 'string' for next 'words' entry (it) */
                }
            return "no match found"
        }
    }

}
