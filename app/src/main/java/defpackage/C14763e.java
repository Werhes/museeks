package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14763e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ float f29193e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f29194e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13642e f29195e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f29196e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f29197e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29198e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f29199e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f29200e;

    public /* synthetic */ C14763e(InterfaceC12123e interfaceC12123e, AudioTrack audioTrack, C13642e c13642e, int i, float f, int i2, String str) {
        this.f29196e = interfaceC12123e;
        this.f29194e = audioTrack;
        this.f29195e = c13642e;
        this.f29197e = i;
        this.f29193e = f;
        this.f29200e = i2;
        this.f29199e = str;
    }

    public /* synthetic */ C14763e(C13642e c13642e, InterfaceC18435e interfaceC18435e, AudioTrack audioTrack, int i, float f, int i2, String str) {
        this.f29195e = c13642e;
        this.f29196e = interfaceC18435e;
        this.f29194e = audioTrack;
        this.f29197e = i;
        this.f29193e = f;
        this.f29200e = i2;
        this.f29199e = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29198e) {
            case 0:
                final InterfaceC12123e interfaceC12123e = (InterfaceC12123e) this.f29196e;
                final InterfaceC10648e interfaceC10648e = (InterfaceC10648e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC10648e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C16005e vip = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).vip(c13770e);
                    C7913e c7913e = AbstractC18007e.metrica;
                    C13964e billing = AbstractC16497e.billing(8);
                    boolean purchase = c13770e.purchase(interfaceC12123e) | ((intValue & 14) == 4);
                    final AudioTrack audioTrack = this.f29194e;
                    boolean purchase2 = purchase | c13770e.purchase(audioTrack);
                    final C13642e c13642e = this.f29195e;
                    boolean yandex = purchase2 | c13770e.yandex(c13642e);
                    final int i = this.f29197e;
                    boolean license = yandex | c13770e.license(i);
                    final float f = this.f29193e;
                    boolean metrica = license | c13770e.metrica(f);
                    final int i2 = this.f29200e;
                    boolean license2 = metrica | c13770e.license(i2);
                    final String str = this.f29199e;
                    boolean purchase3 = license2 | c13770e.purchase(str);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase3 || m3681throw == C2987e.ad) {
                        m3681throw = new Function1() { // from class: eؓۛٚ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                C17213e c17213e = (C17213e) obj4;
                                InterfaceC10648e interfaceC10648e2 = InterfaceC10648e.this;
                                InterfaceC12123e interfaceC12123e2 = interfaceC12123e;
                                final AudioTrack audioTrack2 = audioTrack;
                                final C13642e c13642e2 = c13642e;
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-1578574227, true, new C12050e(interfaceC10648e2, interfaceC12123e2, audioTrack2, c13642e2, 22)), 3);
                                final int i3 = i;
                                final float f2 = f;
                                final int i4 = i2;
                                final String str2 = str;
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(555545814, true, new Function3() { // from class: eَ۟ؐ
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        C13770e c13770e2 = (C13770e) obj6;
                                        int intValue2 = ((Integer) obj7).intValue();
                                        if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2);
                                            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e2, 0);
                                            long j = c13770e2.f27286case;
                                            int i5 = (int) (j ^ (j >>> 32));
                                            InterfaceC3483e advert = c13770e2.advert();
                                            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, smaato);
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
                                            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i5), C2721e.adcel);
                                            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                                            AbstractC2270e.yandex(c13770e2, purchase4, C2721e.license);
                                            float f3 = 0;
                                            C16005e c16005e = new C16005e(f3, f3, f3, f3);
                                            C16005e c16005e2 = AbstractC10244e.ad;
                                            C15492e c15492e = AbstractC11785e.ad;
                                            C3134e ad2 = AbstractC10244e.ad(((C7019e) c13770e2.adcel(c15492e)).ad.subscription, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, 0L, c13770e2, 12);
                                            C3924e ad3 = AbstractC6549e.ad(8);
                                            final int i6 = i3;
                                            boolean license3 = c13770e2.license(i6);
                                            AudioTrack audioTrack3 = audioTrack2;
                                            boolean purchase5 = license3 | c13770e2.purchase(audioTrack3);
                                            C13642e c13642e3 = c13642e2;
                                            boolean yandex2 = purchase5 | c13770e2.yandex(c13642e3);
                                            Object m3681throw2 = c13770e2.m3681throw();
                                            if (yandex2 || m3681throw2 == C2987e.ad) {
                                                m3681throw2 = new C15736e(i6, audioTrack3, c13642e3, 2);
                                                c13770e2.m3682throws(m3681throw2);
                                            }
                                            Function0 function0 = (Function0) m3681throw2;
                                            final float f4 = f2;
                                            final int i7 = i4;
                                            final String str3 = str2;
                                            AbstractC1513e.ad(function0, null, false, ad3, ad2, null, null, c16005e, AbstractC16653e.license(35301890, new Function3() { // from class: eؗؖ۠
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                    C14865e c14865e;
                                                    C13770e c13770e3;
                                                    C13770e c13770e4 = (C13770e) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    boolean z = (intValue3 & 17) != 16;
                                                    AbstractC7919e abstractC7919e = c13770e4.ad;
                                                    if (c13770e4.m3673protected(intValue3 & 1, z)) {
                                                        C0115e c0115e = C0115e.f1276e;
                                                        InterfaceC12864e vip2 = AbstractC17113e.vip(c0115e);
                                                        InterfaceC2747e license4 = AbstractC17074e.license(C5438e.f11676e, false);
                                                        long j2 = c13770e4.f27286case;
                                                        int i8 = (int) (j2 ^ (j2 >>> 32));
                                                        InterfaceC3483e advert2 = c13770e4.advert();
                                                        InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e4, vip2);
                                                        InterfaceC5685e.mopub.getClass();
                                                        C7309e c7309e2 = C2721e.vip;
                                                        c13770e4.m3666import();
                                                        if (c13770e4.f27292implements) {
                                                            c13770e4.mopub(c7309e2);
                                                        } else {
                                                            c13770e4.m3684volatile();
                                                        }
                                                        C14865e c14865e2 = C2721e.billing;
                                                        AbstractC2270e.yandex(c13770e4, license4, c14865e2);
                                                        C14865e c14865e3 = C2721e.purchase;
                                                        AbstractC2270e.yandex(c13770e4, advert2, c14865e3);
                                                        Integer valueOf = Integer.valueOf(i8);
                                                        C14865e c14865e4 = C2721e.adcel;
                                                        AbstractC2270e.yandex(c13770e4, valueOf, c14865e4);
                                                        C5430e c5430e = C2721e.mopub;
                                                        AbstractC2270e.purchase(c13770e4, c5430e);
                                                        C14865e c14865e5 = C2721e.license;
                                                        AbstractC2270e.yandex(c13770e4, purchase6, c14865e5);
                                                        C7913e c7913e2 = AbstractC18007e.metrica;
                                                        float f5 = 0;
                                                        long vip3 = C3618e.vip(0.5f, ((C7019e) c13770e4.adcel(AbstractC11785e.ad)).ad.ad);
                                                        long j3 = C3618e.startapp;
                                                        float f6 = f4;
                                                        boolean metrica2 = c13770e4.metrica(f6);
                                                        Object m3681throw3 = c13770e4.m3681throw();
                                                        C5170e c5170e = C2987e.ad;
                                                        if (metrica2 || m3681throw3 == c5170e) {
                                                            c14865e = c14865e3;
                                                            m3681throw3 = new C0729e(0, f6);
                                                            c13770e4.m3682throws(m3681throw3);
                                                        } else {
                                                            c14865e = c14865e3;
                                                        }
                                                        Function0 function02 = (Function0) m3681throw3;
                                                        Object m3681throw4 = c13770e4.m3681throw();
                                                        if (m3681throw4 == c5170e) {
                                                            m3681throw4 = new C4526e(23);
                                                            c13770e4.m3682throws(m3681throw4);
                                                        }
                                                        C14865e c14865e6 = c14865e;
                                                        AbstractC6574e.vip(function02, c7913e2, vip3, j3, 2, f5, (Function1) m3681throw4, c13770e4, 1772592, 0);
                                                        float f7 = 8;
                                                        InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, f7);
                                                        C8587e ad4 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e4, 48);
                                                        long j4 = c13770e4.f27286case;
                                                        int i9 = (int) (j4 ^ (j4 >>> 32));
                                                        InterfaceC3483e advert3 = c13770e4.advert();
                                                        InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e4, mopub);
                                                        c13770e4.m3666import();
                                                        if (c13770e4.f27292implements) {
                                                            c13770e4.mopub(c7309e2);
                                                        } else {
                                                            c13770e4.m3684volatile();
                                                        }
                                                        AbstractC2270e.yandex(c13770e4, ad4, c14865e2);
                                                        AbstractC2270e.yandex(c13770e4, advert3, c14865e6);
                                                        AbstractC8703e.premium(i9, c13770e4, c14865e4, c13770e4, c5430e);
                                                        AbstractC2270e.yandex(c13770e4, purchase7, c14865e5);
                                                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.player_play, 0, c13770e4), null, null, 0L, c13770e4, 56, 12);
                                                        AbstractC12534e.ad(c13770e4, AbstractC18007e.smaato(c0115e, f7));
                                                        C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e4, 0);
                                                        long j5 = c13770e4.f27286case;
                                                        int i10 = (int) (j5 ^ (j5 >>> 32));
                                                        InterfaceC3483e advert4 = c13770e4.advert();
                                                        InterfaceC12864e purchase8 = AbstractC5679e.purchase(c13770e4, c0115e);
                                                        c13770e4.m3666import();
                                                        if (c13770e4.f27292implements) {
                                                            c13770e4.mopub(c7309e2);
                                                        } else {
                                                            c13770e4.m3684volatile();
                                                        }
                                                        AbstractC2270e.yandex(c13770e4, ad5, c14865e2);
                                                        AbstractC2270e.yandex(c13770e4, advert4, c14865e6);
                                                        AbstractC8703e.premium(i10, c13770e4, c14865e4, c13770e4, c5430e);
                                                        AbstractC2270e.yandex(c13770e4, purchase8, c14865e5);
                                                        AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                        int i11 = i7;
                                                        String str4 = str3;
                                                        if (i11 == 0) {
                                                            c13770e4.m3676strictfp(-1238493485);
                                                            AbstractC14489e.vip(str4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                            c13770e3 = c13770e4;
                                                            c13770e3.Signature(false);
                                                        } else if (i6 > 0) {
                                                            c13770e4.m3676strictfp(-1238324721);
                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_left, new Object[]{str4}, c13770e4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                            c13770e3 = c13770e4;
                                                            c13770e3.Signature(false);
                                                        } else {
                                                            c13770e4.m3676strictfp(-1238144301);
                                                            AbstractC14489e.vip(str4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                            c13770e3 = c13770e4;
                                                            c13770e3.Signature(false);
                                                        }
                                                        c13770e3.Signature(true);
                                                        if (1.0f <= 0.0d) {
                                                            AbstractC9534e.ad("invalid weight; must be greater than zero");
                                                        }
                                                        AbstractC12534e.ad(c13770e3, new C5228e(1.0f, true));
                                                        c13770e3.Signature(true);
                                                        c13770e3.Signature(true);
                                                    } else {
                                                        c13770e4.m3659default();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, c13770e2), c13770e2, 817889280, 358);
                                            c13770e2.Signature(true);
                                        } else {
                                            c13770e2.m3659default();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                                AbstractC5087e.premium(c17213e, null, null, AbstractC2127e.metrica, 3);
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-1680815212, true, new C11961e(audioTrack2, 2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(c7913e, null, vip, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24582, 490);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f29196e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C13642e c13642e2 = this.f29195e;
                    boolean z = c13642e2.m3634package() instanceof C13042e;
                    boolean yandex2 = c13770e2.yandex(interfaceC18435e) | c13770e2.yandex(c13642e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C15700e(interfaceC18435e, c13642e2, 0);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC11148e.vip(z, (Function0) m3681throw2, null, null, null, null, false, 0.0f, AbstractC16653e.license(-2121342110, new C14763e(interfaceC12123e2, this.f29194e, c13642e2, this.f29197e, this.f29193e, this.f29200e, this.f29199e), c13770e2), c13770e2, 100663296, 252);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
