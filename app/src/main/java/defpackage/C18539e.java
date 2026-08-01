package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۨٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18539e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36370e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f36371e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f36372e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f36373e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36374e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36375e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f36376e;

    public /* synthetic */ C18539e(C4921e c4921e, boolean z, Function1 function1, InterfaceC12864e interfaceC12864e, Integer num, boolean z2, int i) {
        this.f36370e = c4921e;
        this.f36371e = z;
        this.f36376e = function1;
        this.f36372e = interfaceC12864e;
        this.f36375e = num;
        this.f36373e = z2;
    }

    public /* synthetic */ C18539e(InterfaceC12864e interfaceC12864e, boolean z, C13822e c13822e, boolean z2, Function0 function0, C2892e c2892e) {
        this.f36372e = interfaceC12864e;
        this.f36371e = z;
        this.f36370e = c13822e;
        this.f36373e = z2;
        this.f36376e = function0;
        this.f36375e = c2892e;
    }

    public /* synthetic */ C18539e(C17312e c17312e, InterfaceC12864e interfaceC12864e, C12560e c12560e, C5181e c5181e, boolean z, boolean z2, int i) {
        this.f36370e = c17312e;
        this.f36372e = interfaceC12864e;
        this.f36376e = c12560e;
        this.f36375e = c5181e;
        this.f36371e = z;
        this.f36373e = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36374e) {
            case 0:
                ((Integer) obj2).getClass();
                ((C4921e) this.f36370e).m1691strictfp(this.f36371e, (Function1) this.f36376e, this.f36372e, (Integer) this.f36375e, this.f36373e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C17312e) this.f36370e).isVip(this.f36372e, (C12560e) this.f36376e, (C5181e) this.f36375e, this.f36371e, this.f36373e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                InterfaceC17220e interfaceC17220e = (InterfaceC17220e) this.f36370e;
                Function0 function0 = (Function0) this.f36376e;
                C2892e c2892e = (C2892e) this.f36375e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC17947e.adcel(this.f36372e, this.f36371e, null, interfaceC17220e, this.f36373e, new C11796e(4), function0), 1.0f);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.appmetrica, C5438e.f11678e, c13770e, 54);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    c2892e.invoke(C0283e.ad, c13770e, 6);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
