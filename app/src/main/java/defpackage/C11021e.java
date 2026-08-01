package defpackage;

import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11021e implements Comparator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21843e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C11021e f21837e = new C11021e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C11021e f21835e = new C11021e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C11021e f21839e = new C11021e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C11021e f21834e = new C11021e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C11021e f21842e = new C11021e(4);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C11021e f21841e = new C11021e(5);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C11021e f21838e = new C11021e(6);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C11021e f21840e = new C11021e(7);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C11021e f21836e = new C11021e(8);

    public /* synthetic */ C11021e(int i) {
        this.f21843e = i;
    }

    public static int ad(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e == null) {
            AbstractC14300e.ad(36);
            throw null;
        }
        if (AbstractC14300e.advert(interfaceC15498e, 4)) {
            return 8;
        }
        if (interfaceC15498e instanceof InterfaceC11788e) {
            return 7;
        }
        if (interfaceC15498e instanceof InterfaceC2188e) {
            return ((InterfaceC2188e) interfaceC15498e).mo327e() == null ? 6 : 5;
        }
        if (interfaceC15498e instanceof InterfaceC16528e) {
            return ((InterfaceC16528e) interfaceC15498e).mo327e() == null ? 4 : 3;
        }
        if (interfaceC15498e instanceof InterfaceC5052e) {
            return 2;
        }
        return interfaceC15498e instanceof InterfaceC9794e ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        int i = 4;
        int i2 = 0;
        switch (this.f21843e) {
            case 0:
                C11795e c11795e = (C11795e) obj;
                C11795e c11795e2 = (C11795e) obj2;
                if (AbstractC11267e.purchase(c11795e) && AbstractC11267e.purchase(c11795e2)) {
                    C13915e mopub = AbstractC5851e.mopub(c11795e);
                    C13915e mopub2 = AbstractC5851e.mopub(c11795e2);
                    if (!AbstractC7890e.billing(mopub, mopub2)) {
                        C13915e[] c13915eArr = new C13915e[16];
                        int i3 = 0;
                        while (mopub != null) {
                            int i4 = i3 + 1;
                            if (c13915eArr.length < i4) {
                                int length = c13915eArr.length;
                                ?? r5 = new Object[Math.max(i4, length * 2)];
                                System.arraycopy(c13915eArr, 0, r5, 0, length);
                                c13915eArr = r5;
                            }
                            if (i3 != 0) {
                                System.arraycopy(c13915eArr, 0, c13915eArr, 0 + 1, i3 + 0);
                            }
                            c13915eArr[0] = mopub;
                            i3++;
                            mopub = mopub.tapsense();
                        }
                        C13915e[] c13915eArr2 = new C13915e[16];
                        int i5 = 0;
                        while (mopub2 != null) {
                            int i6 = i5 + 1;
                            if (c13915eArr2.length < i6) {
                                int length2 = c13915eArr2.length;
                                ?? r52 = new Object[Math.max(i6, length2 * 2)];
                                System.arraycopy(c13915eArr2, 0, r52, 0, length2);
                                c13915eArr2 = r52;
                            }
                            if (i5 != 0) {
                                System.arraycopy(c13915eArr2, 0, c13915eArr2, 0 + 1, i5 + 0);
                            }
                            c13915eArr2[0] = mopub2;
                            i5++;
                            mopub2 = mopub2.tapsense();
                        }
                        int min = Math.min(i3 - 1, i5 - 1);
                        if (min >= 0) {
                            while (AbstractC7890e.billing(c13915eArr[i2], c13915eArr2[i2])) {
                                if (i2 != min) {
                                    i2++;
                                }
                            }
                            return AbstractC7890e.yandex(c13915eArr[i2].isVip(), c13915eArr2[i2].isVip());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (AbstractC11267e.purchase(c11795e)) {
                        return -1;
                    }
                    if (AbstractC11267e.purchase(c11795e2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                C0763e yandex = ((C6071e) obj).yandex();
                C0763e yandex2 = ((C6071e) obj2).yandex();
                int compare = Float.compare(yandex.ad, yandex2.ad);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(yandex.vip, yandex2.vip);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(yandex.license, yandex2.license);
                return compare3 != 0 ? compare3 : Float.compare(yandex.metrica, yandex2.metrica);
            case 2:
                return ((C6541e) obj).license.compareToIgnoreCase(((C6541e) obj2).license);
            case 3:
                return ((C6541e) obj).license.compareToIgnoreCase(((C6541e) obj2).license);
            case 4:
                return ((C6541e) obj).license.compareToIgnoreCase(((C6541e) obj2).license);
            case 5:
                InterfaceC15498e interfaceC15498e = (InterfaceC15498e) obj;
                InterfaceC15498e interfaceC15498e2 = (InterfaceC15498e) obj2;
                int ad = ad(interfaceC15498e2) - ad(interfaceC15498e);
                if (ad != 0) {
                    valueOf = Integer.valueOf(ad);
                } else if (AbstractC14300e.advert(interfaceC15498e, 4) && AbstractC14300e.advert(interfaceC15498e2, 4)) {
                    valueOf = 0;
                } else {
                    int compareTo = interfaceC15498e.getName().f2667e.compareTo(interfaceC15498e2.getName().f2667e);
                    valueOf = compareTo != 0 ? Integer.valueOf(compareTo) : null;
                }
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                return 0;
            case 6:
                C13915e c13915e = (C13915e) obj;
                C13915e c13915e2 = (C13915e) obj2;
                int yandex3 = AbstractC7890e.yandex(c13915e2.f27590e, c13915e.f27590e);
                return yandex3 != 0 ? yandex3 : AbstractC7890e.yandex(c13915e.hashCode(), c13915e2.hashCode());
            case 7:
                C0763e yandex4 = ((C6071e) obj).yandex();
                C0763e yandex5 = ((C6071e) obj2).yandex();
                int compare4 = Float.compare(yandex5.metrica, yandex4.metrica);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(yandex4.vip, yandex5.vip);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(yandex4.license, yandex5.license);
                return compare6 != 0 ? compare6 : Float.compare(yandex5.ad, yandex4.ad);
            case 8:
                C6571e c6571e = (C6571e) obj;
                C6571e c6571e2 = (C6571e) obj2;
                int compare7 = Float.compare(((C0763e) c6571e.f13544e).vip, ((C0763e) c6571e2.f13544e).vip);
                return compare7 != 0 ? compare7 : Float.compare(((C0763e) c6571e.f13544e).license, ((C0763e) c6571e2.f13544e).license);
            case 9:
                return AbstractC0258e.vip(Integer.valueOf(((C9363e) obj).vip), Integer.valueOf(((C9363e) obj2).vip));
            case 10:
                return AbstractC0258e.vip(Integer.valueOf(((C9363e) obj).vip), Integer.valueOf(((C9363e) obj2).vip));
            case 11:
                String str = (String) obj;
                String str2 = (String) obj2;
                int min2 = Math.min(str.length(), str2.length());
                while (true) {
                    if (i >= min2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 < length4) {
                            return -1;
                        }
                    } else {
                        char charAt = str.charAt(i);
                        char charAt2 = str2.charAt(i);
                        if (charAt == charAt2) {
                            i++;
                        } else if (AbstractC7890e.yandex(charAt, charAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 12:
                String str3 = (String) obj;
                int i7 = 0;
                for (int i8 = 0; i8 < str3.length(); i8++) {
                    if (str3.charAt(i8) == '/') {
                        i7++;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i7);
                String str4 = (String) obj2;
                int i9 = 0;
                while (i2 < str4.length()) {
                    if (str4.charAt(i2) == '/') {
                        i9++;
                    }
                    i2++;
                }
                return AbstractC0258e.vip(valueOf2, Integer.valueOf(i9));
            case 13:
                return AbstractC0258e.vip(AbstractC2876e.billing((InterfaceC5052e) obj).ad.ad, AbstractC2876e.billing((InterfaceC5052e) obj2).ad.ad);
            case 14:
                return ((C12086e) obj2).vip() - ((C12086e) obj).vip();
            case 15:
                return AbstractC0258e.vip(Boolean.valueOf(((C16427e) obj).smaato), Boolean.valueOf(((C16427e) obj2).smaato));
            case 16:
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC0258e.vip((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0258e.vip((String) ((C6571e) obj).f13544e, (String) ((C6571e) obj2).f13544e);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C13915e c13915e3 = (C13915e) obj;
                C13915e c13915e4 = (C13915e) obj2;
                int yandex6 = AbstractC7890e.yandex(c13915e3.f27590e, c13915e4.f27590e);
                return yandex6 != 0 ? yandex6 : AbstractC7890e.yandex(c13915e3.hashCode(), c13915e4.hashCode());
            case 20:
                return AbstractC0258e.vip(((C2299e) ((InterfaceC8960e) obj)).getName(), ((C2299e) ((InterfaceC8960e) obj2)).getName());
            case 21:
                return ((C3650e) obj).ad - ((C3650e) obj2).ad;
            case 22:
                return AbstractC0258e.vip(Float.valueOf(((C8060e) obj).ad), Float.valueOf(((C8060e) obj2).ad));
            case 23:
                return AbstractC0258e.vip(Integer.valueOf(((C3637e) obj2).metrica), Integer.valueOf(((C3637e) obj).metrica));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C14087e c14087e = (C14087e) obj;
                C14087e c14087e2 = (C14087e) obj2;
                RecyclerView recyclerView = c14087e.license;
                if ((recyclerView == null) == (c14087e2.license == null)) {
                    boolean z3 = c14087e.ad;
                    if (z3 == c14087e2.ad) {
                        int i10 = c14087e2.vip - c14087e.vip;
                        if (i10 != 0) {
                            return i10;
                        }
                        int i11 = c14087e.metrica - c14087e2.metrica;
                        if (i11 != 0) {
                            return i11;
                        }
                        return 0;
                    }
                    if (z3) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return AbstractC0258e.vip(Float.valueOf(((C16106e) obj).metrica.purchase()), Float.valueOf(((C16106e) obj2).metrica.purchase()));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return AbstractC0258e.vip(Double.valueOf(((C16855e) obj2).metrica), Double.valueOf(((C16855e) obj).metrica));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC0258e.vip(((Charset) obj).name(), ((Charset) obj2).name());
            default:
                return AbstractC0258e.vip((Float) ((C6571e) obj2).f13543e, (Float) ((C6571e) obj).f13543e);
        }
    }
}
