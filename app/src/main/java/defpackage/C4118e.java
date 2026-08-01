package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4118e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9078e;

    public /* synthetic */ C4118e(int i) {
        this.f9078e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        C2666e c2666e;
        int i5 = 0;
        switch (this.f9078e) {
            case 0:
                return new C11964e(((Integer) obj).intValue());
            case 1:
                List list = (List) obj;
                return new C3759e(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case 2:
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                C4616e[] c4616eArr = C12973e.vip;
                Function1 function1 = AbstractC4768e.tapsense.f33237e;
                Boolean bool = Boolean.FALSE;
                AbstractC7890e.billing(obj2, bool);
                long j2 = (obj2 != null ? (C12973e) function1.invoke(obj2) : null).ad;
                Object obj3 = list2.get(1);
                AbstractC7890e.billing(obj3, bool);
                return new C5652e(j2, (obj3 != null ? (C12973e) function1.invoke(obj3) : null).ad);
            case 3:
                return new C1812e(((Integer) obj).intValue());
            case 4:
                return new C8065e(((Float) obj).floatValue());
            case 5:
                List list3 = (List) obj;
                Object obj4 = list3.get(0);
                int intValue = (obj4 != null ? (Integer) obj4 : null).intValue();
                Object obj5 = list3.get(1);
                return new C12347e(AbstractC9262e.metrica(intValue, (obj5 != null ? (Integer) obj5 : null).intValue()));
            case 6:
                List list4 = (List) obj;
                Object obj6 = list4.get(0);
                int i6 = C3618e.mopub;
                C11883e c11883e = AbstractC4768e.ad;
                Boolean bool2 = Boolean.FALSE;
                AbstractC7890e.billing(obj6, bool2);
                long j3 = (obj6 != null ? AbstractC7890e.billing(obj6, Boolean.FALSE) ? new C3618e(C3618e.adcel) : new C3618e(AbstractC6532e.vip(((Integer) obj6).intValue())) : null).ad;
                Object obj7 = list4.get(1);
                C16974e c16974e = AbstractC4768e.inmobi;
                AbstractC7890e.billing(obj7, bool2);
                long j4 = (obj7 != null ? (C2152e) c16974e.f33237e.invoke(obj7) : null).ad;
                Object obj8 = list4.get(2);
                return new C13973e(j3, j4, (obj8 != null ? (Float) obj8 : null).floatValue());
            case 7:
                return new C7975e(((Integer) obj).intValue());
            case 8:
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                String str = obj9 != null ? (String) obj9 : null;
                Object obj10 = list5.get(1);
                return new C1611e(str, (AbstractC7890e.billing(obj10, Boolean.FALSE) || obj10 == null) ? null : (C2233e) ((Function1) AbstractC4768e.startapp.f23814e).invoke(obj10), null);
            case 9:
                return new C7613e(((Integer) obj).intValue());
            case 10:
                return new C18235e(((Integer) obj).intValue());
            case 11:
                List list6 = (List) obj;
                ArrayList arrayList = new ArrayList(list6.size());
                int size = list6.size();
                while (i5 < size) {
                    Object obj11 = list6.get(i5);
                    arrayList.add((AbstractC7890e.billing(obj11, Boolean.FALSE) || obj11 == null) ? null : (C9363e) ((Function1) AbstractC4768e.vip.f23814e).invoke(obj11));
                    i5++;
                }
                return arrayList;
            case 12:
                return new C6277e(((Integer) obj).intValue());
            case 13:
                return new C5208e(((Integer) obj).intValue());
            case 14:
                Boolean bool3 = Boolean.FALSE;
                if (AbstractC7890e.billing(obj, bool3)) {
                    return new C12973e(C12973e.metrica);
                }
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                float floatValue = (obj12 != null ? (Float) obj12 : null).floatValue();
                Object obj13 = list7.get(1);
                C16974e c16974e2 = AbstractC4768e.isVip;
                AbstractC7890e.billing(obj13, bool3);
                return new C12973e(AbstractC13362e.mopub(floatValue, (obj13 != null ? (C4616e) c16974e2.f33237e.invoke(obj13) : null).ad));
            case 15:
                return AbstractC7890e.billing(obj, 0) ? new C4616e(8589934592L) : AbstractC7890e.billing(obj, 1) ? new C4616e(4294967296L) : new C4616e(0L);
            case 16:
                if (AbstractC7890e.billing(obj, Boolean.FALSE)) {
                    return new C2152e(9205357640488583168L);
                }
                List list8 = (List) obj;
                Object obj14 = list8.get(0);
                float floatValue2 = (obj14 != null ? (Float) obj14 : null).floatValue();
                return new C2152e((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits((list8.get(1) != null ? (Float) r1 : null).floatValue()) & 4294967295L));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i5 < size2) {
                    Object obj15 = list9.get(i5);
                    arrayList2.add((AbstractC7890e.billing(obj15, Boolean.FALSE) || obj15 == null) ? null : (C0768e) ((Function1) AbstractC4768e.applovin.f23814e).invoke(obj15));
                    i5++;
                }
                return new C4622e(arrayList2);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                String str2 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str2);
                if (AbstractC7890e.billing(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C0768e(forLanguageTag);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list10 = (List) obj;
                Object obj16 = list10.get(0);
                String str3 = obj16 != null ? (String) obj16 : null;
                Object obj17 = list10.get(1);
                return new C5320e(str3, (AbstractC7890e.billing(obj17, Boolean.FALSE) || obj17 == null) ? null : (C2233e) ((Function1) AbstractC4768e.startapp.f23814e).invoke(obj17), null);
            case 20:
                List list11 = (List) obj;
                Object obj18 = list11.get(0);
                float f = C17979e.vip;
                C16974e c16974e3 = AbstractC4768e.premium;
                Boolean bool4 = Boolean.FALSE;
                AbstractC7890e.billing(obj18, bool4);
                float f2 = (obj18 != null ? (C17979e) c16974e3.f33237e.invoke(obj18) : null).ad;
                Object obj19 = list11.get(1);
                C16974e c16974e4 = AbstractC4768e.subs;
                AbstractC7890e.billing(obj19, bool4);
                int i7 = (obj19 != null ? (C0741e) c16974e4.f33237e.invoke(obj19) : null).ad;
                Object obj20 = list11.get(2);
                C16974e c16974e5 = AbstractC4768e.crashlytics;
                AbstractC7890e.billing(obj20, bool4);
                return new C14917e(i7, f2, (obj20 != null ? (C11939e) c16974e5.f33237e.invoke(obj20) : null).ad);
            case 21:
                float floatValue3 = ((Float) obj).floatValue();
                C17979e.ad(floatValue3);
                return new C17979e(floatValue3);
            case 22:
                return new C0741e(((Integer) obj).intValue());
            case 23:
                List list12 = (List) obj;
                Object obj21 = list12.get(0);
                EnumC14289e enumC14289e = obj21 != null ? (EnumC14289e) obj21 : null;
                Object obj22 = list12.get(2);
                int intValue2 = (obj22 != null ? (Integer) obj22 : null).intValue();
                Object obj23 = list12.get(3);
                int intValue3 = (obj23 != null ? (Integer) obj23 : null).intValue();
                Object obj24 = list12.get(4);
                String str4 = obj24 != null ? (String) obj24 : null;
                switch (enumC14289e.ordinal()) {
                    case 0:
                        Object obj25 = list12.get(1);
                        return new C9363e((AbstractC7890e.billing(obj25, Boolean.FALSE) || obj25 == null) ? null : (C6191e) ((Function1) AbstractC4768e.billing.f23814e).invoke(obj25), intValue2, intValue3, str4);
                    case 1:
                        Object obj26 = list12.get(1);
                        return new C9363e((AbstractC7890e.billing(obj26, Boolean.FALSE) || obj26 == null) ? null : (C4282e) ((Function1) AbstractC4768e.yandex.f23814e).invoke(obj26), intValue2, intValue3, str4);
                    case 2:
                        Object obj27 = list12.get(1);
                        return new C9363e((AbstractC7890e.billing(obj27, Boolean.FALSE) || obj27 == null) ? null : (C18475e) ((Function1) AbstractC4768e.metrica.f23814e).invoke(obj27), intValue2, intValue3, str4);
                    case 3:
                        Object obj28 = list12.get(1);
                        return new C9363e((AbstractC7890e.billing(obj28, Boolean.FALSE) || obj28 == null) ? null : (C8249e) ((Function1) AbstractC4768e.license.f23814e).invoke(obj28), intValue2, intValue3, str4);
                    case 4:
                        Object obj29 = list12.get(1);
                        return new C9363e((AbstractC7890e.billing(obj29, Boolean.FALSE) || obj29 == null) ? null : (C1611e) ((Function1) AbstractC4768e.appmetrica.f23814e).invoke(obj29), intValue2, intValue3, str4);
                    case 5:
                        Object obj30 = list12.get(1);
                        return new C9363e((AbstractC7890e.billing(obj30, Boolean.FALSE) || obj30 == null) ? null : (C5320e) ((Function1) AbstractC4768e.purchase.f23814e).invoke(obj30), intValue2, intValue3, str4);
                    case 6:
                        Object obj31 = list12.get(1);
                        return new C9363e(new C9092e(obj31 != null ? (String) obj31 : null), intValue2, intValue3, str4);
                    default:
                        throw new C14803e(10);
                }
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C11939e(((Integer) obj).intValue());
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C18475e(obj != null ? (String) obj : null);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C8249e(obj != null ? (String) obj : null);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                C16974e c16974e6 = AbstractC4768e.admob;
                Boolean bool5 = Boolean.FALSE;
                AbstractC7890e.billing(obj32, bool5);
                int i8 = (obj32 != null ? (C7975e) c16974e6.f33237e.invoke(obj32) : null).ad;
                Object obj33 = list13.get(1);
                C16974e c16974e7 = AbstractC4768e.subscription;
                AbstractC7890e.billing(obj33, bool5);
                int i9 = (obj33 != null ? (C7613e) c16974e7.f33237e.invoke(obj33) : null).ad;
                Object obj34 = list13.get(2);
                C4616e[] c4616eArr2 = C12973e.vip;
                C16974e c16974e8 = AbstractC4768e.tapsense;
                AbstractC7890e.billing(obj34, bool5);
                long j5 = (obj34 != null ? (C12973e) c16974e8.f33237e.invoke(obj34) : null).ad;
                Object obj35 = list13.get(3);
                C5652e c5652e = C5652e.metrica;
                C5652e c5652e2 = (AbstractC7890e.billing(obj35, bool5) || obj35 == null) ? null : (C5652e) ((Function1) AbstractC4768e.advert.f23814e).invoke(obj35);
                Object obj36 = list13.get(4);
                C15803e c15803e = (AbstractC7890e.billing(obj36, bool5) || obj36 == null) ? null : (C15803e) ((Function1) AbstractC17287e.ad.f23814e).invoke(obj36);
                Object obj37 = list13.get(5);
                C14917e c14917e = C14917e.license;
                C14917e c14917e2 = (AbstractC7890e.billing(obj37, bool5) || obj37 == null) ? null : (C14917e) ((Function1) AbstractC4768e.ads.f23814e).invoke(obj37);
                Object obj38 = list13.get(6);
                int i10 = ((AbstractC7890e.billing(obj38, bool5) || obj38 == null) ? null : (C18285e) ((Function1) AbstractC17287e.metrica.f23814e).invoke(obj38)).ad;
                Object obj39 = list13.get(7);
                C16974e c16974e9 = AbstractC4768e.remoteconfig;
                AbstractC7890e.billing(obj39, bool5);
                int i11 = (obj39 != null ? (C18235e) c16974e9.f33237e.invoke(obj39) : null).ad;
                Object obj40 = list13.get(8);
                boolean billing = AbstractC7890e.billing(obj40, bool5);
                C11883e c11883e2 = AbstractC17287e.license;
                if (billing || obj40 == null) {
                    i = i8;
                    i2 = i9;
                    i3 = i11;
                    i4 = i10;
                    j = j5;
                    c2666e = null;
                } else {
                    i = i8;
                    i2 = i9;
                    i3 = i11;
                    i4 = i10;
                    j = j5;
                    c2666e = (C2666e) ((Function1) c11883e2.f23814e).invoke(obj40);
                }
                return new C6191e(i, i2, j, c5652e2, c15803e, c14917e2, i4, i3, c2666e);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                List list14 = (List) obj;
                Object obj41 = list14.get(0);
                int i12 = C3618e.mopub;
                C11883e c11883e3 = AbstractC4768e.ad;
                Boolean bool6 = Boolean.FALSE;
                AbstractC7890e.billing(obj41, bool6);
                long j6 = (obj41 != null ? AbstractC7890e.billing(obj41, Boolean.FALSE) ? new C3618e(C3618e.adcel) : new C3618e(AbstractC6532e.vip(((Integer) obj41).intValue())) : null).ad;
                Object obj42 = list14.get(1);
                C4616e[] c4616eArr3 = C12973e.vip;
                Function1 function12 = AbstractC4768e.tapsense.f33237e;
                AbstractC7890e.billing(obj42, bool6);
                long j7 = (obj42 != null ? (C12973e) function12.invoke(obj42) : null).ad;
                Object obj43 = list14.get(2);
                C1812e c1812e = C1812e.f4888e;
                C1812e c1812e2 = (AbstractC7890e.billing(obj43, bool6) || obj43 == null) ? null : (C1812e) ((Function1) AbstractC4768e.smaato.f23814e).invoke(obj43);
                Object obj44 = list14.get(3);
                C6277e c6277e = (AbstractC7890e.billing(obj44, bool6) || obj44 == null) ? null : (C6277e) ((Function1) AbstractC4768e.pro.f23814e).invoke(obj44);
                Object obj45 = list14.get(4);
                C5208e c5208e = (AbstractC7890e.billing(obj45, bool6) || obj45 == null) ? null : (C5208e) ((Function1) AbstractC4768e.signatures.f23814e).invoke(obj45);
                Object obj46 = list14.get(6);
                String str5 = obj46 != null ? (String) obj46 : null;
                Object obj47 = list14.get(7);
                AbstractC7890e.billing(obj47, bool6);
                long j8 = (obj47 != null ? (C12973e) function12.invoke(obj47) : null).ad;
                Object obj48 = list14.get(8);
                C8065e c8065e = (AbstractC7890e.billing(obj48, bool6) || obj48 == null) ? null : (C8065e) ((Function1) AbstractC4768e.amazon.f23814e).invoke(obj48);
                Object obj49 = list14.get(9);
                C3759e c3759e = (AbstractC7890e.billing(obj49, bool6) || obj49 == null) ? null : (C3759e) ((Function1) AbstractC4768e.mopub.f23814e).invoke(obj49);
                Object obj50 = list14.get(10);
                C4622e c4622e = C4622e.f9949e;
                C4622e c4622e2 = (AbstractC7890e.billing(obj50, bool6) || obj50 == null) ? null : (C4622e) ((Function1) AbstractC4768e.isPro.f23814e).invoke(obj50);
                Object obj51 = list14.get(11);
                AbstractC7890e.billing(obj51, bool6);
                long j9 = (obj51 != null ? AbstractC7890e.billing(obj51, Boolean.FALSE) ? new C3618e(C3618e.adcel) : new C3618e(AbstractC6532e.vip(((Integer) obj51).intValue())) : null).ad;
                Object obj52 = list14.get(12);
                C11964e c11964e = (AbstractC7890e.billing(obj52, bool6) || obj52 == null) ? null : (C11964e) ((Function1) AbstractC4768e.adcel.f23814e).invoke(obj52);
                Object obj53 = list14.get(13);
                C13973e c13973e = C13973e.license;
                return new C4282e(j6, j7, c1812e2, c6277e, c5208e, null, str5, j8, c8065e, c3759e, c4622e2, j9, c11964e, (AbstractC7890e.billing(obj53, bool6) || obj53 == null) ? null : (C13973e) ((Function1) AbstractC4768e.loadAd.f23814e).invoke(obj53), 49184);
            default:
                List list15 = (List) obj;
                Object obj54 = list15.get(0);
                boolean booleanValue = (obj54 != null ? (Boolean) obj54 : null).booleanValue();
                Object obj55 = list15.get(1);
                return new C15803e(((AbstractC7890e.billing(obj55, Boolean.FALSE) || obj55 == null) ? null : (C14591e) ((Function1) AbstractC17287e.vip.f23814e).invoke(obj55)).ad, booleanValue);
        }
    }
}
