package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14448e implements InterfaceC6502e {
    public final Object ad;

    public C14448e(Object obj) {
        this.ad = obj;
    }

    @Override // defpackage.InterfaceC6502e
    public final Object ad(InterfaceC3483e interfaceC3483e) {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14448e) && AbstractC7890e.billing(this.ad, ((C14448e) obj).ad);
    }

    public final int hashCode() {
        Object obj = this.ad;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.ad + ')';
    }
}
