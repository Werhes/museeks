package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12328e {
    public Object[] ad;
    public C8794e metrica;
    public int vip;

    public /* synthetic */ C12328e() {
        this(16);
    }

    public C12328e(int i) {
        this.ad = i == 0 ? AbstractC4180e.ad : new Object[i];
    }

    public final Object Signature(int i, Object obj) {
        if (i < 0 || i >= this.vip) {
            admob(i);
            throw null;
        }
        Object[] objArr = this.ad;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void ad(Object obj) {
        int i = this.vip + 1;
        Object[] objArr = this.ad;
        if (objArr.length < i) {
            loadAd(i, objArr);
        }
        Object[] objArr2 = this.ad;
        int i2 = this.vip;
        objArr2[i2] = obj;
        this.vip = i2 + 1;
    }

    public final boolean adcel() {
        return this.vip == 0;
    }

    public final void admob(int i) {
        StringBuilder premium = AbstractC4653e.premium("Index ", i, " must be in 0..");
        premium.append(this.vip - 1);
        AbstractC14783e.yandex(premium.toString());
        throw null;
    }

    public final boolean advert(Object obj) {
        int startapp = startapp(obj);
        if (startapp < 0) {
            return false;
        }
        smaato(startapp);
        return true;
    }

    public final void amazon(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.vip) || i2 < 0 || i2 > i3) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "Start (", ") and end (", ") must be in 0..");
            pro.append(this.vip);
            AbstractC14783e.yandex(pro.toString());
            throw null;
        }
        if (i2 < i) {
            AbstractC14783e.billing("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.ad;
                AbstractC1660e.mopub(i, i2, i3, objArr, objArr);
            }
            int i4 = this.vip;
            int i5 = i4 - (i2 - i);
            Arrays.fill(this.ad, i5, i4, (Object) null);
            this.vip = i5;
        }
    }

    public final C8794e appmetrica() {
        C8794e c8794e = this.metrica;
        if (c8794e != null) {
            return c8794e;
        }
        C8794e c8794e2 = new C8794e(0, this);
        this.metrica = c8794e2;
        return c8794e2;
    }

    public final Object billing() {
        if (!adcel()) {
            return this.ad[0];
        }
        AbstractC14783e.startapp("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12328e) {
            C12328e c12328e = (C12328e) obj;
            int i = c12328e.vip;
            int i2 = this.vip;
            if (i == i2) {
                Object[] objArr = this.ad;
                Object[] objArr2 = c12328e.ad;
                C15926e admob = AbstractC3062e.admob(0, i2);
                int i3 = admob.f22523e;
                int i4 = admob.f22522e;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC7890e.billing(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final boolean license(int i, Collection collection) {
        if (i < 0 || i > this.vip) {
            StringBuilder premium = AbstractC4653e.premium("Index ", i, " must be in 0..");
            premium.append(this.vip);
            AbstractC14783e.yandex(premium.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + this.vip;
        Object[] objArr = this.ad;
        if (objArr.length < size) {
            loadAd(size, objArr);
        }
        Object[] objArr2 = this.ad;
        if (i != this.vip) {
            AbstractC1660e.mopub(collection.size() + i, i, this.vip, objArr2, objArr2);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        this.vip = collection.size() + this.vip;
        return true;
    }

    public final void loadAd(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.ad = objArr2;
    }

    public final void metrica(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.vip;
        int size = list.size() + i;
        Object[] objArr = this.ad;
        if (objArr.length < size) {
            loadAd(size, objArr);
        }
        Object[] objArr2 = this.ad;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.vip = list.size() + this.vip;
    }

    public final boolean mopub() {
        return this.vip != 0;
    }

    public final void purchase() {
        Arrays.fill(this.ad, 0, this.vip, (Object) null);
        this.vip = 0;
    }

    public final Object smaato(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.vip)) {
            admob(i);
            throw null;
        }
        Object[] objArr = this.ad;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC1660e.mopub(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.vip - 1;
        this.vip = i3;
        objArr[i3] = null;
        return obj;
    }

    public final int startapp(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.ad;
            int i2 = this.vip;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.ad;
        int i3 = this.vip;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.ad;
        int i = this.vip;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public final void vip(C12328e c12328e) {
        if (c12328e.adcel()) {
            return;
        }
        int i = this.vip + c12328e.vip;
        Object[] objArr = this.ad;
        if (objArr.length < i) {
            loadAd(i, objArr);
        }
        AbstractC1660e.mopub(this.vip, 0, c12328e.vip, c12328e.ad, this.ad);
        this.vip += c12328e.vip;
    }

    public final Object yandex(int i) {
        if (i >= 0 && i < this.vip) {
            return this.ad[i];
        }
        admob(i);
        throw null;
    }
}
