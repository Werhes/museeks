package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13764e implements InterfaceC5495e {
    public final /* synthetic */ C13713e ad;

    public C13764e(C13713e c13713e) {
        this.ad = c13713e;
    }

    @Override // defpackage.InterfaceC5495e
    public final int ad() {
        C13713e c13713e = this.ad;
        return (int) (c13713e.billing().signatures == EnumC17426e.f34146e ? c13713e.billing().amazon & 4294967295L : c13713e.billing().amazon >> 32);
    }

    @Override // defpackage.InterfaceC5495e
    public final float appmetrica() {
        C13713e c13713e = this.ad;
        int purchase = ((C16330e) c13713e.metrica.f5739e).purchase();
        int purchase2 = ((C16330e) c13713e.metrica.f5733e).purchase();
        return c13713e.license() ? (purchase * 500) + purchase2 + 100 : (purchase * 500) + purchase2;
    }

    @Override // defpackage.InterfaceC5495e
    public final int license() {
        C13713e c13713e = this.ad;
        return c13713e.billing().admob + c13713e.billing().subscription;
    }

    @Override // defpackage.InterfaceC5495e
    public final Object metrica(int i, C11143e c11143e) {
        C11883e c11883e = C13713e.inmobi;
        C13713e c13713e = this.ad;
        c13713e.getClass();
        Object vip = c13713e.vip(EnumC6955e.f14256e, new C16600e(c13713e, i, null, 15), c11143e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (vip != enumC2821e) {
            vip = Unit.INSTANCE;
        }
        return vip == enumC2821e ? vip : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5495e
    public final C6517e purchase() {
        return new C6517e(-1, -1);
    }

    @Override // defpackage.InterfaceC5495e
    public final float vip() {
        C13713e c13713e = this.ad;
        return (((C16330e) c13713e.metrica.f5739e).purchase() * 500) + ((C16330e) c13713e.metrica.f5733e).purchase();
    }
}
