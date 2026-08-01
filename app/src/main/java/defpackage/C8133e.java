package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8133e implements InterfaceC1648e {
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5370e f16513e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16511e = AtomicIntegerFieldUpdater.newUpdater(C8133e.class, "_isCompleting$volatile");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16510e = AtomicReferenceFieldUpdater.newUpdater(C8133e.class, Object.class, "_rootCause$volatile");

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16512e = AtomicReferenceFieldUpdater.newUpdater(C8133e.class, Object.class, "_exceptionsHolder$volatile");

    public C8133e(C5370e c5370e, Throwable th) {
        this.f16513e = c5370e;
        this._rootCause$volatile = th;
    }

    public final void ad(Throwable th) {
        Throwable metrica = metrica();
        if (metrica == null) {
            f16510e.set(this, th);
            return;
        }
        if (th == metrica) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16512e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final ArrayList appmetrica(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16512e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable metrica = metrica();
        if (metrica != null) {
            arrayList.add(0, metrica);
        }
        if (th != null && !th.equals(metrica)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC15211e.appmetrica);
        return arrayList;
    }

    public final boolean license() {
        return metrica() != null;
    }

    public final Throwable metrica() {
        return (Throwable) f16510e.get(this);
    }

    @Override // defpackage.InterfaceC1648e
    public final boolean purchase() {
        return metrica() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(license());
        sb.append(", completing=");
        sb.append(f16511e.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(metrica());
        sb.append(", exceptions=");
        sb.append(f16512e.get(this));
        sb.append(", list=");
        sb.append(this.f16513e);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC1648e
    public final C5370e vip() {
        return this.f16513e;
    }
}
