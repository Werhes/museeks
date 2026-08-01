package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1744e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f4744e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f4745e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4746e = 0;

    public /* synthetic */ C1744e(List list, Function1 function1) {
        this.f4745e = list;
        this.f4744e = function1;
    }

    public /* synthetic */ C1744e(List list, Function1 function1, int i) {
        this.f4745e = list;
        this.f4744e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4746e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    for (Catalog2ReplacementOption catalog2ReplacementOption : this.f4745e) {
                        Integer num = catalog2ReplacementOption.license;
                        boolean z = num != null && num.intValue() == 1;
                        boolean purchase = c13770e.purchase(catalog2ReplacementOption);
                        Object obj3 = this.f4744e;
                        boolean purchase2 = purchase | c13770e.purchase(obj3);
                        Object m3681throw = c13770e.m3681throw();
                        if (purchase2 || m3681throw == C2987e.ad) {
                            m3681throw = new C5565e(catalog2ReplacementOption, obj3, 20);
                            c13770e.m3682throws(m3681throw);
                        }
                        C2892e license = AbstractC16653e.license(1091708555, new C3450e(15, catalog2ReplacementOption), c13770e);
                        AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                        AbstractC12843e.vip(z, (Function0) m3681throw, null, false, license, ((C7019e) c13770e.adcel(abstractC4455e)).ad.ad, ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob, c13770e, 24576);
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC1574e.ad(this.f4745e, this.f4744e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
