package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12431e implements RandomAccess {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f24868e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C8794e f24869e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f24870e;

    public C12431e(int i, Object[] objArr) {
        this.f24870e = objArr;
        this.f24868e = i;
    }

    public final void Signature(int i) {
        Object[] objArr = this.f24870e;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f24870e = objArr2;
    }

    public final void ad(int i, Object obj) {
        int i2 = this.f24868e + 1;
        if (this.f24870e.length < i2) {
            Signature(i2);
        }
        Object[] objArr = this.f24870e;
        int i3 = this.f24868e;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f24868e++;
    }

    public final boolean adcel(Object obj) {
        int i = this.f24868e - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC7890e.billing(this.f24870e[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int advert(Object obj) {
        Object[] objArr = this.f24870e;
        int i = this.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            if (AbstractC7890e.billing(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final Object amazon(int i) {
        Object[] objArr = this.f24870e;
        Object obj = objArr[i];
        int i2 = this.f24868e;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f24868e - 1;
        this.f24868e = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void appmetrica(int i, C12431e c12431e) {
        int i2 = c12431e.f24868e;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f24868e + i2;
        if (this.f24870e.length < i3) {
            Signature(i3);
        }
        Object[] objArr = this.f24870e;
        int i4 = this.f24868e;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(c12431e.f24870e, 0, objArr, i, i2);
        this.f24868e += i2;
    }

    public final boolean billing(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f24868e + size;
        if (this.f24870e.length < i3) {
            Signature(i3);
        }
        Object[] objArr = this.f24870e;
        int i4 = this.f24868e;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f24868e += size;
        return true;
    }

    public final void license(Object obj) {
        int i = this.f24868e + 1;
        if (this.f24870e.length < i) {
            Signature(i);
        }
        Object[] objArr = this.f24870e;
        int i2 = this.f24868e;
        objArr[i2] = obj;
        this.f24868e = i2 + 1;
    }

    public final void loadAd(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f24868e;
            if (i2 < i3) {
                Object[] objArr = this.f24870e;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f24868e;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f24870e[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f24868e = i5;
        }
    }

    public final void purchase(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f24868e + size;
        if (this.f24870e.length < i2) {
            Signature(i2);
        }
        Object[] objArr = this.f24870e;
        int i3 = this.f24868e;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f24868e += size;
    }

    public final boolean smaato(Object obj) {
        int advert = advert(obj);
        if (advert < 0) {
            return false;
        }
        amazon(advert);
        return true;
    }

    public final void startapp() {
        Object[] objArr = this.f24870e;
        int i = this.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f24868e = 0;
    }

    public final List yandex() {
        C8794e c8794e = this.f24869e;
        if (c8794e != null) {
            return c8794e;
        }
        C8794e c8794e2 = new C8794e(1, this);
        this.f24869e = c8794e2;
        return c8794e2;
    }
}
