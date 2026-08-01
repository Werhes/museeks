package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6575e implements Comparator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13556e;

    public /* synthetic */ C6575e(int i) {
        this.f13556e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int bitCount;
        int bitCount2;
        switch (this.f13556e) {
            case 0:
                return AbstractC7890e.yandex(((C5388e) obj2).ad, ((C5388e) obj).ad);
            case 1:
                bitCount = Integer.bitCount(((Integer) obj2).intValue());
                bitCount2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 2:
                bitCount = ((C16975e) obj2).adcel;
                bitCount2 = ((C16975e) obj).adcel;
                break;
            case 3:
                return Integer.compare(((C8350e) obj2).vip, ((C8350e) obj).vip);
            case 4:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 5:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 6:
                String name = ((File) obj).getName();
                int i = C14848e.purchase;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return Integer.compare(((C1280e) ((List) obj).get(0)).f3990e, ((C1280e) ((List) obj2).get(0)).f3990e);
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 13;
                return C2380e.purchase(C7918e.metrica((C7918e) Collections.max(list, new C6575e(12)), (C7918e) Collections.max(list2, new C6575e(12)))).ad(list.size(), list2.size()).vip((C7918e) Collections.max(list, new C6575e(i2)), (C7918e) Collections.max(list2, new C6575e(i2)), new C6575e(i2)).appmetrica();
            case 10:
                return ((C15806e) Collections.max((List) obj)).compareTo((C15806e) Collections.max((List) obj2));
            case 11:
                return ((C6350e) ((List) obj).get(0)).compareTo((C6350e) ((List) obj2).get(0));
            case 12:
                return C7918e.metrica((C7918e) obj, (C7918e) obj2);
            case 13:
                C7918e c7918e = (C7918e) obj;
                C7918e c7918e2 = (C7918e) obj2;
                boolean z = c7918e.f16015e;
                int i3 = c7918e.f16018e;
                AbstractC15023e ad = (z && c7918e.f16025e) ? C11010e.f21801e : C11010e.f21801e.ad();
                boolean z2 = c7918e.f16032e.f9750class;
                AbstractC7118e abstractC7118e = AbstractC7118e.ad;
                if (z2) {
                    abstractC7118e = abstractC7118e.vip(Integer.valueOf(i3), Integer.valueOf(c7918e2.f16018e), C11010e.f21801e.ad());
                }
                return abstractC7118e.vip(Integer.valueOf(c7918e.f16026e), Integer.valueOf(c7918e2.f16026e), ad).vip(Integer.valueOf(i3), Integer.valueOf(c7918e2.f16018e), ad).appmetrica();
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 15:
                return AbstractC7890e.yandex(((C1547e) obj).vip, ((C1547e) obj2).vip);
            case 16:
                return ((C7661e) obj).ad.compareTo(((C7661e) obj2).ad);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15926e c15926e = (C15926e) obj;
                C15926e c15926e2 = (C15926e) obj2;
                return (c15926e.f22522e - c15926e.f22523e) - (c15926e2.f22522e - c15926e2.f22523e);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13915e c13915e = (C13915e) obj;
                C13915e c13915e2 = (C13915e) obj2;
                float f = c13915e.f27612e.Signature.f25201e;
                float f2 = c13915e2.f27612e.Signature.f25201e;
                return f == f2 ? AbstractC7890e.yandex(c13915e.isVip(), c13915e2.isVip()) : Float.compare(f, f2);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC7890e.yandex(((InterfaceC8848e) obj).getIndex(), ((InterfaceC8848e) obj2).getIndex());
            case 20:
                AbstractC2416e abstractC2416e = (AbstractC2416e) obj;
                AbstractC2416e abstractC2416e2 = (AbstractC2416e) obj2;
                long j = abstractC2416e.f6203e;
                long j2 = abstractC2416e2.f6203e;
                return j - j2 == 0 ? abstractC2416e.compareTo(abstractC2416e2) : j < j2 ? -1 : 1;
            case 21:
                C12583e c12583e = (C12583e) obj;
                C12583e c12583e2 = (C12583e) obj2;
                int i5 = c12583e.metrica;
                int i6 = c12583e2.metrica;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                return Integer.compare(c12583e2.license, c12583e.license);
            case 22:
                return ((C14326e) obj).ad.compareTo(((C14326e) obj2).ad);
            case 23:
                return ((C13001e) ((AbstractC6344e) obj)).ad.compareTo(((C13001e) ((AbstractC6344e) obj2)).ad);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C18296e) obj).ad - ((C18296e) obj2).ad;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Float.compare(((C18296e) obj).metrica, ((C18296e) obj2).metrica);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Integer.compare(((C14429e) obj).ad.vip, ((C14429e) obj2).ad.vip);
            default:
                return Long.compare(((C16743e) obj).vip, ((C16743e) obj2).vip);
        }
        return bitCount - bitCount2;
    }
}
