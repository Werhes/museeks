package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16724e {
    public static final C16724e purchase = new C16724e(0, new int[0], new Object[0], false);
    public int ad;
    public boolean appmetrica;
    public int license = -1;
    public Object[] metrica;
    public int[] vip;

    public C16724e(int i, int[] iArr, Object[] objArr, boolean z) {
        this.ad = i;
        this.vip = iArr;
        this.metrica = objArr;
        this.appmetrica = z;
    }

    public final void ad(int i) {
        int[] iArr = this.vip;
        if (i > iArr.length) {
            int i2 = this.ad;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.vip = Arrays.copyOf(iArr, i);
            this.metrica = Arrays.copyOf(this.metrica, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16724e)) {
            return false;
        }
        C16724e c16724e = (C16724e) obj;
        int i = this.ad;
        if (i == c16724e.ad) {
            int[] iArr = this.vip;
            int[] iArr2 = c16724e.vip;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.metrica;
                    Object[] objArr2 = c16724e.metrica;
                    int i3 = this.ad;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.ad;
        int i2 = (527 + i) * 31;
        int[] iArr = this.vip;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.metrica;
        int i7 = this.ad;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void license(C6594e c6594e) {
        if (this.ad == 0) {
            return;
        }
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.vip[i];
            Object obj = this.metrica[i];
            C15997e c15997e = (C15997e) c6594e.f13613e;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c15997e.m4098goto(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c15997e.isPro(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c15997e.signatures(i3, (C6283e) obj);
            } else if (i4 == 3) {
                c15997e.firebase(i3, 3);
                ((C16724e) obj).license(c6594e);
                c15997e.firebase(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(C11690e.vip());
                }
                c15997e.isVip(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final void metrica(int i, Object obj) {
        if (!this.appmetrica) {
            throw new UnsupportedOperationException();
        }
        ad(this.ad + 1);
        int[] iArr = this.vip;
        int i2 = this.ad;
        iArr[i2] = i;
        this.metrica[i2] = obj;
        this.ad = i2 + 1;
    }

    public final int vip() {
        int smaato;
        int loadAd;
        int smaato2;
        int i = this.license;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.ad; i3++) {
            int i4 = this.vip[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.metrica[i3]).getClass();
                    smaato2 = C15997e.smaato(i5) + 8;
                } else if (i6 == 2) {
                    smaato2 = C15997e.mopub(i5, (C6283e) this.metrica[i3]);
                } else if (i6 == 3) {
                    smaato = C15997e.smaato(i5) * 2;
                    loadAd = ((C16724e) this.metrica[i3]).vip();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C11690e.vip());
                    }
                    ((Integer) this.metrica[i3]).getClass();
                    smaato2 = C15997e.smaato(i5) + 4;
                }
                i2 = smaato2 + i2;
            } else {
                long longValue = ((Long) this.metrica[i3]).longValue();
                smaato = C15997e.smaato(i5);
                loadAd = C15997e.loadAd(longValue);
            }
            i2 = loadAd + smaato + i2;
        }
        this.license = i2;
        return i2;
    }
}
