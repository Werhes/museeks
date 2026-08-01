package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17859e {
    public static final C10807e Companion = new Object();
    public final int ad;
    public final String vip;

    public /* synthetic */ C17859e(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C16652e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17859e)) {
            return false;
        }
        C17859e c17859e = (C17859e) obj;
        return this.ad == c17859e.ad && AbstractC7890e.billing(this.vip, c17859e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        return "AudioGenreDto(id=" + this.ad + ", name=" + this.vip + ")";
    }
}
