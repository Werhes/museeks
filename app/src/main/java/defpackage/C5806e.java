package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5806e {
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e ad;
    public C0398e adcel;
    public InterfaceC6256e advert;
    public C0763e amazon;
    public boolean appmetrica;
    public boolean billing;
    public boolean license;
    public C0763e loadAd;
    public C12476e mopub;
    public boolean purchase;
    public boolean startapp;
    public final C12894e vip;
    public boolean yandex;
    public final Object metrica = new Object();
    public Function1 smaato = C5430e.f11646e;
    public final CursorAnchorInfo.Builder Signature = new CursorAnchorInfo.Builder();
    public final float[] admob = C6739e.ad();
    public final Matrix subscription = new Matrix();

    public C5806e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C12894e c12894e) {
        this.ad = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.vip = c12894e;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, eؕٛؓ] */
    public final void ad() {
        InterfaceC3477e interfaceC3477e;
        boolean z;
        boolean z2;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        C12894e c12894e = this.vip;
        ?? r2 = c12894e.f25750e;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view = (View) c12894e.f25751e;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.smaato;
            float[] fArr = this.admob;
            function1.invoke(new C6739e(fArr));
            this.ad.pro(fArr);
            Matrix matrix = this.subscription;
            C14155e.metrica(matrix, fArr);
            C0398e c0398e = this.adcel;
            InterfaceC6256e interfaceC6256e = this.advert;
            C12476e c12476e = this.mopub;
            C0763e c0763e = this.amazon;
            C0763e c0763e2 = this.loadAd;
            boolean z3 = this.purchase;
            boolean z4 = this.billing;
            boolean z5 = this.yandex;
            boolean z6 = this.startapp;
            CursorAnchorInfo.Builder builder = this.Signature;
            builder.reset();
            builder.setMatrix(matrix);
            long j = c0398e.vip;
            C12347e c12347e = c0398e.metrica;
            int billing = C12347e.billing(j);
            builder.setSelectionRange(billing, C12347e.purchase(c0398e.vip));
            if (!z3 || billing < 0) {
                interfaceC3477e = r2;
            } else {
                int billing2 = interfaceC6256e.billing(billing);
                C0763e metrica = c12476e.metrica(billing2);
                interfaceC3477e = r2;
                float vip = AbstractC3062e.vip(metrica.ad, 0.0f, (int) (c12476e.metrica >> 32));
                boolean purchase = AbstractC9464e.purchase(c0763e, vip, metrica.vip);
                boolean purchase2 = AbstractC9464e.purchase(c0763e, vip, metrica.license);
                boolean z7 = c12476e.ad(billing2) == 2;
                int i3 = (purchase || purchase2) ? 1 : 0;
                if (!purchase || !purchase2) {
                    i3 |= 2;
                }
                if (z7) {
                    i3 |= 4;
                }
                float f4 = metrica.vip;
                float f5 = metrica.license;
                builder.setInsertionMarkerLocation(vip, f4, f5, f5, i3);
            }
            if (z4) {
                int billing3 = c12347e != null ? C12347e.billing(c12347e.ad) : -1;
                int purchase3 = c12347e != null ? C12347e.purchase(c12347e.ad) : -1;
                if (billing3 >= 0 && billing3 < purchase3) {
                    builder.setComposingText(billing3, c0398e.ad.f20850e.subSequence(billing3, purchase3));
                    int billing4 = interfaceC6256e.billing(billing3);
                    int billing5 = interfaceC6256e.billing(purchase3);
                    float[] fArr2 = new float[(billing5 - billing4) * 4];
                    z = z5;
                    z2 = z6;
                    c12476e.vip.ad(AbstractC9262e.metrica(billing4, billing5), fArr2);
                    int i4 = billing3;
                    while (i4 < purchase3) {
                        int billing6 = interfaceC6256e.billing(i4);
                        int i5 = (billing6 - billing4) * 4;
                        float f6 = fArr2[i5];
                        float f7 = fArr2[i5 + 1];
                        float f8 = fArr2[i5 + 2];
                        float f9 = fArr2[i5 + 3];
                        int i6 = purchase3;
                        int i7 = (c0763e.ad < f8 ? 1 : 0) & (f6 < c0763e.metrica ? 1 : 0) & (c0763e.vip < f9 ? 1 : 0) & (f7 < c0763e.license ? 1 : 0);
                        if (!AbstractC9464e.purchase(c0763e, f6, f7) || !AbstractC9464e.purchase(c0763e, f8, f9)) {
                            i7 |= 2;
                        }
                        int i8 = i7;
                        if (c12476e.ad(billing6) == 2) {
                            i2 = i8 | 4;
                            f = f9;
                            f3 = f7;
                            f2 = f8;
                        } else {
                            i2 = i8;
                            f = f9;
                            f2 = f8;
                            f3 = f7;
                        }
                        builder.addCharacterBounds(i4, f6, f3, f2, f, i2);
                        i4++;
                        purchase3 = i6;
                    }
                    i = Build.VERSION.SDK_INT;
                    if (i >= 33 && z) {
                        AbstractC14380e.applovin(builder, c0763e2);
                    }
                    if (i >= 34 && z2) {
                        AbstractC5666e.ad(builder, c12476e, c0763e);
                    }
                    ((InputMethodManager) interfaceC3477e.getValue()).updateCursorAnchorInfo(view, builder.build());
                    this.appmetrica = false;
                }
            }
            z = z5;
            z2 = z6;
            i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                AbstractC14380e.applovin(builder, c0763e2);
            }
            if (i >= 34) {
                AbstractC5666e.ad(builder, c12476e, c0763e);
            }
            ((InputMethodManager) interfaceC3477e.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.appmetrica = false;
        }
    }
}
