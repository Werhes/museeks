package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7480e {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int ad;
    public final /* synthetic */ AtomicReferenceArray license;
    public final int metrica;
    public final boolean vip;
    public static final /* synthetic */ AtomicReferenceFieldUpdater appmetrica = AtomicReferenceFieldUpdater.newUpdater(C7480e.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater purchase = AtomicLongFieldUpdater.newUpdater(C7480e.class, "_state$volatile");
    public static final C2443e billing = new C2443e("REMOVE_FROZEN", 2);

    public C7480e(int i, boolean z) {
        this.ad = i;
        this.vip = z;
        int i2 = i - 1;
        this.metrica = i2;
        this.license = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int ad(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = purchase;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.metrica;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.vip;
            AtomicReferenceArray atomicReferenceArray = this.license;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (purchase.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C7480e c7480e = this;
                    while ((atomicLongFieldUpdater.get(c7480e) & 1152921504606846976L) != 0) {
                        c7480e = c7480e.metrica();
                        AtomicReferenceArray atomicReferenceArray2 = c7480e.license;
                        int i4 = c7480e.metrica & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C12224e) && ((C12224e) obj2).ad == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c7480e = null;
                        }
                        if (c7480e == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.ad;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final Object license() {
        C7480e c7480e = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = purchase;
            long j = atomicLongFieldUpdater.get(c7480e);
            if ((j & 1152921504606846976L) != 0) {
                return billing;
            }
            int i = (int) (j & 1073741823);
            int i2 = c7480e.metrica;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c7480e.license;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = c7480e.vip;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof C12224e) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (purchase.compareAndSet(c7480e, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                c7480e = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(c7480e);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c7480e = c7480e.metrica();
                        } else {
                            C7480e c7480e2 = c7480e;
                            if (purchase.compareAndSet(c7480e2, j3, (j3 & (-1073741824)) | j2)) {
                                c7480e2.license.set(i4 & c7480e2.metrica, null);
                                c7480e = null;
                            } else {
                                c7480e = c7480e2;
                            }
                        }
                        if (c7480e == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final C7480e metrica() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C7480e c7480e;
        while (true) {
            atomicLongFieldUpdater = purchase;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c7480e = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c7480e = this;
            if (atomicLongFieldUpdater.compareAndSet(c7480e, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = appmetrica;
            C7480e c7480e2 = (C7480e) atomicReferenceFieldUpdater.get(this);
            if (c7480e2 != null) {
                return c7480e2;
            }
            C7480e c7480e3 = new C7480e(c7480e.ad * 2, c7480e.vip);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c7480e.metrica;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = c7480e.license.get(i4);
                if (obj == null) {
                    obj = new C12224e(i);
                }
                c7480e3.license.set(c7480e3.metrica & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(c7480e3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c7480e3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final boolean vip() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = purchase;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }
}
