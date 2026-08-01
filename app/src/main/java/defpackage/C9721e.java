package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: eٍۙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9721e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5306e f19219e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19220e;

    public /* synthetic */ C9721e(C5306e c5306e, int i) {
        this.f19220e = i;
        this.f19219e = c5306e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19220e) {
            case 0:
                int intValue = ((Number) obj).intValue();
                C4956e c4956e = (C4956e) this.f19219e.f11400e;
                InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c4956e.f10513e;
                C18277e c18277e = (C18277e) c4956e.f10517e;
                C11709e vip = AbstractC17487e.vip(interfaceC11824e, intValue);
                return vip.metrica ? (InterfaceC5052e) ((C12917e) c18277e.remoteconfig).vip.invoke(new C4712e(vip, null)) : AbstractC1284e.appmetrica((InterfaceC5334e) c18277e.vip, vip);
            case 1:
                int intValue2 = ((Number) obj).intValue();
                C4956e c4956e2 = (C4956e) this.f19219e.f11400e;
                C11709e vip2 = AbstractC17487e.vip((InterfaceC11824e) c4956e2.f10513e, intValue2);
                if (!vip2.metrica) {
                    InterfaceC4077e appmetrica = AbstractC1284e.appmetrica((InterfaceC5334e) ((C18277e) c4956e2.f10517e).vip, vip2);
                    if (appmetrica instanceof InterfaceC9794e) {
                        return (InterfaceC9794e) appmetrica;
                    }
                }
                return null;
            default:
                return AbstractC17110e.amazon((C13212e) obj, (C17221e) ((C4956e) this.f19219e.f11400e).f10515e);
        }
    }
}
