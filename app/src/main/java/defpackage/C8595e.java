package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8595e extends AbstractC7255e {
    public final C11109e Signature;
    public final InterfaceC16400e admob;

    public C8595e(C11109e c11109e, InterfaceC16400e interfaceC16400e) {
        this.Signature = c11109e;
        this.admob = interfaceC16400e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8595e)) {
            return false;
        }
        C8595e c8595e = (C8595e) obj;
        return AbstractC7890e.billing(this.Signature, c8595e.Signature) && AbstractC7890e.billing(this.admob, c8595e.admob);
    }

    public final int hashCode() {
        int hashCode = this.Signature.hashCode() * 31;
        InterfaceC16400e interfaceC16400e = this.admob;
        return hashCode + (interfaceC16400e == null ? 0 : interfaceC16400e.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.Signature + ", owner=" + this.admob + ')';
    }
}
