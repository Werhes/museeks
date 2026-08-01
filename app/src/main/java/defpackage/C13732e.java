package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13732e {
    public final C11388e ad;
    public C8419e appmetrica;
    public boolean billing;
    public final InterfaceC18435e license;
    public final C0909e metrica;
    public boolean purchase;
    public boolean startapp;
    public final C7102e vip;
    public boolean yandex;
    public final CursorAnchorInfo.Builder adcel = new CursorAnchorInfo.Builder();
    public final float[] mopub = C6739e.ad();
    public final Matrix advert = new Matrix();

    public C13732e(C11388e c11388e, C7102e c7102e, C0909e c0909e, InterfaceC18435e interfaceC18435e) {
        this.ad = c11388e;
        this.vip = c7102e;
        this.metrica = c0909e;
        this.license = interfaceC18435e;
    }

    public final CursorAnchorInfo ad() {
        InterfaceC0043e interfaceC0043e;
        InterfaceC0043e vip;
        C12476e metrica;
        int i;
        float f;
        float f2;
        float f3;
        C7102e c7102e = this.vip;
        InterfaceC0043e appmetrica = c7102e.appmetrica();
        if (appmetrica != null) {
            if (!appmetrica.billing()) {
                appmetrica = null;
            }
            if (appmetrica != null && (interfaceC0043e = (InterfaceC0043e) c7102e.license.getValue()) != null) {
                if (!interfaceC0043e.billing()) {
                    interfaceC0043e = null;
                }
                if (interfaceC0043e != null && (vip = c7102e.vip()) != null) {
                    if (!vip.billing()) {
                        vip = null;
                    }
                    if (vip != null && (metrica = c7102e.metrica()) != null) {
                        C17013e license = this.ad.license();
                        float[] fArr = this.mopub;
                        C6739e.license(fArr);
                        appmetrica.startapp(fArr);
                        Matrix matrix = this.advert;
                        C14155e.metrica(matrix, fArr);
                        C0763e amazon = AbstractC14520e.startapp(interfaceC0043e).amazon(appmetrica.mo207class(interfaceC0043e, 0L));
                        C0763e amazon2 = AbstractC14520e.startapp(vip).amazon(appmetrica.mo207class(vip, 0L));
                        long j = license.f33324e;
                        C12347e c12347e = license.f33321e;
                        boolean z = this.purchase;
                        boolean z2 = this.billing;
                        boolean z3 = this.yandex;
                        boolean z4 = this.startapp;
                        CursorAnchorInfo.Builder builder = this.adcel;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int billing = C12347e.billing(j);
                        builder.setSelectionRange(billing, C12347e.purchase(j));
                        if (z && billing >= 0) {
                            C0763e metrica2 = metrica.metrica(billing);
                            float vip2 = AbstractC3062e.vip(metrica2.ad, 0.0f, (int) (metrica.metrica >> 32));
                            boolean ad = AbstractC15367e.ad(amazon, vip2, metrica2.vip);
                            boolean ad2 = AbstractC15367e.ad(amazon, vip2, metrica2.license);
                            boolean z5 = metrica.ad(billing) == 2;
                            int i2 = (ad || ad2) ? 1 : 0;
                            if (!ad || !ad2) {
                                i2 |= 2;
                            }
                            if (z5) {
                                i2 |= 4;
                            }
                            int i3 = i2;
                            float f4 = metrica2.vip;
                            float f5 = metrica2.license;
                            builder.setInsertionMarkerLocation(vip2, f4, f5, f5, i3);
                        }
                        if (z2) {
                            int billing2 = c12347e != null ? C12347e.billing(c12347e.ad) : -1;
                            int purchase = c12347e != null ? C12347e.purchase(c12347e.ad) : -1;
                            if (billing2 >= 0 && billing2 < purchase) {
                                builder.setComposingText(billing2, license.f33322e.subSequence(billing2, purchase));
                                float[] fArr2 = new float[(purchase - billing2) * 4];
                                metrica.vip.ad(AbstractC9262e.metrica(billing2, purchase), fArr2);
                                for (int i4 = billing2; i4 < purchase; i4++) {
                                    int i5 = (i4 - billing2) * 4;
                                    float f6 = fArr2[i5];
                                    float f7 = fArr2[i5 + 1];
                                    float f8 = fArr2[i5 + 2];
                                    float f9 = fArr2[i5 + 3];
                                    int i6 = (f6 < amazon.metrica ? 1 : 0) & (amazon.ad < f8 ? 1 : 0) & (amazon.vip < f9 ? 1 : 0) & (f7 < amazon.license ? 1 : 0);
                                    if (!AbstractC15367e.ad(amazon, f6, f7) || !AbstractC15367e.ad(amazon, f8, f9)) {
                                        i6 |= 2;
                                    }
                                    int i7 = i6;
                                    if (metrica.ad(i4) == 2) {
                                        i = i7 | 4;
                                        f = f9;
                                        f3 = f7;
                                        f2 = f8;
                                    } else {
                                        i = i7;
                                        f = f9;
                                        f2 = f8;
                                        f3 = f7;
                                    }
                                    builder.addCharacterBounds(i4, f6, f3, f2, f, i);
                                }
                            }
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 33 && z3) {
                            AbstractC14380e.ads(builder, amazon2);
                        }
                        if (i8 >= 34 && z4) {
                            AbstractC5666e.vip(builder, metrica, amazon);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
