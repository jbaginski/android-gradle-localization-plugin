package pl.droidsonroids.gradle.localization

import org.junit.Test

//TODO add more tests
class ParseCSVTest extends LocalizationPluginTestBase {

    @Test
    void testCsvFileConfig() {
        def config = new ConfigExtension()
        config.csvFile = new File(getClass().getResource('valid.csv').getPath())
        parseTestFile(config)
    }

    @Test
    void testValidFile() {
        println 'testing valid file'
        parseTestFile('valid.csv')
    }

    @Test(expected = IOException.class)
    void testMissingTranslation() {
        println 'testing invalid file'
        parseTestFile('missing_translation.csv')
    }
}
