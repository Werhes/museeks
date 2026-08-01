package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12095e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14452e f24239e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24240e;

    public /* synthetic */ C12095e(C14452e c14452e, int i) {
        this.f24240e = i;
        this.f24239e = c14452e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24240e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C14452e c14452e = this.f24239e;
                    if (c14452e.m3801package() == EnumC1143e.f3721e) {
                        c13770e.m3676strictfp(-1728547636);
                        InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                        InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                        long j = c13770e.f27286case;
                        int i = (int) (j ^ (j >>> 32));
                        InterfaceC3483e advert = c13770e.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, adcel);
                        InterfaceC5685e.mopub.getClass();
                        Function0 function0 = C2721e.vip;
                        c13770e.m3666import();
                        if (c13770e.f27292implements) {
                            c13770e.mopub(function0);
                        } else {
                            c13770e.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                        AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                        AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                        AbstractC6232e.vip(C14486e.ad.ad(C0115e.f1276e, C5438e.f11700e), 0L, null, c13770e, 0, 6);
                        c13770e.Signature(true);
                        c13770e.Signature(false);
                    } else {
                        c13770e.m3676strictfp(-1728211844);
                        C13964e billing = AbstractC16497e.billing(8);
                        boolean yandex = c13770e.yandex(c14452e);
                        Object m3681throw = c13770e.m3681throw();
                        if (yandex || m3681throw == C2987e.ad) {
                            m3681throw = new C0609e(23, c14452e);
                            c13770e.m3682throws(m3681throw);
                        }
                        AbstractC7023e.ad(null, null, interfaceC12123e, billing, null, null, false, null, (Function1) m3681throw, c13770e, ((intValue << 6) & 896) | 24576, 491);
                        c13770e.Signature(false);
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e2, this.f24239e.m3801package() == EnumC1143e.f3718e ? R.string.cdcm_wizard_prereq_permissions_text_gms : R.string.cdcm_wizard_prereq_permissions_text);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.mopub, c13770e2, 48, 0, 131064);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
