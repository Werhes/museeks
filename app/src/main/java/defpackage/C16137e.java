package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16137e {
    public static final C16137e purchase = new C16137e(0, new int[0], new Object[0], false);
    public int ad;
    public boolean appmetrica;
    public int license = -1;
    public Object[] metrica;
    public int[] vip;

    public C16137e(int i, int[] iArr, Object[] objArr, boolean z) {
        this.ad = i;
        this.vip = iArr;
        this.metrica = objArr;
        this.appmetrica = z;
    }

    public static C16137e metrica() {
        return new C16137e(0, new int[8], new Object[8], true);
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

    public final void appmetrica(C13935e c13935e) {
        if (this.ad == 0) {
            return;
        }
        c13935e.getClass();
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.vip[i];
            Object obj = this.metrica[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((AbstractC16754e) c13935e.f27641e).premium(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((AbstractC16754e) c13935e.f27641e).remoteconfig(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((AbstractC16754e) c13935e.f27641e).Signature(i3, (AbstractC4002e) obj);
            } else if (i4 == 3) {
                AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
                abstractC16754e.isPro(i3, 3);
                ((C16137e) obj).appmetrica(c13935e);
                abstractC16754e.isPro(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(C11872e.metrica());
                }
                ((AbstractC16754e) c13935e.f27641e).admob(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16137e)) {
            return false;
        }
        C16137e c16137e = (C16137e) obj;
        int i = this.ad;
        if (i == c16137e.ad) {
            int[] iArr = this.vip;
            int[] iArr2 = c16137e.vip;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.metrica;
                    Object[] objArr2 = c16137e.metrica;
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

    public final void license(int i, Object obj) {
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
        int adcel;
        int advert;
        int adcel2;
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
                    adcel2 = AbstractC16754e.adcel(i5) + 8;
                } else if (i6 == 2) {
                    adcel2 = AbstractC16754e.purchase(i5, (AbstractC4002e) this.metrica[i3]);
                } else if (i6 == 3) {
                    adcel = AbstractC16754e.adcel(i5) * 2;
                    advert = ((C16137e) this.metrica[i3]).vip();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C11872e.metrica());
                    }
                    ((Integer) this.metrica[i3]).getClass();
                    adcel2 = AbstractC16754e.adcel(i5) + 4;
                }
                i2 = adcel2 + i2;
            } else {
                long longValue = ((Long) this.metrica[i3]).longValue();
                adcel = AbstractC16754e.adcel(i5);
                advert = AbstractC16754e.advert(longValue);
            }
            i2 = advert + adcel + i2;
        }
        this.license = i2;
        return i2;
    }
}
