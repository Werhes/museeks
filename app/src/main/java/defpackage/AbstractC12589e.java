package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12589e {
    public static final SparseArray ad = new SparseArray();
    public static final HashMap vip;

    static {
        HashMap hashMap = new HashMap();
        vip = hashMap;
        hashMap.put(EnumC6651e.f13723e, 0);
        hashMap.put(EnumC6651e.f13721e, 1);
        hashMap.put(EnumC6651e.f13720e, 2);
        for (EnumC6651e enumC6651e : hashMap.keySet()) {
            ad.append(((Integer) vip.get(enumC6651e)).intValue(), enumC6651e);
        }
    }

    public static int ad(EnumC6651e enumC6651e) {
        Integer num = (Integer) vip.get(enumC6651e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC6651e);
    }

    public static EnumC6651e vip(int i) {
        EnumC6651e enumC6651e = (EnumC6651e) ad.get(i);
        if (enumC6651e != null) {
            return enumC6651e;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unknown Priority for value "));
    }
}
