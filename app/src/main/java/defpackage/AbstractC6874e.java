package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6874e {
    public static final int[] ad = {0, 25847, -2608894, -518909, 237124, -777960, -876248, 466468, 1826347, 2353451, -359251, -2091905, 3119733, -2884855, 3111497, 2680103, 2725464, 1024112, -1079900, 3585928, -549488, -1119584, 2619752, -2108549, -2118186, -3859737, -1399561, -3277672, 1757237, -19422, 4010497, 280005, 2706023, 95776, 3077325, 3530437, -1661693, -3592148, -2537516, 3915439, -3861115, -3043716, 3574422, -2867647, 3539968, -300467, 2348700, -539299, -1699267, -1643818, 3505694, -3821735, 3507263, -2140649, -1600420, 3699596, 811944, 531354, 954230, 3881043, 3900724, -2556880, 2071892, -2797779, -3930395, -1528703, -3677745, -3041255, -1452451, 3475950, 2176455, -1585221, -1257611, 1939314, -4083598, -1000202, -3190144, -3157330, -3632928, 126922, 3412210, -983419, 2147896, 2715295, -2967645, -3693493, -411027, -2477047, -671102, -1228525, -22981, -1308169, -381987, 1349076, 1852771, -1430430, -3343383, 264944, 508951, 3097992, 44288, -1100098, 904516, 3958618, -3724342, -8578, 1653064, -3249728, 2389356, -210977, 759969, -1316856, 189548, -3553272, 3159746, -1851402, -2409325, -177440, 1315589, 1341330, 1285669, -1584928, -812732, -1439742, -3019102, -3881060, -3628969, 3839961, 2091667, 3407706, 2316500, 3817976, -3342478, 2244091, -2446433, -3562462, 266997, 2434439, -1235728, 3513181, -3520352, -3759364, -1197226, -3193378, 900702, 1859098, 909542, 819034, 495491, -1613174, -43260, -522500, -655327, -3122442, 2031748, 3207046, -3556995, -525098, -768622, -3595838, 342297, 286988, -2437823, 4108315, 3437287, -3342277, 1735879, 203044, 2842341, 2691481, -2590150, 1265009, 4055324, 1247620, 2486353, 1595974, -3767016, 1250494, 2635921, -3548272, -2994039, 1869119, 1903435, -1050970, -1333058, 1237275, -3318210, -1430225, -451100, 1312455, 3306115, -1962642, -1279661, 1917081, -2546312, -1374803, 1500165, 777191, 2235880, 3406031, -542412, -2831860, -1671176, -1846953, -2584293, -3724270, 594136, -3776993, -2013608, 2432395, 2454455, -164721, 1957272, 3369112, 185531, -1207385, -3183426, 162844, 1616392, 3014001, 810149, 1652634, -3694233, -1799107, -3038916, 3523897, 3866901, 269760, 2213111, -975884, 1717735, 472078, -426683, 1723600, -1803090, 1910376, -1667432, -1104333, -260646, -3833893, -2939036, -2235985, -420899, -2286327, 183443, -976891, 1612842, -3545687, -554416, 3919660, -48306, -1362209, 3937738, 1400424, -846154, 1976782};

    public static void Signature() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ArrayList ad(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4613e(objArr, true));
    }

    public static List adcel(Object obj) {
        return obj != null ? Collections.singletonList(obj) : C13664e.f27089e;
    }

    public static final List advert(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : C13664e.f27089e;
    }

    public static final void amazon(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("fromIndex (0) is greater than toIndex (", i2, ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static int billing(List list) {
        return list.size() - 1;
    }

    public static C1169e license() {
        return new C1169e(10);
    }

    public static void loadAd() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static C1169e metrica(List list) {
        C1169e c1169e = (C1169e) list;
        c1169e.m478native();
        c1169e.f3761e = true;
        return c1169e.f3762e > 0 ? c1169e : C1169e.f3760e;
    }

    public static ArrayList mopub(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4613e(objArr, true));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑۡ, eُۙۨ] */
    public static C15926e purchase(Collection collection) {
        return new C11241e(0, collection.size() - 1, 1);
    }

    public static List startapp(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C13664e.f27089e;
    }

    public static int vip(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        amazon(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int vip = AbstractC0258e.vip((Comparable) arrayList.get(i3), comparable);
            if (vip < 0) {
                i2 = i3 + 1;
            } else {
                if (vip <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int yandex(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public abstract void admob(int i, int i2, byte[] bArr);

    public boolean appmetrica(AbstractC2781e abstractC2781e) {
        return true;
    }

    public abstract void smaato(String str);
}
