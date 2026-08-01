package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4686e extends AbstractC10054e implements Set, j$.util.Set {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ int f10068e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public transient AbstractC8718e f10069e;

    public static AbstractC4686e Signature(int i, Object... objArr) {
        if (i == 0) {
            return C1790e.f4844e;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C7467e(obj);
        }
        int loadAd = loadAd(i);
        Object[] objArr2 = new Object[loadAd];
        int i2 = loadAd - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            AbstractC8457e.mopub(i5, obj2);
            int hashCode = obj2.hashCode();
            int appmetrica = AbstractC6227e.appmetrica(hashCode);
            while (true) {
                int i6 = appmetrica & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    appmetrica++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C7467e(obj4);
        }
        if (loadAd(i4) < loadAd / 2) {
            return Signature(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C1790e(i3, i2, i4, objArr, objArr2);
    }

    public static int loadAd(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4686e) && (this instanceof C1790e) && (((AbstractC4686e) obj) instanceof C1790e) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
