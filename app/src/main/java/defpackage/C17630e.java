package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C17630e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f34553e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34554e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34555e;

    public /* synthetic */ C17630e(AbstractC11110e abstractC11110e, Function1 function1) {
        this.f34555e = 15;
        this.f34553e = abstractC11110e;
        this.f34554e = function1;
    }

    public /* synthetic */ C17630e(Object obj, Object obj2, int i) {
        this.f34555e = i;
        this.f34554e = obj;
        this.f34553e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0296, code lost:
    
        if (r8 == r6) goto L46;
     */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object ad(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17630e.ad(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object adcel(Object obj, Object obj2, Object obj3) {
        C8510e c8510e;
        C6028e c6028e = (C6028e) this.f34554e;
        C8510e c8510e2 = (C8510e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            int i = c6028e.vip;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c8510e2);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                c8510e = c8510e2;
                C7736e c7736e = new C7736e(0, c8510e, C8510e.class, "navigateToCachedTracks", "navigateToCachedTracks()V", 0, 0, 20);
                c13770e.m3682throws(c7736e);
                m3681throw = c7736e;
            } else {
                c8510e = c8510e2;
            }
            c8510e.m2438transient(R.string.cache_library_title_virtual, i, R.drawable.ic_download_outline_28, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object advert(Object obj, Object obj2, Object obj3) {
        C14873e c14873e = (C14873e) this.f34554e;
        C6123e c6123e = (C6123e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            c14873e.m3873else(c6123e.metrica, c6123e.ad.subs, AbstractC16653e.license(-1405875730, new C9130e(c14873e, c6123e, 16), c13770e), AbstractC16653e.license(-173744435, new C17689e(18, c6123e), c13770e), c13770e, 3456);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        C2314e c2314e = (C2314e) this.f34554e;
        C4271e c4271e = (C4271e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            switch (c2314e.ad.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 5:
                case 6:
                case 8:
                    c13770e.m3676strictfp(-479661719);
                    c4271e.isVip(c2314e, c13770e, 0);
                    c13770e.Signature(false);
                    break;
                case 3:
                    c13770e.m3676strictfp(-479659928);
                    c4271e.m1513interface(c2314e, c13770e, 0);
                    c13770e.Signature(false);
                    break;
                case 4:
                    c13770e.m3676strictfp(-479655956);
                    c4271e.firebase(c2314e, c13770e, 0);
                    c13770e.Signature(false);
                    break;
                case 7:
                    c13770e.m3676strictfp(-479653715);
                    c4271e.premium(c2314e, c13770e, 0);
                    c13770e.Signature(false);
                    break;
                case 9:
                default:
                    c13770e.m3676strictfp(-479650036);
                    c4271e.m1512goto(c2314e, c13770e, 0);
                    c13770e.Signature(false);
                    break;
                case 10:
                    c13770e.m3676strictfp(-479658002);
                    c4271e.m1511class(c2314e, c13770e, 0);
                    c13770e.Signature(false);
                    break;
            }
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f34554e;
        Function0 function02 = (Function0) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        boolean z = (intValue & 17) != 16;
        AbstractC7919e abstractC7919e = c13770e.ad;
        if (c13770e.m3673protected(intValue & 1, z)) {
            C0115e c0115e = C0115e.f1276e;
            float f = 16;
            InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC9546e.license(c0115e, false, null, function0, 15), f);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, mopub);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e, 48);
            long j2 = c13770e.f27286case;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC8703e.premium(i2, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.ad(C1839e.ad(((C7019e) c13770e.adcel(c15492e)).vip.smaato, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, 0L, 0L, null, null, 16777214), AbstractC16653e.license(-2049493487, new C8436e((byte) 0, 29), c13770e), c13770e, 48);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e, new C5228e(1.0f, true));
            AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_dismiss_24, 0, c13770e);
            C6144e ad3 = AbstractC17394e.ad(4, 20);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            AbstractC5647e.vip(metrica, null, AbstractC9546e.metrica(c0115e, (C15274e) m3681throw, ad3, false, new C11796e(0), function02, 12), 0L, c13770e, 56, 8);
            c13770e.Signature(true);
            AbstractC14489e.ad(((C7019e) c13770e.adcel(c15492e)).vip.mopub, AbstractC16653e.license(-307005387, new C17706e(0), c13770e), c13770e, 48);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        C8510e c8510e;
        C4093e c4093e = (C4093e) this.f34554e;
        C8510e c8510e2 = (C8510e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            int i = c4093e.ad;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c8510e2);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                c8510e = c8510e2;
                C7736e c7736e = new C7736e(0, c8510e, C8510e.class, "navigateToAllTracks", "navigateToAllTracks()V", 0, 0, 21);
                c13770e.m3682throws(c7736e);
                m3681throw = c7736e;
            } else {
                c8510e = c8510e2;
            }
            c8510e.m2438transient(R.string.fake_catalog_tracks_all, i, R.drawable.ic_article_outline_28, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object purchase(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f34554e;
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean purchase = c13770e.purchase(function0);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C1708e(function0, interfaceC3314e, 16);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC1513e.license((Function0) m3681throw, null, false, null, null, null, AbstractC1284e.appmetrica, c13770e, 805306368, 510);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object smaato(Object obj, Object obj2, Object obj3) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f34554e;
        C9013e c9013e = (C9013e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(interfaceC18435e) | c13770e.yandex(c9013e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1708e(interfaceC18435e, c9013e, 27);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16519e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3) {
        C8510e c8510e;
        Object c7736e;
        C8510e c8510e2 = (C8510e) this.f34554e;
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC0822e interfaceC0822e = (InterfaceC0822e) interfaceC16132e.getValue();
            C3197e c3197e = interfaceC0822e instanceof C3197e ? (C3197e) interfaceC0822e : null;
            int i = c3197e != null ? c3197e.vip : 0;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c8510e2);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                c8510e = c8510e2;
                c7736e = new C7736e(0, c8510e, C8510e.class, "navigateToMyLibrary", "navigateToMyLibrary()V", 0, 0, 19);
                c13770e.m3682throws(c7736e);
            } else {
                c8510e = c8510e2;
                c7736e = m3681throw;
            }
            c8510e.m2438transient(R.string.cache_library_header, i, R.drawable.ic_profile_28, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) c7736e), 15), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2, Object obj3) {
        C5170e c5170e;
        C16918e c16918e = (C16918e) this.f34554e;
        Function0 function0 = (Function0) this.f34553e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            c13770e.m3676strictfp(-1670571729);
            C1630e c1630e = new C1630e(0, EnumC3144e.f7214e);
            while (true) {
                boolean hasNext = c1630e.hasNext();
                c5170e = C2987e.ad;
                if (!hasNext) {
                    break;
                }
                EnumC3144e enumC3144e = (EnumC3144e) c1630e.next();
                C2892e license = AbstractC16653e.license(-514747999, new C17689e(9, enumC3144e), c13770e);
                boolean yandex = c13770e.yandex(c16918e) | c13770e.license(enumC3144e.ordinal()) | c13770e.purchase(function0);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == c5170e) {
                    m3681throw = new Csynchronized(16, c16918e, enumC3144e, function0);
                    c13770e.m3682throws(m3681throw);
                }
                AbstractC4709e.vip(license, (Function0) m3681throw, null, null, AbstractC16653e.license(-634563419, new C9130e(enumC3144e, c16918e, 1), c13770e), false, null, null, c13770e, 24582, 492);
            }
            c13770e.Signature(false);
            AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
            boolean yandex2 = c13770e.yandex(c16918e) | c13770e.purchase(function0);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C1708e(c16918e, function0, 12);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC4709e.vip(AbstractC13510e.ad, (Function0) m3681throw2, null, null, AbstractC16653e.license(-1952175293, new C2068e(c16918e), c13770e), false, null, null, c13770e, 24582, 492);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v86 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3924e c3924e;
        ?? r1;
        C0115e c0115e;
        boolean z;
        boolean z2;
        int i = this.f34555e;
        int i2 = 28;
        int i3 = 8;
        EnumC11342e enumC11342e = EnumC11342e.f22808e;
        int i4 = 15;
        int i5 = 6;
        C0115e c0115e2 = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        int i6 = 16;
        Object obj4 = this.f34553e;
        Object obj5 = this.f34554e;
        switch (i) {
            case 0:
                AbstractC6401e.license((Function1) obj5, obj4, (InterfaceC8850e) obj3);
                return Unit.INSTANCE;
            case 1:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj5;
                Function3 function3 = (Function3) obj4;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC10600e.ad(((C10375e) c13770e.adcel(AbstractC17878e.ad)).smaato, AbstractC16653e.license(311252164, new C18170e(interfaceC12123e, function3, 0), c13770e), c13770e, 48);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C15435e c15435e = (C15435e) obj5;
                CachedTrack cachedTrack = (CachedTrack) obj4;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z3 = c15435e.m4167private() == enumC11342e;
                    AbstractC16049e m4166package = c15435e.m4166package();
                    AbstractC8230e.ad(z3, AbstractC7890e.billing(m4166package != null ? m4166package.Signature() : null, cachedTrack.applovin()), AbstractC16653e.license(1693648202, new C11044e(cachedTrack, 0), c13770e2), c13770e2, 384);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C5250e c5250e = (C5250e) obj5;
                CachedTrack cachedTrack2 = (CachedTrack) obj4;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean z4 = c5250e.m4167private() == enumC11342e;
                    AbstractC16049e m4166package2 = c5250e.m4166package();
                    AbstractC8230e.ad(z4, AbstractC7890e.billing(m4166package2 != null ? m4166package2.Signature() : null, cachedTrack2.applovin()), AbstractC16653e.license(-1130007080, new C11044e(cachedTrack2, 5), c13770e3), c13770e3, 384);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                Function1 function1 = (Function1) obj5;
                C16641e c16641e = (C16641e) obj4;
                C15274e c15274e = (C15274e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.purchase(c15274e) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean purchase = c13770e4.purchase(function1) | c13770e4.yandex(c16641e);
                    Object m3681throw = c13770e4.m3681throw();
                    if (purchase || m3681throw == c5170e) {
                        m3681throw = new Celse(function1, c16641e, i2);
                        c13770e4.m3682throws(m3681throw);
                    }
                    AbstractC5190e.ad((Function0) m3681throw, null, null, null, null, null, null, c15274e, AbstractC16653e.license(688681895, new C6599e(12, c16641e), c13770e4), c13770e4, ((intValue4 << 24) & 234881024) | 805306368, 254);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                return (InterfaceC17242e) ((Function4) obj5).invoke((InterfaceC13158e) obj, (InterfaceC16719e) obj2, (C5602e) obj3, ((C16646e) obj4).ad.getValue());
            case 6:
                C14623e c14623e = (C14623e) obj5;
                C3566e c3566e = (C3566e) obj4;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Object obj6 = c14623e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    long j = ((C7019e) c13770e5.adcel(c15492e)).ad.Signature;
                    if (c14623e.license) {
                        c13770e5.m3676strictfp(-992728003);
                        c3924e = ((C7019e) c13770e5.adcel(c15492e)).metrica.appmetrica;
                        c13770e5.Signature(false);
                    } else {
                        c13770e5.m3676strictfp(-992635871);
                        c3924e = ((C7019e) c13770e5.adcel(c15492e)).metrica.metrica;
                        c13770e5.Signature(false);
                    }
                    InterfaceC12864e vip = AbstractC12447e.vip(c0115e2, c3924e);
                    InterfaceC17220e interfaceC17220e = (InterfaceC17220e) c13770e5.adcel(AbstractC10746e.ad);
                    boolean yandex = c13770e5.yandex(c3566e);
                    Object m3681throw2 = c13770e5.m3681throw();
                    if (yandex || m3681throw2 == c5170e) {
                        m3681throw2 = new C7604e(c3566e, 1);
                        c13770e5.m3682throws(m3681throw2);
                    }
                    Function0 function0 = (Function0) m3681throw2;
                    boolean yandex2 = c13770e5.yandex(c3566e);
                    Object m3681throw3 = c13770e5.m3681throw();
                    if (yandex2 || m3681throw3 == c5170e) {
                        m3681throw3 = new C7604e(c3566e, 2);
                        c13770e5.m3682throws(m3681throw3);
                    }
                    AbstractC8636e.ad(obj6, 0, j, 0L, 0, 0.0f, false, AbstractC10432e.ad, null, AbstractC9546e.appmetrica(vip, null, interfaceC17220e, false, function0, (Function0) m3681throw3, 444), c13770e5, 12582912, 378);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C3566e c3566e2 = (C3566e) obj5;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj4;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                    c3566e2.inmobi(c3566e2.f8044e, ((Boolean) interfaceC16132e.getValue()).booleanValue(), AbstractC18007e.metrica(c0115e2, 1.0f), c13770e6, 384);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C3274e c3274e = (C3274e) obj5;
                C18478e c18478e = (C18478e) obj4;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                boolean z5 = (intValue7 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e7.ad;
                if (c13770e7.m3673protected(intValue7 & 1, z5)) {
                    C9616e c9616e = AbstractC16497e.metrica;
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad = AbstractC14801e.ad(c9616e, c9577e, c13770e7, 0);
                    long j2 = c13770e7.f27286case;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert = c13770e7.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e7, c0115e2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e7, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e7, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i7);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e7, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e7, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e7, purchase2, c14865e4);
                    float f = 8;
                    C13964e billing = AbstractC16497e.billing(f);
                    C14544e c14544e = C5438e.f11668e;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e2, 16);
                    C8587e ad2 = AbstractC6451e.ad(billing, c14544e, c13770e7, 54);
                    long j3 = c13770e7.f27286case;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert2 = c13770e7.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e7, mopub);
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e7, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e7, advert2, c14865e2);
                    AbstractC8703e.premium(i8, c13770e7, c14865e3, c13770e7, c5430e);
                    AbstractC2270e.yandex(c13770e7, purchase3, c14865e4);
                    C3533e c3533e = C3533e.ad;
                    InterfaceC12864e ad3 = c3533e.ad(c0115e2, 1.0f, true);
                    C4789e ad4 = AbstractC14801e.ad(c9616e, c9577e, c13770e7, 0);
                    long j4 = c13770e7.f27286case;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert3 = c13770e7.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e7, ad3);
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e7, ad4, c14865e);
                    AbstractC2270e.yandex(c13770e7, advert3, c14865e2);
                    AbstractC8703e.premium(i9, c13770e7, c14865e3, c13770e7, c5430e);
                    AbstractC2270e.yandex(c13770e7, purchase4, c14865e4);
                    String str = c3274e.ad;
                    C10985e c10985e = c3274e.appmetrica;
                    C10985e c10985e2 = c3274e.license;
                    Integer num = c3274e.metrica;
                    AbstractC14489e.vip(str, null, AbstractC0903e.license(c13770e7).admob, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e7).yandex, c13770e7, 0, 24960, 110586);
                    String str2 = c3274e.vip;
                    if (str2 == null || str2.length() == 0) {
                        r1 = 0;
                        c13770e7.m3676strictfp(-1265839614);
                    } else {
                        c13770e7.m3676strictfp(-1261440931);
                        AbstractC14489e.vip(c3274e.vip, null, AbstractC0903e.license(c13770e7).remoteconfig, 0L, null, null, null, 0L, null, 0L, 2, false, 4, 0, AbstractC0903e.billing(c13770e7).mopub, c13770e7, 0, 24960, 110586);
                        r1 = 0;
                    }
                    c13770e7.Signature(r1);
                    c13770e7.Signature(true);
                    if (num == null || num.intValue() == 0) {
                        c0115e = c0115e2;
                        c13770e7.m3676strictfp(-338593448);
                    } else {
                        c13770e7.m3676strictfp(-333673779);
                        c0115e = c0115e2;
                        AbstractC5647e.vip(AbstractC12475e.metrica(num.intValue(), r1, c13770e7), null, AbstractC18007e.startapp(c0115e, 32), AbstractC0903e.license(c13770e7).ad, c13770e7, 440, 0);
                    }
                    c13770e7.Signature(r1);
                    c13770e7.Signature(true);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e7, 0, 7);
                    C13964e billing2 = AbstractC16497e.billing(f);
                    InterfaceC12864e vip2 = AbstractC17113e.vip(c0115e);
                    C8587e ad5 = AbstractC6451e.ad(billing2, c14544e, c13770e7, 54);
                    long j5 = c13770e7.f27286case;
                    int i10 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert4 = c13770e7.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e7, vip2);
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e7, ad5, c14865e);
                    AbstractC2270e.yandex(c13770e7, advert4, c14865e2);
                    AbstractC8703e.premium(i10, c13770e7, c14865e3, c13770e7, c5430e);
                    AbstractC2270e.yandex(c13770e7, purchase5, c14865e4);
                    if (c10985e2 == null) {
                        c13770e7.m3676strictfp(1860337637);
                    } else {
                        c13770e7.m3676strictfp(1860337638);
                        int intValue8 = ((Number) c10985e2.f21742e).intValue();
                        String str3 = (String) c10985e2.f21741e;
                        Function0 function02 = (Function0) c10985e2.f21740e;
                        C16005e c16005e = AbstractC10244e.ad;
                        c18478e.Signature(function02, str3, intValue8, AbstractC10244e.license(((C7019e) c13770e7.adcel(AbstractC11785e.ad)).ad), c3533e.ad(c0115e, 1.0f, true), c13770e7, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    c13770e7.Signature(false);
                    if (c10985e2 == null || c10985e == null) {
                        z = false;
                        c13770e7.m3676strictfp(1854744897);
                    } else {
                        c13770e7.m3676strictfp(1860620544);
                        AbstractC8141e.appmetrica(null, 0.0f, 0L, c13770e7, 0, 7);
                        z = false;
                    }
                    c13770e7.Signature(z);
                    if (c10985e == null) {
                        c13770e7.m3676strictfp(1860743024);
                        c13770e7.Signature(z);
                        z2 = true;
                    } else {
                        c13770e7.m3676strictfp(1860743025);
                        int intValue9 = ((Number) c10985e.f21742e).intValue();
                        String str4 = (String) c10985e.f21741e;
                        Function0 function03 = (Function0) c10985e.f21740e;
                        C16005e c16005e2 = AbstractC10244e.ad;
                        z2 = true;
                        c18478e.Signature(function03, str4, intValue9, AbstractC10244e.purchase(AbstractC0903e.license(c13770e7).remoteconfig, 0L, c13770e7, 13), c3533e.ad(c0115e, 1.0f, true), c13770e7, 0);
                        Unit unit2 = Unit.INSTANCE;
                        c13770e7.Signature(false);
                    }
                    c13770e7.Signature(z2);
                    c13770e7.Signature(z2);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C16929e c16929e = (C16929e) obj5;
                C0764e c0764e = (C0764e) obj4;
                C13770e c13770e8 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue10 & 1, (intValue10 & 17) != 16)) {
                    boolean yandex3 = c13770e8.yandex(c16929e) | c13770e8.purchase(c0764e);
                    Object m3681throw4 = c13770e8.m3681throw();
                    if (yandex3 || m3681throw4 == c5170e) {
                        m3681throw4 = new C10479e(c16929e, c0764e);
                        c13770e8.m3682throws(m3681throw4);
                    }
                    AbstractC1513e.license((Function0) m3681throw4, AbstractC12220e.loadAd(AbstractC18007e.metrica(c0115e2, 1.0f), 0.0f, 0.0f, 0.0f, 16, 7), false, null, null, null, AbstractC15920e.appmetrica, c13770e8, 805306416, 508);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                Function1 function12 = (Function1) obj5;
                C12776e c12776e = (C12776e) obj4;
                C13770e c13770e9 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c13770e9.m3673protected(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Object m3681throw5 = c13770e9.m3681throw();
                    if (m3681throw5 == c5170e) {
                        m3681throw5 = new C8024e();
                        c13770e9.m3682throws(m3681throw5);
                    }
                    C8024e c8024e = (C8024e) m3681throw5;
                    c8024e.ad.clear();
                    function12.invoke(c8024e);
                    c8024e.ad(c12776e, c13770e9, 0);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C2616e c2616e = (C2616e) obj5;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj4;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (c13770e10.m3673protected(intValue12 & 1, (intValue12 & 17) != 16)) {
                    float f2 = 16;
                    C13964e billing3 = AbstractC16497e.billing(f2);
                    InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e2, f2, 0.0f, 2);
                    C8587e ad6 = AbstractC6451e.ad(billing3, C5438e.f11668e, c13770e10, 54);
                    long j6 = c13770e10.f27286case;
                    int i11 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert5 = c13770e10.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e10, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e2);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e10, ad6, C2721e.billing);
                    AbstractC2270e.yandex(c13770e10, advert5, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e10, Integer.valueOf(i11), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e10, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e10, purchase6, C2721e.license);
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.settings_crossfade_seconds_fmt, new Object[]{1}, c13770e10), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e10, 0, 0, 262142);
                    float purchase7 = c2616e.purchase();
                    C5015e c5015e = AbstractC0608e.ad;
                    long j7 = ((C3618e) c13770e10.adcel(c5015e)).ad;
                    long j8 = ((C3618e) c13770e10.adcel(c5015e)).ad;
                    long j9 = ((C7019e) c13770e10.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                    long j10 = C3618e.startapp;
                    C14607e purchase8 = AbstractC11750e.purchase(j7, j8, j9, j10, j10, c13770e10, 14155776, 818);
                    C3721e c3721e = new C3721e(0.0f, 12.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e = new C5228e(1.0f, true);
                    boolean purchase9 = c13770e10.purchase(c2616e);
                    Object m3681throw6 = c13770e10.m3681throw();
                    if (purchase9 || m3681throw6 == c5170e) {
                        m3681throw6 = new C4976e(c2616e, 2);
                        c13770e10.m3682throws(m3681throw6);
                    }
                    Function1 function13 = (Function1) m3681throw6;
                    boolean yandex4 = c13770e10.yandex(interfaceC18435e) | c13770e10.purchase(c2616e);
                    Object m3681throw7 = c13770e10.m3681throw();
                    if (yandex4 || m3681throw7 == c5170e) {
                        m3681throw7 = new C5625e(interfaceC18435e, c2616e, 7);
                        c13770e10.m3682throws(m3681throw7);
                    }
                    AbstractC8741e.vip(purchase7, function13, c5228e, false, c3721e, 11, (Function0) m3681throw7, null, purchase8, c13770e10, 196608, 136);
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.settings_crossfade_seconds_fmt, new Object[]{12}, c13770e10), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e10, 0, 0, 262142);
                    c13770e10.Signature(true);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C5838e c5838e = (C5838e) obj5;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                C13770e c13770e11 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(intValue13 & 1, (intValue13 & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e2, 1.0f);
                    C16005e metrica2 = AbstractC12220e.metrica(0.0f, 12, 1);
                    C16005e c16005e3 = AbstractC10244e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    C3134e ad7 = AbstractC10244e.ad(((C7019e) c13770e11.adcel(c15492e2)).ad.f18924class, ((C7019e) c13770e11.adcel(c15492e2)).ad.admob, 0L, 0L, c13770e11, 12);
                    C3924e c3924e2 = ((C7019e) c13770e11.adcel(c15492e2)).metrica.metrica;
                    boolean yandex5 = c13770e11.yandex(c5838e);
                    Object m3681throw8 = c13770e11.m3681throw();
                    if (yandex5 || m3681throw8 == c5170e) {
                        m3681throw8 = new C4408e(c5838e, false ? 1 : 0);
                        c13770e11.m3682throws(m3681throw8);
                    }
                    AbstractC1513e.ad((Function0) m3681throw8, metrica, false, c3924e2, ad7, null, null, metrica2, AbstractC16653e.license(-346491211, new C3584e(interfaceC3314e, 5), c13770e11), c13770e11, 817889328, 356);
                    AbstractC12534e.ad(c13770e11, AbstractC18007e.license(c0115e2, 16));
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                C13770e c13770e12 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                c13770e12.m3676strictfp(-353972293);
                ((InterfaceC17220e) obj5).ad((C15274e) obj4, c13770e12);
                C1400e c1400e = C1400e.f4208e;
                boolean purchase10 = c13770e12.purchase(c1400e);
                Object m3681throw9 = c13770e12.m3681throw();
                Object obj7 = m3681throw9;
                if (purchase10 || m3681throw9 == c5170e) {
                    C16862e c16862e = new C16862e(c1400e);
                    c13770e12.m3682throws(c16862e);
                    obj7 = c16862e;
                }
                C16862e c16862e2 = (C16862e) obj7;
                c13770e12.Signature(false);
                return c16862e2;
            case 14:
                C3675e c3675e = (C3675e) obj5;
                InterfaceC8370e interfaceC8370e = (InterfaceC8370e) obj4;
                AudioContentCard audioContentCard = (AudioContentCard) obj;
                C13770e c13770e13 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= (intValue14 & 8) == 0 ? c13770e13.purchase(audioContentCard) : c13770e13.yandex(audioContentCard) ? 4 : 2;
                }
                if (c13770e13.m3673protected(intValue14 & 1, (intValue14 & 19) != 18)) {
                    boolean yandex6 = c13770e13.yandex(c3675e);
                    Object m3681throw10 = c13770e13.m3681throw();
                    if (yandex6 || m3681throw10 == c5170e) {
                        m3681throw10 = new C12851e(i4, c3675e);
                        c13770e13.m3682throws(m3681throw10);
                    }
                    Function0 function04 = (Function0) m3681throw10;
                    boolean yandex7 = c13770e13.yandex(interfaceC8370e);
                    Object m3681throw11 = c13770e13.m3681throw();
                    if (yandex7 || m3681throw11 == c5170e) {
                        m3681throw11 = new C12851e(i6, interfaceC8370e);
                        c13770e13.m3682throws(m3681throw11);
                    }
                    AbstractC16279e.ad(audioContentCard, function04, (Function0) m3681throw11, false, c13770e13, 3080 | (intValue14 & 14));
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                AbstractC11110e abstractC11110e = (AbstractC11110e) obj4;
                Function1 function14 = (Function1) obj5;
                C10023e c10023e = (C10023e) obj;
                C13770e c13770e14 = (C13770e) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= c13770e14.purchase(c10023e) ? 4 : 2;
                }
                if (c13770e14.m3673protected(intValue15 & 1, (intValue15 & 19) != 18)) {
                    InterfaceC12864e ad8 = c10023e.ad(AbstractC12220e.mopub(c0115e2, 4), 1.0f, true);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    InterfaceC12864e metrica3 = AbstractC16136e.metrica(AbstractC12447e.vip(ad8, ((C7019e) c13770e14.adcel(c15492e3)).metrica.metrica), ((C7019e) c13770e14.adcel(c15492e3)).ad.f18939interface, AbstractC10432e.ad);
                    ListIterator listIterator = abstractC11110e.listIterator(0);
                    while (listIterator.hasNext()) {
                        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) listIterator.next();
                        c13770e14.m3662final(1180339721, customCatalogBlockItem.appmetrica);
                        boolean purchase11 = c13770e14.purchase(function14) | c13770e14.yandex(customCatalogBlockItem);
                        Object m3681throw12 = c13770e14.m3681throw();
                        if (purchase11 || m3681throw12 == c5170e) {
                            m3681throw12 = new C1708e(function14, customCatalogBlockItem, 1);
                            c13770e14.m3682throws(m3681throw12);
                        }
                        AbstractC4465e.vip(customCatalogBlockItem, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw12, 15), c13770e14, 0);
                        c13770e14.Signature(false);
                    }
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                return ad(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C16918e c16918e = (C16918e) obj5;
                Function0 function05 = (Function0) obj4;
                C13770e c13770e15 = (C13770e) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if (c13770e15.m3673protected(intValue16 & 1, (intValue16 & 17) != 16)) {
                    c13770e15.m3676strictfp(1205200615);
                    C1630e c1630e = new C1630e(0, EnumC12987e.f25891e);
                    while (c1630e.hasNext()) {
                        EnumC12987e enumC12987e = (EnumC12987e) c1630e.next();
                        C2892e license = AbstractC16653e.license(-712872615, new C17689e(i5, enumC12987e), c13770e15);
                        boolean yandex8 = c13770e15.yandex(c16918e) | c13770e15.license(enumC12987e.ordinal()) | c13770e15.purchase(function05);
                        Object m3681throw13 = c13770e15.m3681throw();
                        if (yandex8 || m3681throw13 == c5170e) {
                            m3681throw13 = new Csynchronized(i4, c16918e, enumC12987e, function05);
                            c13770e15.m3682throws(m3681throw13);
                        }
                        AbstractC4709e.vip(license, (Function0) m3681throw13, null, null, AbstractC16653e.license(-832688035, new C17785e(enumC12987e, c16918e, 27), c13770e15), false, null, null, c13770e15, 24582, 492);
                    }
                    c13770e15.Signature(false);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e15, 0, 7);
                    boolean yandex9 = c13770e15.yandex(c16918e) | c13770e15.purchase(function05);
                    Object m3681throw14 = c13770e15.m3681throw();
                    if (yandex9 || m3681throw14 == c5170e) {
                        m3681throw14 = new C1708e(c16918e, function05, 9);
                        c13770e15.m3682throws(m3681throw14);
                    }
                    AbstractC4709e.vip(AbstractC8228e.ad, (Function0) m3681throw14, null, null, AbstractC16653e.license(2144667387, new C17689e(7, c16918e), c13770e15), false, null, null, c13770e15, 24582, 492);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C17158e c17158e = (C17158e) obj5;
                Function0 function06 = (Function0) obj4;
                C13770e c13770e16 = (C13770e) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if (c13770e16.m3673protected(intValue17 & 1, (intValue17 & 17) != 16)) {
                    boolean yandex10 = c13770e16.yandex(c17158e) | c13770e16.purchase(function06);
                    Object m3681throw15 = c13770e16.m3681throw();
                    if (yandex10 || m3681throw15 == c5170e) {
                        m3681throw15 = new C1708e(c17158e, function06, 11);
                        c13770e16.m3682throws(m3681throw15);
                    }
                    AbstractC4709e.vip(AbstractC17331e.vip, (Function0) m3681throw15, null, null, AbstractC16653e.license(-1322337255, new C17689e(i3, c17158e), c13770e16), false, null, null, c13770e16, 24582, 492);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return vip(obj, obj2, obj3);
            case 20:
                return license(obj, obj2, obj3);
            case 21:
                C2921e c2921e = (C2921e) obj5;
                CachedTrack cachedTrack3 = (CachedTrack) obj4;
                C13770e c13770e17 = (C13770e) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if (c13770e17.m3673protected(intValue18 & 1, (intValue18 & 17) != 16)) {
                    boolean z6 = c2921e.m4167private() == enumC11342e;
                    AbstractC16049e m4166package3 = c2921e.m4166package();
                    AbstractC8230e.ad(z6, AbstractC7890e.billing(m4166package3 != null ? m4166package3.Signature() : null, cachedTrack3.applovin()), AbstractC16653e.license(-826371006, new C11044e(cachedTrack3, i5), c13770e17), c13770e17, 384);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                return purchase(obj, obj2, obj3);
            case 23:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return startapp(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return adcel(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return mopub(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return advert(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return smaato(obj, obj2, obj3);
            default:
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) obj5;
                C9013e c9013e = (C9013e) obj4;
                C13770e c13770e18 = (C13770e) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if (c13770e18.m3673protected(intValue19 & 1, (intValue19 & 17) != 16)) {
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e2, 1.0f);
                    boolean purchase12 = c13770e18.purchase(interfaceC16132e2) | c13770e18.yandex(c9013e);
                    Object m3681throw16 = c13770e18.m3681throw();
                    if (purchase12 || m3681throw16 == c5170e) {
                        m3681throw16 = new C1708e(c9013e, interfaceC16132e2, i2);
                        c13770e18.m3682throws(m3681throw16);
                    }
                    AbstractC16429e.ad(AbstractC16519e.appmetrica, AbstractC9546e.license(metrica4, false, null, (Function0) m3681throw16, 15), null, AbstractC16519e.purchase, null, AbstractC16653e.license(-749136434, new C9130e(c9013e, interfaceC16132e2, 20), c13770e18), null, 0.0f, 0.0f, c13770e18, 199686, 468);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
