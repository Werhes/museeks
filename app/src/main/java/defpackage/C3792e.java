package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۨۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3792e extends AbstractC14140e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f8399e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C6556e f8400e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f8401e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f8402e;

    public C3792e(C6556e c6556e, AbstractC13502e[] abstractC13502eArr) {
        super(c6556e.f13486e, abstractC13502eArr);
        this.f8400e = c6556e;
        this.f8401e = c6556e.f13485e;
    }

    public final void metrica(int i, C9709e c9709e, Object obj, int i2) {
        int i3 = i2 * 5;
        AbstractC13502e[] abstractC13502eArr = this.f27967e;
        if (i3 <= 30) {
            int yandex = 1 << AbstractC10672e.yandex(i, i3);
            if (c9709e.yandex(yandex)) {
                abstractC13502eArr[i2].ad(Integer.bitCount(c9709e.ad) * 2, c9709e.purchase(yandex), c9709e.license);
                this.f27966e = i2;
                return;
            }
            int pro = c9709e.pro(yandex);
            C9709e remoteconfig = c9709e.remoteconfig(pro);
            abstractC13502eArr[i2].ad(Integer.bitCount(c9709e.ad) * 2, pro, c9709e.license);
            metrica(i, remoteconfig, obj, i2 + 1);
            return;
        }
        AbstractC13502e abstractC13502e = abstractC13502eArr[i2];
        Object[] objArr = c9709e.license;
        abstractC13502e.ad(objArr.length, 0, objArr);
        while (true) {
            AbstractC13502e abstractC13502e2 = abstractC13502eArr[i2];
            if (AbstractC7890e.billing(abstractC13502e2.f26780e[abstractC13502e2.f26778e], obj)) {
                this.f27966e = i2;
                return;
            } else {
                abstractC13502eArr[i2].f26778e += 2;
            }
        }
    }

    @Override // defpackage.AbstractC14140e, java.util.Iterator
    public final Object next() {
        if (this.f8400e.f13485e != this.f8401e) {
            throw new ConcurrentModificationException();
        }
        if (!this.f27965e) {
            throw new NoSuchElementException();
        }
        AbstractC13502e abstractC13502e = this.f27967e[this.f27966e];
        this.f8399e = abstractC13502e.f26780e[abstractC13502e.f26778e];
        this.f8402e = true;
        return super.next();
    }

    @Override // defpackage.AbstractC14140e, java.util.Iterator
    public final void remove() {
        if (!this.f8402e) {
            throw new IllegalStateException();
        }
        boolean z = this.f27965e;
        C6556e c6556e = this.f8400e;
        if (!z) {
            AbstractC9476e.metrica(c6556e).remove(this.f8399e);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            AbstractC13502e abstractC13502e = this.f27967e[this.f27966e];
            Object obj = abstractC13502e.f26780e[abstractC13502e.f26778e];
            AbstractC9476e.metrica(c6556e).remove(this.f8399e);
            metrica(obj != null ? obj.hashCode() : 0, c6556e.f13486e, obj, 0);
        }
        this.f8399e = null;
        this.f8402e = false;
        this.f8401e = c6556e.f13485e;
    }
}
