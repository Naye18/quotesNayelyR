// Generated by Dagger (https://dagger.dev).
package edu.itvo.quotescelebrities;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import edu.itvo.quotescelebrities.core.di.ContextApplication;
import edu.itvo.quotescelebrities.core.di.ContextApplication_ProvideApplicationFactory;
import edu.itvo.quotescelebrities.core.di.ContextModule;
import edu.itvo.quotescelebrities.core.di.ContextModule_ProvideContextFactory;
import edu.itvo.quotescelebrities.core.di.DatabaseModule;
import edu.itvo.quotescelebrities.core.di.DatabaseModule_ProvideCoroutineScopeFactory;
import edu.itvo.quotescelebrities.core.di.DatabaseModule_ProvideGetDatabaseFactory;
import edu.itvo.quotescelebrities.core.di.DatabaseModule_ProvideQuoteDaoFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideCache$app_debugFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideHeaderInterceptorFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideOkHttpClientFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideQuoteApiInterfaceFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideQuoteRemoteDataSourceImplFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideRetrofitFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideUserApiInterfaceFactory;
import edu.itvo.quotescelebrities.core.di.NetworkModule_ProvideUserRemoteDataSourceImplFactory;
import edu.itvo.quotescelebrities.data.PreferenceStorageImpl;
import edu.itvo.quotescelebrities.data.QuoteRepositoryImpl;
import edu.itvo.quotescelebrities.data.UserRepositoryImpl;
import edu.itvo.quotescelebrities.data.local.QuoteDB;
import edu.itvo.quotescelebrities.data.local.QuoteLocalDataSourceImpl;
import edu.itvo.quotescelebrities.data.local.daos.QuoteDao;
import edu.itvo.quotescelebrities.data.remote.QuoteApiInterface;
import edu.itvo.quotescelebrities.data.remote.QuoteRemoteDataSourceImpl;
import edu.itvo.quotescelebrities.data.remote.UserApiInterface;
import edu.itvo.quotescelebrities.data.remote.UserRemoteDataSourceImpl;
import edu.itvo.quotescelebrities.domain.usecase.AddQuoteUseCase;
import edu.itvo.quotescelebrities.domain.usecase.EditQuoteUseCase;
import edu.itvo.quotescelebrities.domain.usecase.GetQuoteRandomUseCase;
import edu.itvo.quotescelebrities.domain.usecase.GetQuotesUseCase;
import edu.itvo.quotescelebrities.domain.usecase.LoginUserUseCase;
import edu.itvo.quotescelebrities.presentation.view.DrawerNavigation;
import edu.itvo.quotescelebrities.presentation.view.LoginFragment;
import edu.itvo.quotescelebrities.presentation.view.QuoteAddFragment;
import edu.itvo.quotescelebrities.presentation.view.QuoteEditFragment;
import edu.itvo.quotescelebrities.presentation.view.QuoteListFragment;
import edu.itvo.quotescelebrities.presentation.view.QuoteRandomFragment;
import edu.itvo.quotescelebrities.presentation.viewmodel.DataStoreViewModel;
import edu.itvo.quotescelebrities.presentation.viewmodel.DataStoreViewModel_HiltModules_KeyModule_ProvideFactory;
import edu.itvo.quotescelebrities.presentation.viewmodel.LoginViewModel;
import edu.itvo.quotescelebrities.presentation.viewmodel.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteAddViewModel;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteAddViewModel_HiltModules_KeyModule_ProvideFactory;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteEditViewModel;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteEditViewModel_HiltModules_KeyModule_ProvideFactory;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteListViewModel;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteListViewModel_HiltModules_KeyModule_ProvideFactory;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteRandomViewModel;
import edu.itvo.quotescelebrities.presentation.viewmodel.QuoteRandomViewModel_HiltModules_KeyModule_ProvideFactory;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerQuotesApp_HiltComponents_SingletonC {
  private DaggerQuotesApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private ContextApplication contextApplication;

    private ContextModule contextModule;

    private DatabaseModule databaseModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder contextApplication(ContextApplication contextApplication) {
      this.contextApplication = Preconditions.checkNotNull(contextApplication);
      return this;
    }

    public Builder contextModule(ContextModule contextModule) {
      this.contextModule = Preconditions.checkNotNull(contextModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public QuotesApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (contextApplication == null) {
        this.contextApplication = new ContextApplication();
      }
      if (contextModule == null) {
        this.contextModule = new ContextModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      return new SingletonCImpl(applicationContextModule, contextApplication, contextModule, databaseModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements QuotesApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public QuotesApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements QuotesApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public QuotesApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements QuotesApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public QuotesApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements QuotesApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public QuotesApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements QuotesApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public QuotesApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements QuotesApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public QuotesApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements QuotesApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public QuotesApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends QuotesApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends QuotesApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectLoginFragment(LoginFragment loginFragment) {
    }

    @Override
    public void injectQuoteAddFragment(QuoteAddFragment quoteAddFragment) {
    }

    @Override
    public void injectQuoteEditFragment(QuoteEditFragment quoteEditFragment) {
    }

    @Override
    public void injectQuoteListFragment(QuoteListFragment quoteListFragment) {
    }

    @Override
    public void injectQuoteRandomFragment(QuoteRandomFragment quoteRandomFragment) {
    }
  }

  private static final class ViewCImpl extends QuotesApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends QuotesApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(6).add(DataStoreViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(QuoteAddViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(QuoteEditViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(QuoteListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(QuoteRandomViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectDrawerNavigation(DrawerNavigation drawerNavigation) {
    }
  }

  private static final class ViewModelCImpl extends QuotesApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<DataStoreViewModel> dataStoreViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<QuoteAddViewModel> quoteAddViewModelProvider;

    private Provider<QuoteEditViewModel> quoteEditViewModelProvider;

    private Provider<QuoteListViewModel> quoteListViewModelProvider;

    private Provider<QuoteRandomViewModel> quoteRandomViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private LoginUserUseCase loginUserUseCase() {
      return new LoginUserUseCase(singletonCImpl.userRepositoryImplProvider.get());
    }

    private AddQuoteUseCase addQuoteUseCase() {
      return new AddQuoteUseCase(singletonCImpl.quoteRepositoryImplProvider.get());
    }

    private EditQuoteUseCase editQuoteUseCase() {
      return new EditQuoteUseCase(singletonCImpl.quoteRepositoryImplProvider.get());
    }

    private GetQuotesUseCase getQuotesUseCase() {
      return new GetQuotesUseCase(singletonCImpl.quoteRepositoryImplProvider.get());
    }

    private GetQuoteRandomUseCase getQuoteRandomUseCase() {
      return new GetQuoteRandomUseCase(singletonCImpl.quoteRepositoryImplProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.dataStoreViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.quoteAddViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.quoteEditViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.quoteListViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.quoteRandomViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(6).put("edu.itvo.quotescelebrities.presentation.viewmodel.DataStoreViewModel", ((Provider) dataStoreViewModelProvider)).put("edu.itvo.quotescelebrities.presentation.viewmodel.LoginViewModel", ((Provider) loginViewModelProvider)).put("edu.itvo.quotescelebrities.presentation.viewmodel.QuoteAddViewModel", ((Provider) quoteAddViewModelProvider)).put("edu.itvo.quotescelebrities.presentation.viewmodel.QuoteEditViewModel", ((Provider) quoteEditViewModelProvider)).put("edu.itvo.quotescelebrities.presentation.viewmodel.QuoteListViewModel", ((Provider) quoteListViewModelProvider)).put("edu.itvo.quotescelebrities.presentation.viewmodel.QuoteRandomViewModel", ((Provider) quoteRandomViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // edu.itvo.quotescelebrities.presentation.viewmodel.DataStoreViewModel 
          return (T) new DataStoreViewModel(singletonCImpl.preferenceStorageImplProvider.get());

          case 1: // edu.itvo.quotescelebrities.presentation.viewmodel.LoginViewModel 
          return (T) new LoginViewModel(viewModelCImpl.loginUserUseCase());

          case 2: // edu.itvo.quotescelebrities.presentation.viewmodel.QuoteAddViewModel 
          return (T) new QuoteAddViewModel(viewModelCImpl.addQuoteUseCase());

          case 3: // edu.itvo.quotescelebrities.presentation.viewmodel.QuoteEditViewModel 
          return (T) new QuoteEditViewModel(viewModelCImpl.editQuoteUseCase());

          case 4: // edu.itvo.quotescelebrities.presentation.viewmodel.QuoteListViewModel 
          return (T) new QuoteListViewModel(viewModelCImpl.getQuotesUseCase());

          case 5: // edu.itvo.quotescelebrities.presentation.viewmodel.QuoteRandomViewModel 
          return (T) new QuoteRandomViewModel(viewModelCImpl.getQuoteRandomUseCase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends QuotesApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends QuotesApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends QuotesApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final ContextModule contextModule;

    private final ContextApplication contextApplication;

    private final DatabaseModule databaseModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<PreferenceStorageImpl> preferenceStorageImplProvider;

    private Provider<Interceptor> provideHeaderInterceptorProvider;

    private Provider<QuotesApp> provideApplicationProvider;

    private Provider<Context> provideContextProvider;

    private Provider<Cache> provideCache$app_debugProvider;

    private Provider<OkHttpClient> provideOkHttpClientProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<UserApiInterface> provideUserApiInterfaceProvider;

    private Provider<UserRemoteDataSourceImpl> provideUserRemoteDataSourceImplProvider;

    private Provider<UserRepositoryImpl> userRepositoryImplProvider;

    private Provider<CoroutineScope> provideCoroutineScopeProvider;

    private Provider<QuoteDB> provideGetDatabaseProvider;

    private Provider<QuoteDao> provideQuoteDaoProvider;

    private Provider<QuoteApiInterface> provideQuoteApiInterfaceProvider;

    private Provider<QuoteRemoteDataSourceImpl> provideQuoteRemoteDataSourceImplProvider;

    private Provider<QuoteRepositoryImpl> quoteRepositoryImplProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        ContextApplication contextApplicationParam, ContextModule contextModuleParam,
        DatabaseModule databaseModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      this.contextModule = contextModuleParam;
      this.contextApplication = contextApplicationParam;
      this.databaseModule = databaseModuleParam;
      initialize(applicationContextModuleParam, contextApplicationParam, contextModuleParam, databaseModuleParam);

    }

    private QuoteLocalDataSourceImpl quoteLocalDataSourceImpl() {
      return new QuoteLocalDataSourceImpl(provideQuoteDaoProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final ContextApplication contextApplicationParam, final ContextModule contextModuleParam,
        final DatabaseModule databaseModuleParam) {
      this.preferenceStorageImplProvider = DoubleCheck.provider(new SwitchingProvider<PreferenceStorageImpl>(singletonCImpl, 0));
      this.provideHeaderInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<Interceptor>(singletonCImpl, 6));
      this.provideApplicationProvider = DoubleCheck.provider(new SwitchingProvider<QuotesApp>(singletonCImpl, 9));
      this.provideContextProvider = DoubleCheck.provider(new SwitchingProvider<Context>(singletonCImpl, 8));
      this.provideCache$app_debugProvider = DoubleCheck.provider(new SwitchingProvider<Cache>(singletonCImpl, 7));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 5));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 4));
      this.provideUserApiInterfaceProvider = DoubleCheck.provider(new SwitchingProvider<UserApiInterface>(singletonCImpl, 3));
      this.provideUserRemoteDataSourceImplProvider = DoubleCheck.provider(new SwitchingProvider<UserRemoteDataSourceImpl>(singletonCImpl, 2));
      this.userRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<UserRepositoryImpl>(singletonCImpl, 1));
      this.provideCoroutineScopeProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineScope>(singletonCImpl, 13));
      this.provideGetDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<QuoteDB>(singletonCImpl, 12));
      this.provideQuoteDaoProvider = DoubleCheck.provider(new SwitchingProvider<QuoteDao>(singletonCImpl, 11));
      this.provideQuoteApiInterfaceProvider = DoubleCheck.provider(new SwitchingProvider<QuoteApiInterface>(singletonCImpl, 15));
      this.provideQuoteRemoteDataSourceImplProvider = DoubleCheck.provider(new SwitchingProvider<QuoteRemoteDataSourceImpl>(singletonCImpl, 14));
      this.quoteRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<QuoteRepositoryImpl>(singletonCImpl, 10));
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectQuotesApp(QuotesApp quotesApp) {
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // edu.itvo.quotescelebrities.data.PreferenceStorageImpl 
          return (T) new PreferenceStorageImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 1: // edu.itvo.quotescelebrities.data.UserRepositoryImpl 
          return (T) new UserRepositoryImpl(singletonCImpl.provideUserRemoteDataSourceImplProvider.get());

          case 2: // edu.itvo.quotescelebrities.data.remote.UserRemoteDataSourceImpl 
          return (T) NetworkModule_ProvideUserRemoteDataSourceImplFactory.provideUserRemoteDataSourceImpl(singletonCImpl.provideUserApiInterfaceProvider.get());

          case 3: // edu.itvo.quotescelebrities.data.remote.UserApiInterface 
          return (T) NetworkModule_ProvideUserApiInterfaceFactory.provideUserApiInterface(singletonCImpl.provideRetrofitProvider.get());

          case 4: // retrofit2.Retrofit 
          return (T) NetworkModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideOkHttpClientProvider.get());

          case 5: // okhttp3.OkHttpClient 
          return (T) NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(singletonCImpl.provideHeaderInterceptorProvider.get(), singletonCImpl.provideCache$app_debugProvider.get());

          case 6: // okhttp3.Interceptor 
          return (T) NetworkModule_ProvideHeaderInterceptorFactory.provideHeaderInterceptor();

          case 7: // okhttp3.Cache 
          return (T) NetworkModule_ProvideCache$app_debugFactory.provideCache$app_debug(singletonCImpl.provideContextProvider.get());

          case 8: // android.content.Context 
          return (T) ContextModule_ProvideContextFactory.provideContext(singletonCImpl.contextModule, singletonCImpl.provideApplicationProvider.get());

          case 9: // edu.itvo.quotescelebrities.QuotesApp 
          return (T) ContextApplication_ProvideApplicationFactory.provideApplication(singletonCImpl.contextApplication, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 10: // edu.itvo.quotescelebrities.data.QuoteRepositoryImpl 
          return (T) new QuoteRepositoryImpl(singletonCImpl.quoteLocalDataSourceImpl(), singletonCImpl.provideQuoteRemoteDataSourceImplProvider.get());

          case 11: // edu.itvo.quotescelebrities.data.local.daos.QuoteDao 
          return (T) DatabaseModule_ProvideQuoteDaoFactory.provideQuoteDao(singletonCImpl.databaseModule, singletonCImpl.provideGetDatabaseProvider.get());

          case 12: // edu.itvo.quotescelebrities.data.local.QuoteDB 
          return (T) DatabaseModule_ProvideGetDatabaseFactory.provideGetDatabase(singletonCImpl.databaseModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideCoroutineScopeProvider.get());

          case 13: // kotlinx.coroutines.CoroutineScope 
          return (T) DatabaseModule_ProvideCoroutineScopeFactory.provideCoroutineScope(singletonCImpl.databaseModule);

          case 14: // edu.itvo.quotescelebrities.data.remote.QuoteRemoteDataSourceImpl 
          return (T) NetworkModule_ProvideQuoteRemoteDataSourceImplFactory.provideQuoteRemoteDataSourceImpl(singletonCImpl.provideQuoteApiInterfaceProvider.get());

          case 15: // edu.itvo.quotescelebrities.data.remote.QuoteApiInterface 
          return (T) NetworkModule_ProvideQuoteApiInterfaceFactory.provideQuoteApiInterface(singletonCImpl.provideRetrofitProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}