package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۢ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9069e {
    public static final C6689e appmetrica;
    public static final C5298e purchase;
    public final C6689e ad;
    public final AbstractC17475e license;
    public final AbstractC17475e metrica;
    public final C5298e vip;

    static {
        HashSet hashSet = new HashSet();
        C1410e c1410e = C11858e.license;
        for (int i = 0; i < c1410e.f4224e; i++) {
            hashSet.add(new C11858e(((Integer) c1410e.get(i)).intValue()));
        }
        new C6689e(hashSet);
        HashSet hashSet2 = new HashSet();
        C1410e c1410e2 = C11858e.appmetrica;
        for (int i2 = 0; i2 < c1410e2.f4224e; i2++) {
            hashSet2.add(new C11858e(((Integer) c1410e2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < c1410e.f4224e; i3++) {
            hashSet2.add(new C11858e(((Integer) c1410e.get(i3)).intValue()));
        }
        appmetrica = new C6689e(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : C17974e.f35231e) {
            AbstractC2301e.subscription(!false);
            sparseBooleanArray.append(i4, true);
        }
        AbstractC2301e.subscription(!false);
        purchase = new C5298e(new C11715e(sparseBooleanArray));
    }

    public C9069e(C6689e c6689e, C5298e c5298e, AbstractC17475e abstractC17475e, AbstractC17475e abstractC17475e2) {
        this.ad = c6689e;
        this.vip = c5298e;
        this.metrica = abstractC17475e;
        this.license = abstractC17475e2;
    }
}
