// Generated by Dagger (https://dagger.dev).
package edu.itvo.quotescelebrities.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import edu.itvo.quotescelebrities.data.remote.QuoteApiInterface;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideQuoteApiInterfaceFactory implements Factory<QuoteApiInterface> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideQuoteApiInterfaceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public QuoteApiInterface get() {
    return provideQuoteApiInterface(retrofitProvider.get());
  }

  public static NetworkModule_ProvideQuoteApiInterfaceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideQuoteApiInterfaceFactory(retrofitProvider);
  }

  public static QuoteApiInterface provideQuoteApiInterface(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideQuoteApiInterface(retrofit));
  }
}