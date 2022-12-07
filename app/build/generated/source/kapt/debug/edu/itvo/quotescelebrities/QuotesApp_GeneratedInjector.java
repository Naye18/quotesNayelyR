package edu.itvo.quotescelebrities;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = QuotesApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface QuotesApp_GeneratedInjector {
  void injectQuotesApp(QuotesApp quotesApp);
}
