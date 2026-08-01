package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9832e extends C7055e implements InterfaceC1232e, InterfaceC1648e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C6467e f19423e;

    @Override // defpackage.InterfaceC1232e
    public final void ad() {
        C6467e c6467e = this.f19423e;
        if (c6467e == null) {
            c6467e = null;
        }
        c6467e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6467e.f13374e;
            Object obj = atomicReferenceFieldUpdater.get(c6467e);
            if (obj instanceof AbstractC9832e) {
                if (obj != this) {
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c6467e, obj, AbstractC15211e.billing)) {
                    if (atomicReferenceFieldUpdater.get(c6467e) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1648e) || ((InterfaceC1648e) obj).vip() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7055e.f14486e;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C5670e) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C7055e c7055e = (C7055e) obj2;
                c7055e.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C7055e.f14484e;
                C5670e c5670e = (C5670e) atomicReferenceFieldUpdater3.get(c7055e);
                if (c5670e == null) {
                    c5670e = new C5670e(c7055e);
                    atomicReferenceFieldUpdater3.set(c7055e, c5670e);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c5670e)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c7055e.license();
                return;
            }
        }
    }

    public abstract void mopub(Throwable th);

    @Override // defpackage.InterfaceC1648e
    public final boolean purchase() {
        return true;
    }

    public abstract boolean startapp();

    @Override // defpackage.C7055e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC7111e.purchase(this));
        sb.append("[job@");
        C6467e c6467e = this.f19423e;
        if (c6467e == null) {
            c6467e = null;
        }
        sb.append(AbstractC7111e.purchase(c6467e));
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC1648e
    public final C5370e vip() {
        return null;
    }
}
