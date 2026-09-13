pluginManagement {
    plugins {
        kotlin("plugin.lombok") version "2.3.21"
    }
}
rootProject.name = "liquid"

include(
    "liquid-api",
    "liquid-jooq",
    "liquid-core",
    "liquid-export",
    "liquid-db"
)