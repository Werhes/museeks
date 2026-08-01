package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4271e extends AbstractC16997e {

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final /* synthetic */ int f9361e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public String f9362e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f9363e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f9364e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f9365e;

    public C4271e(String str) {
        super(false, 1);
        this.f9363e = str;
        this.f9364e = AbstractC14533e.startapp(C17576e.ad);
        this.f9365e = AbstractC14533e.startapp(C0451e.ad);
    }

    /* renamed from: this, reason: not valid java name */
    public static C2314e m1510this(C1357e c1357e) {
        C5767e c5767e;
        List list;
        String str = c1357e.yandex;
        C2035e c2035e = c1357e.pro;
        String str2 = null;
        C1769e c1769e = new C1769e(new C5767e(str, 2), new C5767e(c1357e.purchase, 2), new C5767e(null, 3), new C5767e(null, 3));
        List<C2035e> list2 = c1357e.advert;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list2, 10));
        for (C2035e c2035e2 : list2) {
            String str3 = c2035e2.vip;
            String str4 = c2035e2.metrica;
            arrayList.add(new C2277e(str3, c2035e2.ad, null, str4.length() > 0 ? new C5767e(str4, 2) : null, 12));
        }
        String str5 = c1357e.vip;
        int hashCode = str5.hashCode();
        String str6 = BuildConfig.FLAVOR;
        switch (hashCode) {
            case -2024994754:
                if (str5.equals("multi_images")) {
                    EnumC14399e enumC14399e = EnumC14399e.f28477e;
                    String str7 = c1357e.ad;
                    List singletonList = Collections.singletonList(new C2277e(c1357e.subscription, null, null, null, 30));
                    List singletonList2 = Collections.singletonList(new C2277e(c1357e.admob, null, null, null, 30));
                    ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                    for (C2035e c2035e3 : list2) {
                        String str8 = c2035e3.vip;
                        List list3 = c2035e3.billing;
                        String str9 = c2035e3.ad;
                        String str10 = c2035e3.metrica;
                        if (list3.isEmpty()) {
                            c5767e = null;
                        } else {
                            String str11 = (String) AbstractC13480e.m3604this(list3);
                            if (str11 == null) {
                                str11 = BuildConfig.FLAVOR;
                            }
                            c5767e = new C5767e(str11, 2);
                        }
                        arrayList2.add(new C2277e(str8, str9, str10, c5767e, 8));
                    }
                    return new C2314e(enumC14399e, str7, singletonList, singletonList2, c1769e, c1357e.license, c1357e.metrica, arrayList2, 6928);
                }
                break;
            case -1820889799:
                if (str5.equals("extended")) {
                    EnumC14399e enumC14399e2 = EnumC14399e.f28484e;
                    String str12 = c1357e.ad;
                    List singletonList3 = Collections.singletonList(new C2277e(c1357e.subscription, null, null, null, 30));
                    List singletonList4 = Collections.singletonList(new C2277e(c1357e.admob, null, null, null, 30));
                    ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                    for (C2035e c2035e4 : list2) {
                        String str13 = c2035e4.vip;
                        String str14 = c2035e4.metrica;
                        arrayList3.add(new C2277e(c2035e4.ad, str13, null, str14.length() > 0 ? new C5767e(str14, 2) : null, 4));
                    }
                    return new C2314e(enumC14399e2, str12, singletonList3, singletonList4, c1769e, c1357e.license, c1357e.metrica, arrayList3, 6928);
                }
                break;
            case 3016401:
                if (str5.equals("base")) {
                    EnumC14399e enumC14399e3 = EnumC14399e.f28479e;
                    String str15 = c1357e.ad;
                    List singletonList5 = Collections.singletonList(new C2277e(c1357e.subscription, null, null, null, 30));
                    List singletonList6 = Collections.singletonList(new C2277e(c1357e.admob, null, null, null, 30));
                    ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                    for (C2035e c2035e5 : list2) {
                        arrayList4.add(new C2277e(c2035e5.vip, c2035e5.ad, null, null, 28));
                    }
                    return new C2314e(enumC14399e3, str15, singletonList5, singletonList6, c1769e, c1357e.license, c1357e.metrica, arrayList4, 6928);
                }
                break;
            case 97436022:
                if (str5.equals("final")) {
                    return new C2314e(EnumC14399e.f28483e, c1357e.ad, Collections.singletonList(new C2277e(c1357e.subscription, null, null, null, 30)), Collections.singletonList(new C2277e(c1357e.admob, null, null, null, 30)), c1769e, c1357e.license, c1357e.metrica, null, 7952);
                }
                break;
            case 1233099618:
                if (str5.equals("welcome")) {
                    EnumC14399e enumC14399e4 = EnumC14399e.f28484e;
                    String str16 = c1357e.ad;
                    List singletonList7 = Collections.singletonList(new C2277e(c1357e.subscription, null, null, null, 30));
                    List singletonList8 = Collections.singletonList(new C2277e(c1357e.admob, null, null, null, 30));
                    String str17 = c2035e != null ? c2035e.license : null;
                    String str18 = str17 == null ? BuildConfig.FLAVOR : str17;
                    if (c2035e != null && (list = c2035e.billing) != null) {
                        str2 = (String) AbstractC13480e.m3604this(list);
                    }
                    if (str2 != null) {
                        str6 = str2;
                    }
                    return new C2314e(enumC14399e4, str16, singletonList7, singletonList8, c1769e, c1357e.license, c1357e.metrica, Collections.singletonList(new C2277e(str18, null, null, new C5767e(str6, 2), 6)), 6928);
                }
                break;
        }
        return new C2314e(EnumC14399e.f28479e, c1357e.ad, Collections.singletonList(new C2277e(c1357e.subscription, null, null, null, 30)), Collections.singletonList(new C2277e(c1357e.admob, null, null, null, 30)), c1769e, c1357e.license, c1357e.metrica, arrayList, 6928);
    }

    public final void ads(C2314e c2314e, C13770e c13770e, int i) {
        C1839e c1839e;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-770396730);
        int i2 = 2;
        int i3 = i | (c13770e2.yandex(c2314e) ? 4 : 2);
        boolean z = true;
        boolean z2 = false;
        if (!c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            c13770e2.m3659default();
        } else if (c2314e.license.isEmpty()) {
            c13770e2.m3676strictfp(1389593340);
            c13770e2.Signature(false);
        } else {
            c13770e2.m3676strictfp(1416388655);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(2), C5438e.f11678e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
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
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            c13770e2.m3676strictfp(-1388061949);
            int i5 = 0;
            for (Object obj : c2314e.license) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                String str = ((C2277e) obj).ad;
                if (i5 == 0) {
                    c13770e2.m3676strictfp(871037275);
                    c1839e = ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.adcel;
                } else {
                    c13770e2.m3676strictfp(871038556);
                    c1839e = ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.mopub;
                }
                c13770e2.Signature(z2);
                AbstractC14489e.vip(str, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 8, 0.0f, i2), 0L, 0L, null, C1812e.f4889e, i5 == 0 ? AbstractC16795e.metrica : AbstractC16795e.vip, 0L, new C7975e(3), 0L, 0, false, 0, 0, c1839e, c13770e, 1572912, 0, 129852);
                z = z;
                c13770e2 = c13770e;
                i5 = i6;
                c0115e = c0115e;
                i2 = i2;
                z2 = false;
            }
            boolean z3 = z2;
            AbstractC1786e.isPro(c13770e2, z3, z, z3);
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 8);
        }
    }

    public final void applovin(C2314e c2314e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-2090448568);
        int i2 = (c13770e2.yandex(c2314e) ? 4 : 2) | i;
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C2277e c2277e = (C2277e) AbstractC13480e.m3604this(c2314e.metrica);
            if (c2277e == null) {
                C2846e subscription = c13770e2.subscription();
                if (subscription != null) {
                    subscription.license = new C17736e(this, c2314e, i, 6);
                    return;
                }
                return;
            }
            C5767e c5767e = c2277e.appmetrica;
            String str = c2277e.ad;
            float mo497instanceof = ((InterfaceC14388e) c13770e2.adcel(AbstractC11473e.yandex)).mo497instanceof(24);
            C0115e c0115e = C0115e.f1276e;
            C5170e c5170e = C2987e.ad;
            if (c5767e != null) {
                c13770e2.m3676strictfp(472764540);
                InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
                long j = c13770e2.f27286case;
                int i3 = (int) (j ^ (j >>> 32));
                InterfaceC3483e advert = c13770e2.advert();
                InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica);
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
                AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                boolean purchase2 = c13770e2.purchase(c2277e);
                Object m3681throw = c13770e2.m3681throw();
                if (purchase2 || m3681throw == c5170e) {
                    m3681throw = str.toUpperCase(Locale.ROOT);
                    c13770e2.m3682throws(m3681throw);
                }
                AbstractC14489e.vip((String) m3681throw, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), 0L, 0L, new C6277e(1), C1812e.f4889e, AbstractC16795e.metrica, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.vip, c13770e, 1572912, 0, 129820);
                c13770e2 = c13770e;
                String str2 = c5767e.ad;
                InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                boolean metrica3 = c13770e2.metrica(mo497instanceof);
                Object m3681throw2 = c13770e2.m3681throw();
                if (metrica3 || m3681throw2 == c5170e) {
                    m3681throw2 = new C11499e(2, mo497instanceof);
                    c13770e2.m3682throws(m3681throw2);
                }
                AbstractC8461e.ad(str2, null, AbstractC12546e.yandex(metrica2, (Function1) m3681throw2), C16477e.metrica, null, c13770e2, 1572912, 1976);
                c13770e2.Signature(true);
                c13770e2.Signature(false);
            } else {
                if (str.length() > 0) {
                    c13770e2.m3676strictfp(473797026);
                    boolean purchase3 = c13770e2.purchase(c2277e);
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (purchase3 || m3681throw3 == c5170e) {
                        m3681throw3 = str.toUpperCase(Locale.ROOT);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    AbstractC14489e.vip((String) m3681throw3, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), 0L, 0L, null, C1812e.f4889e, AbstractC16795e.metrica, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.billing, c13770e, 1572912, 0, 129852);
                    c13770e2 = c13770e;
                } else {
                    c13770e2.m3676strictfp(447609466);
                }
                c13770e2.Signature(false);
            }
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription2 = c13770e2.subscription();
        if (subscription2 != null) {
            subscription2.license = new C17736e(this, c2314e, i, 7);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final void m1511class(C2314e c2314e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(684368564);
        int i2 = 2;
        int i3 = (c13770e2.yandex(c2314e) ? 4 : 2) | i;
        int i4 = 0;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            for (Object obj : c2314e.mopub) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                AbstractC0865e.ad(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, i2), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).metrica.license, AbstractC12322e.vip(C3618e.appmetrica, C3618e.vip, 0L, 0L, c13770e, 54, 12), null, null, AbstractC16653e.license(-1687176575, new C15165e((C2277e) obj, 0), c13770e), c13770e, 196614, 24);
                c13770e2 = c13770e;
                i4 = i5;
                i2 = 2;
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b7, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b9, code lost:
    
        r9 = org.conscrypt.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01bb, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c9, code lost:
    
        if (r0 == null) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void crashlytics(final defpackage.C2314e r36, final boolean r37, int r38, int r39, final defpackage.InterfaceC12864e r40, final defpackage.C2892e r41, defpackage.C13770e r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4271e.crashlytics(eؔؑۜ, boolean, int, int, eّۤۧ, eؔ۟ٓ, eٓؕۥ, int):void");
    }

    public final void firebase(C2314e c2314e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-259546018);
        int i2 = 2;
        int i3 = (c13770e2.yandex(c2314e) ? 4 : 2) | i;
        int i4 = 0;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            for (Object obj : c2314e.mopub) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                AbstractC0865e.ad(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, i2), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).metrica.license, AbstractC12322e.vip(C3618e.appmetrica, C3618e.vip, 0L, 0L, c13770e, 54, 12), null, null, AbstractC16653e.license(-986035349, new C15165e((C2277e) obj, 1), c13770e), c13770e, 196614, 24);
                c13770e2 = c13770e;
                i4 = i5;
                i2 = 2;
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 5);
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m1512goto(C2314e c2314e, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-891221502);
        int i2 = (c13770e.yandex(c2314e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e2 = c13770e;
            isPro(new C2277e("неизвестный блок", c2314e.ad.name(), null, null, 28), c2314e.ad, null, c13770e2, ((i2 << 6) & 7168) | 384);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 2);
        }
    }

    public final void inmobi(int i, int i2, C13770e c13770e) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(655679419);
        int i3 = (c13770e2.license(i) ? 4 : 2) | i2;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            C7913e c7913e = AbstractC18007e.metrica;
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c7913e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            C14486e c14486e = C14486e.ad;
            C10156e c10156e = C5438e.f11700e;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c14486e.ad(c0115e, c10156e), 16, 0.0f, 2);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11678e, c13770e2, 54);
            long j2 = c13770e2.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, smaato);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.logo_vk_music_outline_24, 0, c13770e2);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC5647e.vip(metrica, null, AbstractC18007e.startapp(c0115e, 36), ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, c13770e2, 440, 0);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, i), null, ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, AbstractC13362e.startapp(15), null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, c13770e, 24576, 0, 261098);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C13752e(this, i, i2, 7);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m1513interface(C2314e c2314e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(197133517);
        int i2 = 2;
        int i3 = (c13770e2.yandex(c2314e) ? 4 : 2) | i;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            int i4 = 0;
            for (Object obj : c2314e.mopub) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                AbstractC0865e.ad(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, i2), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).metrica.license, AbstractC12322e.vip(C3618e.appmetrica, C3618e.vip, 0L, 0L, c13770e, 54, 12), null, null, AbstractC16653e.license(-959301030, new C3174e((C2277e) obj, i4, 5), c13770e), c13770e, 196614, 24);
                c13770e2 = c13770e;
                i4 = i5;
                i2 = 2;
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (defpackage.AbstractC7890e.billing(r19.license, "artist") != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void isPro(defpackage.C2277e r19, defpackage.EnumC14399e r20, java.lang.String r21, defpackage.C13770e r22, int r23) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4271e.isPro(eؔؐؑ, eٓۧٝ, java.lang.String, eٓؕۥ, int):void");
    }

    public final void isVip(C2314e c2314e, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(740797797);
        int i2 = (c13770e.yandex(c2314e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        int i3 = 0;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            for (Object obj : c2314e.mopub) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                isPro((C2277e) obj, c2314e.ad, (String) AbstractC13480e.m3592native(i3, c2314e.appmetrica), c13770e, (i2 << 6) & 7168);
                i3 = i4;
            }
            c13770e2 = c13770e;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x006c, B:13:0x0089, B:15:0x008f, B:18:0x009a, B:23:0x009e, B:24:0x00ad, B:26:0x00b3, B:28:0x00c4), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[Catch: all -> 0x0029, LOOP:1: B:24:0x00ad->B:26:0x00b3, LOOP_END, TryCatch #1 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x006c, B:13:0x0089, B:15:0x008f, B:18:0x009a, B:23:0x009e, B:24:0x00ad, B:26:0x00b3, B:28:0x00c4), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: native, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1514native(defpackage.AbstractC10731e r6) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4271e.m1514native(eُؑ۠):java.lang.Object");
    }

    public final void premium(C2314e c2314e, C13770e c13770e, int i) {
        boolean z;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-529973338);
        int i2 = (c13770e2.yandex(c2314e) ? 4 : 2) | i | (c13770e2.yandex(this) ? 32 : 16);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11678e, c13770e2, 54);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
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
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            C16321e c16321e = c2314e.smaato;
            String str = c16321e != null ? c16321e.metrica : null;
            float f = 16;
            InterfaceC12864e metrica = AbstractC10075e.metrica(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), false);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC8461e.ad(str, null, AbstractC12447e.vip(metrica, ((C7019e) c13770e2.adcel(c15492e)).metrica.license), C16477e.purchase, null, c13770e2, 1572912, 1976);
            InterfaceC15463e interfaceC15463e = (InterfaceC15463e) this.f9365e.getValue();
            boolean z2 = interfaceC15463e instanceof C1789e;
            C5170e c5170e = C2987e.ad;
            if (z2) {
                c13770e2.m3676strictfp(-337311184);
                boolean yandex = c13770e2.yandex(this) | c13770e2.yandex(interfaceC15463e);
                Object m3681throw = c13770e2.m3681throw();
                if (yandex || m3681throw == c5170e) {
                    m3681throw = new C1708e(this, (C1789e) interfaceC15463e, 20);
                    c13770e2.m3682throws(m3681throw);
                }
                InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                C3924e c3924e = ((C7019e) c13770e2.adcel(c15492e)).metrica.license;
                C16005e c16005e = AbstractC10244e.ad;
                AbstractC1513e.ad((Function0) m3681throw, loadAd, false, c3924e, AbstractC10244e.ad(C3618e.appmetrica, C3618e.vip, 0L, 0L, c13770e, 12), null, null, null, AbstractC6401e.metrica, c13770e, 805306416, 484);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
                z = true;
            } else {
                if (!AbstractC7890e.billing(interfaceC15463e, C0451e.ad)) {
                    throw AbstractC1786e.loadAd(-10882830, c13770e2, false);
                }
                c13770e2.m3676strictfp(-336320672);
                boolean yandex2 = c13770e2.yandex(this) | c13770e2.yandex(c2314e);
                Object m3681throw2 = c13770e2.m3681throw();
                if (yandex2 || m3681throw2 == c5170e) {
                    m3681throw2 = new C1708e(this, c2314e, 21);
                    c13770e2.m3682throws(m3681throw2);
                }
                InterfaceC12864e loadAd2 = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                C3924e c3924e2 = ((C7019e) c13770e2.adcel(c15492e)).metrica.license;
                C16005e c16005e2 = AbstractC10244e.ad;
                AbstractC1513e.ad((Function0) m3681throw2, loadAd2, false, c3924e2, AbstractC10244e.ad(C3618e.appmetrica, C3618e.vip, 0L, 0L, c13770e2, 12), null, null, null, AbstractC6401e.license, c13770e, 805306416, 484);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
                z = true;
            }
            c13770e2.Signature(z);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17736e(this, c2314e, i, 4);
        }
    }

    public final void subs(final C2314e c2314e, final boolean z, final int i, final int i2, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i3) {
        int i4;
        c13770e.m3671package(1022731781);
        if ((i3 & 6) == 0) {
            i4 = (c13770e.yandex(c2314e) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c13770e.license(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= c13770e.yandex(this) ? 131072 : 65536;
        }
        if (c13770e.m3673protected(i4 & 1, (74899 & i4) != 74898)) {
            crashlytics(c2314e, z, i, i2, interfaceC12864e, AbstractC16653e.license(1326873690, new C17630e(c2314e, this, 23), c13770e), c13770e, 196608 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | ((i4 << 3) & 3670016));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eّٜؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C4271e.this.subs(c2314e, z, i, i2, interfaceC12864e, (C13770e) obj, AbstractC5190e.advert(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-1319887812);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC9083e.ad(c13770e);
            C4254e appmetrica = AbstractC7595e.appmetrica(c13770e);
            float mo497instanceof = ((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(16);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C13465e(5, this);
                c13770e.m3682throws(m3681throw);
            }
            C16349e vip = AbstractC1742e.vip(0, (Function0) m3681throw, c13770e, 0, 3);
            Unit unit = Unit.INSTANCE;
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C16600e(this, null, 29);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
            AbstractC13348e.ad(null, AbstractC16653e.license(987814400, new C17840e(appmetrica, mo497instanceof, this), c13770e), null, null, null, 0, C3618e.vip, C3618e.appmetrica, null, AbstractC16653e.license(1708483979, new C8124e(6, this, appmetrica, vip), c13770e), c13770e, 819462192, 317);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13815e(this, i);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(1:(13:13|14|15|16|(4:19|(3:21|22|23)(1:25)|24|17)|26|27|28|(1:30)|31|(1:33)|34|35)(2:40|41))(11:42|43|44|45|(1:47)|48|(1:50)|51|52|(11:55|16|(1:17)|26|27|28|(0)|31|(0)|34|35)|54))(15:60|61|62|(1:72)(1:68)|69|(2:71|54)|44|45|(0)|48|(0)|51|52|(0)|54))(3:73|74|75))(5:91|92|93|(1:95)|54)|76|77|(1:79)|80|(2:82|83)(2:84|(2:86|54)(15:87|62|(1:64)|72|69|(0)|44|45|(0)|48|(0)|51|52|(0)|54))))|101|6|7|(0)(0)|76|77|(0)|80|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x013a, code lost:
    
        r0 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ab A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:15:0x0037, B:16:0x0188, B:17:0x01a5, B:19:0x01ab, B:22:0x01b6, B:27:0x01ba), top: B:14:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009f A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #1 {all -> 0x0050, blocks: (B:43:0x004b, B:44:0x0131, B:61:0x0055, B:62:0x00d7, B:64:0x00e1, B:66:0x00e9, B:68:0x00ed, B:69:0x0102, B:84:0x009f), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: throw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1515throw(defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4271e.m1515throw(eُؑ۠):java.lang.Object");
    }
}
