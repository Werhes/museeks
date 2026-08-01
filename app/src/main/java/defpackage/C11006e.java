package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11006e {
    public int ad;
    public int license;
    public Object metrica;
    public int vip;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C11006e)) {
                return false;
            }
            C11006e c11006e = (C11006e) obj;
            int i = this.ad;
            if (i != c11006e.ad) {
                return false;
            }
            if (i != 8 || Math.abs(this.license - this.vip) != 1 || this.license != c11006e.vip || this.vip != c11006e.license) {
                if (this.license != c11006e.license || this.vip != c11006e.vip) {
                    return false;
                }
                Object obj2 = this.metrica;
                if (obj2 != null) {
                    if (!obj2.equals(c11006e.metrica)) {
                        return false;
                    }
                } else if (c11006e.metrica != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.ad * 31) + this.vip) * 31) + this.license;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.ad;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.vip);
        sb.append("c:");
        sb.append(this.license);
        sb.append(",p:");
        sb.append(this.metrica);
        sb.append("]");
        return sb.toString();
    }
}
