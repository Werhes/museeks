package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13965e implements InterfaceC11391e {
    public final ArrayDeque ad = new ArrayDeque();
    public long appmetrica;
    public long billing;
    public C6040e license;
    public final ArrayDeque metrica;
    public long purchase;
    public final ArrayDeque vip;

    public AbstractC13965e() {
        for (int i = 0; i < 10; i++) {
            this.ad.add(new C7507e(1));
        }
        this.vip = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.vip;
            C0211e c0211e = new C0211e(15, this);
            C0598e c0598e = new C0598e();
            c0598e.f2810e = c0211e;
            arrayDeque.add(c0598e);
        }
        this.metrica = new ArrayDeque();
        this.billing = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6145e
    public final void ad(long j) {
        this.billing = j;
    }

    @Override // defpackage.InterfaceC6145e
    public final void appmetrica(C13396e c13396e) {
        AbstractC2301e.billing(c13396e == this.license);
        C6040e c6040e = (C6040e) c13396e;
        if (!c6040e.metrica(4)) {
            long j = c6040e.f15301e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.billing;
                if (j2 != -9223372036854775807L && j < j2) {
                    c6040e.amazon();
                    this.ad.add(c6040e);
                    this.license = null;
                }
            }
        }
        long j3 = this.purchase;
        this.purchase = 1 + j3;
        c6040e.f12708e = j3;
        this.metrica.add(c6040e);
        this.license = null;
    }

    public abstract void billing(C6040e c6040e);

    @Override // defpackage.InterfaceC6145e
    public void flush() {
        ArrayDeque arrayDeque;
        this.purchase = 0L;
        this.appmetrica = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.metrica;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.ad;
            if (isEmpty) {
                break;
            }
            C6040e c6040e = (C6040e) arrayDeque2.poll();
            String str = AbstractC9413e.ad;
            c6040e.amazon();
            arrayDeque.add(c6040e);
        }
        C6040e c6040e2 = this.license;
        if (c6040e2 != null) {
            c6040e2.amazon();
            arrayDeque.add(c6040e2);
            this.license = null;
        }
    }

    @Override // defpackage.InterfaceC6145e
    public final Object license() {
        AbstractC2301e.subscription(this.license == null);
        ArrayDeque arrayDeque = this.ad;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C6040e c6040e = (C6040e) arrayDeque.pollFirst();
        this.license = c6040e;
        return c6040e;
    }

    public abstract C9770e purchase();

    @Override // defpackage.InterfaceC6145e
    public void release() {
    }

    public abstract boolean startapp();

    @Override // defpackage.InterfaceC11391e
    public final void vip(long j) {
        this.appmetrica = j;
    }

    @Override // defpackage.InterfaceC6145e
    /* renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public C0598e metrica() {
        ArrayDeque arrayDeque = this.vip;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.metrica;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C6040e c6040e = (C6040e) arrayDeque2.peek();
            String str = AbstractC9413e.ad;
            if (c6040e.f15301e > this.appmetrica) {
                return null;
            }
            C6040e c6040e2 = (C6040e) arrayDeque2.poll();
            boolean metrica = c6040e2.metrica(4);
            ArrayDeque arrayDeque3 = this.ad;
            if (metrica) {
                C0598e c0598e = (C0598e) arrayDeque.pollFirst();
                c0598e.ad(4);
                c6040e2.amazon();
                arrayDeque3.add(c6040e2);
                return c0598e;
            }
            billing(c6040e2);
            if (startapp()) {
                C9770e purchase = purchase();
                C0598e c0598e2 = (C0598e) arrayDeque.pollFirst();
                long j = c6040e2.f15301e;
                c0598e2.f22622e = j;
                c0598e2.f2809e = purchase;
                c0598e2.f2812e = j;
                c6040e2.amazon();
                arrayDeque3.add(c6040e2);
                return c0598e2;
            }
            c6040e2.amazon();
            arrayDeque3.add(c6040e2);
        }
    }
}
