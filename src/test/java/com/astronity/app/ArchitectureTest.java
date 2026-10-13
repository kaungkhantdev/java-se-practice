package com.astronity.app;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.Test;

public class ArchitectureTest {
    @Test
    public void architectureTest() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("com.mycompany.app");
        ArchRule rule = ArchRuleDefinition
                .classes()
                .that()
                .haveSimpleNameStartingWith("App")
                .should().resideInAnyPackage("com.mycompany.app");
        rule.check(importedClasses);
    }
}