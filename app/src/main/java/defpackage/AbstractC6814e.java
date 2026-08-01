package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6814e {
    public static final HashMap ad;
    public static final HashMap appmetrica;
    public static final HashMap license;
    public static final HashMap metrica;
    public static final HashMap vip;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        HashMap hashMap2 = new HashMap();
        vip = hashMap2;
        HashMap hashMap3 = new HashMap();
        metrica = hashMap3;
        HashMap hashMap4 = new HashMap();
        license = hashMap4;
        HashMap hashMap5 = new HashMap();
        appmetrica = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        C14677e c14677e = C14677e.license;
        hashMap6.put(c14677e, 1);
        C14677e c14677e2 = C14677e.appmetrica;
        hashMap6.put(c14677e2, 2);
        C14677e c14677e3 = C14677e.purchase;
        hashMap6.put(c14677e3, 4096);
        C14677e c14677e4 = C14677e.billing;
        hashMap6.put(c14677e4, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(c14677e, 1);
        hashMap7.put(c14677e2, 2);
        hashMap7.put(c14677e3, 4096);
        hashMap7.put(c14677e4, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(c14677e, 1);
        hashMap8.put(c14677e2, 4);
        hashMap8.put(c14677e3, 4096);
        hashMap8.put(c14677e4, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(C14677e.yandex, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        hashMap9.put(C14677e.startapp, Integer.valueOf(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE));
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static boolean ad(C1900e c1900e, C14677e c14677e) {
        int i = c1900e.yandex;
        Set set = (Set) ad.get(Integer.valueOf(c14677e.vip));
        if (set == null || !set.contains(Integer.valueOf(i))) {
            return false;
        }
        int i2 = c1900e.adcel;
        Set set2 = (Set) vip.get(Integer.valueOf(c14677e.ad));
        return set2 != null && set2.contains(Integer.valueOf(i2));
    }
}
