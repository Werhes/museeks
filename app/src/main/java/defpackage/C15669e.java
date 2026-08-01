package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٕۗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15669e {
    public static final C15870e Companion = new Object();
    public final int ad;
    public final String metrica;
    public final long vip;

    public /* synthetic */ C15669e(int i, int i2, long j, String str) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C3879e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = j;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15669e)) {
            return false;
        }
        C15669e c15669e = (C15669e) obj;
        return this.ad == c15669e.ad && this.vip == c15669e.vip && AbstractC7890e.billing(this.metrica, c15669e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return this.metrica.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksAudioFileDto(duration=");
        sb.append(this.ad);
        sb.append(", fileSize=");
        sb.append(this.vip);
        return AbstractC8647e.ads(sb, ", url=", this.metrica, ")");
    }
}
