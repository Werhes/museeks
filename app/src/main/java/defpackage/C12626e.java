package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12626e {
    public static final C12626e purchase = new C12626e(false, 9205357640488583168L, 0.0f, 1, false);
    public final boolean ad;
    public final boolean appmetrica;
    public final int license;
    public final float metrica;
    public final long vip;

    public C12626e(boolean z, long j, float f, int i, boolean z2) {
        this.ad = z;
        this.vip = j;
        this.metrica = f;
        this.license = i;
        this.appmetrica = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12626e)) {
            return false;
        }
        C12626e c12626e = (C12626e) obj;
        return this.ad == c12626e.ad && C2152e.vip(this.vip, c12626e.vip) && Float.compare(this.metrica, c12626e.metrica) == 0 && this.license == c12626e.license && this.appmetrica == c12626e.appmetrica;
    }

    public final int hashCode() {
        return AbstractC1786e.mopub(this.license, AbstractC1414e.license((C2152e.billing(this.vip) + ((this.ad ? 1231 : 1237) * 31)) * 31, this.metrica, 31), 31) + (this.appmetrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.ad);
        sb.append(", position=");
        sb.append((Object) C2152e.mopub(this.vip));
        sb.append(", lineHeight=");
        sb.append(this.metrica);
        sb.append(", direction=");
        sb.append(AbstractC0054e.m227while(this.license));
        sb.append(", handlesCrossed=");
        return AbstractC1786e.isVip(sb, this.appmetrica, ')');
    }
}
