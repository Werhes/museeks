package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3235e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3409e f7362e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12604e f7363e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7364e;

    public /* synthetic */ C3235e(C12604e c12604e, C3409e c3409e, int i) {
        this.f7364e = i;
        this.f7363e = c12604e;
        this.f7362e = c3409e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7364e;
        C0115e c0115e = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        C3409e c3409e = this.f7362e;
        C12604e c12604e = this.f7363e;
        switch (i) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC12220e.adcel(c0115e, interfaceC12123e), 16, 0.0f, 2);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e, 6);
                    long j = c13770e.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.cdcm_wizard_err_space);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 0, 0, 131066);
                    long j2 = c12604e.metrica;
                    long j3 = c12604e.ad;
                    boolean appmetrica2 = c13770e.appmetrica(j2) | c13770e.appmetrica(j3);
                    Object m3681throw = c13770e.m3681throw();
                    if (appmetrica2 || m3681throw == c5170e) {
                        Context context = c3409e.f27451e;
                        long j4 = c12604e.metrica - j3;
                        if (j4 < 0) {
                            j4 = 0;
                        }
                        m3681throw = Formatter.formatFileSize(context, j4);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.cdcm_wizard_err_space_on_receiver, new Object[]{(String) m3681throw}, c13770e), null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 0, 0, 131066);
                    AbstractC0865e.metrica(AbstractC18007e.metrica(c0115e, 1.0f), null, AbstractC12322e.vip(((C7019e) c13770e.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e, 0, 14), null, null, AbstractC16653e.license(1542088476, new C3235e(c12604e, c3409e, 1), c13770e), c13770e, 196614, 26);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boolean z = (intValue2 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e2.ad;
                if (c13770e2.m3673protected(intValue2 & 1, z)) {
                    float f = 16;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, f);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e2, 6);
                    long j5 = c13770e2.f27286case;
                    int i3 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e2, ad2, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
                    Integer valueOf = Integer.valueOf(i3);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e2, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
                    C5363e c5363e = AbstractC16696e.ad;
                    String appmetrica3 = AbstractC5297e.appmetrica(c13770e2, AbstractC16268e.purchase().license());
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica3, null, ((C7019e) c13770e2.adcel(c15492e2)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e2)).vip.appmetrica, c13770e2, 0, 0, 131066);
                    boolean purchase3 = c13770e2.purchase(c12604e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (purchase3 || m3681throw2 == c5170e) {
                        m3681throw2 = new C10479e(1, c12604e);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC3991e.ad((Function0) m3681throw2, AbstractC18007e.metrica(c0115e, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, c13770e2, 48);
                    C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e2, 48);
                    long j6 = c13770e2.f27286case;
                    int i4 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert3 = c13770e2.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, c0115e);
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad3, c14865e);
                    AbstractC2270e.yandex(c13770e2, advert3, c14865e2);
                    AbstractC8703e.premium(i4, c13770e2, c14865e3, c13770e2, c5430e);
                    AbstractC2270e.yandex(c13770e2, purchase4, c14865e4);
                    long j7 = c12604e.ad;
                    long j8 = c12604e.vip;
                    boolean appmetrica4 = c13770e2.appmetrica(j7) | c13770e2.appmetrica(j8);
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (appmetrica4 || m3681throw3 == c5170e) {
                        Context context2 = c3409e.f27451e;
                        long j9 = j8 - c12604e.ad;
                        if (j9 < 0) {
                            j9 = 0;
                        }
                        m3681throw3 = Formatter.formatFileSize(context2, j9);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    AbstractC14489e.vip((String) m3681throw3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e2)).vip.amazon, c13770e2, 0, 0, 131070);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC17074e.ad(new C5228e(1.0f, true), c13770e2, 0);
                    boolean appmetrica5 = c13770e2.appmetrica(j8);
                    Object m3681throw4 = c13770e2.m3681throw();
                    if (appmetrica5 || m3681throw4 == c5170e) {
                        m3681throw4 = Formatter.formatFileSize(c3409e.f27451e, j8);
                        c13770e2.m3682throws(m3681throw4);
                    }
                    AbstractC14489e.vip((String) m3681throw4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e2)).vip.amazon, c13770e2, 0, 0, 131070);
                    c13770e2.Signature(true);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
