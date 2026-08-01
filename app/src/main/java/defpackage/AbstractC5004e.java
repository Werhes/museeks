package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5004e implements InterfaceC16400e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final float f10577e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final int f10578e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final Handler f10579e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f10580e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Activity f10582e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public View f10583e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public View f10584e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C12344e f10585e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public float f10586e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f10587e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f10588e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f10589e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C6530e f10591e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f10592e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4891e f10590e = new C4891e(this, true);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C8374e f10581e = new C8374e(0, this);

    static {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        float f = 16;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        f10577e = (int) (f * vKXApplication.getResources().getDisplayMetrics().density);
        float f2 = 32;
        VKXApplication vKXApplication2 = VKXApplication.f36528e;
        f10578e = (int) (f2 * (vKXApplication2 != null ? vKXApplication2 : null).getResources().getDisplayMetrics().density);
        f10579e = new Handler(Looper.getMainLooper());
    }

    public AbstractC5004e(boolean z, boolean z2) {
        this.f10580e = z;
        this.f10592e = z2;
    }

    public void Signature(Intent intent) {
    }

    public void adcel() {
        if (this.f10580e) {
            return;
        }
        purchase();
    }

    public void admob() {
        this.f10590e.appmetrica(EnumC14621e.ON_PAUSE);
    }

    public void amazon() {
        EnumC14621e enumC14621e = EnumC14621e.ON_STOP;
        C4891e c4891e = this.f10590e;
        c4891e.appmetrica(enumC14621e);
        c4891e.appmetrica(EnumC14621e.ON_DESTROY);
        Activity activity = this.f10582e;
        if (activity != null) {
            ((ViewGroup) activity.getWindow().getDecorView()).removeView(this.f10591e);
            if (this.f10583e != null) {
                this.f10583e = null;
            }
            this.f10591e = null;
        }
        Collection values = ((HashMap) this.f10585e.f24749e).values();
        Iterator it = new ArrayList(DesugarCollections.unmodifiableList(values instanceof List ? (List) values : new ArrayList(values))).iterator();
        while (it.hasNext()) {
            ((C9412e) it.next()).ad();
        }
        ComponentCallbacks2 componentCallbacks2 = this.f10582e;
        if (componentCallbacks2 instanceof InterfaceC13018e) {
            AppActivity appActivity = (AppActivity) ((InterfaceC13018e) componentCallbacks2);
            C11109e c11109e = appActivity.f36543e;
            ArrayList arrayList = appActivity.f36541e;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c11109e.appmetrica(false);
                c11109e.license();
            }
            ((InterfaceC13018e) this.f10582e).getClass();
        }
    }

    public void appmetrica(int i, int i2) {
        View view = this.f10584e;
        view.setPadding(view.getPaddingLeft(), this.f10584e.getPaddingTop(), this.f10584e.getPaddingRight(), i + i2);
    }

    public abstract int billing();

    public final void metrica() {
        Activity activity = this.f10582e;
        if (activity != null) {
            final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            viewGroup.setBackgroundColor(-16777216);
            this.f10583e = viewGroup.getChildAt(0);
            this.f10584e = smaato(viewGroup);
            this.f10584e.setOutlineProvider(new C18518e(0, this));
            this.f10584e.setClipToOutline(true);
            this.f10584e.setOnClickListener(new ViewOnClickListenerC17360e(0));
            C6530e c6530e = new C6530e(activity);
            this.f10591e = c6530e;
            c6530e.f13452e = this.f10592e || this.f10580e;
            remoteconfig(this.f10584e);
            this.f10584e.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2565e(1, this));
            this.f10591e.setSheetHeight(this.f10584e.getHeight());
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eٕۚۡ
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int stableInsetTop = windowInsets.getStableInsetTop();
                    AbstractC5004e abstractC5004e = AbstractC5004e.this;
                    abstractC5004e.f10589e = stableInsetTop;
                    viewGroup.setOnApplyWindowInsetsListener(null);
                    abstractC5004e.appmetrica(windowInsets.getStableInsetBottom(), abstractC5004e.f10592e ? 0 : abstractC5004e.f10589e + AbstractC5004e.f10578e);
                    return windowInsets.consumeStableInsets();
                }
            });
            C9412e admob = this.f10585e.admob();
            C10621e c10621e = C6530e.f13446e;
            if (c10621e == null) {
                throw new IllegalArgumentException("springConfig is required");
            }
            admob.ad = c10621e;
            admob.metrica(1.0d);
            admob.vip = true;
            admob.adcel.add(new C12073e(this, 1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, billing());
            layoutParams.gravity = 80;
            this.f10584e.setLayoutParams(layoutParams);
            View view = new View(activity);
            view.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
            view.setAlpha(0.0f);
            view.setId(R.id.overlay);
            view.setOnClickListener(new ViewOnClickListenerC0123e(0, this));
            this.f10591e.addView(view);
            this.f10591e.addView(this.f10584e);
            C6530e c6530e2 = this.f10591e;
            c6530e2.f13447e = this;
            c6530e2.setCurrentProgress(1.0f);
            this.f10591e.setAlpha(0.0f);
            this.f10591e.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2565e(2, admob));
            viewGroup.addView(this.f10591e);
            this.f10591e.requestApplyInsets();
        }
    }

    public void mopub() {
        EnumC14621e enumC14621e = EnumC14621e.ON_CREATE;
        C4891e c4891e = this.f10590e;
        c4891e.appmetrica(enumC14621e);
        c4891e.appmetrica(EnumC14621e.ON_START);
        this.f10585e = new C12344e(9);
        ComponentCallbacks2 componentCallbacks2 = this.f10582e;
        if (componentCallbacks2 instanceof InterfaceC13018e) {
            AppActivity appActivity = (AppActivity) ((InterfaceC13018e) componentCallbacks2);
            C11109e c11109e = appActivity.f36543e;
            ArrayList arrayList = appActivity.f36541e;
            arrayList.add(this);
            if (!arrayList.isEmpty()) {
                appActivity.ad().ad(c11109e, appActivity);
                c11109e.appmetrica(true);
            }
            ((InterfaceC13018e) this.f10582e).getClass();
        }
    }

    public final void pro(boolean z) {
        this.f10580e = z;
        C6530e c6530e = this.f10591e;
        if (c6530e != null) {
            c6530e.f13452e = z;
        }
    }

    public void purchase() {
        if (this.f10587e) {
            return;
        }
        this.f10587e = true;
        if (this.f10582e != null) {
            C9412e admob = this.f10585e.admob();
            C10621e c10621e = C6530e.f13446e;
            if (c10621e == null) {
                throw new IllegalArgumentException("springConfig is required");
            }
            admob.ad = c10621e;
            admob.metrica(this.f10586e);
            admob.vip = true;
            admob.adcel.add(new C12073e(this, 0));
            admob.license(1.0d);
        }
    }

    public abstract void remoteconfig(View view);

    public final void signatures(Activity activity) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Log.w("BottomSlideFragment", "show(...) should be called on the main thread!");
            f10579e.post(new RunnableC16019e(this, activity, 12));
            return;
        }
        View findFocus = activity.getWindow().getDecorView().findFocus();
        if (findFocus instanceof EditText) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            findFocus.clearFocus();
            inputMethodManager.hideSoftInputFromWindow(findFocus.getWindowToken(), 1);
        }
        this.f10582e = activity;
        mopub();
        activity.getApplication().registerActivityLifecycleCallbacks(this.f10581e);
        metrica();
    }

    public abstract View smaato(ViewGroup viewGroup);

    public void startapp(int i, int i2, Intent intent) {
    }

    public void subscription() {
        this.f10590e.appmetrica(EnumC14621e.ON_RESUME);
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f10590e;
    }
}
