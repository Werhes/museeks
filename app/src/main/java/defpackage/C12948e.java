package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؐٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12948e {
    public static final C12948e vip;
    public final C2893e ad;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            vip = C6453e.inmobi;
        } else if (i >= 30) {
            vip = C5571e.isVip;
        } else {
            vip = C2893e.vip;
        }
    }

    public C12948e(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.ad = new C0658e(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.ad = new C6453e(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.ad = new C4410e(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.ad = new C5571e(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.ad = new C7002e(this, windowInsets);
        } else if (i >= 28) {
            this.ad = new C17346e(this, windowInsets);
        } else {
            this.ad = new C14089e(this, windowInsets);
        }
    }

    public C12948e(C12948e c12948e) {
        if (c12948e == null) {
            this.ad = new C2893e(this);
            return;
        }
        C2893e c2893e = c12948e.ad;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (c2893e instanceof C0658e)) {
            this.ad = new C0658e(this, (C0658e) c2893e);
        } else if (i >= 34 && (c2893e instanceof C6453e)) {
            this.ad = new C6453e(this, (C6453e) c2893e);
        } else if (i >= 31 && (c2893e instanceof C4410e)) {
            this.ad = new C4410e(this, (C4410e) c2893e);
        } else if (i >= 30 && (c2893e instanceof C5571e)) {
            this.ad = new C5571e(this, (C5571e) c2893e);
        } else if (i >= 29 && (c2893e instanceof C7002e)) {
            this.ad = new C7002e(this, (C7002e) c2893e);
        } else if (i >= 28 && (c2893e instanceof C17346e)) {
            this.ad = new C17346e(this, (C17346e) c2893e);
        } else if (c2893e instanceof C14089e) {
            this.ad = new C14089e(this, (C14089e) c2893e);
        } else if (c2893e instanceof C3222e) {
            this.ad = new C3222e(this, (C3222e) c2893e);
        } else {
            this.ad = new C2893e(this);
        }
        c2893e.appmetrica(this);
    }

    public static C7088e appmetrica(C7088e c7088e, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c7088e.ad - i);
        int max2 = Math.max(0, c7088e.vip - i2);
        int max3 = Math.max(0, c7088e.metrica - i3);
        int max4 = Math.max(0, c7088e.license - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c7088e : C7088e.vip(max, max2, max3, max4);
    }

    public static C12948e yandex(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C12948e c12948e = new C12948e(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            C12948e ad = AbstractC9726e.ad(view);
            C2893e c2893e = c12948e.ad;
            c2893e.isPro(ad);
            View rootView = view.getRootView();
            c2893e.license(rootView);
            c2893e.Signature(rootView);
            c2893e.admob();
            c2893e.ads(view.getWindowSystemUiVisibility());
        }
        return c12948e;
    }

    public final int ad() {
        return this.ad.amazon().license;
    }

    public final WindowInsets billing() {
        C2893e c2893e = this.ad;
        if (c2893e instanceof C3222e) {
            return ((C3222e) c2893e).metrica;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12948e) {
            return Objects.equals(this.ad, ((C12948e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        C2893e c2893e = this.ad;
        if (c2893e == null) {
            return 0;
        }
        return c2893e.hashCode();
    }

    public final int license() {
        return this.ad.amazon().vip;
    }

    public final int metrica() {
        return this.ad.amazon().metrica;
    }

    public final C12948e purchase(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        AbstractC17066e c16087e = i5 >= 36 ? new C16087e(this) : i5 >= 35 ? new C8443e(this) : i5 >= 34 ? new C11610e(this) : i5 >= 31 ? new C16684e(this) : i5 >= 30 ? new C15829e(this) : i5 >= 29 ? new C5815e(this) : new C12525e(this);
        c16087e.yandex(C7088e.vip(i, i2, i3, i4));
        return c16087e.vip();
    }

    public final int vip() {
        return this.ad.amazon().ad;
    }
}
