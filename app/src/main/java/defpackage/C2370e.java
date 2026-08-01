package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2370e {
    public static final C2370e purchase = new C2370e(0, new int[0], new Object[0], false);
    public int ad;
    public boolean appmetrica;
    public int license = -1;
    public Object[] metrica;
    public int[] vip;

    public C2370e(int i, int[] iArr, Object[] objArr, boolean z) {
        this.ad = i;
        this.vip = iArr;
        this.metrica = objArr;
        this.appmetrica = z;
    }

    public static C2370e ad() {
        return new C2370e(0, new int[8], new Object[8], true);
    }

    public final void appmetrica(int i) {
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
        if (obj == null || !(obj instanceof C2370e)) {
            return false;
        }
        C2370e c2370e = (C2370e) obj;
        int i = this.ad;
        if (i == c2370e.ad) {
            int[] iArr = this.vip;
            int[] iArr2 = c2370e.vip;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.metrica;
                    Object[] objArr2 = c2370e.metrica;
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
        int i2 = i + 527;
        int[] iArr = this.vip;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.metrica;
        int i7 = this.ad;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void license(int i, Object obj) {
        if (!this.appmetrica) {
            throw new UnsupportedOperationException();
        }
        appmetrica(this.ad + 1);
        int[] iArr = this.vip;
        int i2 = this.ad;
        iArr[i2] = i;
        this.metrica[i2] = obj;
        this.ad = i2 + 1;
    }

    public final int metrica() {
        int subscription;
        int remoteconfig;
        int subscription2;
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
                    subscription2 = AbstractC13874e.subscription(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    AbstractC7244e abstractC7244e = (AbstractC7244e) this.metrica[i3];
                    int subscription3 = AbstractC13874e.subscription(i7);
                    int billing = abstractC7244e.billing();
                    i2 = AbstractC1414e.purchase(billing, billing, subscription3, i2);
                } else if (i6 == 3) {
                    int subscription4 = AbstractC13874e.subscription(i5 << 3);
                    subscription = subscription4 + subscription4;
                    remoteconfig = ((C2370e) this.metrica[i3]).metrica();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new C15259e());
                    }
                    ((Integer) this.metrica[i3]).getClass();
                    subscription2 = AbstractC13874e.subscription(i5 << 3) + 4;
                }
                i2 = subscription2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.metrica[i3]).longValue();
                subscription = AbstractC13874e.subscription(i8);
                remoteconfig = AbstractC13874e.remoteconfig(longValue);
            }
            i2 = remoteconfig + subscription + i2;
        }
        this.license = i2;
        return i2;
    }

    public final void vip(C16089e c16089e) {
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        if (this.ad != 0) {
            for (int i = 0; i < this.ad; i++) {
                int i2 = this.vip[i];
                Object obj = this.metrica[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    abstractC13874e.inmobi(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    abstractC13874e.isPro(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    abstractC13874e.premium(i4, (AbstractC7244e) obj);
                } else if (i3 == 3) {
                    abstractC13874e.pro(i4, 3);
                    ((C2370e) obj).vip(c16089e);
                    abstractC13874e.pro(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new C15259e());
                    }
                    abstractC13874e.isVip(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
