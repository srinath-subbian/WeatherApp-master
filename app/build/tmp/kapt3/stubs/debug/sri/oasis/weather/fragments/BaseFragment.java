package sri.oasis.weather.fragments;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006/"}, d2 = {"Lsri/oasis/weather/fragments/BaseFragment;", "Landroid/support/v4/app/Fragment;", "()V", "connectionChecker", "Lsri/oasis/weather/utilities/ConnectionChecker;", "getConnectionChecker", "()Lsri/oasis/weather/utilities/ConnectionChecker;", "setConnectionChecker", "(Lsri/oasis/weather/utilities/ConnectionChecker;)V", "errorHandler", "Lsri/oasis/weather/webservice/ErrorHandler;", "getErrorHandler", "()Lsri/oasis/weather/webservice/ErrorHandler;", "setErrorHandler", "(Lsri/oasis/weather/webservice/ErrorHandler;)V", "fragmentUtil", "Lsri/oasis/weather/utilities/FragmentUtil;", "getFragmentUtil", "()Lsri/oasis/weather/utilities/FragmentUtil;", "setFragmentUtil", "(Lsri/oasis/weather/utilities/FragmentUtil;)V", "mActivity", "Lsri/oasis/weather/MainActivity;", "getMActivity", "()Lsri/oasis/weather/MainActivity;", "setMActivity", "(Lsri/oasis/weather/MainActivity;)V", "mResources", "Landroid/content/res/Resources;", "getMResources", "()Landroid/content/res/Resources;", "setMResources", "(Landroid/content/res/Resources;)V", "preferenceUtil", "Lsri/oasis/weather/utilities/PreferenceUtil;", "getPreferenceUtil", "()Lsri/oasis/weather/utilities/PreferenceUtil;", "setPreferenceUtil", "(Lsri/oasis/weather/utilities/PreferenceUtil;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "app_debug"})
public class BaseFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public sri.oasis.weather.MainActivity mActivity;
    @org.jetbrains.annotations.NotNull()
    public sri.oasis.weather.utilities.FragmentUtil fragmentUtil;
    @org.jetbrains.annotations.NotNull()
    public android.content.res.Resources mResources;
    @org.jetbrains.annotations.NotNull()
    public sri.oasis.weather.utilities.ConnectionChecker connectionChecker;
    @org.jetbrains.annotations.NotNull()
    public sri.oasis.weather.utilities.PreferenceUtil preferenceUtil;
    @org.jetbrains.annotations.NotNull()
    public sri.oasis.weather.webservice.ErrorHandler errorHandler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final sri.oasis.weather.MainActivity getMActivity() {
        return null;
    }
    
    public final void setMActivity(@org.jetbrains.annotations.NotNull()
    sri.oasis.weather.MainActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sri.oasis.weather.utilities.FragmentUtil getFragmentUtil() {
        return null;
    }
    
    public final void setFragmentUtil(@org.jetbrains.annotations.NotNull()
    sri.oasis.weather.utilities.FragmentUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.Resources getMResources() {
        return null;
    }
    
    public final void setMResources(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sri.oasis.weather.utilities.ConnectionChecker getConnectionChecker() {
        return null;
    }
    
    public final void setConnectionChecker(@org.jetbrains.annotations.NotNull()
    sri.oasis.weather.utilities.ConnectionChecker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sri.oasis.weather.utilities.PreferenceUtil getPreferenceUtil() {
        return null;
    }
    
    public final void setPreferenceUtil(@org.jetbrains.annotations.NotNull()
    sri.oasis.weather.utilities.PreferenceUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sri.oasis.weather.webservice.ErrorHandler getErrorHandler() {
        return null;
    }
    
    public final void setErrorHandler(@org.jetbrains.annotations.NotNull()
    sri.oasis.weather.webservice.ErrorHandler p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public BaseFragment() {
        super();
    }
}