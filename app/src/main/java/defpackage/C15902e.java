package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15902e extends AbstractC12314e {
    public final InterfaceC18069e ad;

    public C15902e(InterfaceC18069e interfaceC18069e) {
        this.ad = interfaceC18069e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15902e) && AbstractC7890e.billing(this.ad, ((C15902e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.ad + ')';
    }
}
