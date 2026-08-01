package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15741e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30991e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f30992e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30993e;

    public /* synthetic */ C15741e(float f, Object obj, int i) {
        this.f30993e = i;
        this.f30992e = f;
        this.f30991e = obj;
    }

    public /* synthetic */ C15741e(Object obj, float f, int i) {
        this.f30993e = i;
        this.f30991e = obj;
        this.f30992e = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30993e) {
            case 0:
                C10122e c10122e = (C10122e) obj;
                float purchase = ((C2616e) ((C3229e) this.f30991e).purchase.startapp).purchase();
                float intBitsToFloat = Float.intBitsToFloat((int) (c10122e.f19998e & 4294967295L));
                if (!Float.isNaN(purchase) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
                    float f = this.f30992e;
                    c10122e.advert(AbstractC4229e.license(c10122e, f));
                    c10122e.smaato(AbstractC4229e.appmetrica(c10122e, f));
                    c10122e.admob(AbstractC9931e.ad(0.5f, (purchase + intBitsToFloat) / intBitsToFloat));
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC16154e interfaceC16154e = (InterfaceC16154e) this.f30991e;
                C10122e c10122e2 = (C10122e) obj;
                c10122e2.metrica(this.f30992e);
                c10122e2.loadAd(interfaceC16154e);
                c10122e2.appmetrica(true);
                return Unit.INSTANCE;
            case 2:
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) obj;
                return new C11490e((interfaceC14388e.mo493e(((C15765e) ((InterfaceC16132e) this.f30991e).getValue()).f31051e) << 32) | (interfaceC14388e.mo493e(this.f30992e) & 4294967295L));
            default:
                C13119e c13119e = (C13119e) this.f30991e;
                long longValue = ((Long) obj).longValue();
                boolean billing = c13119e.billing();
                C15867e c15867e = c13119e.billing;
                if (!billing) {
                    if (c15867e.purchase() == Long.MIN_VALUE) {
                        c15867e.startapp(longValue);
                        c13119e.ad.ad.setValue(Boolean.TRUE);
                    }
                    long purchase2 = longValue - c15867e.purchase();
                    float f2 = this.f30992e;
                    if (f2 != 0.0f) {
                        purchase2 = AbstractC1561e.purchase(purchase2 / f2);
                    }
                    if (c13119e.vip == null) {
                        c13119e.purchase.startapp(purchase2);
                    }
                    c13119e.yandex(purchase2, f2 == 0.0f);
                }
                return Unit.INSTANCE;
        }
    }
}
