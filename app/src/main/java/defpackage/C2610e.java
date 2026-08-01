package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٕؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2610e {
    public static final C15616e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C14582e(18))};
    public final EnumC6664e ad;

    public /* synthetic */ C2610e(int i, EnumC6664e enumC6664e) {
        if (1 == (i & 1)) {
            this.ad = enumC6664e;
        } else {
            AbstractC5756e.billing(i, 1, C9281e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2610e) && this.ad == ((C2610e) obj).ad;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "BaseResultDto(result=" + this.ad + ")";
    }
}
