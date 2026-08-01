package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C8158e extends AbstractC12346e implements InterfaceC18087e, LayoutInflater.Factory2 {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public C16951e f16561e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public WindowCallbackC2791e f16562e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Window f16563e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Object f16564e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public AbstractC12364e f16565e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final Object f16566e;

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public C5593e f16567e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f16568e;

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public OnBackInvokedCallback f16569e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public InterfaceC7126e f16570e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public boolean f16571e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public Rect f16572e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public boolean f16573e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public C11011e f16574e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public boolean f16575e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public boolean f16576e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public CharSequence f16577e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C0573e f16578e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public boolean f16579e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C17683e f16580e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public boolean f16581e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public boolean f16582e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public View f16583e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public boolean f16584e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public ViewGroup f16585e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public Rect f16586e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Context f16587e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public ActionBarContextView f16589e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public boolean f16590e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f16591e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public TextView f16592e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C12916e f16593e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f16594e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public int f16595e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public Configuration f16596e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public boolean f16597e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public PopupWindow f16599e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final int f16600e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public RunnableC17898e f16601e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public int f16602e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public boolean f16603e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public C11011e f16604e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public boolean f16605e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public C16951e[] f16606e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public boolean f16607e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C9770e f16608e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public int f16609e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public boolean f16610e;

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public static final C17519e f16560e = new C17519e(0);

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public static final int[] f16558e = {R.attr.windowBackground};

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public static final boolean f16559e = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C14712e f16588e = null;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public final RunnableC17898e f16598e = new RunnableC17898e(this, 0);

    public LayoutInflaterFactory2C8158e(Context context, Window window, InterfaceC6812e interfaceC6812e, Object obj) {
        AbstractActivityC1752e abstractActivityC1752e = null;
        this.f16600e = -100;
        this.f16587e = context;
        this.f16566e = interfaceC6812e;
        this.f16564e = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1752e)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1752e = (AbstractActivityC1752e) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1752e != null) {
                this.f16600e = ((LayoutInflaterFactory2C8158e) abstractActivityC1752e.loadAd()).f16600e;
            }
        }
        if (this.f16600e == -100) {
            String name = this.f16564e.getClass().getName();
            C17519e c17519e = f16560e;
            Integer num = (Integer) c17519e.get(name);
            if (num != null) {
                this.f16600e = num.intValue();
                c17519e.remove(this.f16564e.getClass().getName());
            }
        }
        if (window != null) {
            admob(window);
        }
        C17264e.license();
    }

    public static C6473e premium(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC0439e.vip(configuration) : C6473e.vip(AbstractC15092e.vip(configuration.locale));
    }

    public static C6473e subscription(Context context) {
        C6473e c6473e;
        C6473e vip;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c6473e = AbstractC12346e.f24755e) == null) {
            return null;
        }
        InterfaceC14706e interfaceC14706e = c6473e.ad;
        C6473e premium = premium(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        if (i < 24) {
            vip = interfaceC14706e.isEmpty() ? C6473e.vip : C6473e.vip(AbstractC15092e.vip(interfaceC14706e.get(0)));
        } else if (interfaceC14706e.isEmpty()) {
            vip = C6473e.vip;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < premium.ad.size() + interfaceC14706e.size()) {
                Locale locale = i2 < interfaceC14706e.size() ? interfaceC14706e.get(i2) : premium.ad.get(i2 - interfaceC14706e.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            vip = C6473e.ad((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return vip.ad.isEmpty() ? premium : vip;
    }

    public static Configuration tapsense(Context context, int i, C6473e c6473e, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c6473e != null) {
            InterfaceC14706e interfaceC14706e = c6473e.ad;
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0439e.license(configuration2, c6473e);
                return configuration2;
            }
            configuration2.setLocale(interfaceC14706e.get(0));
            configuration2.setLayoutDirection(interfaceC14706e.get(0));
        }
        return configuration2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Signature(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.Signature(boolean, boolean):boolean");
    }

    @Override // defpackage.InterfaceC18087e
    public final boolean ad(MenuC8939e menuC8939e, MenuItem menuItem) {
        C16951e c16951e;
        Window.Callback callback = this.f16563e.getCallback();
        if (callback != null && !this.f16605e) {
            MenuC8939e mopub = menuC8939e.mopub();
            C16951e[] c16951eArr = this.f16606e;
            int length = c16951eArr != null ? c16951eArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c16951e = c16951eArr[i];
                    if (c16951e != null && c16951e.yandex == mopub) {
                        break;
                    }
                    i++;
                } else {
                    c16951e = null;
                    break;
                }
            }
            if (c16951e != null) {
                return callback.onMenuItemSelected(c16951e.ad, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC12346e
    public final void adcel(int i) {
        isPro();
        ViewGroup viewGroup = (ViewGroup) this.f16585e.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f16587e).inflate(i, viewGroup);
        this.f16562e.ad(this.f16563e.getCallback());
    }

    public final void admob(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f16563e != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC2791e) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC2791e windowCallbackC2791e = new WindowCallbackC2791e(this, callback);
        this.f16562e = windowCallbackC2791e;
        window.setCallback(windowCallbackC2791e);
        Context context = this.f16587e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f16558e);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C17264e ad = C17264e.ad();
            synchronized (ad) {
                drawable = ad.ad.billing(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f16563e = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f16568e) != null) {
            return;
        }
        Object obj = this.f16564e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f16569e) != null) {
            AbstractC3500e.metrica(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f16569e = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f16568e = AbstractC3500e.ad(activity);
                m2384throw();
            }
        }
        this.f16568e = null;
        m2384throw();
    }

    public final AbstractC11130e ads(Context context) {
        if (this.f16574e == null) {
            if (C0912e.f3330e == null) {
                Context applicationContext = context.getApplicationContext();
                C0912e.f3330e = new C0912e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f16574e = new C11011e(this, C0912e.f3330e);
        }
        return this.f16574e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.adcel() != false) goto L20;
     */
    @Override // defpackage.InterfaceC18087e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void advert(defpackage.MenuC8939e r6) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.advert(eٌۙؖ):void");
    }

    @Override // defpackage.AbstractC12346e
    public final void amazon(CharSequence charSequence) {
        this.f16577e = charSequence;
        InterfaceC7126e interfaceC7126e = this.f16570e;
        if (interfaceC7126e != null) {
            interfaceC7126e.setWindowTitle(charSequence);
            return;
        }
        C0573e c0573e = this.f16578e;
        if (c0573e == null) {
            TextView textView = this.f16592e;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C5286e c5286e = (C5286e) c0573e.tapsense;
        if (c5286e.billing) {
            return;
        }
        Toolbar toolbar = c5286e.ad;
        c5286e.yandex = charSequence;
        if ((c5286e.vip & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c5286e.billing) {
                AbstractC2016e.Signature(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void applovin() {
        if (this.f16563e == null) {
            Object obj = this.f16564e;
            if (obj instanceof Activity) {
                admob(((Activity) obj).getWindow());
            }
        }
        if (this.f16563e == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12346e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16564e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.AbstractC12346e.f24757e
            monitor-enter(r0)
            defpackage.AbstractC12346e.yandex(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f16610e
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f16563e
            android.view.View r0 = r0.getDecorView()
            e٘ٝۥ r1 = r3.f16598e
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f16605e = r0
            int r0 = r3.f16600e
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f16564e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            eٕ٘ؔ r0 = defpackage.LayoutInflaterFactory2C8158e.f16560e
            java.lang.Object r1 = r3.f16564e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f16600e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            eٕ٘ؔ r0 = defpackage.LayoutInflaterFactory2C8158e.f16560e
            java.lang.Object r1 = r3.f16564e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            eُٕٕ r0 = r3.f16574e
            if (r0 == 0) goto L63
            r0.mopub()
        L63:
            eُٕٕ r0 = r3.f16604e
            if (r0 == 0) goto L6a
            r0.mopub()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.billing():void");
    }

    /* renamed from: class, reason: not valid java name */
    public final int m2378class(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f16604e == null) {
                            this.f16604e = new C11011e(this, context);
                        }
                        return this.f16604e.mo2982e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return ads(context).mo2982e();
                }
            }
            return i;
        }
        return -1;
    }

    public final void crashlytics() {
        isPro();
        if (this.f16573e && this.f16578e == null) {
            Object obj = this.f16564e;
            if (obj instanceof Activity) {
                this.f16578e = new C0573e((Activity) obj, this.f16594e);
            } else if (obj instanceof Dialog) {
                this.f16578e = new C0573e((Dialog) obj);
            }
            C0573e c0573e = this.f16578e;
            if (c0573e != null) {
                c0573e.yandex(this.f16597e);
            }
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2379extends() {
        if (this.f16584e) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void firebase(int i) {
        this.f16602e = (1 << i) | this.f16602e;
        if (this.f16610e) {
            return;
        }
        View decorView = this.f16563e.getDecorView();
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        decorView.postOnAnimation(this.f16598e);
        this.f16610e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.f34829e.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2380goto(defpackage.C16951e r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.m2380goto(eِٗ٘, android.view.KeyEvent):void");
    }

    public final void inmobi(int i) {
        C16951e subs = subs(i);
        if (subs.yandex != null) {
            Bundle bundle = new Bundle();
            subs.yandex.pro(bundle);
            if (bundle.size() > 0) {
                subs.Signature = bundle;
            }
            subs.yandex.isVip();
            subs.yandex.clear();
        }
        subs.loadAd = true;
        subs.amazon = true;
        if ((i == 108 || i == 0) && this.f16570e != null) {
            C16951e subs2 = subs(0);
            subs2.mopub = false;
            m2382native(subs2, null);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m2381interface() {
        InterfaceC1322e interfaceC1322e;
        C3212e c3212e;
        boolean z = this.f16571e;
        this.f16571e = false;
        C16951e subs = subs(0);
        if (!subs.smaato) {
            AbstractC12364e abstractC12364e = this.f16565e;
            if (abstractC12364e != null) {
                abstractC12364e.vip();
                return true;
            }
            crashlytics();
            C0573e c0573e = this.f16578e;
            if (c0573e == null || (interfaceC1322e = c0573e.tapsense) == null || (c3212e = ((C5286e) interfaceC1322e).ad.f266e) == null || c3212e.f7331e == null) {
                return false;
            }
            C3212e c3212e2 = ((C5286e) interfaceC1322e).ad.f266e;
            C9995e c9995e = c3212e2 == null ? null : c3212e2.f7331e;
            if (c9995e != null) {
                c9995e.collapseActionView();
            }
        } else if (!z) {
            signatures(subs, true);
            return true;
        }
        return true;
    }

    public final void isPro() {
        ViewGroup viewGroup;
        if (this.f16584e) {
            return;
        }
        Context context = this.f16587e;
        int[] iArr = AbstractC6062e.adcel;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            startapp(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            startapp(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            startapp(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            startapp(10);
        }
        this.f16579e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        applovin();
        this.f16563e.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f16603e) {
            viewGroup = this.f16591e ? (ViewGroup) from.inflate(ua.itaysonlab.vkx.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(ua.itaysonlab.vkx.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f16579e) {
            viewGroup = (ViewGroup) from.inflate(ua.itaysonlab.vkx.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f16594e = false;
            this.f16573e = false;
        } else if (this.f16573e) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C4411e(context, typedValue.resourceId) : context).inflate(ua.itaysonlab.vkx.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC7126e interfaceC7126e = (InterfaceC7126e) viewGroup.findViewById(ua.itaysonlab.vkx.R.id.decor_content_parent);
            this.f16570e = interfaceC7126e;
            interfaceC7126e.setWindowCallback(this.f16563e.getCallback());
            if (this.f16594e) {
                ((ActionBarOverlayLayout) this.f16570e).adcel(109);
            }
            if (this.f16575e) {
                ((ActionBarOverlayLayout) this.f16570e).adcel(2);
            }
            if (this.f16590e) {
                ((ActionBarOverlayLayout) this.f16570e).adcel(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f16573e);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f16594e);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f16579e);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f16591e);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(AbstractC8703e.signatures(sb, this.f16603e, " }"));
        }
        C17974e c17974e = new C17974e(3, this);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        AbstractC4387e.metrica(viewGroup, c17974e);
        if (this.f16570e == null) {
            this.f16592e = (TextView) viewGroup.findViewById(ua.itaysonlab.vkx.R.id.title);
        }
        boolean z = AbstractC14039e.ad;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ua.itaysonlab.vkx.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f16563e.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f16563e.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C2362e(4, this));
        this.f16585e = viewGroup;
        Object obj = this.f16564e;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f16577e;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC7126e interfaceC7126e2 = this.f16570e;
            if (interfaceC7126e2 != null) {
                interfaceC7126e2.setWindowTitle(title);
            } else {
                C0573e c0573e = this.f16578e;
                if (c0573e != null) {
                    C5286e c5286e = (C5286e) c0573e.tapsense;
                    if (!c5286e.billing) {
                        Toolbar toolbar = c5286e.ad;
                        c5286e.yandex = title;
                        if ((c5286e.vip & 8) != 0) {
                            toolbar.setTitle(title);
                            if (c5286e.billing) {
                                AbstractC2016e.Signature(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f16592e;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f16585e.findViewById(R.id.content);
        View decorView = this.f16563e.getDecorView();
        contentFrameLayout2.f178e.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f16584e = true;
        C16951e subs = subs(0);
        if (this.f16605e || subs.yandex != null) {
            return;
        }
        firebase(108);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.purchase() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.advert() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isVip(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.isVip(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.AbstractC12346e
    public final void license() {
        LayoutInflater from = LayoutInflater.from(this.f16587e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C8158e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.AbstractC12346e
    public final void mopub(View view) {
        isPro();
        ViewGroup viewGroup = (ViewGroup) this.f16585e.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f16562e.ad(this.f16563e.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.yandex == null) goto L78;
     */
    /* renamed from: native, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2382native(defpackage.C16951e r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.m2382native(eِٗ٘, android.view.KeyEvent):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void pro(MenuC8939e menuC8939e) {
        C13631e c13631e;
        if (this.f16607e) {
            return;
        }
        this.f16607e = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16570e;
        actionBarOverlayLayout.mopub();
        ActionMenuView actionMenuView = ((C5286e) actionBarOverlayLayout.f123e).ad.f265e;
        if (actionMenuView != null && (c13631e = actionMenuView.f161e) != null) {
            c13631e.purchase();
            C9337e c9337e = c13631e.f27053e;
            if (c9337e != null && c9337e.vip()) {
                c9337e.startapp.dismiss();
            }
        }
        Window.Callback callback = this.f16563e.getCallback();
        if (callback != null && !this.f16605e) {
            callback.onPanelClosed(108, menuC8939e);
        }
        this.f16607e = false;
    }

    @Override // defpackage.AbstractC12346e
    public final void purchase() {
        String str;
        this.f16582e = true;
        Signature(false, true);
        applovin();
        Object obj = this.f16564e;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC16540e.billing(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0573e c0573e = this.f16578e;
                if (c0573e == null) {
                    this.f16597e = true;
                } else {
                    c0573e.yandex(true);
                }
            }
            synchronized (AbstractC12346e.f24757e) {
                AbstractC12346e.yandex(this);
                AbstractC12346e.f24761e.add(new WeakReference(this));
            }
        }
        this.f16596e = new Configuration(this.f16587e.getResources().getConfiguration());
        this.f16576e = true;
    }

    public final void remoteconfig(int i, C16951e c16951e, MenuC8939e menuC8939e) {
        if (menuC8939e == null) {
            if (c16951e == null && i >= 0) {
                C16951e[] c16951eArr = this.f16606e;
                if (i < c16951eArr.length) {
                    c16951e = c16951eArr[i];
                }
            }
            if (c16951e != null) {
                menuC8939e = c16951e.yandex;
            }
        }
        if ((c16951e == null || c16951e.smaato) && !this.f16605e) {
            WindowCallbackC2791e windowCallbackC2791e = this.f16562e;
            Window.Callback callback = this.f16563e.getCallback();
            windowCallbackC2791e.getClass();
            try {
                windowCallbackC2791e.f6720e = true;
                callback.onPanelClosed(i, menuC8939e);
            } finally {
                windowCallbackC2791e.f6720e = false;
            }
        }
    }

    public final void signatures(C16951e c16951e, boolean z) {
        C18194e c18194e;
        InterfaceC7126e interfaceC7126e;
        C13631e c13631e;
        if (z && c16951e.ad == 0 && (interfaceC7126e = this.f16570e) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC7126e;
            actionBarOverlayLayout.mopub();
            ActionMenuView actionMenuView = ((C5286e) actionBarOverlayLayout.f123e).ad.f265e;
            if (actionMenuView != null && (c13631e = actionMenuView.f161e) != null && c13631e.adcel()) {
                pro(c16951e.yandex);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f16587e.getSystemService("window");
        if (windowManager != null && c16951e.smaato && (c18194e = c16951e.appmetrica) != null) {
            windowManager.removeView(c18194e);
            if (z) {
                remoteconfig(c16951e.ad, c16951e, null);
            }
        }
        c16951e.mopub = false;
        c16951e.advert = false;
        c16951e.smaato = false;
        c16951e.purchase = null;
        c16951e.amazon = true;
        if (this.f16561e == c16951e) {
            this.f16561e = null;
        }
        if (c16951e.ad == 0) {
            m2384throw();
        }
    }

    @Override // defpackage.AbstractC12346e
    public final void smaato(View view, ViewGroup.LayoutParams layoutParams) {
        isPro();
        ViewGroup viewGroup = (ViewGroup) this.f16585e.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f16562e.ad(this.f16563e.getCallback());
    }

    @Override // defpackage.AbstractC12346e
    public final boolean startapp(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f16603e && i == 108) {
            return false;
        }
        if (this.f16573e && i == 1) {
            this.f16573e = false;
        }
        if (i == 1) {
            m2379extends();
            this.f16603e = true;
            return true;
        }
        if (i == 2) {
            m2379extends();
            this.f16575e = true;
            return true;
        }
        if (i == 5) {
            m2379extends();
            this.f16590e = true;
            return true;
        }
        if (i == 10) {
            m2379extends();
            this.f16591e = true;
            return true;
        }
        if (i == 108) {
            m2379extends();
            this.f16573e = true;
            return true;
        }
        if (i != 109) {
            return this.f16563e.requestFeature(i);
        }
        m2379extends();
        this.f16594e = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eِٗ٘] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C16951e subs(int r5) {
        /*
            r4 = this;
            eِٗ٘[] r0 = r4.f16606e
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            eِٗ٘[] r2 = new defpackage.C16951e[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f16606e = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            eِٗ٘ r2 = new eِٗ٘
            r2.<init>()
            r2.ad = r5
            r2.amazon = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C8158e.subs(int):eِٗ٘");
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m2383this(C16951e c16951e, int i, KeyEvent keyEvent) {
        MenuC8939e menuC8939e;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c16951e.mopub || m2382native(c16951e, keyEvent)) && (menuC8939e = c16951e.yandex) != null) {
            return menuC8939e.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m2384throw() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f16568e != null && (subs(0).smaato || this.f16565e != null)) {
                z = true;
            }
            if (z && this.f16569e == null) {
                this.f16569e = AbstractC3500e.vip(this.f16568e, this);
            } else {
                if (z || (onBackInvokedCallback = this.f16569e) == null) {
                    return;
                }
                AbstractC3500e.metrica(this.f16568e, onBackInvokedCallback);
                this.f16569e = null;
            }
        }
    }
}
