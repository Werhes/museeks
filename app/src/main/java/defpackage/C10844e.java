package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10844e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f21478e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f21479e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f21480e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21481e = 0;

    public /* synthetic */ C10844e(C15052e c15052e, int i, InterfaceC3314e interfaceC3314e) {
        this.f21478e = c15052e;
        this.f21479e = i;
        this.f21480e = interfaceC3314e;
    }

    public /* synthetic */ C10844e(String str, int i, String str2) {
        this.f21478e = str;
        this.f21480e = str2;
        this.f21479e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f21481e) {
            case 0:
                C15052e c15052e = (C15052e) this.f21478e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f21480e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    boolean yandex = c13770e.yandex(c15052e);
                    int i = this.f21479e;
                    boolean license = yandex | c13770e.license(AbstractC8703e.m2467class(i)) | c13770e.purchase(interfaceC16132e);
                    Object m3681throw = c13770e.m3681throw();
                    if (license || m3681throw == C2987e.ad) {
                        m3681throw = new C16202e(c15052e, i, interfaceC16132e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw, c13770e, (intValue << 6) & 896, 507);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                String str = (String) this.f21478e;
                String str2 = (String) this.f21480e;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f = 16;
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, f);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e2, 54);
                    long j = c13770e2.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_article_outline_28, 0, c13770e2);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC5647e.vip(metrica, null, null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, c13770e2, 56, 4);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (m3681throw2 == C2987e.ad) {
                        m3681throw2 = "8.12.1_pub (99167) -> " + str2 + " (" + this.f21479e + ')';
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC14489e.vip((String) m3681throw2, null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.mopub, c13770e2, 6, 0, 131066);
                    c13770e2.Signature(true);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e2, 0, 7);
                    AbstractC14489e.vip(str, AbstractC5967e.purchase(AbstractC12220e.mopub(c0115e, f), AbstractC5967e.appmetrica(c13770e2), true), ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.mopub, c13770e2, 0, 0, 131064);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
