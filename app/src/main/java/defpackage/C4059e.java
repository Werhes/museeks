package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4059e {
    public static final C17125e Companion = new Object();
    public final int ad;
    public final int metrica;
    public final String vip;

    public /* synthetic */ C4059e(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C16030e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        this.metrica = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4059e)) {
            return false;
        }
        C4059e c4059e = (C4059e) obj;
        return this.ad == c4059e.ad && AbstractC7890e.billing(this.vip, c4059e.vip) && this.metrica == c4059e.metrica;
    }

    public final int hashCode() {
        return AbstractC1786e.advert(this.ad * 31, 31, this.vip) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksImageDto(height=");
        sb.append(this.ad);
        sb.append(", url=");
        sb.append(this.vip);
        sb.append(", width=");
        return AbstractC17861e.smaato(this.metrica, ")", sb);
    }
}
