package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11928e extends AbstractC10151e {
    public final C5899e ad;

    public C11928e(C5899e c5899e) {
        this.ad = c5899e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10151e)) {
            return false;
        }
        AbstractC10151e abstractC10151e = (AbstractC10151e) obj;
        Object obj2 = EnumC2348e.f5885e;
        if (obj2.equals(obj2)) {
            return this.ad.equals(((C11928e) abstractC10151e).ad);
        }
        return false;
    }

    public final int hashCode() {
        return ((EnumC2348e.f5885e.hashCode() ^ 1000003) * 1000003) ^ this.ad.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC2348e.f5885e + ", androidClientInfo=" + this.ad + "}";
    }
}
