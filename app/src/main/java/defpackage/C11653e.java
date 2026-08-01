package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11653e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f23409e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f23410e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f23411e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23412e;

    public /* synthetic */ C11653e(int i, long j, Object obj, Object obj2) {
        this.f23412e = i;
        this.f23410e = j;
        this.f23409e = obj;
        this.f23411e = obj2;
    }

    public /* synthetic */ C11653e(long j, C1839e c1839e, C2892e c2892e) {
        this.f23412e = 1;
        float f = AbstractC17375e.ad;
        float f2 = AbstractC17375e.ad;
        this.f23410e = j;
        this.f23409e = c1839e;
        this.f23411e = c2892e;
    }

    public /* synthetic */ C11653e(C2743e c2743e, InterfaceC12864e interfaceC12864e, long j, int i) {
        this.f23412e = 5;
        this.f23409e = c2743e;
        this.f23411e = interfaceC12864e;
        this.f23410e = j;
    }

    public /* synthetic */ C11653e(Object obj, long j, Object obj2, int i, int i2) {
        this.f23412e = i2;
        this.f23409e = obj;
        this.f23410e = j;
        this.f23411e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23412e;
        int i2 = 1;
        Object obj3 = this.f23411e;
        Object obj4 = this.f23409e;
        switch (i) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj4;
                Function3 function3 = (Function3) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC5750e.ad(this.f23410e, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.smaato, AbstractC16653e.license(417635459, new C18170e(interfaceC12123e, function3, i2), c13770e), c13770e, 384);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C1839e c1839e = (C1839e) obj4;
                float f = AbstractC17375e.ad;
                float f2 = AbstractC17375e.ad;
                C2892e c2892e = (C2892e) obj3;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(1 & intValue2, (intValue2 & 3) != 2)) {
                    AbstractC5750e.ad(this.f23410e, c1839e, AbstractC16653e.license(-1767363041, new C7099e(c2892e), c13770e2), c13770e2, 384);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC3420e.ad((C8933e) obj4, this.f23410e, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
            case 3:
                C18362e c18362e = (C18362e) obj4;
                String str = (String) obj3;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C3134e purchase = AbstractC10244e.purchase(this.f23410e, 0L, c13770e3, 13);
                    boolean purchase2 = c13770e3.purchase(c18362e);
                    Object m3681throw = c13770e3.m3681throw();
                    if (purchase2 || m3681throw == C2987e.ad) {
                        m3681throw = new C16390e(c18362e, 1);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC1513e.license((Function0) m3681throw, null, false, null, purchase, null, AbstractC16653e.license(521110564, new C7542e(str, 4), c13770e3), c13770e3, 805306368, 494);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C16869e) obj4).m4204strictfp(this.f23410e, (String) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C2743e) obj4).m1195strictfp(AbstractC5190e.advert(3073), this.f23410e, (C13770e) obj, (InterfaceC12864e) obj3);
                return Unit.INSTANCE;
        }
    }
}
