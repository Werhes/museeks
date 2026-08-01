package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4101e {
    public final int ad;
    public final AtomicReferenceArray metrica;
    private volatile /* synthetic */ Object nextRef = null;
    private volatile /* synthetic */ long stateRef = 0;
    public final int vip;
    public static final C14595e purchase = new C14595e(4);
    public static final /* synthetic */ AtomicReferenceFieldUpdater license = AtomicReferenceFieldUpdater.newUpdater(C4101e.class, Object.class, "nextRef");
    public static final /* synthetic */ AtomicLongFieldUpdater appmetrica = AtomicLongFieldUpdater.newUpdater(C4101e.class, "stateRef");

    public C4101e(int i) {
        this.ad = i;
        int i2 = i - 1;
        this.vip = i2;
        this.metrica = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int ad(Object obj) {
        long j;
        int i;
        do {
            j = this.stateRef;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j);
            i = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.vip;
            if (((i + 2) & i3) == (i2 & i3)) {
                return 1;
            }
        } while (!appmetrica.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i + 1) & 1073741823) << 30)));
        this.metrica.set(this.vip & i, obj);
        C4101e c4101e = this;
        while ((c4101e.stateRef & 1152921504606846976L) != 0) {
            c4101e = c4101e.license();
            AtomicReferenceArray atomicReferenceArray = c4101e.metrica;
            int i4 = c4101e.vip & i;
            Object obj2 = atomicReferenceArray.get(i4);
            if ((obj2 instanceof C8339e) && ((C8339e) obj2).ad == i) {
                atomicReferenceArray.set(i4, obj);
            } else {
                c4101e = null;
            }
            if (c4101e == null) {
                return 0;
            }
        }
        return 0;
    }

    public final Object appmetrica() {
        Object obj;
        long j = this.stateRef;
        if ((j & 1152921504606846976L) != 0) {
            return purchase;
        }
        int i = (int) (j & 1073741823);
        int i2 = this.vip;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = this.metrica.get(i4)) == null || (obj instanceof C8339e)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (appmetrica.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
            this.metrica.set(this.vip & i, null);
            return obj;
        }
        C4101e c4101e = this;
        while (true) {
            long j3 = c4101e.stateRef;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((j3 & 1152921504606846976L) != 0) {
                c4101e = c4101e.license();
            } else {
                C4101e c4101e2 = c4101e;
                if (appmetrica.compareAndSet(c4101e2, j3, (j3 & (-1073741824)) | j2)) {
                    c4101e2.metrica.set(c4101e2.vip & i5, null);
                    c4101e = null;
                } else {
                    c4101e = c4101e2;
                }
            }
            if (c4101e == null) {
                return obj;
            }
        }
    }

    public final C4101e license() {
        long j;
        C4101e c4101e;
        while (true) {
            j = this.stateRef;
            if ((j & 1152921504606846976L) != 0) {
                c4101e = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            c4101e = this;
            if (appmetrica.compareAndSet(c4101e, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            C4101e c4101e2 = (C4101e) c4101e.nextRef;
            if (c4101e2 != null) {
                return c4101e2;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = license;
            C4101e c4101e3 = new C4101e(c4101e.ad * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c4101e.vip;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = c4101e3.metrica;
                int i5 = c4101e3.vip & i;
                Object obj = c4101e.metrica.get(i4);
                if (obj == null) {
                    obj = new C8339e(i);
                }
                atomicReferenceArray.set(i5, obj);
                i++;
            }
            c4101e3.stateRef = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c4101e3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final boolean metrica() {
        long j = this.stateRef;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final boolean vip() {
        long j;
        do {
            j = this.stateRef;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!appmetrica.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }
}
