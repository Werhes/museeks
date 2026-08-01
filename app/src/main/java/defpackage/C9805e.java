package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۠ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9805e implements InterfaceC18116e {
    public final InterfaceC18116e ad;
    public final Object vip;

    public C9805e(InterfaceC18116e interfaceC18116e, Object obj) {
        this.ad = interfaceC18116e;
        AbstractC9835e.advert(obj, "log site qualifier");
        this.vip = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9805e)) {
            return false;
        }
        C9805e c9805e = (C9805e) obj;
        return this.ad.equals(c9805e.ad) && this.vip.equals(c9805e.vip);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ this.vip.hashCode();
    }

    public final String toString() {
        String obj = this.ad.toString();
        int length = obj.length();
        String obj2 = this.vip.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        AbstractC13501e.Signature(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
