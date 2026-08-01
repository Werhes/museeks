package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292e extends AbstractC8218e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C0292e f2297e = new C0292e(new Object[0]);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object[] f2298e;

    public C0292e(Object[] objArr) {
        this.f2298e = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: class, reason: not valid java name */
    public final AbstractC8218e mo286class(Object obj) {
        Object[] objArr = this.f2298e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new C0292e(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C14686e(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.AbstractC8218e
    public final AbstractC8218e firebase(int i, Object obj) {
        Object[] objArr = this.f2298e;
        C7582e.appmetrica(i, objArr.length);
        if (i == objArr.length) {
            return mo286class(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC1660e.loadAd(0, i, 6, objArr, objArr2);
            AbstractC1660e.mopub(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new C0292e(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1660e.mopub(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C14686e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        C7582e.license(i, subs());
        return this.f2298e[i];
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC1660e.firebase(obj, this.f2298e);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: interface, reason: not valid java name */
    public final AbstractC8218e mo287interface(Collection collection) {
        Object[] objArr = this.f2298e;
        if (collection.size() + objArr.length > 32) {
            C0316e mo289this = mo289this();
            mo289this.addAll(collection);
            return mo289this.m301class();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new C0292e(copyOf);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC1660e.m672native(obj, this.f2298e);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f2298e;
        C7582e.appmetrica(i, objArr.length);
        return new C5921e(i, objArr.length, objArr);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: native, reason: not valid java name */
    public final AbstractC8218e mo288native(C9501e c9501e) {
        Object[] objArr = this.f2298e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c9501e.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f2297e : new C0292e(AbstractC1660e.pro(0, length, objArr2));
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f2298e.length;
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: this, reason: not valid java name */
    public final C0316e mo289this() {
        return new C0316e(this, null, this.f2298e, 0);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: try, reason: not valid java name */
    public final AbstractC8218e mo290try(int i, Object obj) {
        C7582e.license(i, subs());
        Object[] objArr = this.f2298e;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new C0292e(copyOf);
    }

    @Override // defpackage.AbstractC8218e
    /* renamed from: while, reason: not valid java name */
    public final AbstractC8218e mo291while(int i) {
        Object[] objArr = this.f2298e;
        C7582e.license(i, objArr.length);
        if (objArr.length == 1) {
            return f2297e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC1660e.mopub(i, i + 1, objArr.length, objArr, copyOf);
        return new C0292e(copyOf);
    }
}
