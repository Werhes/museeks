package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٞؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5780e {
    public C16679e ad;
    public int vip = 1;

    public final void ad() {
        InterfaceC16180e interfaceC16180e;
        if (this.vip == 1) {
            AbstractC8889e.metrica("ToolbarRequester is not initialized.");
        }
        C16679e c16679e = this.ad;
        if (c16679e == null || !c16679e.f27016e) {
            return;
        }
        C8419e c8419e = c16679e.f32722e;
        if ((c8419e == null || !c8419e.purchase()) && (interfaceC16180e = (InterfaceC16180e) AbstractC10432e.vip(c16679e, AbstractC2844e.vip)) != null) {
            c16679e.f32722e = AbstractC5336e.purchase(c16679e.m3623e(), null, 4, new C2122e(c16679e, interfaceC16180e, (InterfaceC5083e) null, 27), 1);
        }
    }
}
