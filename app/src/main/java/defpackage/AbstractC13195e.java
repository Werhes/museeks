package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13195e {
    public static final C10566e ad = new C10566e(BuildConfig.FLAVOR);

    public static final List ad(C10566e c10566e, int i, int i2, C14099e c14099e) {
        List list;
        if (i == i2 || (list = c10566e.f20852e) == null) {
            return null;
        }
        if (i != 0 || i2 < c10566e.f20850e.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C9363e c9363e = (C9363e) list.get(i3);
                if ((c14099e != null ? ((Boolean) c14099e.invoke(c9363e.ad)).booleanValue() : true) && vip(i, i2, c9363e.vip, c9363e.metrica)) {
                    arrayList.add(new C9363e((InterfaceC3703e) c9363e.ad, AbstractC3062e.metrica(c9363e.vip, i, i2) - i, AbstractC3062e.metrica(c9363e.metrica, i, i2) - i, c9363e.license));
                }
            }
            return arrayList;
        }
        if (c14099e == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) c14099e.invoke(((C9363e) obj).ad)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean vip(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
