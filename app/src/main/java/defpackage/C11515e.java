package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11515e {
    public static final C0463e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C11515e(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C9245e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11515e)) {
            return false;
        }
        C11515e c11515e = (C11515e) obj;
        return AbstractC7890e.billing(this.ad, c11515e.ad) && AbstractC7890e.billing(this.vip, c11515e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC17861e.subscription("AudioAudioRawIdTrackedDto(id=", this.ad, ", trackCode=", this.vip, ")");
    }
}
