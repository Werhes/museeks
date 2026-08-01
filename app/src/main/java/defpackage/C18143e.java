package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18143e {
    public final C13770e ad;
    public int advert;
    public int billing;
    public boolean metrica;
    public int purchase;
    public C14608e vip;
    public final C2025e license = new C2025e((byte) 0, 2);
    public boolean appmetrica = true;
    public final ArrayList yandex = new ArrayList();
    public int startapp = -1;
    public int adcel = -1;
    public int mopub = -1;

    public C18143e(C13770e c13770e, C14608e c14608e) {
        this.ad = c13770e;
        this.vip = c14608e;
    }

    public final void ad() {
        metrica();
        ArrayList arrayList = this.yandex;
        if (AbstractC5851e.license(arrayList)) {
            AbstractC5851e.purchase(arrayList);
        } else {
            this.billing++;
        }
    }

    public final void appmetrica(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC1889e.ad("Invalid remove index " + i);
            }
            if (this.startapp == i) {
                this.advert += i2;
                return;
            }
            metrica();
            this.startapp = i;
            this.advert = i2;
        }
    }

    public final void license(boolean z) {
        C13770e c13770e = this.ad;
        int i = z ? c13770e.f27293interface.startapp : c13770e.f27293interface.billing;
        int i2 = i - this.purchase;
        if (i2 < 0) {
            AbstractC1889e.ad("Tried to seek backward");
        }
        if (i2 > 0) {
            C12021e c12021e = this.vip.metrica;
            c12021e.adcel(C1371e.license);
            c12021e.billing[c12021e.yandex - c12021e.appmetrica[c12021e.purchase - 1].vip] = i2;
            this.purchase = i;
        }
    }

    public final void metrica() {
        int i = this.advert;
        if (i > 0) {
            int i2 = this.startapp;
            if (i2 >= 0) {
                vip();
                C12021e c12021e = this.vip.metrica;
                c12021e.adcel(C1107e.license);
                int i3 = c12021e.yandex - c12021e.appmetrica[c12021e.purchase - 1].vip;
                int[] iArr = c12021e.billing;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.startapp = -1;
            } else {
                int i4 = this.mopub;
                int i5 = this.adcel;
                vip();
                C12021e c12021e2 = this.vip.metrica;
                c12021e2.adcel(C12819e.license);
                int i6 = c12021e2.yandex - c12021e2.appmetrica[c12021e2.purchase - 1].vip;
                int[] iArr2 = c12021e2.billing;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.adcel = -1;
                this.mopub = -1;
            }
            this.advert = 0;
        }
    }

    public final void vip() {
        int i = this.billing;
        if (i > 0) {
            C12021e c12021e = this.vip.metrica;
            c12021e.adcel(C16734e.license);
            c12021e.billing[c12021e.yandex - c12021e.appmetrica[c12021e.purchase - 1].vip] = i;
            this.billing = 0;
        }
        ArrayList arrayList = this.yandex;
        if (AbstractC5851e.license(arrayList)) {
            C14608e c14608e = this.vip;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            c14608e.getClass();
            if (size != 0) {
                C12021e c12021e2 = c14608e.metrica;
                c12021e2.adcel(C2651e.license);
                AbstractC0207e.adcel(c12021e2, 0, objArr);
            }
            arrayList.clear();
        }
    }
}
