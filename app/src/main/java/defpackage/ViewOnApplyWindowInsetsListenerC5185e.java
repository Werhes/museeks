package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC5185e implements View.OnApplyWindowInsetsListener {
    public final AbstractC15825e ad;
    public C12948e vip;

    public ViewOnApplyWindowInsetsListenerC5185e(View view, AbstractC15825e abstractC15825e) {
        C12948e c12948e;
        this.ad = abstractC15825e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        C12948e ad = AbstractC9726e.ad(view);
        if (ad != null) {
            int i = Build.VERSION.SDK_INT;
            c12948e = (i >= 36 ? new C16087e(ad) : i >= 35 ? new C8443e(ad) : i >= 34 ? new C11610e(ad) : i >= 31 ? new C16684e(ad) : i >= 30 ? new C15829e(ad) : i >= 29 ? new C5815e(ad) : new C12525e(ad)).vip();
        } else {
            c12948e = null;
        }
        this.vip = c12948e;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.vip = C12948e.yandex(view, windowInsets);
            return C15892e.adcel(view, windowInsets);
        }
        C12948e yandex = C12948e.yandex(view, windowInsets);
        C2893e c2893e = yandex.ad;
        if (this.vip == null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            this.vip = AbstractC9726e.ad(view);
        }
        if (this.vip == null) {
            this.vip = yandex;
            return C15892e.adcel(view, windowInsets);
        }
        AbstractC15825e mopub = C15892e.mopub(view);
        if (mopub != null && Objects.equals((C12948e) mopub.f31256e, yandex)) {
            return C15892e.adcel(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C12948e c12948e = this.vip;
        int i = 1;
        while (i <= 512) {
            C7088e startapp = c2893e.startapp(i);
            C7088e startapp2 = c12948e.ad.startapp(i);
            int i2 = startapp.ad;
            int i3 = startapp.license;
            int i4 = startapp.metrica;
            int i5 = startapp.vip;
            int i6 = startapp2.ad;
            int i7 = startapp2.license;
            int i8 = startapp2.metrica;
            int i9 = startapp2.vip;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.vip = yandex;
            return C15892e.adcel(view, windowInsets);
        }
        C12948e c12948e2 = this.vip;
        C12773e c12773e = new C12773e(i12, (i10 & 8) != 0 ? C15892e.appmetrica : (i11 & 8) != 0 ? C15892e.purchase : (i10 & 519) != 0 ? C15892e.billing : (i11 & 519) != 0 ? C15892e.yandex : null, (i12 & 8) != 0 ? 160L : 250L);
        c12773e.ad.appmetrica(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c12773e.ad.vip());
        C7088e startapp3 = c2893e.startapp(i12);
        C7088e startapp4 = c12948e2.ad.startapp(i12);
        int min = Math.min(startapp3.ad, startapp4.ad);
        int i13 = startapp3.vip;
        int i14 = startapp4.vip;
        int min2 = Math.min(i13, i14);
        int i15 = startapp3.metrica;
        int i16 = startapp4.metrica;
        int min3 = Math.min(i15, i16);
        int i17 = startapp3.license;
        int i18 = startapp4.license;
        C7302e c7302e = new C7302e(C7088e.vip(min, min2, min3, Math.min(i17, i18)), C7088e.vip(Math.max(startapp3.ad, startapp4.ad), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 1);
        C15892e.billing(view, c12773e, yandex, false);
        duration.addUpdateListener(new C7871e(c12773e, yandex, c12948e2, i12, view));
        duration.addListener(new C6318e(c12773e, view));
        ViewTreeObserverOnPreDrawListenerC7587e.ad(view, new RunnableC11327e(4, view, c12773e, c7302e, duration, false));
        this.vip = yandex;
        return C15892e.adcel(view, windowInsets);
    }
}
