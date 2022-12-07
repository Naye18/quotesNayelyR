// Generated by Dagger (https://dagger.dev).
package edu.itvo.quotescelebrities.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.quotescelebrities.domain.usecase.AddQuoteUseCase;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuoteAddViewModel_Factory implements Factory<QuoteAddViewModel> {
  private final Provider<AddQuoteUseCase> addQuoteUseCaseProvider;

  public QuoteAddViewModel_Factory(Provider<AddQuoteUseCase> addQuoteUseCaseProvider) {
    this.addQuoteUseCaseProvider = addQuoteUseCaseProvider;
  }

  @Override
  public QuoteAddViewModel get() {
    return newInstance(addQuoteUseCaseProvider.get());
  }

  public static QuoteAddViewModel_Factory create(
      Provider<AddQuoteUseCase> addQuoteUseCaseProvider) {
    return new QuoteAddViewModel_Factory(addQuoteUseCaseProvider);
  }

  public static QuoteAddViewModel newInstance(AddQuoteUseCase addQuoteUseCase) {
    return new QuoteAddViewModel(addQuoteUseCase);
  }
}
