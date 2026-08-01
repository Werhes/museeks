package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9081e {
    public final AbstractC16049e ad;
    public final EnumC13413e vip;

    public C9081e(AbstractC16049e abstractC16049e, EnumC13413e enumC13413e) {
        this.ad = abstractC16049e;
        this.vip = enumC13413e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9081e)) {
            return false;
        }
        C9081e c9081e = (C9081e) obj;
        return AbstractC7890e.billing(this.ad, c9081e.ad) && this.vip == c9081e.vip;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        EnumC13413e enumC13413e = this.vip;
        return hashCode + (enumC13413e == null ? 0 : enumC13413e.hashCode());
    }

    public final String toString() {
        return "TrackWithProvider(track=" + this.ad + ", provider=" + this.vip + ')';
    }
}
