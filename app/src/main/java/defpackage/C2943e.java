package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔۢۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2943e {
    public static final C11097e Companion = new Object();
    public final String ad;
    public final int license;
    public final int metrica;
    public final int vip;

    public /* synthetic */ C2943e(String str, int i, int i2, int i3, int i4) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C2294e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = 0;
        } else {
            this.vip = i2;
        }
        if ((i & 4) == 0) {
            this.metrica = 0;
        } else {
            this.metrica = i3;
        }
        if ((i & 8) == 0) {
            this.license = (this.metrica - this.vip) / 1000;
        } else {
            this.license = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2943e)) {
            return false;
        }
        C2943e c2943e = (C2943e) obj;
        return AbstractC7890e.billing(this.ad, c2943e.ad) && this.vip == c2943e.vip && this.metrica == c2943e.metrica;
    }

    public final int hashCode() {
        return (((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        return AbstractC17861e.smaato(this.metrica, ")", AbstractC10257e.smaato("AudioGetAudioPreviewUrlResponseDto(url=", this.ad, ", clipFrom=", this.vip, ", clipTo="));
    }
}
