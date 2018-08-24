package pl.droidsonroids.gradle.localization

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class LocaleExportTask extends DefaultTask {
    {
        group = 'localeExport'
        description = "Generates CSV from Android string resource XML files"
    }

    @TaskAction
    def parseFile() {
        def outputDirectory = project.localization.outputDirectory ?: project.file('')
        new XmlParserEngine(project.localization, outputDirectory).parseXml()
    }
}
