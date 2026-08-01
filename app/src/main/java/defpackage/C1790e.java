package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1790e extends AbstractC4686e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C1790e f4844e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final Object[] f4845e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final transient int f4846e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient int f4847e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final transient int f4848e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final transient Object[] f4849e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient Object[] f4850e;

    static {
        Object[] objArr = new Object[0];
        f4845e = objArr;
        f4844e = new C1790e(0, 0, 0, objArr, objArr);
    }

    public C1790e(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(2);
        this.f4850e = objArr;
        this.f4847e = i;
        this.f4849e = objArr2;
        this.f4846e = i2;
        this.f4848e = i3;
    }

    @Override // defpackage.AbstractC10054e
    public final int adcel() {
        return this.f4848e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f4849e;
            if (objArr.length != 0) {
                int appmetrica = AbstractC6227e.appmetrica(obj.hashCode());
                while (true) {
                    int i = appmetrica & this.f4846e;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    appmetrica = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC4686e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4847e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC8718e abstractC8718e = this.f10069e;
        if (abstractC8718e == null) {
            abstractC8718e = AbstractC8718e.Signature(this.f4848e, this.f4850e);
            this.f10069e = abstractC8718e;
        }
        return abstractC8718e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4848e;
    }

    @Override // defpackage.AbstractC10054e
    public final int smaato(Object[] objArr) {
        Object[] objArr2 = this.f4850e;
        int i = this.f4848e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC10054e
    public final int startapp() {
        return 0;
    }

    @Override // defpackage.AbstractC10054e
    public final Object[] yandex() {
        return this.f4850e;
    }
}
