package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4167e {
    public final EnumC12813e ad;
    public final boolean license;
    public final int metrica;
    public final long vip;

    public C4167e(EnumC12813e enumC12813e, long j, int i, boolean z) {
        this.ad = enumC12813e;
        this.vip = j;
        this.metrica = i;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4167e)) {
            return false;
        }
        C4167e c4167e = (C4167e) obj;
        return this.ad == c4167e.ad && C2152e.vip(this.vip, c4167e.vip) && this.metrica == c4167e.metrica && this.license == c4167e.license;
    }

    public final int hashCode() {
        return AbstractC1786e.mopub(this.metrica, (C2152e.billing(this.vip) + (this.ad.hashCode() * 31)) * 31, 31) + (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.ad);
        sb.append(", position=");
        sb.append((Object) C2152e.mopub(this.vip));
        sb.append(", anchor=");
        int i = this.metrica;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        return AbstractC1786e.isVip(sb, this.license, ')');
    }
}
