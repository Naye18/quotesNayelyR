// Generated by Dagger (https://dagger.dev).
package edu.itvo.quotescelebrities.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.quotescelebrities.domain.QuoteRepository;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetQuotesUseCase_Factory implements Factory<GetQuotesUseCase> {
  private final Provider<QuoteRepository> quoteRepositoryProvider;

  public GetQuotesUseCase_Factory(Provider<QuoteRepository> quoteRepositoryProvider) {
    this.quoteRepositoryProvider = quoteRepositoryProvider;
  }

  @Override
  public GetQuotesUseCase get() {
    return newInstance(quoteRepositoryProvider.get());
  }

  public static GetQuotesUseCase_Factory create(Provider<QuoteRepository> quoteRepositoryProvider) {
    return new GetQuotesUseCase_Factory(quoteRepositoryProvider);
  }

  public static GetQuotesUseCase newInstance(QuoteRepository quoteRepository) {
    return new GetQuotesUseCase(quoteRepository);
  }
}