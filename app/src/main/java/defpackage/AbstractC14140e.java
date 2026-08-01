package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٞۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14140e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f27965e = true;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f27966e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC13502e[] f27967e;

    public AbstractC14140e(C9709e c9709e, AbstractC13502e[] abstractC13502eArr) {
        this.f27967e = abstractC13502eArr;
        abstractC13502eArr[0].ad(Integer.bitCount(c9709e.ad) * 2, 0, c9709e.license);
        this.f27966e = 0;
        ad();
    }

    public final void ad() {
        int i = this.f27966e;
        AbstractC13502e[] abstractC13502eArr = this.f27967e;
        AbstractC13502e abstractC13502e = abstractC13502eArr[i];
        if (abstractC13502e.f26778e < abstractC13502e.f26779e) {
            return;
        }
        while (-1 < i) {
            int vip = vip(i);
            if (vip == -1) {
                AbstractC13502e abstractC13502e2 = abstractC13502eArr[i];
                int i2 = abstractC13502e2.f26778e;
                Object[] objArr = abstractC13502e2.f26780e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC13502e2.f26778e = i2 + 1;
                    vip = vip(i);
                }
            }
            if (vip != -1) {
                this.f27966e = vip;
                return;
            }
            if (i > 0) {
                AbstractC13502e abstractC13502e3 = abstractC13502eArr[i - 1];
                int i3 = abstractC13502e3.f26778e;
                int length2 = abstractC13502e3.f26780e.length;
                abstractC13502e3.f26778e = i3 + 1;
            }
            abstractC13502eArr[i].ad(0, 0, C9709e.appmetrica.license);
            i--;
        }
        this.f27965e = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27965e;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f27965e) {
            throw new NoSuchElementException();
        }
        Object next = this.f27967e[this.f27966e].next();
        ad();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int vip(int i) {
        AbstractC13502e[] abstractC13502eArr = this.f27967e;
        AbstractC13502e abstractC13502e = abstractC13502eArr[i];
        int i2 = abstractC13502e.f26778e;
        if (i2 < abstractC13502e.f26779e) {
            return i;
        }
        Object[] objArr = abstractC13502e.f26780e;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        C9709e c9709e = (C9709e) objArr[i2];
        if (i == 6) {
            AbstractC13502e abstractC13502e2 = abstractC13502eArr[i + 1];
            Object[] objArr2 = c9709e.license;
            abstractC13502e2.ad(objArr2.length, 0, objArr2);
        } else {
            abstractC13502eArr[i + 1].ad(Integer.bitCount(c9709e.ad) * 2, 0, c9709e.license);
        }
        return vip(i + 1);
    }
}
