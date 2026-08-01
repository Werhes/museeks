package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3631e extends AbstractC16858e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15533e f8175e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f8176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3631e(C15533e c15533e, int i) {
        super(2);
        this.f8176e = i;
        this.f8175e = c15533e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8176e) {
            case 0:
                this.f8175e.ad().f19774e = (AbstractC5830e) obj2;
                return Unit.INSTANCE;
            case 1:
                C10014e ad = this.f8175e.ad();
                ((C13915e) obj).m3719return(new C15222e(ad, (Function2) obj2, ad.f19776e));
                return Unit.INSTANCE;
            default:
                C13915e c13915e = (C13915e) obj;
                C15533e c15533e = this.f8175e;
                InterfaceC10864e interfaceC10864e = c15533e.ad;
                C10014e c10014e = c13915e.f27609e;
                if (c10014e == null) {
                    c10014e = new C10014e(c13915e, interfaceC10864e);
                    c13915e.f27609e = c10014e;
                }
                c15533e.vip = c10014e;
                c15533e.ad().yandex();
                C10014e ad2 = c15533e.ad();
                if (ad2.f19771e != interfaceC10864e) {
                    ad2.f19771e = interfaceC10864e;
                    ad2.adcel(false);
                    C13915e.m3699strictfp(ad2.f19781e, false, 7);
                }
                return Unit.INSTANCE;
        }
    }
}
