package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14677e {
    public final int ad;
    public final int vip;
    public static final C14677e metrica = new C14677e(0, 0);
    public static final C14677e license = new C14677e(1, 8);
    public static final C14677e appmetrica = new C14677e(3, 10);
    public static final C14677e purchase = new C14677e(4, 10);
    public static final C14677e billing = new C14677e(5, 10);
    public static final C14677e yandex = new C14677e(6, 10);
    public static final C14677e startapp = new C14677e(6, 8);

    public C14677e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean ad() {
        return vip() && this.ad != 1 && this.vip == 10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14677e) {
            C14677e c14677e = (C14677e) obj;
            if (this.ad == c14677e.ad && this.vip == c14677e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad ^ 1000003) * 1000003) ^ this.vip;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.ad) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return AbstractC17861e.smaato(this.vip, "}", sb);
    }

    public final boolean vip() {
        int i = this.ad;
        return (i == 0 || i == 2 || this.vip == 0) ? false : true;
    }
}
