package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4894e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater vip = AtomicIntegerFieldUpdater.newUpdater(C4894e.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public AbstractRunnableC9465e[] ad;

    public final void ad(AbstractRunnableC9465e abstractRunnableC9465e) {
        abstractRunnableC9465e.license((C16037e) this);
        AbstractRunnableC9465e[] abstractRunnableC9465eArr = this.ad;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vip;
        if (abstractRunnableC9465eArr == null) {
            abstractRunnableC9465eArr = new AbstractRunnableC9465e[4];
            this.ad = abstractRunnableC9465eArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC9465eArr.length) {
            abstractRunnableC9465eArr = (AbstractRunnableC9465e[]) Arrays.copyOf(abstractRunnableC9465eArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.ad = abstractRunnableC9465eArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC9465eArr[i] = abstractRunnableC9465e;
        abstractRunnableC9465e.f18806e = i;
        while (i > 0) {
            AbstractRunnableC9465e[] abstractRunnableC9465eArr2 = this.ad;
            int i2 = (i - 1) / 2;
            if (abstractRunnableC9465eArr2[i2].compareTo(abstractRunnableC9465eArr2[i]) <= 0) {
                return;
            }
            license(i, i2);
            i = i2;
        }
    }

    public final void license(int i, int i2) {
        AbstractRunnableC9465e[] abstractRunnableC9465eArr = this.ad;
        AbstractRunnableC9465e abstractRunnableC9465e = abstractRunnableC9465eArr[i2];
        AbstractRunnableC9465e abstractRunnableC9465e2 = abstractRunnableC9465eArr[i];
        abstractRunnableC9465eArr[i] = abstractRunnableC9465e;
        abstractRunnableC9465eArr[i2] = abstractRunnableC9465e2;
        abstractRunnableC9465e.f18806e = i;
        abstractRunnableC9465e2.f18806e = i2;
    }

    public final AbstractRunnableC9465e metrica(int i) {
        AbstractRunnableC9465e[] abstractRunnableC9465eArr = this.ad;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vip;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            license(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || abstractRunnableC9465eArr[i].compareTo(abstractRunnableC9465eArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    AbstractRunnableC9465e[] abstractRunnableC9465eArr2 = this.ad;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || abstractRunnableC9465eArr2[i5].compareTo(abstractRunnableC9465eArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (abstractRunnableC9465eArr2[i].compareTo(abstractRunnableC9465eArr2[i5]) <= 0) {
                        break;
                    }
                    license(i, i5);
                    i = i5;
                }
            } else {
                license(i, i2);
                while (i2 > 0) {
                    AbstractRunnableC9465e[] abstractRunnableC9465eArr3 = this.ad;
                    int i6 = (i2 - 1) / 2;
                    if (abstractRunnableC9465eArr3[i6].compareTo(abstractRunnableC9465eArr3[i2]) <= 0) {
                        break;
                    }
                    license(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC9465e abstractRunnableC9465e = abstractRunnableC9465eArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC9465e.license(null);
        abstractRunnableC9465e.f18806e = -1;
        abstractRunnableC9465eArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC9465e;
    }

    public final void vip(AbstractRunnableC9465e abstractRunnableC9465e) {
        synchronized (this) {
            if (abstractRunnableC9465e.vip() != null) {
                metrica(abstractRunnableC9465e.f18806e);
            }
        }
    }
}
