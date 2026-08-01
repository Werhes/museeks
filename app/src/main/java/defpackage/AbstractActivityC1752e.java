package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1752e extends AbstractActivityC15824e implements InterfaceC6812e, InterfaceC16898e {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public LayoutInflaterFactory2C8158e f4792e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f4795e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public boolean f4796e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C7850e f4791e = new C7850e(11, new C2386e(this));

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C4891e f4794e = new C4891e(this, true);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public boolean f4793e = true;

    public AbstractActivityC1752e() {
        ((C3168e) this.f31251e.f12439e).m1261e("android:support:lifecycle", new C14574e(3, this));
        final int i = 0;
        mopub(new InterfaceC0867e(this) { // from class: eًٌؗ
            public final /* synthetic */ AbstractActivityC1752e vip;

            {
                this.vip = this;
            }

            @Override // defpackage.InterfaceC0867e
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.vip.f4791e.m2335extends();
                        return;
                    default:
                        this.vip.f4791e.m2335extends();
                        return;
                }
            }
        });
        final int i2 = 1;
        this.f31239e.add(new InterfaceC0867e(this) { // from class: eًٌؗ
            public final /* synthetic */ AbstractActivityC1752e vip;

            {
                this.vip = this;
            }

            @Override // defpackage.InterfaceC0867e
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.vip.f4791e.m2335extends();
                        return;
                    default:
                        this.vip.f4791e.m2335extends();
                        return;
                }
            }
        });
        advert(new C12409e(this, 1));
    }

    public static boolean Signature(AbstractC15958e abstractC15958e) {
        boolean z = false;
        for (AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e : abstractC15958e.metrica.m3025throw()) {
            if (abstractComponentCallbacksC17875e != null) {
                C2386e c2386e = abstractComponentCallbacksC17875e.f35074e;
                if ((c2386e == null ? null : c2386e.f6093e) != null) {
                    z |= Signature(abstractComponentCallbacksC17875e.purchase());
                }
                C0455e c0455e = abstractComponentCallbacksC17875e.f35081e;
                EnumC7785e enumC7785e = EnumC7785e.f15777e;
                EnumC7785e enumC7785e2 = EnumC7785e.f15779e;
                if (c0455e != null) {
                    c0455e.appmetrica();
                    if (c0455e.f2508e.license.ad(enumC7785e2)) {
                        C4891e c4891e = abstractComponentCallbacksC17875e.f35081e.f2508e;
                        c4891e.license("setCurrentState");
                        c4891e.purchase(enumC7785e);
                        z = true;
                    }
                }
                if (abstractComponentCallbacksC17875e.f35086e.license.ad(enumC7785e2)) {
                    C4891e c4891e2 = abstractComponentCallbacksC17875e.f35086e;
                    c4891e2.license("setCurrentState");
                    c4891e2.purchase(enumC7785e);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        smaato();
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        layoutInflaterFactory2C8158e.isPro();
        ((ViewGroup) layoutInflaterFactory2C8158e.f16585e.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C8158e.f16562e.ad(layoutInflaterFactory2C8158e.f16563e.getCallback());
    }

    public final void admob() {
        super.onDestroy();
        ((C2386e) this.f4791e.f15896e).f6095e.advert();
        this.f4794e.appmetrica(EnumC14621e.ON_DESTROY);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        layoutInflaterFactory2C8158e.f16582e = true;
        int i = layoutInflaterFactory2C8158e.f16600e;
        if (i == -100) {
            i = AbstractC12346e.f24756e;
        }
        int m2378class = layoutInflaterFactory2C8158e.m2378class(context, i);
        if (AbstractC12346e.appmetrica(context)) {
            AbstractC12346e.loadAd(context);
        }
        C6473e subscription = LayoutInflaterFactory2C8158e.subscription(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C8158e.tapsense(context, m2378class, subscription, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C4411e) {
            try {
                ((C4411e) context).ad(LayoutInflaterFactory2C8158e.tapsense(context, m2378class, subscription, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C8158e.f16559e) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        AbstractC0439e.ad(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        AbstractC11815e.inmobi(configuration3, configuration4, configuration);
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration tapsense = LayoutInflaterFactory2C8158e.tapsense(context, m2378class, subscription, configuration, true);
            C4411e c4411e = new C4411e(context, ua.itaysonlab.vkx.R.style.Theme_AppCompat_Empty);
            c4411e.ad(tapsense);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c4411e.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC14204e.m3776interface(theme);
                    } else {
                        synchronized (AbstractC8495e.ad) {
                            if (!AbstractC8495e.metrica) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC8495e.vip = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                AbstractC8495e.metrica = true;
                            }
                            Method method = AbstractC8495e.vip;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    AbstractC8495e.vip = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c4411e;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C8158e) loadAd()).crashlytics();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.AbstractActivityC3684e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C8158e) loadAd()).crashlytics();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractActivityC1752e.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        layoutInflaterFactory2C8158e.isPro();
        return layoutInflaterFactory2C8158e.f16563e.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        if (layoutInflaterFactory2C8158e.f16580e == null) {
            layoutInflaterFactory2C8158e.crashlytics();
            C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
            layoutInflaterFactory2C8158e.f16580e = new C17683e(c0573e != null ? c0573e.purchase() : layoutInflaterFactory2C8158e.f16587e);
        }
        return layoutInflaterFactory2C8158e.f16580e;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = AbstractC0871e.ad;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        if (layoutInflaterFactory2C8158e.f16578e != null) {
            layoutInflaterFactory2C8158e.crashlytics();
            layoutInflaterFactory2C8158e.f16578e.getClass();
            layoutInflaterFactory2C8158e.firebase(0);
        }
    }

    public final AbstractC12346e loadAd() {
        if (this.f4792e == null) {
            ExecutorC11157e executorC11157e = AbstractC12346e.f24760e;
            this.f4792e = new LayoutInflaterFactory2C8158e(this, null, this, this);
        }
        return this.f4792e;
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f4791e.m2335extends();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        if (layoutInflaterFactory2C8158e.f16573e && layoutInflaterFactory2C8158e.f16584e) {
            layoutInflaterFactory2C8158e.crashlytics();
            C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
            if (c0573e != null) {
                c0573e.startapp(c0573e.subscription.getResources().getBoolean(ua.itaysonlab.vkx.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C17264e ad = C17264e.ad();
        Context context = layoutInflaterFactory2C8158e.f16587e;
        synchronized (ad) {
            ad.ad.advert(context);
        }
        layoutInflaterFactory2C8158e.f16596e = new Configuration(layoutInflaterFactory2C8158e.f16587e.getResources().getConfiguration());
        layoutInflaterFactory2C8158e.Signature(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.AbstractActivityC15824e, defpackage.AbstractActivityC3684e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4794e.appmetrica(EnumC14621e.ON_CREATE);
        C1154e c1154e = ((C2386e) this.f4791e.f15896e).f6095e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C2386e) this.f4791e.f15896e).f6095e.purchase.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C2386e) this.f4791e.f15896e).f6095e.purchase.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        admob();
        loadAd().billing();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent appmetrica;
        if (!subscription(i, menuItem)) {
            LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
            layoutInflaterFactory2C8158e.crashlytics();
            C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
            if (menuItem.getItemId() != 16908332 || c0573e == null || (((C5286e) c0573e.tapsense).vip & 4) == 0 || (appmetrica = AbstractC16540e.appmetrica(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(appmetrica)) {
                navigateUpTo(appmetrica);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent appmetrica2 = AbstractC16540e.appmetrica(this);
            if (appmetrica2 == null) {
                appmetrica2 = AbstractC16540e.appmetrica(this);
            }
            if (appmetrica2 != null) {
                ComponentName component = appmetrica2.getComponent();
                if (component == null) {
                    component = appmetrica2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent purchase = AbstractC16540e.purchase(this, component);
                    while (purchase != null) {
                        arrayList.add(size, purchase);
                        purchase = AbstractC16540e.purchase(this, purchase.getComponent());
                    }
                    arrayList.add(appmetrica2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4796e = false;
        ((C2386e) this.f4791e.f15896e).f6095e.signatures(5);
        this.f4794e.appmetrica(EnumC14621e.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C8158e) loadAd()).isPro();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        remoteconfig();
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        layoutInflaterFactory2C8158e.crashlytics();
        C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
        if (c0573e != null) {
            c0573e.f2756extends = true;
        }
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f4791e.m2335extends();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C7850e c7850e = this.f4791e;
        c7850e.m2335extends();
        super.onResume();
        this.f4796e = true;
        ((C2386e) c7850e.f15896e).f6095e.applovin(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        pro();
        ((LayoutInflaterFactory2C8158e) loadAd()).Signature(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f4791e.m2335extends();
    }

    @Override // android.app.Activity
    public final void onStop() {
        signatures();
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) loadAd();
        layoutInflaterFactory2C8158e.crashlytics();
        C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
        if (c0573e != null) {
            c0573e.f2756extends = false;
            C17679e c17679e = c0573e.f2759native;
            if (c17679e != null) {
                c17679e.ad();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        loadAd().amazon(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C8158e) loadAd()).crashlytics();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void pro() {
        C7850e c7850e = this.f4791e;
        c7850e.m2335extends();
        C2386e c2386e = (C2386e) c7850e.f15896e;
        super.onStart();
        this.f4793e = false;
        if (!this.f4795e) {
            this.f4795e = true;
            C1154e c1154e = c2386e.f6095e;
            c1154e.f31420goto = false;
            c1154e.f31424this = false;
            c1154e.f31423protected.billing = false;
            c1154e.signatures(4);
        }
        c2386e.f6095e.applovin(true);
        this.f4794e.appmetrica(EnumC14621e.ON_START);
        C1154e c1154e2 = c2386e.f6095e;
        c1154e2.f31420goto = false;
        c1154e2.f31424this = false;
        c1154e2.f31423protected.billing = false;
        c1154e2.signatures(5);
    }

    public final void remoteconfig() {
        super.onPostResume();
        this.f4794e.appmetrica(EnumC14621e.ON_RESUME);
        C1154e c1154e = ((C2386e) this.f4791e.f15896e).f6095e;
        c1154e.f31420goto = false;
        c1154e.f31424this = false;
        c1154e.f31423protected.billing = false;
        c1154e.signatures(7);
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public final void setContentView(int i) {
        smaato();
        loadAd().adcel(i);
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public void setContentView(View view) {
        smaato();
        loadAd().mopub(view);
    }

    @Override // defpackage.AbstractActivityC15824e, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        smaato();
        loadAd().smaato(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C8158e) loadAd()).f16609e = i;
    }

    public final void signatures() {
        C7850e c7850e;
        super.onStop();
        this.f4793e = true;
        do {
            c7850e = this.f4791e;
        } while (Signature(((C2386e) c7850e.f15896e).f6095e));
        C1154e c1154e = ((C2386e) c7850e.f15896e).f6095e;
        c1154e.f31424this = true;
        c1154e.f31423protected.billing = true;
        c1154e.signatures(4);
        this.f4794e.appmetrica(EnumC14621e.ON_STOP);
    }

    public final boolean subscription(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C2386e) this.f4791e.f15896e).f6095e.adcel();
        }
        return false;
    }
}
