package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٖۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16523e implements InterfaceC12391e {
    public static final C2515e Companion = new Object();
    public final long ad;
    public final String metrica;
    public final long vip;

    public /* synthetic */ C16523e(int i, long j, long j2, String str) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C13589e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = j2;
        this.metrica = str;
    }

    public C16523e(String str, long j, long j2) {
        this.ad = j;
        this.vip = j2;
        this.metrica = str;
    }

    @Override // defpackage.InterfaceC12391e
    public final long ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16523e)) {
            return false;
        }
        C16523e c16523e = (C16523e) obj;
        return this.ad == c16523e.ad && this.vip == c16523e.vip && AbstractC7890e.billing(this.metrica, c16523e.metrica);
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        return this.metrica.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(beginMs=");
        sb.append(this.ad);
        sb.append(", endMs=");
        sb.append(this.vip);
        sb.append(", text=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }

    @Override // defpackage.InterfaceC12391e
    public final long vip() {
        return this.vip;
    }
}
