package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۤؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6758e {
    public final String ad;
    public final int vip;

    public C6758e(String str, int i) {
        this.ad = str;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6758e)) {
            return false;
        }
        C6758e c6758e = (C6758e) obj;
        return this.ad.equals(c6758e.ad) && this.vip == c6758e.vip;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.ad);
        sb.append(", enableFirelog=true, firelogEventType=");
        return AbstractC17861e.smaato(this.vip, "}", sb);
    }
}
