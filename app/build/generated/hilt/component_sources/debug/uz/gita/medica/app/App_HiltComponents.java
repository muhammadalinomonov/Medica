package uz.gita.medica.app;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;
import uz.gita.medica.MainActivity_GeneratedInjector;
import uz.gita.medica.di.FirebaseModule;
import uz.gita.medica.di.NetworkModule;
import uz.gita.medica.di.RepositoryModule;
import uz.gita.medica.di.RoomModule;
import uz.gita.medica.di.SharedPrefModule;
import uz.gita.medica.di.UseCaseModule;
import uz.gita.medica.presentation.screen.favourite.FavouriteScreen_GeneratedInjector;
import uz.gita.medica.presentation.screen.favourite.viewmodel.FavouriteViewModelImpl_HiltModules;
import uz.gita.medica.presentation.screen.fillprofile.ProfileScreen_GeneratedInjector;
import uz.gita.medica.presentation.screen.fillprofile.viewmodel.ProfileViewModelImpl_HiltModules;
import uz.gita.medica.presentation.screen.home.HomeScreen_GeneratedInjector;
import uz.gita.medica.presentation.screen.home.viewmodel.HomeViewModelImpl_HiltModules;
import uz.gita.medica.presentation.screen.login.LoginFragment_GeneratedInjector;
import uz.gita.medica.presentation.screen.login.viewmodel.impl.LoginViewModelImpl_HiltModules;
import uz.gita.medica.presentation.screen.notification.NotificationScreen_GeneratedInjector;
import uz.gita.medica.presentation.screen.notification.viewmodel.NotifyViewModelImpl_HiltModules;
import uz.gita.medica.presentation.screen.register.RegisterFragment_GeneratedInjector;
import uz.gita.medica.presentation.screen.register.viewmodel.impl.RegisterViewModelImpl_HiltModules;
import uz.gita.medica.presentation.screen.signin.SignInFragment_GeneratedInjector;
import uz.gita.medica.presentation.screen.signin.viewmodel.impl.SignViewModeImpl_HiltModules;
import uz.gita.medica.presentation.screen.splash.SplashScreen_GeneratedInjector;
import uz.gita.medica.presentation.screen.verifiy.VerifyFragment_GeneratedInjector;
import uz.gita.medica.presentation.screen.verifiy.viewmodel.impl.VerifyViewModelImpl_HiltModules;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class App_HiltComponents {
  private App_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          ApplicationContextModule.class,
          FirebaseModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          NetworkModule.class,
          RepositoryModule.class,
          RoomModule.class,
          SharedPrefModule.class,
          UseCaseModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent,
      App_GeneratedInjector {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          FavouriteViewModelImpl_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HomeViewModelImpl_HiltModules.KeyModule.class,
          LoginViewModelImpl_HiltModules.KeyModule.class,
          NotifyViewModelImpl_HiltModules.KeyModule.class,
          ProfileViewModelImpl_HiltModules.KeyModule.class,
          RegisterViewModelImpl_HiltModules.KeyModule.class,
          SignViewModeImpl_HiltModules.KeyModule.class,
          VerifyViewModelImpl_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      MainActivity_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FavouriteViewModelImpl_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeViewModelImpl_HiltModules.BindsModule.class,
          LoginViewModelImpl_HiltModules.BindsModule.class,
          NotifyViewModelImpl_HiltModules.BindsModule.class,
          ProfileViewModelImpl_HiltModules.BindsModule.class,
          RegisterViewModelImpl_HiltModules.BindsModule.class,
          SignViewModeImpl_HiltModules.BindsModule.class,
          VerifyViewModelImpl_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      FavouriteScreen_GeneratedInjector,
      ProfileScreen_GeneratedInjector,
      HomeScreen_GeneratedInjector,
      LoginFragment_GeneratedInjector,
      NotificationScreen_GeneratedInjector,
      RegisterFragment_GeneratedInjector,
      SignInFragment_GeneratedInjector,
      SplashScreen_GeneratedInjector,
      VerifyFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
