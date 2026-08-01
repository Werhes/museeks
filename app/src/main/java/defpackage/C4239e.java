package defpackage;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4239e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C17399e f9310e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5926e f9311e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9312e = 1;

    public C4239e(C5926e c5926e, C17399e c17399e) {
        this.f9311e = c5926e;
        this.f9310e = c17399e;
    }

    public C4239e(C17399e c17399e, C5926e c5926e) {
        this.f9310e = c17399e;
        this.f9311e = c5926e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C17399e c17399e;
        boolean purchase;
        Object m3681throw;
        boolean purchase2;
        Object m3681throw2;
        DateTimeFormatter dateTimeFormatter;
        C5471e metrica;
        int i = this.f9312e;
        C17399e c17399e2 = this.f9310e;
        C5926e c5926e = this.f9311e;
        Object obj5 = C2987e.ad;
        int i2 = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    Boolean bool = (Boolean) c17399e2.f34109e.get(c5926e.metrica);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    boolean yandex = c13770e.yandex(c17399e2) | c13770e.yandex(c5926e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex || m3681throw3 == obj5) {
                        m3681throw3 = new C17874e(c17399e2, c5926e, 8);
                        c13770e.m3682throws(m3681throw3);
                    }
                    AbstractC2705e.ad(booleanValue, (Function1) m3681throw3, null, false, null, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Number) obj3).intValue();
                boolean z = (intValue2 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e2.ad;
                if (c13770e2.m3673protected(intValue2 & 1, z)) {
                    C9616e c9616e = AbstractC16497e.metrica;
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad = AbstractC14801e.ad(c9616e, c9577e, c13770e2, 0);
                    long j = c13770e2.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e2, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e2, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i3);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e2, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
                    float f = 16;
                    C17399e c17399e3 = c17399e2;
                    Object obj6 = obj5;
                    AbstractC6401e.vip(AbstractC16653e.license(-720555422, new C3715e(c5926e, i2), c13770e2), AbstractC16653e.license(-744246271, new C3715e(c5926e, 1), c13770e2), AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), f), AbstractC16653e.license(-791627969, new C4239e(c17399e2, c5926e), c13770e2), c13770e2, 3510, 0);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e2, 0, 7);
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, f);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(4), c9577e, c13770e2, 6);
                    long j2 = c13770e2.f27286case;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, mopub);
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
                    AbstractC8703e.premium(i4, c13770e2, c14865e3, c13770e2, c5430e);
                    AbstractC2270e.yandex(c13770e2, purchase4, c14865e4);
                    c13770e2.m3676strictfp(-608180111);
                    Iterator it = c5926e.vip.iterator();
                    while (it.hasNext()) {
                        C3637e c3637e = (C3637e) it.next();
                        boolean license = c13770e2.license(c3637e.metrica);
                        Object m3681throw4 = c13770e2.m3681throw();
                        try {
                            if (license) {
                                obj4 = obj6;
                            } else {
                                obj4 = obj6;
                                if (m3681throw4 != obj4) {
                                    c17399e = c17399e3;
                                    String Signature = AbstractC17861e.Signature("- ", (String) m3681throw4);
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                                    InterfaceC17220e interfaceC17220e = (InterfaceC17220e) c13770e2.adcel(AbstractC10746e.ad);
                                    purchase = c13770e2.purchase(c3637e) | c13770e2.yandex(c17399e);
                                    m3681throw = c13770e2.m3681throw();
                                    if (!purchase || m3681throw == obj4) {
                                        m3681throw = new C12056e(c3637e, c17399e, 17);
                                        c13770e2.m3682throws(m3681throw);
                                    }
                                    Function0 function0 = (Function0) m3681throw;
                                    purchase2 = c13770e2.purchase(c3637e);
                                    m3681throw2 = c13770e2.m3681throw();
                                    if (!purchase2 || m3681throw2 == obj4) {
                                        m3681throw2 = new C3411e(20, c3637e);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    C13770e c13770e3 = c13770e2;
                                    AbstractC14489e.vip(Signature, AbstractC9546e.appmetrica(metrica2, null, interfaceC17220e, false, function0, (Function0) m3681throw2, 444), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262140);
                                    obj6 = obj4;
                                    c17399e3 = c17399e;
                                    c13770e2 = c13770e3;
                                }
                            }
                            m3681throw4 = dateTimeFormatter.format(LocalDateTime.ofInstant(Instant.ofEpochSecond(metrica.f11747e, metrica.f11746e), C9663e.vip(ZoneId.systemDefault()).ad));
                            c13770e2.m3682throws(m3681throw4);
                            String Signature2 = AbstractC17861e.Signature("- ", (String) m3681throw4);
                            InterfaceC12864e metrica22 = AbstractC18007e.metrica(c0115e, 1.0f);
                            InterfaceC17220e interfaceC17220e2 = (InterfaceC17220e) c13770e2.adcel(AbstractC10746e.ad);
                            purchase = c13770e2.purchase(c3637e) | c13770e2.yandex(c17399e);
                            m3681throw = c13770e2.m3681throw();
                            if (!purchase) {
                            }
                            m3681throw = new C12056e(c3637e, c17399e, 17);
                            c13770e2.m3682throws(m3681throw);
                            Function0 function02 = (Function0) m3681throw;
                            purchase2 = c13770e2.purchase(c3637e);
                            m3681throw2 = c13770e2.m3681throw();
                            if (!purchase2) {
                            }
                            m3681throw2 = new C3411e(20, c3637e);
                            c13770e2.m3682throws(m3681throw2);
                            C13770e c13770e32 = c13770e2;
                            AbstractC14489e.vip(Signature2, AbstractC9546e.appmetrica(metrica22, null, interfaceC17220e2, false, function02, (Function0) m3681throw2, 444), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e32, 0, 0, 262140);
                            obj6 = obj4;
                            c17399e3 = c17399e;
                            c13770e2 = c13770e32;
                        } catch (DateTimeException e) {
                            throw new C14803e(e, 1);
                        }
                        c17399e = c17399e3;
                        dateTimeFormatter = c17399e.f34104e;
                        C5471e c5471e = C5471e.f11744e;
                        metrica = C13023e.metrica(c3637e.metrica, 0L);
                        C7969e.Companion.getClass();
                    }
                    AbstractC1786e.isPro(c13770e2, false, true, true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
