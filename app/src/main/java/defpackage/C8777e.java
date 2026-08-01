package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8777e implements InterfaceC6502e {
    public final C0576e ad;

    public C8777e(C0576e c0576e) {
        this.ad = c0576e;
    }

    @Override // defpackage.InterfaceC6502e
    public final Object ad(InterfaceC3483e interfaceC3483e) {
        return this.ad.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8777e) && this.ad.equals(((C8777e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.ad + ')';
    }
}
