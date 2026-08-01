package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10308e {
    public static final C10308e purchase = new C10308e(0, new int[0], new Object[0], false);
    public int ad;
    public boolean appmetrica;
    public int license = -1;
    public Object[] metrica;
    public int[] vip;

    public C10308e(int i, int[] iArr, Object[] objArr, boolean z) {
        this.ad = i;
        this.vip = iArr;
        this.metrica = objArr;
        this.appmetrica = z;
    }

    public static C10308e vip() {
        return new C10308e(0, new int[8], new Object[8], true);
    }

    public final int ad() {
        int yandex;
        int startapp;
        int yandex2;
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
                    yandex2 = C5633e.yandex(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    AbstractC13532e abstractC13532e = (AbstractC13532e) this.metrica[i3];
                    int yandex3 = C5633e.yandex(i7);
                    int startapp2 = abstractC13532e.startapp();
                    i2 = AbstractC1414e.admob(startapp2, startapp2, yandex3, i2);
                } else if (i6 == 3) {
                    int yandex4 = C5633e.yandex(i5 << 3);
                    yandex = yandex4 + yandex4;
                    startapp = ((C10308e) this.metrica[i3]).ad();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new C9916e());
                    }
                    ((Integer) this.metrica[i3]).getClass();
                    yandex2 = C5633e.yandex(i5 << 3) + 4;
                }
                i2 = yandex2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.metrica[i3]).longValue();
                yandex = C5633e.yandex(i8);
                startapp = C5633e.startapp(longValue);
            }
            i2 = startapp + yandex + i2;
        }
        this.license = i2;
        return i2;
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
        if (obj == null || !(obj instanceof C10308e)) {
            return false;
        }
        C10308e c10308e = (C10308e) obj;
        int i = this.ad;
        if (i == c10308e.ad) {
            int[] iArr = this.vip;
            int[] iArr2 = c10308e.vip;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.metrica;
                    Object[] objArr2 = c10308e.metrica;
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

    public final void license(C17698e c17698e) {
        if (this.ad != 0) {
            for (int i = 0; i < this.ad; i++) {
                int i2 = this.vip[i];
                Object obj = this.metrica[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    c17698e.ad.isVip(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    c17698e.ad.loadAd(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    c17698e.ad.advert(i4, (AbstractC13532e) obj);
                } else if (i3 == 3) {
                    c17698e.ad.pro(i4, 3);
                    ((C10308e) obj).license(c17698e);
                    c17698e.ad.pro(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new C9916e());
                    }
                    c17698e.ad.smaato(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void metrica(int i, Object obj) {
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
}
