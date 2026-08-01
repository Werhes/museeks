package defpackage;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18224e implements Iterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f35689e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f35690e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f35691e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f35692e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35693e = 0;

    public AbstractC18224e(C3638e c3638e) {
        this.f35689e = c3638e;
        this.f35691e = c3638e.f8198e;
        this.f35690e = c3638e.isEmpty() ? -1 : 0;
        this.f35692e = -1;
    }

    public AbstractC18224e(C3638e c3638e, byte b) {
        this.f35689e = c3638e;
        this.f35691e = c3638e.f8198e;
        this.f35690e = c3638e.isEmpty() ? -1 : 0;
        this.f35692e = -1;
    }

    public abstract Object ad(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f35693e) {
            case 0:
                return this.f35690e >= 0;
            default:
                return this.f35690e >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35693e) {
            case 0:
                C3638e c3638e = (C3638e) this.f35689e;
                if (c3638e.f8198e != this.f35691e) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f35690e;
                this.f35692e = i;
                Object ad = ad(i);
                int i2 = this.f35690e + 1;
                if (i2 >= c3638e.f8197e) {
                    i2 = -1;
                }
                this.f35690e = i2;
                return ad;
            default:
                C3638e c3638e2 = (C3638e) this.f35689e;
                if (c3638e2.f8198e != this.f35691e) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f35690e;
                this.f35692e = i3;
                Object vip = vip(i3);
                int i4 = this.f35690e + 1;
                if (i4 >= c3638e2.f8197e) {
                    i4 = -1;
                }
                this.f35690e = i4;
                return vip;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f35693e) {
            case 0:
                C3638e c3638e = (C3638e) this.f35689e;
                if (c3638e.f8198e != this.f35691e) {
                    throw new ConcurrentModificationException();
                }
                AbstractC2301e.admob("no calls to next() since the last call to remove()", this.f35692e >= 0);
                this.f35691e += 32;
                c3638e.remove(c3638e.adcel()[this.f35692e]);
                this.f35690e--;
                this.f35692e = -1;
                return;
            default:
                C3638e c3638e2 = (C3638e) this.f35689e;
                int i = c3638e2.f8198e;
                int i2 = this.f35691e;
                if (i != i2) {
                    throw new ConcurrentModificationException();
                }
                int i3 = this.f35692e;
                if (!(i3 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f35691e = i2 + 32;
                c3638e2.remove(c3638e2.amazon()[i3]);
                this.f35690e--;
                this.f35692e = -1;
                return;
        }
    }

    public abstract Object vip(int i);
}
