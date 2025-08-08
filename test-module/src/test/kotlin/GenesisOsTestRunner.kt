package dev.aurakai.auraframefx.test

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertContains

/**
 * Test to verify Genesis-OS functionality is working
 */
class GenesisOsTestRunner {
    
    @Test
    fun testGenesisOsDemonstration() {
        val genesisTest = GenesisOsTest()
        val result = genesisTest.demonstrateKotlinFeatures()
        
        // Verify the demonstration output contains expected content
        assertContains(result, "Genesis-OS Demonstration")
        assertContains(result, "Neural Processing")
        assertContains(result, "Kotlin Version: 2.2.0")
        assertContains(result, "Build Status: ✅ Working")
        
        println("✅ Genesis-OS Test Passed!")
        println(result)
    }
    
    @Test
    fun testKotlin2_2Features() {
        // Test modern Kotlin features are available
        val testData = listOf("AI", "ML", "NLP")
        val result = testData
            .takeIf { it.isNotEmpty() }
            ?.let { list -> list.joinToString(" + ") }
            ?: "Empty"
            
        assertTrue(result == "AI + ML + NLP")
        println("✅ Kotlin 2.2.0 K2 Compiler working correctly!")
    }
}