package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671e implements InterfaceC0040e {
    public final EnumC9702e ad;

    public C0671e(EnumC9702e enumC9702e) {
        this.ad = enumC9702e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0671e) && this.ad == ((C0671e) obj).ad;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "SetEqualizerEngine(engine=" + this.ad + ')';
    }
}
