package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؐٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6100e {
    public static final long[] ad = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static final File Signature(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new IOException("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new IOException("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new IOException("Did not expect uri to have authority");
    }

    public static void ad(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void adcel(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        billing(jArr, jArr2, jArr4);
        smaato(jArr4, jArr3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٖؑۡ, eُۙۨ] */
    /* JADX WARN: Type inference failed for: r1v10, types: [eٖؑۡ, eُۙۨ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eٖؑۡ, eُۙۨ] */
    public static C17476e advert(String str) {
        C15525e c15525e = new C15525e(str, 5, (char) 0);
        c15525e.vip(new C2894e(25));
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        EnumC15009e enumC15009e = null;
        while (true) {
            if (c15525e.metrica >= str.length()) {
                break;
            }
            if (c15525e.metrica < str.length() && AbstractC4511e.adcel(str.charAt(c15525e.metrica))) {
                int i = c15525e.metrica;
                c15525e.vip(new C2894e(26));
                String substring = str.substring(i, c15525e.metrica);
                if (num == null || num2 == null || num3 == null) {
                    C15525e c15525e2 = new C15525e(substring, 5, (char) 0);
                    int i2 = c15525e2.metrica;
                    if (c15525e2.ad(C7247e.f14806e)) {
                        c15525e2.ad(C7247e.f14834e);
                        int parseInt = Integer.parseInt(substring.substring(i2, c15525e2.metrica));
                        if (c15525e2.ad(C11633e.f23375e)) {
                            int i3 = c15525e2.metrica;
                            if (c15525e2.ad(C7247e.f14833e)) {
                                c15525e2.ad(C7247e.f14820e);
                                int parseInt2 = Integer.parseInt(substring.substring(i3, c15525e2.metrica));
                                if (c15525e2.ad(C7247e.f14815e)) {
                                    int i4 = c15525e2.metrica;
                                    if (c15525e2.ad(C7247e.f14831e)) {
                                        c15525e2.ad(C7247e.f14810e);
                                        int parseInt3 = Integer.parseInt(substring.substring(i4, c15525e2.metrica));
                                        if (c15525e2.ad(C7247e.f14809e)) {
                                            c15525e2.vip(C7247e.f14829e);
                                        }
                                        Integer valueOf = Integer.valueOf(parseInt);
                                        Integer valueOf2 = Integer.valueOf(parseInt2);
                                        num3 = Integer.valueOf(parseInt3);
                                        num = valueOf;
                                        num2 = valueOf2;
                                        c15525e.vip(new C2894e(27));
                                    }
                                }
                            }
                        }
                    }
                }
                if (num4 == null) {
                    C15525e c15525e3 = new C15525e(substring, 5, (char) 0);
                    int i5 = c15525e3.metrica;
                    if (c15525e3.ad(C11633e.f23368e)) {
                        c15525e3.ad(C11633e.f23363e);
                        int parseInt4 = Integer.parseInt(substring.substring(i5, c15525e3.metrica));
                        if (c15525e3.ad(C11633e.f23371e)) {
                            c15525e3.vip(C11633e.f23376e);
                        }
                        num4 = Integer.valueOf(parseInt4);
                        c15525e.vip(new C2894e(27));
                    }
                }
                if (enumC15009e == null && substring.length() >= 3) {
                    C1630e c1630e = new C1630e(0, EnumC15009e.f29734e);
                    while (c1630e.hasNext()) {
                        EnumC15009e enumC15009e2 = (EnumC15009e) c1630e.next();
                        if (AbstractC6507e.pro(substring, enumC15009e2.f29736e, true)) {
                            enumC15009e = enumC15009e2;
                            break;
                        }
                    }
                }
                if (num5 == null) {
                    C15525e c15525e4 = new C15525e(substring, 5, (char) 0);
                    int i6 = c15525e4.metrica;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= 2) {
                            for (int i8 = 0; i8 < 2; i8++) {
                                c15525e4.ad(C7247e.f14812e);
                            }
                            int parseInt5 = Integer.parseInt(c15525e4.vip.substring(i6, c15525e4.metrica));
                            if (c15525e4.ad(C7247e.f14823e)) {
                                c15525e4.vip(C7247e.f14808e);
                            }
                            num5 = Integer.valueOf(parseInt5);
                        } else {
                            if (!c15525e4.ad(C7247e.f14807e)) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
                c15525e.vip(new C2894e(27));
            }
        }
        ?? c11241e = new C11241e(70, 99, 1);
        if (num5 == null || !c11241e.appmetrica(num5.intValue())) {
            ?? c11241e2 = new C11241e(0, 69, 1);
            if (num5 != null && c11241e2.appmetrica(num5.intValue())) {
                num5 = Integer.valueOf(num5.intValue() + 2000);
            }
        } else {
            num5 = Integer.valueOf(num5.intValue() + 1900);
        }
        metrica(str, "day-of-month", num4);
        metrica(str, "month", enumC15009e);
        metrica(str, "year", num5);
        metrica(str, "time", num);
        metrica(str, "time", num2);
        metrica(str, "time", num3);
        if (!new C11241e(1, 31, 1).appmetrica(num4.intValue())) {
            throw new C2486e(str, "day-of-month not in [1,31]");
        }
        if (num5.intValue() < 1601) {
            throw new C2486e(str, "year >= 1601");
        }
        if (num.intValue() > 23) {
            throw new C2486e(str, "hours > 23");
        }
        if (num2.intValue() > 59) {
            throw new C2486e(str, "minutes > 59");
        }
        if (num3.intValue() <= 59) {
            return AbstractC0187e.ad(num3.intValue(), num2.intValue(), num.intValue(), num4.intValue(), enumC15009e, num5.intValue());
        }
        throw new C2486e(str, "seconds > 59");
    }

    public static boolean amazon(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC8902e) {
            collection = ((C11994e) ((InterfaceC8902e) collection)).loadAd();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= set.remove(it.next());
            }
            return z;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static C14889e appmetrica(Set set, InterfaceC11801e interfaceC11801e) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof C14889e)) {
                return new C14889e(set2, interfaceC11801e);
            }
            C14889e c14889e = (C14889e) set2;
            InterfaceC11801e interfaceC11801e2 = c14889e.f29503e;
            interfaceC11801e2.getClass();
            return new C14889e((SortedSet) c14889e.f29504e, new C17929e(Arrays.asList(interfaceC11801e2, interfaceC11801e)));
        }
        if (!(set instanceof C14889e)) {
            set.getClass();
            return new C14889e(set, interfaceC11801e);
        }
        C14889e c14889e2 = (C14889e) set;
        InterfaceC11801e interfaceC11801e3 = c14889e2.f29503e;
        interfaceC11801e3.getClass();
        return new C14889e(c14889e2.f29504e, new C17929e(Arrays.asList(interfaceC11801e3, interfaceC11801e)));
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        yandex(jArr3, j5, j10, jArr4, 0);
        yandex(jArr3, j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        yandex(jArr3, j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        yandex(jArr3, j5 ^ j13, j10 ^ j14, jArr4, 6);
        yandex(jArr3, j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = j17 ^ jArr4[9];
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j18) ^ (j28 >>> 55);
        long j30 = ((j26 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 36028797018963967L;
        long j37 = (((j28 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54)) ^ (j36 >>> 54);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 36028797018963967L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 54);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        long j51 = (j23 ^ j36) ^ j25;
        jArr3[1] = j51;
        long j52 = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[2] = j52;
        long j53 = j43 ^ j50;
        jArr3[3] = j53;
        long j54 = j50 ^ jArr4[2];
        jArr3[4] = j54;
        long j55 = jArr4[3];
        jArr3[5] = j55;
        jArr3[0] = j21 ^ (j51 << 55);
        jArr3[1] = (j51 >>> 9) ^ (j52 << 46);
        jArr3[2] = (j52 >>> 18) ^ (j53 << 37);
        jArr3[3] = (j53 >>> 27) ^ (j54 << 28);
        jArr3[4] = (j54 >>> 36) ^ (j55 << 19);
        jArr3[5] = j55 >>> 45;
    }

    public static boolean license(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void loadAd(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        AbstractC15792e.license(3, jArr, jArr3);
        while (true) {
            smaato(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC15792e.license(3, jArr2, jArr3);
            }
        }
    }

    public static void metrica(String str, String str2, Object obj) {
        if (obj == null) {
            throw new C2486e(str, "Could not find ".concat(str2));
        }
    }

    public static HashSet mopub(int i) {
        int ceil;
        if (i < 3) {
            AbstractC17595e.metrica(i, "expectedSize");
            ceil = i + 1;
        } else {
            ceil = i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        return new HashSet(ceil);
    }

    public static int purchase(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static void smaato(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    public static C16697e startapp(Set set, AbstractC12614e abstractC12614e) {
        AbstractC2301e.amazon(set, "set1");
        AbstractC2301e.amazon(abstractC12614e, "set2");
        return new C16697e(set, abstractC12614e);
    }

    public static void vip(Context context, List list) {
        if (context instanceof AppActivity) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MainArtist) obj).ad != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (arrayList.size() == 1) {
                AppActivity appActivity = (AppActivity) context;
                String str = ((MainArtist) list.get(0)).ad;
                if (str == null) {
                    return;
                }
                appActivity.isVip(new C5522e(str));
                appActivity.firebase();
                return;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MainArtist mainArtist = (MainArtist) it.next();
                arrayList2.add(new C3662e(R.drawable.ic_music_mic_outline_28, mainArtist.metrica, new C10869e(context, mainArtist, 1)));
            }
            new C11683e(R.string.libopener_artists, arrayList2).signatures((Activity) context);
        }
    }

    public static void yandex(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        long j7 = jArr[((int) j) & 3];
        long j8 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 36028797018963967L & j7;
        jArr2[i + 1] = (j7 >>> 55) ^ (j8 << 9);
    }
}
