package org.jfrog.artifactory.client.model.repository.settings;

public interface ComposerRepositorySettings extends VcsRepositorySettings {

    // ** remote ** //

    String getComposerRegistryUrl();
}
