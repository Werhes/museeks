package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2342e implements InterfaceC5083e, InterfaceC18430e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f5855e = AtomicReferenceFieldUpdater.newUpdater(C2342e.class, Object.class, "result");

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5083e f5856e;
    private volatile Object result;

    public C2342e(InterfaceC5083e interfaceC5083e, EnumC2821e enumC2821e) {
        this.f5856e = interfaceC5083e;
        this.result = enumC2821e;
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f5856e.admob();
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC2821e enumC2821e = EnumC2821e.f6780e;
            if (obj2 == enumC2821e) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5855e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2821e, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC2821e) {
                        break;
                    }
                }
                return;
            }
            EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
            if (obj2 != enumC2821e2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5855e;
            EnumC2821e enumC2821e3 = EnumC2821e.f6779e;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC2821e2, enumC2821e3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC2821e2) {
                    break;
                }
            }
            this.f5856e.billing(obj);
            return;
        }
    }

    public final Object metrica() {
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        Object obj = this.result;
        EnumC2821e enumC2821e2 = EnumC2821e.f6780e;
        if (obj == enumC2821e2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5855e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2821e2, enumC2821e)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC2821e2) {
                    obj = this.result;
                }
            }
            return enumC2821e;
        }
        if (obj == EnumC2821e.f6779e) {
            return enumC2821e;
        }
        if (obj instanceof C12763e) {
            throw ((C12763e) obj).f25537e;
        }
        return obj;
    }

    public final String toString() {
        return "SafeContinuation for " + this.f5856e;
    }

    @Override // defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        InterfaceC5083e interfaceC5083e = this.f5856e;
        if (interfaceC5083e instanceof InterfaceC18430e) {
            return (InterfaceC18430e) interfaceC5083e;
        }
        return null;
    }
}
