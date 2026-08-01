package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14362e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f28393e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28394e;

    public /* synthetic */ C14362e(int i, int i2) {
        this.f28394e = i2;
        this.f28393e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f28394e;
        C5100e c5100e = AbstractC10432e.ad;
        int i2 = 24;
        C0115e c0115e = C0115e.f1276e;
        int i3 = this.f28393e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                ((Integer) obj3).getClass();
                InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e, 0.0f, 8, 1);
                C13002e c13002e = (C13002e) ((List) obj).get(i3);
                C12870e c12870e = AbstractC9672e.ad;
                InterfaceC12864e premium = AbstractC5679e.metrica(smaato, new C6599e(i2, c13002e)).premium(AbstractC18007e.vip);
                C15492e c15492e = AbstractC11785e.ad;
                AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC12447e.vip(premium, ((C7019e) c13770e.adcel(c15492e)).metrica.metrica), C3618e.vip(0.25f, ((C7019e) c13770e.adcel(c15492e)).ad.ad), c5100e), c13770e, 0);
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                InterfaceC12864e smaato2 = AbstractC12220e.smaato(c0115e, 0.0f, 8, 1);
                C13002e c13002e2 = (C13002e) ((List) obj).get(i3);
                C12870e c12870e2 = AbstractC9672e.ad;
                InterfaceC12864e premium2 = AbstractC5679e.metrica(smaato2, new C6599e(i2, c13002e2)).premium(AbstractC18007e.vip);
                C15492e c15492e2 = AbstractC11785e.ad;
                AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC12447e.vip(premium2, ((C7019e) c13770e2.adcel(c15492e2)).metrica.metrica), C3618e.vip(0.25f, ((C7019e) c13770e2.adcel(c15492e2)).ad.ad), c5100e), c13770e2, 0);
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC14489e.vip(String.valueOf(i3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AbstractC14489e.vip(String.valueOf(i3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e5.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e5.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    InterfaceC12864e smaato3 = AbstractC12220e.smaato(AbstractC12220e.adcel(c0115e, interfaceC12123e), 16, 0.0f, 2);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e5, 6);
                    long j = c13770e5.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e5.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e5, smaato3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase, C2721e.license);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e5, R.string.cdcm_wizard_fail);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e5.adcel(c15492e3)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e5.adcel(c15492e3)).vip.appmetrica, c13770e5, 0, 0, 131066);
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.cdcm_wizard_fail_text, new Object[]{String.valueOf(i3)}, c13770e5), null, ((C7019e) c13770e5.adcel(c15492e3)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e5.adcel(c15492e3)).vip.mopub, c13770e5, 0, 0, 131066);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e6 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.find_duplicates_action, new Object[]{Integer.valueOf(i3)}, c13770e6), null, 0L, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).vip.mopub, c13770e6, 1572864, 0, 131006);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e7 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.spark_payment_window_action, new Object[]{Integer.valueOf(i3), AbstractC5297e.appmetrica(c13770e7, R.string.spark_currency_rub)}, c13770e7), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e7, 0, 0, 262142);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
