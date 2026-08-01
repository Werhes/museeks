package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13468e {
    public int[] ad;
    public int[] adcel;
    public int advert;
    public float[] appmetrica;
    public int[] billing;
    public int[] license;
    public int metrica;
    public boolean[] mopub;
    public int purchase;
    public int startapp;
    public int[] vip;
    public String[] yandex;

    public final void ad(int i, float f) {
        int i2 = this.purchase;
        int[] iArr = this.license;
        if (i2 >= iArr.length) {
            this.license = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.appmetrica;
            this.appmetrica = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.license;
        int i3 = this.purchase;
        iArr2[i3] = i;
        float[] fArr2 = this.appmetrica;
        this.purchase = i3 + 1;
        fArr2[i3] = f;
    }

    public final void license(int i, boolean z) {
        int i2 = this.advert;
        int[] iArr = this.adcel;
        if (i2 >= iArr.length) {
            this.adcel = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.mopub;
            this.mopub = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.adcel;
        int i3 = this.advert;
        iArr2[i3] = i;
        boolean[] zArr2 = this.mopub;
        this.advert = i3 + 1;
        zArr2[i3] = z;
    }

    public final void metrica(int i, String str) {
        int i2 = this.startapp;
        int[] iArr = this.billing;
        if (i2 >= iArr.length) {
            this.billing = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.yandex;
            this.yandex = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.billing;
        int i3 = this.startapp;
        iArr2[i3] = i;
        String[] strArr2 = this.yandex;
        this.startapp = i3 + 1;
        strArr2[i3] = str;
    }

    public final void vip(int i, int i2) {
        int i3 = this.metrica;
        int[] iArr = this.ad;
        if (i3 >= iArr.length) {
            this.ad = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.vip;
            this.vip = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.ad;
        int i4 = this.metrica;
        iArr3[i4] = i;
        int[] iArr4 = this.vip;
        this.metrica = i4 + 1;
        iArr4[i4] = i2;
    }
}
