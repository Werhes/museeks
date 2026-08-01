package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17729e implements InterfaceC10940e {
    public static final C0630e Companion = new Object();
    public final int ad;
    public final String metrica;
    public final long vip;

    public /* synthetic */ C17729e(int i, int i2, long j, String str) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C9525e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = j;
        this.metrica = str;
    }

    public C17729e(long j, int i, String str) {
        this.ad = i;
        this.vip = j;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17729e)) {
            return false;
        }
        C17729e c17729e = (C17729e) obj;
        return this.ad == c17729e.ad && this.vip == c17729e.vip && AbstractC7890e.billing(this.metrica, c17729e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return this.metrica.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(id=");
        sb.append(this.ad);
        sb.append(", owner=");
        sb.append(this.vip);
        sb.append(", name=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
