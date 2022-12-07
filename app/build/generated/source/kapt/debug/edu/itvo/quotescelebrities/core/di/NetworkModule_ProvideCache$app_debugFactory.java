// Generated by Dagger (https://dagger.dev).
package edu.itvo.quotescelebrities.core.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.Cache;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideCache$app_debugFactory implements Factory<Cache> {
  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideCache$app_debugFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Cache get() {
    return provideCache$app_debug(contextProvider.get());
  }

  public static NetworkModule_ProvideCache$app_debugFactory create(
      Provider<Context> contextProvider) {
    return new NetworkModule_ProvideCache$app_debugFactory(contextProvider);
  }

  public static Cache provideCache$app_debug(Context context) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCache$app_debug(context));
  }
}