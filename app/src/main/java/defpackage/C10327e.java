package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10327e extends AbstractC11110e implements InterfaceC8346e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10327e f20377e = new C10327e(new Object[0]);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object[] f20378e;

    public C10327e(Object[] objArr) {
        this.f20378e = objArr;
    }

    @Override // defpackage.AbstractC11110e
    /* renamed from: class, reason: not valid java name */
    public final AbstractC11110e mo2797class(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.f20378e;
        if (collection.size() + objArr.length > 32) {
            C4009e mo2798interface = mo2798interface();
            mo2798interface.addAll(collection);
            return mo2798interface.m1421class();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new C10327e(copyOf);
    }

    @Override // defpackage.AbstractC11110e
    public final AbstractC11110e firebase(Object obj) {
        Object[] objArr = this.f20378e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new C10327e(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C12576e(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC6494e.license(i, subs());
        return this.f20378e[i];
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC1660e.firebase(obj, this.f20378e);
    }

    @Override // defpackage.AbstractC11110e
    /* renamed from: interface, reason: not valid java name */
    public final C4009e mo2798interface() {
        return new C4009e(this, null, this.f20378e, 0);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC1660e.m672native(obj, this.f20378e);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f20378e;
        AbstractC6494e.appmetrica(i, objArr.length);
        return new C5583e(i, objArr.length, objArr);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f20378e.length;
    }

    @Override // defpackage.AbstractC11110e
    /* renamed from: this, reason: not valid java name */
    public final AbstractC11110e mo2799this(int i) {
        Object[] objArr = this.f20378e;
        AbstractC6494e.license(i, objArr.length);
        if (objArr.length == 1) {
            return f20377e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC1660e.mopub(i, i + 1, objArr.length, objArr, copyOf);
        return new C10327e(copyOf);
    }
}
