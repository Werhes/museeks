package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17204e extends AbstractC16103e implements InterfaceC16486e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C17204e f33724e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C9780e f33725e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f33726e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f33727e;

    static {
        C5170e c5170e = C5170e.f11076e;
        f33724e = new C17204e(c5170e, c5170e, C9780e.f19324e);
    }

    public C17204e(Object obj, Object obj2, C9780e c9780e) {
        this.f33727e = obj;
        this.f33726e = obj2;
        this.f33725e = c9780e;
    }

    /* renamed from: class, reason: not valid java name */
    public final C17204e m4274class(Object obj) {
        C9780e c9780e = this.f33725e;
        C7731e c7731e = (C7731e) c9780e.get(obj);
        if (c7731e == null) {
            return this;
        }
        Object obj2 = c7731e.ad;
        Object obj3 = c7731e.vip;
        C9709e c9709e = c9780e.f19326e;
        C9709e tapsense = c9709e.tapsense(obj != null ? obj.hashCode() : 0, 0, obj);
        if (c9709e != tapsense) {
            c9780e = tapsense == null ? C9780e.f19324e : new C9780e(tapsense, c9780e.f19325e - 1);
        }
        C5170e c5170e = C5170e.f11076e;
        if (obj2 != c5170e) {
            c9780e = c9780e.vip(obj2, new C7731e(((C7731e) c9780e.get(obj2)).ad, obj3));
        }
        if (obj3 != c5170e) {
            c9780e = c9780e.vip(obj3, new C7731e(obj2, ((C7731e) c9780e.get(obj3)).vip));
        }
        Object obj4 = obj2 != c5170e ? this.f33727e : obj3;
        if (obj3 != c5170e) {
            obj2 = this.f33726e;
        }
        return new C17204e(obj4, obj2, c9780e);
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f33725e.containsKey(obj);
    }

    public final C17204e firebase(Object obj) {
        C9780e c9780e = this.f33725e;
        if (c9780e.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C17204e(obj, obj, c9780e.vip(obj, new C7731e()));
        }
        Object obj2 = this.f33726e;
        return new C17204e(this.f33727e, obj, c9780e.vip(obj2, new C7731e(((C7731e) c9780e.get(obj2)).ad, obj)).vip(obj, new C7731e(obj2)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5143e(this.f33727e, this.f33725e);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        C9780e c9780e = this.f33725e;
        c9780e.getClass();
        return c9780e.f19325e;
    }
}
