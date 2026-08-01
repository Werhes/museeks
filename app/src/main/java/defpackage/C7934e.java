package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7934e {
    public final String ad;
    public final String vip;

    public C7934e(String str, String str2) {
        this.ad = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7934e) {
            C7934e c7934e = (C7934e) obj;
            if (this.ad.equals(c7934e.ad) && this.vip.equals(c7934e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.ad);
        sb.append(", version=");
        return AbstractC1786e.signatures(sb, this.vip, "}");
    }
}
