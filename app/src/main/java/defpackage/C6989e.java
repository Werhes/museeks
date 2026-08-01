package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6989e implements InterfaceC1108e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8780e f14316e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14317e;

    public /* synthetic */ C6989e(C8780e c8780e, int i) {
        this.f14317e = i;
        this.f14316e = c8780e;
    }

    @Override // defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        switch (this.f14317e) {
            case 0:
                Object ad = this.f14316e.ad(new C7465e(interfaceC6034e, 1), interfaceC5083e);
                return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
            default:
                Object ad2 = this.f14316e.ad(new C15137e(interfaceC6034e, 28), interfaceC5083e);
                return ad2 == EnumC2821e.f6782e ? ad2 : Unit.INSTANCE;
        }
    }
}
