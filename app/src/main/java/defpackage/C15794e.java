package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15794e {
    public static final C15794e appmetrica;
    public static final long license;
    public final int ad;
    public final int metrica;
    public final int vip;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        license = j;
        appmetrica = new C15794e(0, -1, -1);
    }

    public C15794e(int i, int i2, int i3) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
    }

    public static int appmetrica(int i, int i2, String str) {
        if (i == i2) {
            throw C14803e.metrica("missing precision", i - 1, str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= '\n') {
                throw C14803e.metrica("invalid precision character", i4, str);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw C14803e.vip(i, i2, "precision too large", str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw C14803e.vip(i, i2, "invalid precision", str);
    }

    public final boolean ad() {
        return this == appmetrica;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15794e) {
            C15794e c15794e = (C15794e) obj;
            if (c15794e.ad == this.ad && c15794e.vip == this.vip && c15794e.metrica == this.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.ad * 31) + this.vip) * 31) + this.metrica;
    }

    public final void license(StringBuilder sb) {
        if (ad()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.ad & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.vip;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.metrica;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean metrica() {
        return (this.ad & 128) != 0;
    }

    public final boolean vip(int i, boolean z) {
        int i2;
        if (ad()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.ad;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.metrica != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.vip != -1;
    }
}
