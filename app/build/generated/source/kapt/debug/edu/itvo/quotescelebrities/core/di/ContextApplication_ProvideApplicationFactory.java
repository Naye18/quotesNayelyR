// Generated by Dagger (https://dagger.dev).
package edu.itvo.quotescelebrities.core.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.quotescelebrities.QuotesApp;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ContextApplication_ProvideApplicationFactory implements Factory<QuotesApp> {
  private final ContextApplication module;

  private final Provider<Context> appProvider;

  public ContextApplication_ProvideApplicationFactory(ContextApplication module,
      Provider<Context> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public QuotesApp get() {
    return provideApplication(module, appProvider.get());
  }

  public static ContextApplication_ProvideApplicationFactory create(ContextApplication module,
      Provider<Context> appProvider) {
    return new ContextApplication_ProvideApplicationFactory(module, appProvider);
  }

  public static QuotesApp provideApplication(ContextApplication instance, Context app) {
    return Preconditions.checkNotNullFromProvides(instance.provideApplication(app));
  }
}
