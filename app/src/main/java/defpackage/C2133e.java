package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2133e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f5509e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f5510e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5511e;

    public /* synthetic */ C2133e(InterfaceC12864e interfaceC12864e, int i) {
        this.f5511e = 1;
        this.f5510e = interfaceC12864e;
        this.f5509e = i;
    }

    public /* synthetic */ C2133e(InterfaceC12864e interfaceC12864e, int i, int i2, int i3) {
        this.f5511e = i3;
        this.f5510e = interfaceC12864e;
        this.f5509e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5511e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC5805e.vip(AbstractC5190e.advert(1), this.f5509e, c13770e, this.f5510e);
                return Unit.INSTANCE;
            case 1:
                AbstractC17074e.ad(this.f5510e, c13770e, AbstractC5190e.advert(this.f5509e | 1));
                return Unit.INSTANCE;
            case 2:
                AbstractC14942e.license(AbstractC5190e.advert(1), this.f5509e, c13770e, this.f5510e);
                return Unit.INSTANCE;
            default:
                AbstractC14942e.metrica(AbstractC5190e.advert(1), this.f5509e, c13770e, this.f5510e);
                return Unit.INSTANCE;
        }
    }
}
