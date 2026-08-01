package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884e {
    public static final C16913e Companion = new Object();
    public final int ad;
    public final String license;
    public final int metrica;
    public final String vip;

    public /* synthetic */ C0884e(int i, int i2, int i3, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C12349e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        this.metrica = i3;
        this.license = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0884e)) {
            return false;
        }
        C0884e c0884e = (C0884e) obj;
        return this.ad == c0884e.ad && AbstractC7890e.billing(this.vip, c0884e.vip) && this.metrica == c0884e.metrica && AbstractC7890e.billing(this.license, c0884e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((AbstractC1786e.advert(this.ad * 31, 31, this.vip) + this.metrica) * 31);
    }

    public final String toString() {
        return "EcosystemSendOtpResponseDto(status=" + this.ad + ", sid=" + this.vip + ", codeLength=" + this.metrica + ", info=" + this.license + ")";
    }
}
