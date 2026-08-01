package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۡ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16569e implements InterfaceC6448e {
    public final InterfaceC8910e ad;
    public final int metrica;
    public final String vip;

    public C16569e(InterfaceC8910e interfaceC8910e, String str, int i) {
        this.ad = interfaceC8910e;
        this.vip = str;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16569e)) {
            return false;
        }
        C16569e c16569e = (C16569e) obj;
        return AbstractC7890e.billing(this.ad, c16569e.ad) && AbstractC7890e.billing(this.vip, c16569e.vip) && this.metrica == c16569e.metrica;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return AbstractC8703e.m2467class(this.metrica) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.ad + ", mimeType=" + this.vip + ", dataSource=" + AbstractC13501e.premium(this.metrica) + ")";
    }
}
