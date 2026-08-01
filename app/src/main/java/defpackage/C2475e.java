package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2475e implements InterfaceC5222e {
    public final /* synthetic */ C6530e ad;

    public C2475e(C6530e c6530e) {
        this.ad = c6530e;
    }

    @Override // defpackage.InterfaceC5222e
    public final void ad(C9412e c9412e) {
        double max = Math.max(0.0d, c9412e.license.ad);
        C6530e c6530e = this.ad;
        c6530e.f13456e = (float) max;
        c6530e.vip();
        if (max <= 0.0d) {
            c9412e.ad();
            c6530e.f13448e = false;
            c6530e.f13450e = false;
            c6530e.f13454e = false;
        }
    }
}
