package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0453e implements InterfaceC1570e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f2500e = AtomicLongFieldUpdater.newUpdater(AbstractC0453e.class, "top");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AtomicReferenceArray f2501e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f2502e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int[] f2503e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f2504e;
    private volatile /* synthetic */ long top;

    public AbstractC0453e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "capacity should be positive but it is ").toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        this.top = 0L;
        int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f2504e = highestOneBit;
        this.f2502e = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        int i2 = highestOneBit + 1;
        this.f2501e = new AtomicReferenceArray(i2);
        this.f2503e = new int[i2];
    }

    public Object ad(Object obj) {
        return obj;
    }

    public void advert(Object obj) {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        do {
        } while (purchase() != null);
    }

    @Override // defpackage.InterfaceC1570e
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final void mo360e(Object obj) {
        long j;
        long j2;
        advert(obj);
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f2502e) + 1;
        for (int i = 0; i < 8; i++) {
            AtomicReferenceArray atomicReferenceArray = this.f2501e;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = this.f2504e;
                    }
                }
            }
            if (identityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j = this.top;
                j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.f2503e[identityHashCode] = (int) (4294967295L & j);
            } while (!f2500e.compareAndSet(this, j, j2));
            return;
        }
    }

    @Override // defpackage.InterfaceC1570e
    public final Object firebase() {
        Object purchase = purchase();
        return purchase != null ? ad(purchase) : license();
    }

    public abstract Object license();

    public final Object purchase() {
        long j;
        int i;
        AbstractC0453e abstractC0453e;
        long j2;
        do {
            j = this.top;
            if (j != 0) {
                j2 = ((j >> 32) & 4294967295L) + 1;
                i = (int) (4294967295L & j);
                if (i != 0) {
                    abstractC0453e = this;
                }
            }
            i = 0;
            abstractC0453e = this;
            break;
        } while (!f2500e.compareAndSet(abstractC0453e, j, (j2 << 32) | this.f2503e[i]));
        if (i == 0) {
            return null;
        }
        return abstractC0453e.f2501e.getAndSet(i, null);
    }
}
