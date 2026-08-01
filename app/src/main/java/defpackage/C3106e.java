package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؕؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3106e implements InterfaceC5353e {
    public static final C6142e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C13630e(4))};
    public final EnumC11407e ad;

    public /* synthetic */ C3106e(int i, EnumC11407e enumC11407e) {
        if (1 == (i & 1)) {
            this.ad = enumC11407e;
        } else {
            AbstractC5756e.billing(i, 1, C7817e.ad.appmetrica());
            throw null;
        }
    }

    public C3106e(EnumC11407e enumC11407e) {
        this.ad = enumC11407e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3106e) && this.ad == ((C3106e) obj).ad;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "TransferFinished(result=" + this.ad + ')';
    }
}
