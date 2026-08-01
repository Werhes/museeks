package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1870e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4994e;

    public /* synthetic */ C1870e(int i) {
        this.f4994e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnumC14289e enumC14289e;
        Object ad;
        switch (this.f4994e) {
            case 0:
                C12347e c12347e = (C12347e) obj2;
                return AbstractC6874e.ad(Integer.valueOf((int) (c12347e.ad >> 32)), Integer.valueOf((int) (4294967295L & c12347e.ad)));
            case 1:
                C13840e c13840e = (C13840e) obj;
                C13973e c13973e = (C13973e) obj2;
                return AbstractC6874e.ad(AbstractC4768e.ad(new C3618e(c13973e.ad), AbstractC4768e.Signature, c13840e), AbstractC4768e.ad(new C2152e(c13973e.vip), AbstractC4768e.inmobi, c13840e), Float.valueOf(c13973e.metrica));
            case 2:
                return Integer.valueOf(((C7975e) obj2).ad);
            case 3:
                return Integer.valueOf(((C7613e) obj2).ad);
            case 4:
                return Integer.valueOf(((C18235e) obj2).ad);
            case 5:
                return Integer.valueOf(((C6277e) obj2).ad);
            case 6:
                return Integer.valueOf(((C5208e) obj2).ad);
            case 7:
                C12973e c12973e = (C12973e) obj2;
                return c12973e == null ? false : C12973e.ad(c12973e.ad, C12973e.metrica) ? Boolean.FALSE : AbstractC6874e.ad(Float.valueOf(C12973e.metrica(c12973e.ad)), AbstractC4768e.ad(new C4616e(C12973e.vip(c12973e.ad)), AbstractC4768e.isVip, (C13840e) obj));
            case 8:
                C5320e c5320e = (C5320e) obj2;
                return AbstractC6874e.ad(c5320e.ad, AbstractC4768e.ad(c5320e.vip, AbstractC4768e.startapp, (C13840e) obj));
            case 9:
                long j = ((C4616e) obj2).ad;
                if (C4616e.ad(j, 8589934592L)) {
                    return 0;
                }
                if (C4616e.ad(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 10:
                C2152e c2152e = (C2152e) obj2;
                return c2152e == null ? false : C2152e.vip(c2152e.ad, 9205357640488583168L) ? Boolean.FALSE : AbstractC6874e.ad(Float.valueOf(Float.intBitsToFloat((int) (c2152e.ad >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & c2152e.ad))));
            case 11:
                C13840e c13840e2 = (C13840e) obj;
                C9363e c9363e = (C9363e) obj2;
                Object obj3 = c9363e.ad;
                if (obj3 instanceof C6191e) {
                    enumC14289e = EnumC14289e.f28259e;
                } else if (obj3 instanceof C4282e) {
                    enumC14289e = EnumC14289e.f28256e;
                } else if (obj3 instanceof C18475e) {
                    enumC14289e = EnumC14289e.f28255e;
                } else if (obj3 instanceof C8249e) {
                    enumC14289e = EnumC14289e.f28258e;
                } else if (obj3 instanceof C1611e) {
                    enumC14289e = EnumC14289e.f28254e;
                } else if (obj3 instanceof C5320e) {
                    enumC14289e = EnumC14289e.f28261e;
                } else {
                    if (!(obj3 instanceof C9092e)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC14289e = EnumC14289e.f28260e;
                }
                switch (enumC14289e.ordinal()) {
                    case 0:
                        ad = AbstractC4768e.ad((C6191e) obj3, AbstractC4768e.billing, c13840e2);
                        break;
                    case 1:
                        ad = AbstractC4768e.ad((C4282e) obj3, AbstractC4768e.yandex, c13840e2);
                        break;
                    case 2:
                        ad = AbstractC4768e.ad((C18475e) obj3, AbstractC4768e.metrica, c13840e2);
                        break;
                    case 3:
                        ad = AbstractC4768e.ad((C8249e) obj3, AbstractC4768e.license, c13840e2);
                        break;
                    case 4:
                        ad = AbstractC4768e.ad((C1611e) obj3, AbstractC4768e.appmetrica, c13840e2);
                        break;
                    case 5:
                        ad = AbstractC4768e.ad((C5320e) obj3, AbstractC4768e.purchase, c13840e2);
                        break;
                    case 6:
                        ad = ((C9092e) obj3).ad;
                        break;
                    default:
                        throw new C14803e(10);
                }
                return AbstractC6874e.ad(enumC14289e, ad, Integer.valueOf(c9363e.vip), Integer.valueOf(c9363e.metrica), c9363e.license);
            case 12:
                C13840e c13840e3 = (C13840e) obj;
                List list = ((C4622e) obj2).f9951e;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(AbstractC4768e.ad((C0768e) list.get(i), AbstractC4768e.applovin, c13840e3));
                }
                return arrayList;
            case 13:
                return ((C0768e) obj2).ad.toLanguageTag();
            case 14:
                C13840e c13840e4 = (C13840e) obj;
                C14917e c14917e = (C14917e) obj2;
                return AbstractC6874e.ad(AbstractC4768e.ad(new C17979e(c14917e.ad), AbstractC4768e.premium, c13840e4), AbstractC4768e.ad(new C0741e(c14917e.vip), AbstractC4768e.subs, c13840e4), AbstractC4768e.ad(new C11939e(c14917e.metrica), AbstractC4768e.crashlytics, c13840e4));
            case 15:
                return Float.valueOf(((C17979e) obj2).ad);
            case 16:
                return Integer.valueOf(((C0741e) obj2).ad);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Integer.valueOf(((C11939e) obj2).ad);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C18475e) obj2).ad;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C13840e c13840e5 = (C13840e) obj;
                C6191e c6191e = (C6191e) obj2;
                Object ad2 = AbstractC4768e.ad(new C7975e(c6191e.ad), AbstractC4768e.admob, c13840e5);
                Object ad3 = AbstractC4768e.ad(new C7613e(c6191e.vip), AbstractC4768e.subscription, c13840e5);
                Object ad4 = AbstractC4768e.ad(new C12973e(c6191e.metrica), AbstractC4768e.tapsense, c13840e5);
                C5652e c5652e = c6191e.license;
                C5652e c5652e2 = C5652e.metrica;
                Object ad5 = AbstractC4768e.ad(c5652e, AbstractC4768e.advert, c13840e5);
                Object ad6 = AbstractC4768e.ad(c6191e.appmetrica, AbstractC17287e.ad, c13840e5);
                C14917e c14917e2 = c6191e.purchase;
                C14917e c14917e3 = C14917e.license;
                return AbstractC6874e.ad(ad2, ad3, ad4, ad5, ad6, AbstractC4768e.ad(c14917e2, AbstractC4768e.ads, c13840e5), AbstractC4768e.ad(new C18285e(c6191e.billing), AbstractC17287e.metrica, c13840e5), AbstractC4768e.ad(new C18235e(c6191e.yandex), AbstractC4768e.remoteconfig, c13840e5), AbstractC4768e.ad(c6191e.startapp, AbstractC17287e.license, c13840e5));
            case 20:
                return ((C8249e) obj2).ad;
            case 21:
                C13840e c13840e6 = (C13840e) obj;
                C4282e c4282e = (C4282e) obj2;
                C3618e c3618e = new C3618e(c4282e.ad.vip());
                C16974e c16974e = AbstractC4768e.Signature;
                Object ad7 = AbstractC4768e.ad(c3618e, c16974e, c13840e6);
                C12973e c12973e2 = new C12973e(c4282e.vip);
                C16974e c16974e2 = AbstractC4768e.tapsense;
                Object ad8 = AbstractC4768e.ad(c12973e2, c16974e2, c13840e6);
                C1812e c1812e = c4282e.metrica;
                C1812e c1812e2 = C1812e.f4888e;
                Object ad9 = AbstractC4768e.ad(c1812e, AbstractC4768e.smaato, c13840e6);
                Object ad10 = AbstractC4768e.ad(c4282e.license, AbstractC4768e.pro, c13840e6);
                Object ad11 = AbstractC4768e.ad(c4282e.appmetrica, AbstractC4768e.signatures, c13840e6);
                String str = c4282e.billing;
                Object ad12 = AbstractC4768e.ad(new C12973e(c4282e.yandex), c16974e2, c13840e6);
                Object ad13 = AbstractC4768e.ad(c4282e.startapp, AbstractC4768e.amazon, c13840e6);
                Object ad14 = AbstractC4768e.ad(c4282e.adcel, AbstractC4768e.mopub, c13840e6);
                C4622e c4622e = c4282e.mopub;
                C4622e c4622e2 = C4622e.f9949e;
                Object ad15 = AbstractC4768e.ad(c4622e, AbstractC4768e.isPro, c13840e6);
                Object ad16 = AbstractC4768e.ad(new C3618e(c4282e.advert), c16974e, c13840e6);
                Object ad17 = AbstractC4768e.ad(c4282e.smaato, AbstractC4768e.adcel, c13840e6);
                C13973e c13973e2 = c4282e.amazon;
                C13973e c13973e3 = C13973e.license;
                return AbstractC6874e.ad(ad7, ad8, ad9, ad10, ad11, -1, str, ad12, ad13, ad14, ad15, ad16, ad17, AbstractC4768e.ad(c13973e2, AbstractC4768e.loadAd, c13840e6));
            case 22:
                C13840e c13840e7 = (C13840e) obj;
                C2233e c2233e = (C2233e) obj2;
                C4282e c4282e2 = c2233e.ad;
                C11883e c11883e = AbstractC4768e.yandex;
                return AbstractC6874e.ad(AbstractC4768e.ad(c4282e2, c11883e, c13840e7), AbstractC4768e.ad(c2233e.vip, c11883e, c13840e7), AbstractC4768e.ad(c2233e.metrica, c11883e, c13840e7), AbstractC4768e.ad(c2233e.license, c11883e, c13840e7));
            case 23:
                C15803e c15803e = (C15803e) obj2;
                Boolean valueOf = Boolean.valueOf(c15803e.ad);
                C11883e c11883e2 = AbstractC4768e.ad;
                return AbstractC6874e.ad(valueOf, AbstractC4768e.ad(new C14591e(c15803e.vip), AbstractC17287e.vip, (C13840e) obj));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Integer.valueOf(((C14591e) obj2).ad);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Integer.valueOf(((C18285e) obj2).ad);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C2666e c2666e = (C2666e) obj2;
                return AbstractC6874e.ad(AbstractC4768e.ad(new C6132e(c2666e.ad), AbstractC17287e.appmetrica, (C13840e) obj), Boolean.valueOf(c2666e.vip));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Integer.valueOf(((C6132e) obj2).ad);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Integer.valueOf(((C9137e) obj2).ad.purchase());
            default:
                return Long.valueOf(((C0971e) obj2).license.get());
        }
    }
}
