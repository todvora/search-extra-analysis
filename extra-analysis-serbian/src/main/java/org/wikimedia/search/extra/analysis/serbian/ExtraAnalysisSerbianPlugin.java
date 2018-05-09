package org.wikimedia.search.extra.analysis.serbian;

import java.util.Collections;
import java.util.Map;

import org.elasticsearch.index.analysis.TokenFilterFactory;
import org.elasticsearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;

/**
 * Setup the Elasticsearch plugin.
 */
public class ExtraAnalysisSerbianPlugin extends Plugin implements AnalysisPlugin {

	/**
	 * Register our stemmer.
	 */
	@Override
	public Map<String, AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
		return Collections.singletonMap("serbian_stemmer", SerbianStemmerTokenFilterFactory::new);
	}

}