package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12775e {
    public final C9445e ad;
    public C0398e adcel;
    public InterfaceC6256e advert;
    public C0763e amazon;
    public boolean appmetrica;
    public boolean billing;
    public boolean license;
    public C12476e mopub;
    public boolean purchase;
    public C0763e smaato;
    public boolean startapp;
    public final C16911e vip;
    public boolean yandex;
    public final Object metrica = new Object();
    public final CursorAnchorInfo.Builder loadAd = new CursorAnchorInfo.Builder();
    public final float[] Signature = C6739e.ad();
    public final Matrix admob = new Matrix();

    public C12775e(C9445e c9445e, C16911e c16911e) {
        this.ad = c9445e;
        this.vip = c16911e;
    }

    public final void ad() {
        C16911e c16911e;
        boolean z;
        boolean z2;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        C16911e c16911e2 = this.vip;
        InputMethodManager inmobi = c16911e2.inmobi();
        View view = (View) c16911e2.f33137e;
        if (!inmobi.isActive(view) || this.adcel == null || this.advert == null || this.mopub == null || this.smaato == null || this.amazon == null) {
            return;
        }
        float[] fArr = this.Signature;
        C6739e.license(fArr);
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.ad.f18786e.f21052e.getValue();
        if (interfaceC0043e != null) {
            if (!interfaceC0043e.billing()) {
                interfaceC0043e = null;
            }
            if (interfaceC0043e != null) {
                interfaceC0043e.startapp(fArr);
            }
        }
        Unit unit = Unit.INSTANCE;
        C0763e c0763e = this.amazon;
        C6739e.adcel(fArr, -c0763e.ad, -c0763e.vip);
        Matrix matrix = this.admob;
        C14155e.metrica(matrix, fArr);
        C0398e c0398e = this.adcel;
        InterfaceC6256e interfaceC6256e = this.advert;
        C12476e c12476e = this.mopub;
        C0763e c0763e2 = this.smaato;
        C0763e c0763e3 = this.amazon;
        boolean z3 = this.purchase;
        boolean z4 = this.billing;
        boolean z5 = this.yandex;
        boolean z6 = this.startapp;
        CursorAnchorInfo.Builder builder = this.loadAd;
        builder.reset();
        builder.setMatrix(matrix);
        long j = c0398e.vip;
        C12347e c12347e = c0398e.metrica;
        int billing = C12347e.billing(j);
        builder.setSelectionRange(billing, C12347e.purchase(c0398e.vip));
        if (!z3 || billing < 0) {
            c16911e = c16911e2;
        } else {
            int billing2 = interfaceC6256e.billing(billing);
            C0763e metrica = c12476e.metrica(billing2);
            c16911e = c16911e2;
            float vip = AbstractC3062e.vip(metrica.ad, 0.0f, (int) (c12476e.metrica >> 32));
            boolean ad = AbstractC15367e.ad(c0763e2, vip, metrica.vip);
            boolean ad2 = AbstractC15367e.ad(c0763e2, vip, metrica.license);
            boolean z7 = c12476e.ad(billing2) == 2;
            int i3 = (ad || ad2) ? 1 : 0;
            if (!ad || !ad2) {
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
            int purchase = c12347e != null ? C12347e.purchase(c12347e.ad) : -1;
            if (billing3 >= 0 && billing3 < purchase) {
                builder.setComposingText(billing3, c0398e.ad.f20850e.subSequence(billing3, purchase));
                int billing4 = interfaceC6256e.billing(billing3);
                int billing5 = interfaceC6256e.billing(purchase);
                float[] fArr2 = new float[(billing5 - billing4) * 4];
                z = z5;
                z2 = z6;
                c12476e.vip.ad(AbstractC9262e.metrica(billing4, billing5), fArr2);
                int i4 = billing3;
                while (i4 < purchase) {
                    int billing6 = interfaceC6256e.billing(i4);
                    int i5 = (billing6 - billing4) * 4;
                    float f6 = fArr2[i5];
                    float f7 = fArr2[i5 + 1];
                    float f8 = fArr2[i5 + 2];
                    float f9 = fArr2[i5 + 3];
                    int i6 = purchase;
                    int i7 = (c0763e2.ad < f8 ? 1 : 0) & (f6 < c0763e2.metrica ? 1 : 0) & (c0763e2.vip < f9 ? 1 : 0) & (f7 < c0763e2.license ? 1 : 0);
                    if (!AbstractC15367e.ad(c0763e2, f6, f7) || !AbstractC15367e.ad(c0763e2, f8, f9)) {
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
                    purchase = i6;
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 33 && z) {
                    AbstractC14380e.ads(builder, c0763e3);
                }
                if (i >= 34 && z2) {
                    AbstractC5666e.vip(builder, c12476e, c0763e2);
                }
                c16911e.inmobi().updateCursorAnchorInfo(view, builder.build());
                this.appmetrica = false;
            }
        }
        z = z5;
        z2 = z6;
        i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            AbstractC14380e.ads(builder, c0763e3);
        }
        if (i >= 34) {
            AbstractC5666e.vip(builder, c12476e, c0763e2);
        }
        c16911e.inmobi().updateCursorAnchorInfo(view, builder.build());
        this.appmetrica = false;
    }
}
