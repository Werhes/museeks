package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13581e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f26928e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f26929e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f26930e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26931e = 0;

    public /* synthetic */ C13581e(long j, int i, Function2 function2, int i2) {
        this.f26929e = j;
        this.f26928e = i;
        this.f26930e = function2;
    }

    public /* synthetic */ C13581e(long j, InterfaceC12864e interfaceC12864e, int i) {
        this.f26929e = j;
        this.f26930e = interfaceC12864e;
        this.f26928e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26931e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(49);
                AbstractC16429e.metrica(this.f26929e, this.f26928e, (Function2) this.f26930e, (C13770e) obj, advert);
                return Unit.INSTANCE;
            default:
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f26930e;
                ((Integer) obj2).getClass();
                AbstractC14942e.vip(AbstractC5190e.advert(this.f26928e | 1), this.f26929e, (C13770e) obj, interfaceC12864e);
                return Unit.INSTANCE;
        }
    }
}
