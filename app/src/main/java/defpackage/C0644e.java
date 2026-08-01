package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644e implements InterfaceC5353e {
    public static final C13449e Companion = new Object();
    public final long ad;
    public final long metrica;
    public final long vip;

    public /* synthetic */ C0644e(int i, long j, long j2, long j3) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C0761e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
    }

    public C0644e(long j, long j2, long j3) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0644e)) {
            return false;
        }
        C0644e c0644e = (C0644e) obj;
        return this.ad == c0644e.ad && this.vip == c0644e.vip && this.metrica == c0644e.metrica;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.metrica;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FailNotEnoughStorage(total=");
        sb.append(this.ad);
        sb.append(", free=");
        sb.append(this.vip);
        sb.append(", required=");
        return AbstractC10257e.mopub(sb, this.metrica, ')');
    }
}
