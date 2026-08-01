package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17903e {
    public final C12697e ad = C12697e.purchase;
    public final String vip;

    public C17903e(String str) {
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17903e)) {
            return false;
        }
        C17903e c17903e = (C17903e) obj;
        return this.ad.equals(c17903e.ad) && this.vip.equals(c17903e.vip);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ this.vip.hashCode();
    }
}
