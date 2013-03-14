package org.elasticsearch.examples.justsource.plugin;

import org.elasticsearch.examples.justsource.rest.action.RestJustSourceAction;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.rest.RestModule;

/**
 * This class is instantiated when Elasticsearch loads the plugin for the
 * first time. If you change the name of this plugin, make sure to update
 * src/main/resources/es-plugin.properties file that points to this class.
 */
public class JustSourcePlugin extends AbstractPlugin {

    /**
     * The name of the plugin.
     * <p/>
     * This name will be used by elasticsearch in the log file to refer to this plugin.
     *
     * @return plugin name.
     */
    @Override
    public String name() {
        return "just-source";
    }

    /**
     * The description of the plugin.
     *
     * @return plugin description
     */
    @Override
    public String description() {
        return "An example of plugin with REST endpoint";
    }

    /**
     * During initialization elasticsearch will call this method with RestModule, which can be used to
     * register a REST endpoint
     *
     * @param module
     */
    public void onModule(RestModule module) {
        // Register REST endpoint
        module.addRestAction(RestJustSourceAction.class);
    }
}
