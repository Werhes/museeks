package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3222e extends C2893e {
    public static Class Signature = null;
    public static Field admob = null;
    public static boolean amazon = false;
    public static Method loadAd;
    public static Field subscription;
    public int adcel;
    public Rect[][] advert;
    public C7088e appmetrica;
    public C7088e billing;
    public C7088e[] license;
    public final WindowInsets metrica;
    public int mopub;
    public C12948e purchase;
    public Rect[][] smaato;
    public C5494e startapp;
    public int yandex;

    public C3222e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e);
        this.appmetrica = null;
        this.advert = new Rect[10];
        this.smaato = new Rect[10];
        this.metrica = windowInsets;
    }

    public C3222e(C12948e c12948e, C3222e c3222e) {
        this(c12948e, new WindowInsets(c3222e.metrica));
    }

    /* renamed from: class, reason: not valid java name */
    private Rect[] m1319class(C7088e c7088e) {
        ArrayList arrayList = new ArrayList();
        int i = c7088e.ad;
        int i2 = c7088e.license;
        int i3 = c7088e.metrica;
        int i4 = c7088e.vip;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c7088e.ad, this.adcel));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.mopub, i4));
        }
        if (i3 != 0) {
            int i5 = this.mopub;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.adcel));
        }
        if (i2 != 0) {
            int i6 = this.adcel;
            arrayList.add(new Rect(0, i6 - i2, this.mopub, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private C5494e crashlytics(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.ad.ad.pro()) {
            return C5494e.ad(point.x, point.y, true, 0, 0, 0, 0);
        }
        C7607e admob2 = AbstractC16048e.admob(display, 0);
        C7607e admob3 = AbstractC16048e.admob(display, 1);
        C7607e admob4 = AbstractC16048e.admob(display, 2);
        C7607e admob5 = AbstractC16048e.admob(display, 3);
        return C5494e.ad(point.x, point.y, false, admob2 != null ? admob2.vip : 0, admob3 != null ? admob3.vip : 0, admob4 != null ? admob4.vip : 0, admob5 != null ? admob5.vip : 0);
    }

    private static List<Rect> firebase(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC2426e.ad(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: interface, reason: not valid java name */
    private C7088e m1320interface(int i, boolean z) {
        C7088e c7088e = C7088e.appmetrica;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c7088e = C7088e.ad(c7088e, m1326goto(i2, z));
            }
        }
        return c7088e;
    }

    /* renamed from: native, reason: not valid java name */
    private C7088e m1321native(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!amazon) {
            m1323throw();
        }
        Method method = loadAd;
        if (method != null && Signature != null && admob != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) admob.get(subscription.get(invoke));
                if (rect != null) {
                    return C7088e.vip(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* renamed from: this, reason: not valid java name */
    private C7088e m1322this() {
        C12948e c12948e = this.purchase;
        return c12948e != null ? c12948e.ad.advert() : C7088e.appmetrica;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: throw, reason: not valid java name */
    private static void m1323throw() {
        try {
            loadAd = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Signature = cls;
            admob = cls.getDeclaredField("mVisibleInsets");
            subscription = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            admob.setAccessible(true);
            subscription.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        amazon = true;
    }

    /* renamed from: while, reason: not valid java name */
    public static boolean m1324while(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.C2893e
    public void Signature(View view) {
        this.startapp = crashlytics(view);
    }

    @Override // defpackage.C2893e
    public C7088e adcel(int i) {
        return m1320interface(i, true);
    }

    @Override // defpackage.C2893e
    @SuppressLint({"WrongConstant"})
    public void admob() {
        for (int i = 1; i <= 512; i <<= 1) {
            int ad = AbstractC2426e.ad(i);
            this.advert[ad] = m1319class(startapp(i));
            if (i != 8) {
                this.smaato[ad] = m1319class(adcel(i));
            }
        }
    }

    @Override // defpackage.C2893e
    public void ads(int i) {
        this.yandex = i;
    }

    @Override // defpackage.C2893e
    public final C7088e amazon() {
        if (this.appmetrica == null) {
            WindowInsets windowInsets = this.metrica;
            this.appmetrica = C7088e.vip(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.appmetrica;
    }

    @Override // defpackage.C2893e
    public void appmetrica(C12948e c12948e) {
        c12948e.ad.isPro(this.purchase);
        C7088e c7088e = this.billing;
        C2893e c2893e = c12948e.ad;
        c2893e.inmobi(c7088e);
        c2893e.ads(this.yandex);
        c2893e.tapsense(this.startapp);
        c2893e.premium(this.advert);
        c2893e.subs(this.smaato);
    }

    @Override // defpackage.C2893e
    public List<Rect> billing(int i) {
        return firebase(this.smaato, i);
    }

    @Override // defpackage.C2893e
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C3222e c3222e = (C3222e) obj;
        return Objects.equals(this.billing, c3222e.billing) && m1324while(this.yandex, c3222e.yandex);
    }

    /* renamed from: extends, reason: not valid java name */
    public boolean m1325extends(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m1326goto(i, false).equals(C7088e.appmetrica);
    }

    /* renamed from: goto, reason: not valid java name */
    public C7088e m1326goto(int i, boolean z) {
        C7088e advert;
        int i2;
        C7088e c7088e = C7088e.appmetrica;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C7088e[] c7088eArr = this.license;
                    advert = c7088eArr != null ? c7088eArr[AbstractC2426e.ad(8)] : null;
                    if (advert != null) {
                        return advert;
                    }
                    C7088e amazon2 = amazon();
                    C7088e m1322this = m1322this();
                    int i3 = amazon2.license;
                    if (i3 > m1322this.license) {
                        return C7088e.vip(0, 0, 0, i3);
                    }
                    C7088e c7088e2 = this.billing;
                    if (c7088e2 != null && !c7088e2.equals(c7088e) && (i2 = this.billing.license) > m1322this.license) {
                        return C7088e.vip(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return smaato();
                    }
                    if (i == 32) {
                        return mopub();
                    }
                    if (i == 64) {
                        return loadAd();
                    }
                    if (i == 128) {
                        C12948e c12948e = this.purchase;
                        C10119e yandex = c12948e != null ? c12948e.ad.yandex() : yandex();
                        if (yandex != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C7088e.vip(i4 >= 28 ? AbstractC17305e.premium(yandex.ad) : 0, i4 >= 28 ? AbstractC17305e.crashlytics(yandex.ad) : 0, i4 >= 28 ? AbstractC17305e.subs(yandex.ad) : 0, i4 >= 28 ? AbstractC17305e.ads(yandex.ad) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C7088e m1322this2 = m1322this();
                    C7088e advert2 = advert();
                    return C7088e.vip(Math.max(m1322this2.ad, advert2.ad), 0, Math.max(m1322this2.metrica, advert2.metrica), Math.max(m1322this2.license, advert2.license));
                }
                if ((this.yandex & 2) == 0) {
                    C7088e amazon3 = amazon();
                    C12948e c12948e2 = this.purchase;
                    advert = c12948e2 != null ? c12948e2.ad.advert() : null;
                    int i5 = amazon3.license;
                    if (advert != null) {
                        i5 = Math.min(i5, advert.license);
                    }
                    return C7088e.vip(amazon3.ad, 0, amazon3.metrica, i5);
                }
            }
        } else {
            if (z) {
                return C7088e.vip(0, Math.max(m1322this().vip, amazon().vip), 0, 0);
            }
            if ((this.yandex & 4) == 0) {
                return C7088e.vip(0, amazon().vip, 0, 0);
            }
        }
        return c7088e;
    }

    @Override // defpackage.C2893e
    public void inmobi(C7088e c7088e) {
        this.billing = c7088e;
    }

    @Override // defpackage.C2893e
    public void isPro(C12948e c12948e) {
        this.purchase = c12948e;
    }

    @Override // defpackage.C2893e
    public void isVip(C7088e[] c7088eArr) {
        this.license = c7088eArr;
    }

    @Override // defpackage.C2893e
    public void license(View view) {
        this.mopub = view.getWidth();
        this.adcel = view.getHeight();
        C7088e m1321native = m1321native(view);
        if (m1321native == null) {
            m1321native = C7088e.appmetrica;
        }
        inmobi(m1321native);
    }

    @Override // defpackage.C2893e
    public void premium(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.advert = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.C2893e
    public boolean pro() {
        return this.metrica.isRound();
    }

    @Override // defpackage.C2893e
    public List<Rect> purchase(int i) {
        return firebase(this.advert, i);
    }

    @Override // defpackage.C2893e
    @SuppressLint({"WrongConstant"})
    public boolean signatures(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m1325extends(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.C2893e
    public C7088e startapp(int i) {
        return m1320interface(i, false);
    }

    @Override // defpackage.C2893e
    public void subs(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.smaato = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.C2893e
    public C12948e subscription(int i, int i2, int i3, int i4) {
        C12948e yandex = C12948e.yandex(null, this.metrica);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC17066e c16087e = i5 >= 36 ? new C16087e(yandex) : i5 >= 35 ? new C8443e(yandex) : i5 >= 34 ? new C11610e(yandex) : i5 >= 31 ? new C16684e(yandex) : i5 >= 30 ? new C15829e(yandex) : i5 >= 29 ? new C5815e(yandex) : new C12525e(yandex);
        c16087e.yandex(C12948e.appmetrica(amazon(), i, i2, i3, i4));
        c16087e.purchase(C12948e.appmetrica(advert(), i, i2, i3, i4));
        return c16087e.vip();
    }

    @Override // defpackage.C2893e
    public void tapsense(C5494e c5494e) {
        this.startapp = c5494e;
    }
}
