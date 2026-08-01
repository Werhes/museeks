package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5930e extends AbstractC9359e implements Collection, InterfaceC12555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f12508e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f12509e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C6556e f12510e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C17204e f12511e;

    public C5930e(C17204e c17204e) {
        this.f12511e = c17204e;
        this.f12509e = c17204e.f33727e;
        this.f12508e = c17204e.f33726e;
        this.f12510e = c17204e.f33725e.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C6556e c6556e = this.f12510e;
        if (c6556e.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f12509e = obj;
            this.f12508e = obj;
            c6556e.put(obj, new C7731e());
            return true;
        }
        c6556e.put(this.f12508e, new C7731e(((C7731e) c6556e.get(this.f12508e)).ad, obj));
        c6556e.put(obj, new C7731e(this.f12508e));
        this.f12508e = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12510e.clear();
        C5170e c5170e = C5170e.f11076e;
        this.f12509e = c5170e;
        this.f12508e = c5170e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12510e.containsKey(obj);
    }

    public final C17204e firebase() {
        C9780e build = this.f12510e.build();
        C17204e c17204e = this.f12511e;
        if (build != c17204e.f33725e) {
            c17204e = new C17204e(this.f12509e, this.f12508e, build);
        }
        this.f12511e = c17204e;
        return c17204e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2729e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C6556e c6556e = this.f12510e;
        C7731e c7731e = (C7731e) c6556e.remove(obj);
        if (c7731e == null) {
            return false;
        }
        Object obj2 = c7731e.vip;
        Object obj3 = c7731e.ad;
        C5170e c5170e = C5170e.f11076e;
        if (obj3 != c5170e) {
            c6556e.put(obj3, new C7731e(((C7731e) c6556e.get(obj3)).ad, obj2));
        } else {
            this.f12509e = obj2;
        }
        if (obj2 != c5170e) {
            c6556e.put(obj2, new C7731e(obj3, ((C7731e) c6556e.get(obj2)).vip));
            return true;
        }
        this.f12508e = obj3;
        return true;
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        return this.f12510e.metrica();
    }
}
