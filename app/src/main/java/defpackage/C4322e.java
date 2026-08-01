package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4322e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ long f9443e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Object f9444e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C2662e f9445e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2566e f9446e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ int f9447e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11210e f9448e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f9449e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C2662e f9450e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f9451e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9452e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9453e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C6943e f9454e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f9455e;

    public /* synthetic */ C4322e(InterfaceC2566e interfaceC2566e, String str, long j, InterfaceC12123e interfaceC12123e, String str2, C6943e c6943e, String str3, boolean z, C11210e c11210e, int i, C2662e c2662e, C2662e c2662e2) {
        this.f9446e = interfaceC2566e;
        this.f9451e = str;
        this.f9443e = j;
        this.f9444e = interfaceC12123e;
        this.f9455e = str2;
        this.f9454e = c6943e;
        this.f9449e = str3;
        this.f9452e = z;
        this.f9448e = c11210e;
        this.f9447e = i;
        this.f9450e = c2662e;
        this.f9445e = c2662e2;
    }

    public /* synthetic */ C4322e(C11210e c11210e, InterfaceC18435e interfaceC18435e, C10339e c10339e, String str, long j, String str2, C6943e c6943e, String str3, boolean z, int i, C2662e c2662e, C2662e c2662e2) {
        this.f9448e = c11210e;
        this.f9444e = interfaceC18435e;
        this.f9446e = c10339e;
        this.f9451e = str;
        this.f9443e = j;
        this.f9455e = str2;
        this.f9454e = c6943e;
        this.f9449e = str3;
        this.f9452e = z;
        this.f9447e = i;
        this.f9450e = c2662e;
        this.f9445e = c2662e2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9453e) {
            case 0:
                final InterfaceC12123e interfaceC12123e = (InterfaceC12123e) this.f9444e;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C16005e vip = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).vip(c13770e);
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC18007e.metrica, this.f9446e.ad(), null);
                    final String str = this.f9451e;
                    boolean purchase = c13770e.purchase(str);
                    final long j = this.f9443e;
                    boolean appmetrica = purchase | c13770e.appmetrica(j) | c13770e.purchase(interfaceC12123e);
                    final String str2 = this.f9455e;
                    boolean purchase2 = appmetrica | c13770e.purchase(str2);
                    final C6943e c6943e = this.f9454e;
                    boolean yandex = purchase2 | c13770e.yandex(c6943e);
                    final String str3 = this.f9449e;
                    boolean purchase3 = yandex | c13770e.purchase(str3);
                    final boolean z = this.f9452e;
                    boolean billing = purchase3 | c13770e.billing(z);
                    final C11210e c11210e = this.f9448e;
                    boolean yandex2 = billing | c13770e.yandex(c11210e);
                    final int i = this.f9447e;
                    boolean license2 = yandex2 | c13770e.license(i);
                    final C2662e c2662e = this.f9450e;
                    boolean yandex3 = license2 | c13770e.yandex(c2662e);
                    final C2662e c2662e2 = this.f9445e;
                    boolean yandex4 = yandex3 | c13770e.yandex(c2662e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex4 || m3681throw == C2987e.ad) {
                        Function1 function1 = new Function1() { // from class: eؘٓ٘
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                C17213e c17213e = (C17213e) obj4;
                                final String str4 = str;
                                final long j2 = j;
                                final InterfaceC12123e interfaceC12123e2 = interfaceC12123e;
                                final String str5 = str2;
                                final C6943e c6943e2 = c6943e;
                                final String str6 = str3;
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-1229448020, true, new Function3() { // from class: eّؓؗ
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        C13770e c13770e2 = (C13770e) obj6;
                                        int intValue2 = ((Integer) obj7).intValue();
                                        boolean z2 = (intValue2 & 17) != 16;
                                        AbstractC7919e abstractC7919e = c13770e2.ad;
                                        if (c13770e2.m3673protected(intValue2 & 1, z2)) {
                                            C0115e c0115e = C0115e.f1276e;
                                            InterfaceC12864e vip2 = AbstractC17113e.vip(AbstractC18007e.metrica(c0115e, 1.0f));
                                            InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
                                            long j3 = c13770e2.f27286case;
                                            int i2 = (int) (j3 ^ (j3 >>> 32));
                                            InterfaceC3483e advert = c13770e2.advert();
                                            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, vip2);
                                            InterfaceC5685e.mopub.getClass();
                                            C7309e c7309e = C2721e.vip;
                                            c13770e2.m3666import();
                                            if (c13770e2.f27292implements) {
                                                c13770e2.mopub(c7309e);
                                            } else {
                                                c13770e2.m3684volatile();
                                            }
                                            C14865e c14865e = C2721e.billing;
                                            AbstractC2270e.yandex(c13770e2, license3, c14865e);
                                            C14865e c14865e2 = C2721e.purchase;
                                            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
                                            Integer valueOf = Integer.valueOf(i2);
                                            C14865e c14865e3 = C2721e.adcel;
                                            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
                                            C5430e c5430e = C2721e.mopub;
                                            AbstractC2270e.purchase(c13770e2, c5430e);
                                            C14865e c14865e4 = C2721e.license;
                                            AbstractC2270e.yandex(c13770e2, purchase4, c14865e4);
                                            C6159e c6159e = new C6159e(AbstractC0903e.license(c13770e2).ads);
                                            C6159e c6159e2 = new C6159e(AbstractC0903e.license(c13770e2).ads);
                                            C5944e c5944e = new C5944e((Context) c13770e2.adcel(AbstractC2676e.vip));
                                            c5944e.metrica = str4;
                                            AbstractC2182e.metrica(c5944e, new C5939e(AbstractC4340e.metrica(c13770e2)));
                                            C14542e ad = c5944e.ad();
                                            C7913e c7913e = AbstractC18007e.metrica;
                                            long j4 = j2;
                                            boolean appmetrica2 = c13770e2.appmetrica(j4);
                                            Object m3681throw2 = c13770e2.m3681throw();
                                            if (appmetrica2 || m3681throw2 == C2987e.ad) {
                                                m3681throw2 = new C14134e(j4, 2);
                                                c13770e2.m3682throws(m3681throw2);
                                            }
                                            AbstractC8461e.vip(ad, null, AbstractC5750e.appmetrica(c7913e, (Function1) m3681throw2), c6159e, c6159e2, C16477e.ad, c13770e2, 36912, 6, 31712);
                                            InterfaceC12864e smaato = AbstractC12220e.smaato(C14486e.ad.ad(AbstractC12220e.adcel(AbstractC18007e.metrica(c0115e, 1.0f), interfaceC12123e2), C5438e.f11682e), 16, 0.0f, 2);
                                            float f = 8;
                                            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e2, 6);
                                            long j5 = c13770e2.f27286case;
                                            int i3 = (int) (j5 ^ (j5 >>> 32));
                                            InterfaceC3483e advert2 = c13770e2.advert();
                                            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e2, smaato);
                                            c13770e2.m3666import();
                                            if (c13770e2.f27292implements) {
                                                c13770e2.mopub(c7309e);
                                            } else {
                                                c13770e2.m3684volatile();
                                            }
                                            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
                                            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
                                            AbstractC8703e.premium(i3, c13770e2, c14865e3, c13770e2, c5430e);
                                            AbstractC2270e.yandex(c13770e2, purchase5, c14865e4);
                                            InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                                            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11678e, c13770e2, 54);
                                            long j6 = c13770e2.f27286case;
                                            int i4 = (int) (j6 ^ (j6 >>> 32));
                                            InterfaceC3483e advert3 = c13770e2.advert();
                                            InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e2, metrica);
                                            c13770e2.m3666import();
                                            if (c13770e2.f27292implements) {
                                                c13770e2.mopub(c7309e);
                                            } else {
                                                c13770e2.m3684volatile();
                                            }
                                            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
                                            AbstractC2270e.yandex(c13770e2, advert3, c14865e2);
                                            AbstractC8703e.premium(i4, c13770e2, c14865e3, c13770e2, c5430e);
                                            AbstractC2270e.yandex(c13770e2, purchase6, c14865e4);
                                            AbstractC8461e.vip(str5, null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 160), AbstractC0903e.purchase(c13770e2).metrica), new C6159e(AbstractC0903e.license(c13770e2).ads), new C6159e(AbstractC0903e.license(c13770e2).ads), null, c13770e2, 36912, 0, 32736);
                                            C6943e c6943e3 = c6943e2;
                                            String str7 = c6943e3.pro;
                                            String str8 = BuildConfig.FLAVOR;
                                            if (str7 == null) {
                                                str7 = BuildConfig.FLAVOR;
                                            }
                                            AbstractC14489e.vip(str7, AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e2).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 2, false, 2, 0, AbstractC0903e.billing(c13770e2).appmetrica, c13770e2, 48, 24960, 109560);
                                            C3367e c3367e = c6943e3.amazon;
                                            String str9 = c3367e != null ? c3367e.vip : null;
                                            if (str9 != null) {
                                                str8 = str9;
                                            }
                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.separator_strings, new Object[]{str8, str6}, c13770e2), AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e2).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 1, 0, null, c13770e2, 48, 24576, 244728);
                                            AbstractC1786e.isPro(c13770e2, true, true, true);
                                        } else {
                                            c13770e2.m3659default();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                                boolean z2 = z;
                                if (!z2) {
                                    AbstractC5087e.premium(c17213e, null, null, AbstractC9460e.license, 3);
                                }
                                final C11210e c11210e2 = c11210e;
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(1938274837, true, new C17824e(c6943e2, c11210e2, z2, i)), 3);
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-1624517004, true, new C6599e(6, c11210e2)), 3);
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-892341549, true, new C6623e(c6943e2, c11210e2)), 3);
                                final C2662e c2662e3 = c2662e;
                                if (c2662e3 != null) {
                                    final int i2 = 0;
                                    AbstractC5087e.premium(c17213e, null, null, new C2892e(1852886426, true, new Function3() { // from class: eؙؕۖ
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i3 = i2;
                                            C13770e c13770e2 = (C13770e) obj6;
                                            int intValue2 = ((Integer) obj7).intValue();
                                            switch (i3) {
                                                case 0:
                                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                                        final C6943e c6943e3 = c6943e2;
                                                        boolean yandex5 = c13770e2.yandex(c6943e3);
                                                        final C11210e c11210e3 = c11210e2;
                                                        boolean yandex6 = yandex5 | c13770e2.yandex(c11210e3);
                                                        final C2662e c2662e4 = c2662e3;
                                                        boolean yandex7 = yandex6 | c13770e2.yandex(c2662e4);
                                                        Object m3681throw2 = c13770e2.m3681throw();
                                                        if (yandex7 || m3681throw2 == C2987e.ad) {
                                                            final int i4 = 0;
                                                            m3681throw2 = new Function0() { // from class: eِٔ٘
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    switch (i4) {
                                                                        case 0:
                                                                            C6943e c6943e4 = c6943e3;
                                                                            int size = c6943e4.metrica.size();
                                                                            final C11210e c11210e4 = c11210e3;
                                                                            if (size > 1) {
                                                                                List<C2662e> list = c6943e4.metrica;
                                                                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                                                                                for (final C2662e c2662e5 : list) {
                                                                                    String str7 = c2662e5.license;
                                                                                    if (str7 == null) {
                                                                                        str7 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i5 = 0;
                                                                                    arrayList.add(new C3662e(-1, str7, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i5) {
                                                                                                case 0:
                                                                                                    Activity pro = c11210e4.pro();
                                                                                                    Integer num = c2662e5.vip;
                                                                                                    if (num == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro, new C15767e(new C7307e(num.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro2 = c11210e4.pro();
                                                                                                    Integer num2 = c2662e5.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_authors, arrayList).signatures(c11210e4.pro());
                                                                            } else {
                                                                                Activity pro = c11210e4.pro();
                                                                                Integer num = c2662e4.vip;
                                                                                if (num == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro, new C15767e(new C7307e(num.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        default:
                                                                            C6943e c6943e5 = c6943e3;
                                                                            int size2 = c6943e5.Signature.size();
                                                                            final C11210e c11210e5 = c11210e3;
                                                                            if (size2 > 1) {
                                                                                List<C2662e> list2 = c6943e5.Signature;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                                                                                for (final C2662e c2662e6 : list2) {
                                                                                    String str8 = c2662e6.license;
                                                                                    if (str8 == null) {
                                                                                        str8 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i6 = 1;
                                                                                    arrayList2.add(new C3662e(-1, str8, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i6) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e5.pro();
                                                                                                    Integer num2 = c2662e6.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e5.pro();
                                                                                                    Integer num22 = c2662e6.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_narrators, arrayList2).signatures(c11210e5.pro());
                                                                            } else {
                                                                                Activity pro2 = c11210e5.pro();
                                                                                Integer num2 = c2662e4.vip;
                                                                                if (num2 == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            };
                                                            c13770e2.m3682throws(m3681throw2);
                                                        }
                                                        final int i5 = 0;
                                                        final int i6 = 0;
                                                        AbstractC16429e.ad(AbstractC16653e.license(-2118939524, new Function2() { // from class: eؘٟؐ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                int i7 = i5;
                                                                String str7 = BuildConfig.FLAVOR;
                                                                C2662e c2662e5 = c2662e4;
                                                                C6943e c6943e4 = c6943e3;
                                                                switch (i7) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            c13770e3.m3659default();
                                                                        } else if (c6943e4.metrica.size() > 1) {
                                                                            c13770e3.m3676strictfp(2102026349);
                                                                            String str8 = c2662e5.license;
                                                                            if (str8 != null) {
                                                                                str7 = str8;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        } else {
                                                                            c13770e3.m3676strictfp(2102182806);
                                                                            String str9 = c2662e5.license;
                                                                            AbstractC14489e.vip(str9 == null ? BuildConfig.FLAVOR : str9, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (!c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            c13770e4.m3659default();
                                                                        } else if (c6943e4.Signature.size() > 1) {
                                                                            c13770e4.m3676strictfp(202111916);
                                                                            String str10 = c2662e5.license;
                                                                            if (str10 != null) {
                                                                                str7 = str10;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        } else {
                                                                            c13770e4.m3676strictfp(202270357);
                                                                            String str11 = c2662e5.license;
                                                                            AbstractC14489e.vip(str11 == null ? BuildConfig.FLAVOR : str11, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw2, 15), null, AbstractC9460e.billing, AbstractC16653e.license(2012206328, new Function2() { // from class: eِٟؗ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                switch (i6) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            C15492e c15492e = AbstractC11785e.ad;
                                                                            C6159e c6159e = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C6159e c6159e2 = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C14762e c14762e = (C14762e) AbstractC13480e.m3569abstract(c2662e4.appmetrica);
                                                                            AbstractC8461e.vip(c14762e != null ? c14762e.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e, c6159e2, C16477e.ad, c13770e3, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e3.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            C15492e c15492e2 = AbstractC11785e.ad;
                                                                            C6159e c6159e3 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C6159e c6159e4 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C14762e c14762e2 = (C14762e) AbstractC13480e.m3569abstract(c2662e4.appmetrica);
                                                                            AbstractC8461e.vip(c14762e2 != null ? c14762e2.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e3, c6159e4, C16477e.ad, c13770e4, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e4.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), null, null, 0.0f, 0.0f, c13770e2, 27654, 484);
                                                    } else {
                                                        c13770e2.m3659default();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                                        final C6943e c6943e4 = c6943e2;
                                                        boolean yandex8 = c13770e2.yandex(c6943e4);
                                                        final C11210e c11210e4 = c11210e2;
                                                        boolean yandex9 = yandex8 | c13770e2.yandex(c11210e4);
                                                        final C2662e c2662e5 = c2662e3;
                                                        boolean yandex10 = yandex9 | c13770e2.yandex(c2662e5);
                                                        Object m3681throw3 = c13770e2.m3681throw();
                                                        if (yandex10 || m3681throw3 == C2987e.ad) {
                                                            final int i7 = 1;
                                                            m3681throw3 = new Function0() { // from class: eِٔ٘
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    switch (i7) {
                                                                        case 0:
                                                                            C6943e c6943e42 = c6943e4;
                                                                            int size = c6943e42.metrica.size();
                                                                            final C11210e c11210e42 = c11210e4;
                                                                            if (size > 1) {
                                                                                List<C2662e> list = c6943e42.metrica;
                                                                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                                                                                for (final C2662e c2662e52 : list) {
                                                                                    String str7 = c2662e52.license;
                                                                                    if (str7 == null) {
                                                                                        str7 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i52 = 0;
                                                                                    arrayList.add(new C3662e(-1, str7, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i52) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e42.pro();
                                                                                                    Integer num2 = c2662e52.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e42.pro();
                                                                                                    Integer num22 = c2662e52.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_authors, arrayList).signatures(c11210e42.pro());
                                                                            } else {
                                                                                Activity pro = c11210e42.pro();
                                                                                Integer num = c2662e5.vip;
                                                                                if (num == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro, new C15767e(new C7307e(num.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        default:
                                                                            C6943e c6943e5 = c6943e4;
                                                                            int size2 = c6943e5.Signature.size();
                                                                            final C11210e c11210e5 = c11210e4;
                                                                            if (size2 > 1) {
                                                                                List<C2662e> list2 = c6943e5.Signature;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                                                                                for (final C2662e c2662e6 : list2) {
                                                                                    String str8 = c2662e6.license;
                                                                                    if (str8 == null) {
                                                                                        str8 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i62 = 1;
                                                                                    arrayList2.add(new C3662e(-1, str8, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i62) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e5.pro();
                                                                                                    Integer num2 = c2662e6.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e5.pro();
                                                                                                    Integer num22 = c2662e6.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_narrators, arrayList2).signatures(c11210e5.pro());
                                                                            } else {
                                                                                Activity pro2 = c11210e5.pro();
                                                                                Integer num2 = c2662e5.vip;
                                                                                if (num2 == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            };
                                                            c13770e2.m3682throws(m3681throw3);
                                                        }
                                                        final int i8 = 1;
                                                        final int i9 = 1;
                                                        AbstractC16429e.ad(AbstractC16653e.license(-1386764069, new Function2() { // from class: eؘٟؐ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                int i72 = i8;
                                                                String str7 = BuildConfig.FLAVOR;
                                                                C2662e c2662e52 = c2662e5;
                                                                C6943e c6943e42 = c6943e4;
                                                                switch (i72) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            c13770e3.m3659default();
                                                                        } else if (c6943e42.metrica.size() > 1) {
                                                                            c13770e3.m3676strictfp(2102026349);
                                                                            String str8 = c2662e52.license;
                                                                            if (str8 != null) {
                                                                                str7 = str8;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        } else {
                                                                            c13770e3.m3676strictfp(2102182806);
                                                                            String str9 = c2662e52.license;
                                                                            AbstractC14489e.vip(str9 == null ? BuildConfig.FLAVOR : str9, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (!c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            c13770e4.m3659default();
                                                                        } else if (c6943e42.Signature.size() > 1) {
                                                                            c13770e4.m3676strictfp(202111916);
                                                                            String str10 = c2662e52.license;
                                                                            if (str10 != null) {
                                                                                str7 = str10;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        } else {
                                                                            c13770e4.m3676strictfp(202270357);
                                                                            String str11 = c2662e52.license;
                                                                            AbstractC14489e.vip(str11 == null ? BuildConfig.FLAVOR : str11, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw3, 15), null, AbstractC9460e.yandex, AbstractC16653e.license(-1550585513, new Function2() { // from class: eِٟؗ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                switch (i9) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            C15492e c15492e = AbstractC11785e.ad;
                                                                            C6159e c6159e = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C6159e c6159e2 = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C14762e c14762e = (C14762e) AbstractC13480e.m3569abstract(c2662e5.appmetrica);
                                                                            AbstractC8461e.vip(c14762e != null ? c14762e.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e, c6159e2, C16477e.ad, c13770e3, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e3.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            C15492e c15492e2 = AbstractC11785e.ad;
                                                                            C6159e c6159e3 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C6159e c6159e4 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C14762e c14762e2 = (C14762e) AbstractC13480e.m3569abstract(c2662e5.appmetrica);
                                                                            AbstractC8461e.vip(c14762e2 != null ? c14762e2.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e3, c6159e4, C16477e.ad, c13770e4, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e4.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), null, null, 0.0f, 0.0f, c13770e2, 27654, 484);
                                                    } else {
                                                        c13770e2.m3659default();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }), 3);
                                }
                                final C2662e c2662e4 = c2662e2;
                                if (c2662e4 != null) {
                                    final int i3 = 1;
                                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-1709905415, true, new Function3() { // from class: eؙؕۖ
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i32 = i3;
                                            C13770e c13770e2 = (C13770e) obj6;
                                            int intValue2 = ((Integer) obj7).intValue();
                                            switch (i32) {
                                                case 0:
                                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                                        final C6943e c6943e3 = c6943e2;
                                                        boolean yandex5 = c13770e2.yandex(c6943e3);
                                                        final C11210e c11210e3 = c11210e2;
                                                        boolean yandex6 = yandex5 | c13770e2.yandex(c11210e3);
                                                        final C2662e c2662e42 = c2662e4;
                                                        boolean yandex7 = yandex6 | c13770e2.yandex(c2662e42);
                                                        Object m3681throw2 = c13770e2.m3681throw();
                                                        if (yandex7 || m3681throw2 == C2987e.ad) {
                                                            final int i4 = 0;
                                                            m3681throw2 = new Function0() { // from class: eِٔ٘
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    switch (i4) {
                                                                        case 0:
                                                                            C6943e c6943e42 = c6943e3;
                                                                            int size = c6943e42.metrica.size();
                                                                            final C11210e c11210e42 = c11210e3;
                                                                            if (size > 1) {
                                                                                List<C2662e> list = c6943e42.metrica;
                                                                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                                                                                for (final C2662e c2662e52 : list) {
                                                                                    String str7 = c2662e52.license;
                                                                                    if (str7 == null) {
                                                                                        str7 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i52 = 0;
                                                                                    arrayList.add(new C3662e(-1, str7, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i52) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e42.pro();
                                                                                                    Integer num2 = c2662e52.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e42.pro();
                                                                                                    Integer num22 = c2662e52.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_authors, arrayList).signatures(c11210e42.pro());
                                                                            } else {
                                                                                Activity pro = c11210e42.pro();
                                                                                Integer num = c2662e42.vip;
                                                                                if (num == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro, new C15767e(new C7307e(num.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        default:
                                                                            C6943e c6943e5 = c6943e3;
                                                                            int size2 = c6943e5.Signature.size();
                                                                            final C11210e c11210e5 = c11210e3;
                                                                            if (size2 > 1) {
                                                                                List<C2662e> list2 = c6943e5.Signature;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                                                                                for (final C2662e c2662e6 : list2) {
                                                                                    String str8 = c2662e6.license;
                                                                                    if (str8 == null) {
                                                                                        str8 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i62 = 1;
                                                                                    arrayList2.add(new C3662e(-1, str8, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i62) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e5.pro();
                                                                                                    Integer num2 = c2662e6.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e5.pro();
                                                                                                    Integer num22 = c2662e6.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_narrators, arrayList2).signatures(c11210e5.pro());
                                                                            } else {
                                                                                Activity pro2 = c11210e5.pro();
                                                                                Integer num2 = c2662e42.vip;
                                                                                if (num2 == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            };
                                                            c13770e2.m3682throws(m3681throw2);
                                                        }
                                                        final int i5 = 0;
                                                        final int i6 = 0;
                                                        AbstractC16429e.ad(AbstractC16653e.license(-2118939524, new Function2() { // from class: eؘٟؐ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                int i72 = i5;
                                                                String str7 = BuildConfig.FLAVOR;
                                                                C2662e c2662e52 = c2662e42;
                                                                C6943e c6943e42 = c6943e3;
                                                                switch (i72) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            c13770e3.m3659default();
                                                                        } else if (c6943e42.metrica.size() > 1) {
                                                                            c13770e3.m3676strictfp(2102026349);
                                                                            String str8 = c2662e52.license;
                                                                            if (str8 != null) {
                                                                                str7 = str8;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        } else {
                                                                            c13770e3.m3676strictfp(2102182806);
                                                                            String str9 = c2662e52.license;
                                                                            AbstractC14489e.vip(str9 == null ? BuildConfig.FLAVOR : str9, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (!c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            c13770e4.m3659default();
                                                                        } else if (c6943e42.Signature.size() > 1) {
                                                                            c13770e4.m3676strictfp(202111916);
                                                                            String str10 = c2662e52.license;
                                                                            if (str10 != null) {
                                                                                str7 = str10;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        } else {
                                                                            c13770e4.m3676strictfp(202270357);
                                                                            String str11 = c2662e52.license;
                                                                            AbstractC14489e.vip(str11 == null ? BuildConfig.FLAVOR : str11, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw2, 15), null, AbstractC9460e.billing, AbstractC16653e.license(2012206328, new Function2() { // from class: eِٟؗ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                switch (i6) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            C15492e c15492e = AbstractC11785e.ad;
                                                                            C6159e c6159e = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C6159e c6159e2 = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C14762e c14762e = (C14762e) AbstractC13480e.m3569abstract(c2662e42.appmetrica);
                                                                            AbstractC8461e.vip(c14762e != null ? c14762e.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e, c6159e2, C16477e.ad, c13770e3, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e3.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            C15492e c15492e2 = AbstractC11785e.ad;
                                                                            C6159e c6159e3 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C6159e c6159e4 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C14762e c14762e2 = (C14762e) AbstractC13480e.m3569abstract(c2662e42.appmetrica);
                                                                            AbstractC8461e.vip(c14762e2 != null ? c14762e2.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e3, c6159e4, C16477e.ad, c13770e4, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e4.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), null, null, 0.0f, 0.0f, c13770e2, 27654, 484);
                                                    } else {
                                                        c13770e2.m3659default();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                                        final C6943e c6943e4 = c6943e2;
                                                        boolean yandex8 = c13770e2.yandex(c6943e4);
                                                        final C11210e c11210e4 = c11210e2;
                                                        boolean yandex9 = yandex8 | c13770e2.yandex(c11210e4);
                                                        final C2662e c2662e5 = c2662e4;
                                                        boolean yandex10 = yandex9 | c13770e2.yandex(c2662e5);
                                                        Object m3681throw3 = c13770e2.m3681throw();
                                                        if (yandex10 || m3681throw3 == C2987e.ad) {
                                                            final int i7 = 1;
                                                            m3681throw3 = new Function0() { // from class: eِٔ٘
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    switch (i7) {
                                                                        case 0:
                                                                            C6943e c6943e42 = c6943e4;
                                                                            int size = c6943e42.metrica.size();
                                                                            final C11210e c11210e42 = c11210e4;
                                                                            if (size > 1) {
                                                                                List<C2662e> list = c6943e42.metrica;
                                                                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                                                                                for (final C2662e c2662e52 : list) {
                                                                                    String str7 = c2662e52.license;
                                                                                    if (str7 == null) {
                                                                                        str7 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i52 = 0;
                                                                                    arrayList.add(new C3662e(-1, str7, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i52) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e42.pro();
                                                                                                    Integer num2 = c2662e52.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e42.pro();
                                                                                                    Integer num22 = c2662e52.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_authors, arrayList).signatures(c11210e42.pro());
                                                                            } else {
                                                                                Activity pro = c11210e42.pro();
                                                                                Integer num = c2662e5.vip;
                                                                                if (num == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro, new C15767e(new C7307e(num.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        default:
                                                                            C6943e c6943e5 = c6943e4;
                                                                            int size2 = c6943e5.Signature.size();
                                                                            final C11210e c11210e5 = c11210e4;
                                                                            if (size2 > 1) {
                                                                                List<C2662e> list2 = c6943e5.Signature;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                                                                                for (final C2662e c2662e6 : list2) {
                                                                                    String str8 = c2662e6.license;
                                                                                    if (str8 == null) {
                                                                                        str8 = BuildConfig.FLAVOR;
                                                                                    }
                                                                                    final int i62 = 1;
                                                                                    arrayList2.add(new C3662e(-1, str8, new Function1() { // from class: eٍٖۖ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj8) {
                                                                                            switch (i62) {
                                                                                                case 0:
                                                                                                    Activity pro2 = c11210e5.pro();
                                                                                                    Integer num2 = c2662e6.vip;
                                                                                                    if (num2 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                                default:
                                                                                                    Activity pro22 = c11210e5.pro();
                                                                                                    Integer num22 = c2662e6.vip;
                                                                                                    if (num22 == null) {
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                    AbstractC7237e.metrica(pro22, new C15767e(new C7307e(num22.intValue(), 1, null)));
                                                                                                    return Unit.INSTANCE;
                                                                                            }
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C11683e(R.string.book_narrators, arrayList2).signatures(c11210e5.pro());
                                                                            } else {
                                                                                Activity pro2 = c11210e5.pro();
                                                                                Integer num2 = c2662e5.vip;
                                                                                if (num2 == null) {
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                                AbstractC7237e.metrica(pro2, new C15767e(new C7307e(num2.intValue(), 1, null)));
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            };
                                                            c13770e2.m3682throws(m3681throw3);
                                                        }
                                                        final int i8 = 1;
                                                        final int i9 = 1;
                                                        AbstractC16429e.ad(AbstractC16653e.license(-1386764069, new Function2() { // from class: eؘٟؐ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                int i72 = i8;
                                                                String str7 = BuildConfig.FLAVOR;
                                                                C2662e c2662e52 = c2662e5;
                                                                C6943e c6943e42 = c6943e4;
                                                                switch (i72) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            c13770e3.m3659default();
                                                                        } else if (c6943e42.metrica.size() > 1) {
                                                                            c13770e3.m3676strictfp(2102026349);
                                                                            String str8 = c2662e52.license;
                                                                            if (str8 != null) {
                                                                                str7 = str8;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        } else {
                                                                            c13770e3.m3676strictfp(2102182806);
                                                                            String str9 = c2662e52.license;
                                                                            AbstractC14489e.vip(str9 == null ? BuildConfig.FLAVOR : str9, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                                                                            c13770e3.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (!c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            c13770e4.m3659default();
                                                                        } else if (c6943e42.Signature.size() > 1) {
                                                                            c13770e4.m3676strictfp(202111916);
                                                                            String str10 = c2662e52.license;
                                                                            if (str10 != null) {
                                                                                str7 = str10;
                                                                            }
                                                                            AbstractC14489e.vip(AbstractC5297e.license(R.string.book_and_other, new Object[]{str7}, c13770e4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        } else {
                                                                            c13770e4.m3676strictfp(202270357);
                                                                            String str11 = c2662e52.license;
                                                                            AbstractC14489e.vip(str11 == null ? BuildConfig.FLAVOR : str11, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                                                            c13770e4.Signature(false);
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw3, 15), null, AbstractC9460e.yandex, AbstractC16653e.license(-1550585513, new Function2() { // from class: eِٟؗ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                switch (i9) {
                                                                    case 0:
                                                                        C13770e c13770e3 = (C13770e) obj8;
                                                                        int intValue3 = ((Integer) obj9).intValue();
                                                                        if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                            C15492e c15492e = AbstractC11785e.ad;
                                                                            C6159e c6159e = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C6159e c6159e2 = new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads);
                                                                            C14762e c14762e = (C14762e) AbstractC13480e.m3569abstract(c2662e5.appmetrica);
                                                                            AbstractC8461e.vip(c14762e != null ? c14762e.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e, c6159e2, C16477e.ad, c13770e3, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e3.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    default:
                                                                        C13770e c13770e4 = (C13770e) obj8;
                                                                        int intValue4 = ((Integer) obj9).intValue();
                                                                        if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                            C15492e c15492e2 = AbstractC11785e.ad;
                                                                            C6159e c6159e3 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C6159e c6159e4 = new C6159e(((C7019e) c13770e4.adcel(c15492e2)).ad.ads);
                                                                            C14762e c14762e2 = (C14762e) AbstractC13480e.m3569abstract(c2662e5.appmetrica);
                                                                            AbstractC8461e.vip(c14762e2 != null ? c14762e2.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), c6159e3, c6159e4, C16477e.ad, c13770e4, 36912, 6, 31712);
                                                                        } else {
                                                                            c13770e4.m3659default();
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, c13770e2), null, null, 0.0f, 0.0f, c13770e2, 27654, 484);
                                                    } else {
                                                        c13770e2.m3659default();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }), 3);
                                }
                                AbstractC5087e.premium(c17213e, null, null, AbstractC9460e.startapp, 3);
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(572009361, true, new C6623e(c11210e2, c6943e2)), 3);
                                List list = c6943e2.license;
                                c17213e.mopub(list.size(), null, new Cfor(list, 8, false), new C2892e(802480018, true, new C10193e(list, z2, c11210e2, c6943e2)));
                                AbstractC5087e.premium(c17213e, null, null, AbstractC9460e.adcel, 3);
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(2036360271, true, new C9957e(1, c6943e2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        c13770e.m3682throws(function1);
                        m3681throw = function1;
                    }
                    AbstractC7023e.ad(license, null, vip, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 506);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f9444e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C11210e c11210e2 = this.f9448e;
                    boolean z2 = ((InterfaceC9816e) c11210e2.f22473e.getValue()) instanceof C17786e;
                    boolean yandex5 = c13770e2.yandex(interfaceC18435e) | c13770e2.yandex(c11210e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex5 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C2264e(interfaceC18435e, c11210e2, 1);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC11148e.vip(z2, (Function0) m3681throw2, null, null, null, null, false, 0.0f, AbstractC16653e.license(-2020057951, new C4322e(this.f9446e, this.f9451e, this.f9443e, interfaceC12123e2, this.f9455e, this.f9454e, this.f9449e, this.f9452e, c11210e2, this.f9447e, this.f9450e, this.f9445e), c13770e2), c13770e2, 100663296, 252);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
