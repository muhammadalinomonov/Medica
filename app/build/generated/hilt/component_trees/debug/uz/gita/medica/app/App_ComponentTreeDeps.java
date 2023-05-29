package uz.gita.medica.app;

import dagger.hilt.internal.aggregatedroot.codegen._uz_gita_medica_app_App;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._uz_gita_medica_MainActivity_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_app_App_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_di_FirebaseModule;
import hilt_aggregated_deps._uz_gita_medica_di_NetworkModule;
import hilt_aggregated_deps._uz_gita_medica_di_RepositoryModule;
import hilt_aggregated_deps._uz_gita_medica_di_RoomModule;
import hilt_aggregated_deps._uz_gita_medica_di_SharedPrefModule;
import hilt_aggregated_deps._uz_gita_medica_di_UseCaseModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_favourite_FavouriteScreen_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_favourite_viewmodel_FavouriteViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_favourite_viewmodel_FavouriteViewModelImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_fillprofile_ProfileScreen_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_fillprofile_viewmodel_ProfileViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_fillprofile_viewmodel_ProfileViewModelImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_home_HomeScreen_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_home_viewmodel_HomeViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_home_viewmodel_HomeViewModelImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_login_LoginFragment_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_login_viewmodel_impl_LoginViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_login_viewmodel_impl_LoginViewModelImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_notification_NotificationScreen_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_notification_viewmodel_NotifyViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_notification_viewmodel_NotifyViewModelImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_register_RegisterFragment_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_register_viewmodel_impl_RegisterViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_register_viewmodel_impl_RegisterViewModelImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_signin_SignInFragment_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_signin_viewmodel_impl_SignViewModeImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_signin_viewmodel_impl_SignViewModeImpl_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_splash_SplashScreen_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_verifiy_VerifyFragment_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_verifiy_viewmodel_impl_VerifyViewModelImpl_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_medica_presentation_screen_verifiy_viewmodel_impl_VerifyViewModelImpl_HiltModules_KeyModule;

@ComponentTreeDeps(
    rootDeps = _uz_gita_medica_app_App.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _uz_gita_medica_MainActivity_GeneratedInjector.class,
        _uz_gita_medica_app_App_GeneratedInjector.class,
        _uz_gita_medica_di_FirebaseModule.class,
        _uz_gita_medica_di_NetworkModule.class,
        _uz_gita_medica_di_RepositoryModule.class,
        _uz_gita_medica_di_RoomModule.class,
        _uz_gita_medica_di_SharedPrefModule.class,
        _uz_gita_medica_di_UseCaseModule.class,
        _uz_gita_medica_presentation_screen_favourite_FavouriteScreen_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_favourite_viewmodel_FavouriteViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_favourite_viewmodel_FavouriteViewModelImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_fillprofile_ProfileScreen_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_fillprofile_viewmodel_ProfileViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_fillprofile_viewmodel_ProfileViewModelImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_home_HomeScreen_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_home_viewmodel_HomeViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_home_viewmodel_HomeViewModelImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_login_LoginFragment_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_login_viewmodel_impl_LoginViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_login_viewmodel_impl_LoginViewModelImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_notification_NotificationScreen_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_notification_viewmodel_NotifyViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_notification_viewmodel_NotifyViewModelImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_register_RegisterFragment_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_register_viewmodel_impl_RegisterViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_register_viewmodel_impl_RegisterViewModelImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_signin_SignInFragment_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_signin_viewmodel_impl_SignViewModeImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_signin_viewmodel_impl_SignViewModeImpl_HiltModules_KeyModule.class,
        _uz_gita_medica_presentation_screen_splash_SplashScreen_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_verifiy_VerifyFragment_GeneratedInjector.class,
        _uz_gita_medica_presentation_screen_verifiy_viewmodel_impl_VerifyViewModelImpl_HiltModules_BindsModule.class,
        _uz_gita_medica_presentation_screen_verifiy_viewmodel_impl_VerifyViewModelImpl_HiltModules_KeyModule.class
    }
)
public final class App_ComponentTreeDeps {
}