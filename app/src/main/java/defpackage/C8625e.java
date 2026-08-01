package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8625e {
    public final C16786e ad;
    public final int metrica;
    public final int vip;

    public C8625e(int i, int i2, Class cls) {
        this(C16786e.ad(cls), i, i2);
    }

    public C8625e(C16786e c16786e, int i, int i2) {
        AbstractC11138e.metrica(c16786e, "Null dependency anInterface.");
        this.ad = c16786e;
        this.vip = i;
        this.metrica = i2;
    }

    public static C8625e ad(C16786e c16786e) {
        return new C8625e(c16786e, 1, 0);
    }

    public static C8625e vip(Class cls) {
        return new C8625e(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8625e)) {
            return false;
        }
        C8625e c8625e = (C8625e) obj;
        return this.ad.equals(c8625e.ad) && this.vip == c8625e.vip && this.metrica == c8625e.metrica;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.ad);
        sb.append(", type=");
        int i = this.vip;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.metrica;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(AbstractC1786e.admob(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC1786e.signatures(sb, str, "}");
    }
}
