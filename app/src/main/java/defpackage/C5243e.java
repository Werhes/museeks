package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۤؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5243e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f11157e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f11158e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Iterator f11159e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f11160e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9929e f11161e;

    public C5243e(C9929e c9929e, Iterator it) {
        this.f11161e = c9929e;
        this.f11159e = it;
        this.f11157e = ((C9160e) AbstractC12909e.yandex(c9929e.f19630e)).license;
        this.f11158e = this.f11160e;
        this.f11160e = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11160e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((C9160e) AbstractC12909e.yandex(this.f11161e.f19630e)).license != this.f11157e) {
            throw new ConcurrentModificationException();
        }
        this.f11158e = this.f11160e;
        Iterator it = this.f11159e;
        this.f11160e = it.hasNext() ? it.next() : null;
        Object obj = this.f11158e;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C9929e c9929e = this.f11161e;
        if (((C9160e) AbstractC12909e.yandex(c9929e.f19630e)).license != this.f11157e) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f11158e;
        if (obj == null) {
            throw new IllegalStateException();
        }
        c9929e.remove(obj);
        this.f11158e = null;
        Unit unit = Unit.INSTANCE;
        this.f11157e = ((C9160e) AbstractC12909e.yandex(c9929e.f19630e)).license;
    }
}
