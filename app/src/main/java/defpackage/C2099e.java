package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2099e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f5428e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f5429e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5430e;

    public /* synthetic */ C2099e(InterfaceC16132e interfaceC16132e, InterfaceC16132e interfaceC16132e2, int i) {
        this.f5430e = i;
        this.f5429e = interfaceC16132e;
        this.f5428e = interfaceC16132e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5430e) {
            case 0:
                C10122e c10122e = (C10122e) obj;
                c10122e.pro(c10122e.f20006e.vip() * ((C15765e) this.f5429e.getValue()).f31051e);
                c10122e.metrica(((Number) this.f5428e.getValue()).floatValue());
                return Unit.INSTANCE;
            case 1:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float mo497instanceof = interfaceC2235e.mo497instanceof(AbstractC4530e.metrica);
                InterfaceC16132e interfaceC16132e = this.f5429e;
                float f = 2;
                float f2 = mo497instanceof / f;
                AbstractC4653e.mopub(interfaceC2235e, ((C3618e) interfaceC16132e.getValue()).ad, interfaceC2235e.mo497instanceof(AbstractC7511e.ad / f) - f2, 0L, new C13121e(mo497instanceof, 0.0f, 0, 0, null, 30), 108);
                InterfaceC16132e interfaceC16132e2 = this.f5428e;
                if (C15765e.ad(((C15765e) interfaceC16132e2.getValue()).f31051e, 0) > 0) {
                    AbstractC4653e.mopub(interfaceC2235e, ((C3618e) interfaceC16132e.getValue()).ad, interfaceC2235e.mo497instanceof(((C15765e) interfaceC16132e2.getValue()).f31051e) - f2, 0L, C6590e.ad, 108);
                }
                return Unit.INSTANCE;
            default:
                C10122e c10122e2 = (C10122e) obj;
                InterfaceC16132e interfaceC16132e3 = this.f5429e;
                c10122e2.advert(((Number) interfaceC16132e3.getValue()).floatValue());
                c10122e2.smaato(((Number) interfaceC16132e3.getValue()).floatValue());
                c10122e2.metrica(((Number) this.f5428e.getValue()).floatValue());
                return Unit.INSTANCE;
        }
    }
}
