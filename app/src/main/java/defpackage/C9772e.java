package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9772e implements InterfaceC12836e {
    public final C8988e ad;

    public C9772e(C8988e c8988e) {
        this.ad = c8988e;
    }

    @Override // defpackage.InterfaceC12836e
    public final boolean ad(Exception exc) {
        return false;
    }

    @Override // defpackage.InterfaceC12836e
    public final boolean vip(C0100e c0100e) {
        int i = c0100e.vip;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.ad.license(c0100e.ad);
        return true;
    }
}
