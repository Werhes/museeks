package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6947e {
    public final InterfaceC18069e ad;
    public final C0272e vip;

    public C6947e(InterfaceC18069e interfaceC18069e, C0272e c0272e) {
        this.ad = interfaceC18069e;
        this.vip = c0272e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6947e)) {
            return false;
        }
        C6947e c6947e = (C6947e) obj;
        return AbstractC7890e.billing(this.ad, c6947e.ad) && AbstractC7890e.billing(this.vip, c6947e.vip);
    }

    public final int hashCode() {
        InterfaceC18069e interfaceC18069e = this.ad;
        int hashCode = (interfaceC18069e == null ? 0 : interfaceC18069e.hashCode()) * 31;
        C0272e c0272e = this.vip;
        return hashCode + (c0272e != null ? c0272e.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.ad + ", androidCameraState=" + this.vip + ')';
    }
}
