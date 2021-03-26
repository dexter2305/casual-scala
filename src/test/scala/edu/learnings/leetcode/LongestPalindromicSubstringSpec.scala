package edu.learnings.leetcode

import edu.learnings.BaseFlatSpec

class LongestPalindromicSubstringSpec extends BaseFlatSpec {

  val i = new LongestPalindromicSubstring

  "dabac" should "aba" in {
    i.longestPalindromeBruteForce("dabac") shouldBe "aba"
  }

  "abc" should "a" in {
    i.longestPalindromeBruteForce("abc") shouldBe "a"
  }

  "dabac using slider" should "aba" in {
    i.longestPalindromeUsingSlider("dabac") shouldBe "aba"
  }

  "abc using slider" should "a" in {
    i.longestPalindromeUsingSlider("abc") shouldBe "a"
  }

  "Performance testing using slider" should "pass " in {
    val input = "lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc"
    i.longestPalindromeUsingSlider(input)
  }

}
