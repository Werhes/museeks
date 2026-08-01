package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14754e {
    public static final String adcel;
    public static final String advert;
    public static final String amazon;
    public static final String mopub;
    public static final String smaato;
    public static final String startapp;
    public static final C14754e yandex = new C14754e(1, 2, 3, null, -1, -1);
    public final int ad;
    public final int appmetrica;
    public int billing;
    public final byte[] license;
    public final int metrica;
    public final int purchase;
    public final int vip;

    static {
        String str = AbstractC9413e.ad;
        startapp = Integer.toString(0, 36);
        adcel = Integer.toString(1, 36);
        mopub = Integer.toString(2, 36);
        advert = Integer.toString(3, 36);
        smaato = Integer.toString(4, 36);
        amazon = Integer.toString(5, 36);
    }

    public C14754e(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = bArr;
        this.appmetrica = i4;
        this.purchase = i5;
    }

    public static String ad(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC1786e.admob(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static boolean appmetrica(C14754e c14754e) {
        if (c14754e == null) {
            return true;
        }
        int i = c14754e.ad;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c14754e.vip;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c14754e.metrica;
        if ((i3 != -1 && i3 != 3) || c14754e.license != null) {
            return false;
        }
        int i4 = c14754e.purchase;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c14754e.appmetrica;
        return i5 == -1 || i5 == 8;
    }

    public static int billing(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String metrica(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC1786e.admob(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static int purchase(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static String vip(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC1786e.admob(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14754e.class == obj.getClass()) {
            C14754e c14754e = (C14754e) obj;
            if (this.ad == c14754e.ad && this.vip == c14754e.vip && this.metrica == c14754e.metrica && Arrays.equals(this.license, c14754e.license) && this.appmetrica == c14754e.appmetrica && this.purchase == c14754e.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.billing == 0) {
            this.billing = ((((Arrays.hashCode(this.license) + ((((((527 + this.ad) * 31) + this.vip) * 31) + this.metrica) * 31)) * 31) + this.appmetrica) * 31) + this.purchase;
        }
        return this.billing;
    }

    public final boolean license() {
        return (this.ad == -1 || this.vip == -1 || this.metrica == -1) ? false : true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(vip(this.ad));
        sb.append(", ");
        sb.append(ad(this.vip));
        sb.append(", ");
        sb.append(metrica(this.metrica));
        sb.append(", ");
        sb.append(this.license != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.appmetrica;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.purchase;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC1786e.signatures(sb, str2, ")");
    }
}
