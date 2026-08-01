package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5298e {
    public static final String metrica;
    public static final C5298e vip;
    public final C11715e ad;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC2301e.subscription(!false);
        vip = new C5298e(new C11715e(sparseBooleanArray));
        String str = AbstractC9413e.ad;
        metrica = Integer.toString(0, 36);
    }

    public C5298e(C11715e c11715e) {
        this.ad = c11715e;
    }

    public static C5298e vip(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(metrica);
        if (integerArrayList == null) {
            return vip;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int intValue = integerArrayList.get(i).intValue();
            AbstractC2301e.subscription(!false);
            sparseBooleanArray.append(intValue, true);
        }
        AbstractC2301e.subscription(!false);
        return new C5298e(new C11715e(sparseBooleanArray));
    }

    public final boolean ad(int i) {
        return this.ad.ad.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5298e) {
            return this.ad.equals(((C5298e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final Bundle metrica() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            C11715e c11715e = this.ad;
            if (i >= c11715e.ad.size()) {
                bundle.putIntegerArrayList(metrica, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(c11715e.vip(i)));
            i++;
        }
    }
}
