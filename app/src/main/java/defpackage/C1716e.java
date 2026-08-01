package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَؘؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716e {
    public static final C6495e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {AbstractC18039e.appmetrica(2, new C14561e(16)), AbstractC18039e.appmetrica(2, new C14561e(17))};
    public final EnumC6983e ad;
    public final EnumC0422e vip;

    public /* synthetic */ C1716e(int i, EnumC6983e enumC6983e, EnumC0422e enumC0422e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C1575e.ad.appmetrica());
            throw null;
        }
        this.ad = enumC6983e;
        this.vip = enumC0422e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1716e)) {
            return false;
        }
        C1716e c1716e = (C1716e) obj;
        return this.ad == c1716e.ad && this.vip == c1716e.vip;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "AudioPlaylistActionDto(type=" + this.ad + ", location=" + this.vip + ")";
    }
}
