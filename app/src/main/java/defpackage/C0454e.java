package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454e {
    public static final String appmetrica;
    public static final String billing;
    public static final C0454e license = new C0454e(new C13601e());
    public static final String purchase;
    public final int ad;
    public final boolean metrica;
    public final boolean vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(1, 36);
        purchase = Integer.toString(2, 36);
        billing = Integer.toString(3, 36);
    }

    public C0454e(C13601e c13601e) {
        this.ad = c13601e.ad;
        this.vip = c13601e.vip;
        this.metrica = c13601e.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0454e.class == obj.getClass()) {
            C0454e c0454e = (C0454e) obj;
            if (this.ad == c0454e.ad && this.vip == c0454e.vip && this.metrica == c0454e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.ad + 31) * 31) + (this.vip ? 1 : 0)) * 31) + (this.metrica ? 1 : 0);
    }
}
