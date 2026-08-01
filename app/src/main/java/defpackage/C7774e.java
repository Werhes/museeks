package defpackage;

import android.view.ViewStructure;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7774e extends AbstractC16858e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f15758e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f15759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7774e(int i, Object obj) {
        super(4);
        this.f15759e = i;
        this.f15758e = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.f15759e) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                ((ViewStructure) this.f15758e).setDimens(intValue, intValue2, 0, 0, ((Number) obj3).intValue() - intValue, ((Number) obj4).intValue() - intValue2);
                return Unit.INSTANCE;
            default:
                C13610e c13610e = (C13610e) obj;
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj2;
                C13770e c13770e = (C13770e) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i = (c13770e.purchase(c13610e) ? 4 : 2) | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    C2892e c2892e = (C2892e) this.f15758e;
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.appmetrica(c13770e, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    c2892e.invoke(c13610e, c13770e, Integer.valueOf(i & 14));
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
