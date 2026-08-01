package defpackage;

import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8880e {
    public static final C0715e ad;
    public static final int license;
    public static final int metrica;
    public static final ArrayList vip;

    /* JADX WARN: Type inference failed for: r2v5, types: [eؑۧؑ, java.lang.Object] */
    static {
        Object obj = new Object();
        vip = new ArrayList();
        int i = 5;
        metrica = 5;
        license = 5;
        synchronized (obj) {
            try {
                if (ad == null) {
                    ?? obj2 = new Object();
                    int size = vip.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add((C0715e) vip.get(i2));
                    }
                    arrayList.add(obj2);
                    ad = obj2;
                    vip = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i3 = metrica;
        InterfaceC16665e.ad.getClass();
        String c8506e = C10031e.vip.vip.toString();
        LinkedHashMap linkedHashMap = AbstractC12479e.ad;
        int i4 = 7;
        switch (AbstractC8703e.m2467class(i3)) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                throw new C14803e(10);
        }
        int m2467class = AbstractC8703e.m2467class(i);
        int i5 = AbstractC6026e.ad;
        realmcJNI.realm_set_log_level_category(c8506e, m2467class);
        license = AbstractC12479e.ad(AbstractC4608e.license((short) realmcJNI.realm_get_log_level_category(C18409e.metrica.vip.toString())));
        realmcJNI.set_log_callback(new C10215e(i4));
    }
}
