import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.*

@CacheableTask
abstract class CountTask : DefaultTask() {

    @get:PathSensitive(PathSensitivity.NAME_ONLY)
    @get:InputFiles
    abstract val filesToCount: ConfigurableFileCollection

    @get:OutputFile
    abstract val countTxt: RegularFileProperty

    @TaskAction
    fun count() {
        val files = filesToCount.asFileTree.files
        println("Count Executed")
        countTxt.get().asFile.writeText("""
            We have ${files.size} files.
            
            ${files.joinToString("\n            ") { it.name }}
        """.trimIndent())
    }
}