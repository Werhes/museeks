package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12578e implements InterfaceC5355e {
    public static final C4671e billing = new C4671e(6);
    public final InterfaceC8910e ad;
    public final boolean appmetrica;
    public final Function1 license;
    public final C12313e metrica;
    public final boolean purchase;
    public final C6302e vip;

    public C12578e(InterfaceC8910e interfaceC8910e, C6302e c6302e, C12313e c12313e, Function1 function1, boolean z, boolean z2) {
        this.ad = interfaceC8910e;
        this.vip = c6302e;
        this.metrica = c12313e;
        this.license = function1;
        this.appmetrica = z;
        this.purchase = z2;
    }

    @Override // defpackage.InterfaceC5355e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        C4870e c4870e = new C4870e(new C5671e(13, this), null, 23);
        return AbstractC5336e.advert(C2693e.f6576e, c4870e, (AbstractC10731e) interfaceC5083e);
    }
}
