package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0492e {
    public final C4089e ad;
    public final C17268e vip;

    public C0492e(C4089e c4089e, C17268e c17268e) {
        this.ad = c4089e;
        if (c17268e == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.vip = c17268e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0492e)) {
            return false;
        }
        C0492e c0492e = (C0492e) obj;
        return this.ad.equals(c0492e.ad) && this.vip.equals(c0492e.vip);
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        String abstractC15319e = this.ad.toString();
        int length = abstractC15319e.length();
        String obj = this.vip.toString();
        StringBuilder sb = new StringBuilder(length + 53 + obj.length() + 1);
        AbstractC13501e.Signature(sb, "ProtoSerializer{defaultValue=", abstractC15319e, ", extensionRegistryLite=", obj);
        sb.append("}");
        return sb.toString();
    }
}
