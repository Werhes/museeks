package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؐۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10715e implements Iterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f21109e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f21110e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f21111e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Iterator f21112e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21113e;

    public /* synthetic */ C10715e(C12745e c12745e) {
        this.f21113e = 2;
        Objects.requireNonNull(c12745e);
        this.f21109e = c12745e;
        this.f21111e = -1;
    }

    public /* synthetic */ C10715e(AbstractMap abstractMap, int i) {
        this.f21113e = i;
        this.f21109e = abstractMap;
        this.f21111e = -1;
    }

    public Iterator ad() {
        switch (this.f21113e) {
            case 0:
                if (this.f21112e == null) {
                    this.f21112e = ((C15497e) this.f21109e).f30612e.entrySet().iterator();
                }
                return this.f21112e;
            default:
                if (this.f21112e == null) {
                    this.f21112e = ((C9062e) this.f21109e).f18154e.entrySet().iterator();
                }
                return this.f21112e;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21113e) {
            case 0:
                return this.f21111e + 1 < ((C15497e) this.f21109e).f30613e.size() || ad().hasNext();
            case 1:
                int i = this.f21111e + 1;
                C9062e c9062e = (C9062e) this.f21109e;
                if (i >= c9062e.f18155e) {
                    return !c9062e.f18154e.isEmpty() && ad().hasNext();
                }
                return true;
            case 2:
                int i2 = this.f21111e + 1;
                C12745e c12745e = (C12745e) this.f21109e;
                if (i2 >= c12745e.f25497e) {
                    return !c12745e.f25496e.isEmpty() && vip().hasNext();
                }
                return true;
            default:
                int i3 = this.f21111e + 1;
                C15620e c15620e = (C15620e) this.f21109e;
                if (i3 >= c15620e.f30806e) {
                    return !c15620e.f30805e.isEmpty() && vip().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21113e) {
            case 0:
                this.f21110e = true;
                int i = this.f21111e + 1;
                this.f21111e = i;
                C15497e c15497e = (C15497e) this.f21109e;
                return i < c15497e.f30613e.size() ? (Map.Entry) c15497e.f30613e.get(this.f21111e) : (Map.Entry) ad().next();
            case 1:
                this.f21110e = true;
                int i2 = this.f21111e + 1;
                this.f21111e = i2;
                C9062e c9062e = (C9062e) this.f21109e;
                return i2 < c9062e.f18155e ? (C7399e) c9062e.f18157e[i2] : (Map.Entry) ad().next();
            case 2:
                this.f21110e = true;
                int i3 = this.f21111e + 1;
                this.f21111e = i3;
                C12745e c12745e = (C12745e) this.f21109e;
                return i3 < c12745e.f25497e ? (C11377e) c12745e.f25499e[i3] : (Map.Entry) vip().next();
            default:
                this.f21110e = true;
                int i4 = this.f21111e + 1;
                this.f21111e = i4;
                C15620e c15620e = (C15620e) this.f21109e;
                return i4 < c15620e.f30806e ? (C4392e) c15620e.f30808e[i4] : (Map.Entry) vip().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f21113e;
        AbstractMap abstractMap = this.f21109e;
        switch (i) {
            case 0:
                C15497e c15497e = (C15497e) abstractMap;
                if (!this.f21110e) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f21110e = false;
                int i2 = C15497e.f30610e;
                c15497e.vip();
                if (this.f21111e >= c15497e.f30613e.size()) {
                    ad().remove();
                    return;
                }
                int i3 = this.f21111e;
                this.f21111e = i3 - 1;
                c15497e.purchase(i3);
                return;
            case 1:
                C9062e c9062e = (C9062e) abstractMap;
                if (!this.f21110e) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f21110e = false;
                int i4 = C9062e.f18152e;
                c9062e.vip();
                int i5 = this.f21111e;
                if (i5 >= c9062e.f18155e) {
                    ad().remove();
                    return;
                } else {
                    this.f21111e = i5 - 1;
                    c9062e.yandex(i5);
                    return;
                }
            case 2:
                if (!this.f21110e) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f21110e = false;
                C12745e c12745e = (C12745e) abstractMap;
                c12745e.purchase();
                int i6 = this.f21111e;
                if (i6 >= c12745e.f25497e) {
                    vip().remove();
                    return;
                } else {
                    this.f21111e = i6 - 1;
                    c12745e.license(i6);
                    return;
                }
            default:
                C15620e c15620e = (C15620e) abstractMap;
                if (!this.f21110e) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f21110e = false;
                int i7 = C15620e.f30803e;
                c15620e.billing();
                int i8 = this.f21111e;
                if (i8 >= c15620e.f30806e) {
                    vip().remove();
                    return;
                } else {
                    this.f21111e = i8 - 1;
                    c15620e.appmetrica(i8);
                    return;
                }
        }
    }

    public Iterator vip() {
        switch (this.f21113e) {
            case 2:
                if (this.f21112e == null) {
                    this.f21112e = ((C12745e) this.f21109e).f25496e.entrySet().iterator();
                }
                return this.f21112e;
            default:
                if (this.f21112e == null) {
                    this.f21112e = ((C15620e) this.f21109e).f30805e.entrySet().iterator();
                }
                return this.f21112e;
        }
    }
}
