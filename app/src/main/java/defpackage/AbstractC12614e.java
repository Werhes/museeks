package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12614e extends AbstractC0281e implements Set, j$.util.Set {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ int f25334e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient AbstractC17475e f25335e;

    public static AbstractC12614e Signature(int i, Object... objArr) {
        if (i == 0) {
            return C4477e.f9679e;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C8892e(obj);
        }
        int loadAd = loadAd(i);
        Object[] objArr2 = new Object[loadAd];
        int i2 = loadAd - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC1786e.admob(i5, "at index "));
            }
            int hashCode = obj2.hashCode();
            int license = AbstractC3192e.license(hashCode);
            while (true) {
                int i6 = license & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                license++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C8892e(obj4);
        }
        if (loadAd(i4) < loadAd / 2) {
            return Signature(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C4477e(i3, i2, i4, objArr, objArr2);
    }

    public static AbstractC12614e admob(Collection collection) {
        if ((collection instanceof AbstractC12614e) && !(collection instanceof SortedSet)) {
            AbstractC12614e abstractC12614e = (AbstractC12614e) collection;
            if (!abstractC12614e.advert()) {
                return abstractC12614e;
            }
        }
        Object[] array = collection.toArray();
        return Signature(array.length, array);
    }

    public static int loadAd(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            AbstractC2301e.yandex(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static AbstractC12614e remoteconfig(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC2301e.yandex(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return Signature(length, objArr2);
    }

    @Override // defpackage.AbstractC0281e
    public AbstractC17475e appmetrica() {
        AbstractC17475e abstractC17475e = this.f25335e;
        if (abstractC17475e != null) {
            return abstractC17475e;
        }
        AbstractC17475e subscription = subscription();
        this.f25335e = subscription;
        return subscription;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC12614e) && (this instanceof C4477e) && (((AbstractC12614e) obj) instanceof C4477e) && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC6100e.license(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC6100e.purchase(this);
    }

    public AbstractC17475e subscription() {
        Object[] array = toArray(AbstractC0281e.f2283e);
        C2171e c2171e = AbstractC17475e.f34223e;
        return AbstractC17475e.loadAd(array.length, array);
    }
}
