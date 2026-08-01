package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180e {
    public final InterfaceC6545e ad;
    public final C3895e metrica;
    public final C10379e vip;

    public C0180e(InterfaceC6545e interfaceC6545e, C10379e c10379e, C3895e c3895e) {
        this.ad = interfaceC6545e;
        this.vip = c10379e;
        this.metrica = c3895e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0180e)) {
            return false;
        }
        C0180e c0180e = (C0180e) obj;
        return AbstractC7890e.billing(this.ad, c0180e.ad) && AbstractC7890e.billing(this.vip, c0180e.vip) && AbstractC7890e.billing(this.metrica, c0180e.metrica);
    }

    public final int hashCode() {
        int hashCode = (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
        C3895e c3895e = this.metrica;
        return hashCode + (c3895e == null ? 0 : c3895e.hashCode());
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.ad + ", processor=" + this.vip + ", captureSequenceProcessor=" + this.metrica + ')';
    }
}
