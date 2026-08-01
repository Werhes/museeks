package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789e implements InterfaceC15463e {
    public final int ad;
    public final String metrica;
    public final long vip;

    public C1789e(long j, int i, String str) {
        this.ad = i;
        this.vip = j;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1789e)) {
            return false;
        }
        C1789e c1789e = (C1789e) obj;
        return this.ad == c1789e.ad && this.vip == c1789e.vip && AbstractC7890e.billing(this.metrica, c1789e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.metrica;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Created(id=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(this.vip);
        sb.append(", accessKey=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
