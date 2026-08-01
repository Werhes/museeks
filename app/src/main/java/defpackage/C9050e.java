package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۡۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9050e extends AbstractC11130e implements InterfaceC0420e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f18108e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f18109e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14400e f18110e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C11498e f18111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9050e(C14400e c14400e, int i, int i2, C11498e c11498e) {
        super(9);
        this.f18110e = c14400e;
        this.f18109e = i;
        this.f18108e = i2;
        this.f18111e = c11498e;
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC16843e
    public final void release() {
        C8823e c8823e = (C8823e) this.f22046e;
        Object obj = null;
        if (c8823e.mo693e() && !c8823e.isCancelled()) {
            Object obj2 = ((C4418e) c8823e.m2188while()).ad;
            if (C4418e.ad(obj2)) {
                obj = obj2;
            }
        }
        InterfaceC9857e interfaceC9857e = (C4369e) obj;
        if (interfaceC9857e != null) {
            if (interfaceC9857e instanceof AutoCloseable) {
                interfaceC9857e.close();
            } else {
                if (!(interfaceC9857e instanceof ExecutorService)) {
                    throw new IllegalArgumentException();
                }
                AbstractC6418e.smaato((ExecutorService) interfaceC9857e);
            }
        }
    }

    @Override // defpackage.InterfaceC0420e
    public final void vip(Object obj) {
        Object obj2;
        EnumC16228e enumC16228e;
        AutoCloseable ad;
        InterfaceC17031e interfaceC17031e = (InterfaceC17031e) (C4418e.ad(obj) ? obj : null);
        if (interfaceC17031e != null) {
            if (interfaceC17031e instanceof C4369e) {
                ad = ((C4369e) interfaceC17031e).ad();
            } else {
                C4369e c4369e = (C4369e) interfaceC17031e.mo754static(AbstractC3820e.ad.vip(C4369e.class));
                ad = c4369e != null ? c4369e.ad() : new C4369e(interfaceC17031e, new C15024e(interfaceC17031e));
            }
            if (!((C8823e) this.f22046e).m2175import(new C4418e(ad))) {
                if (ad instanceof AutoCloseable) {
                    ad.close();
                } else {
                    if (!(ad instanceof ExecutorService)) {
                        throw new IllegalArgumentException();
                    }
                    AbstractC6418e.smaato((ExecutorService) ad);
                }
            }
        } else {
            ((C8823e) this.f22046e).m2175import(new C4418e(new C3110e(C4418e.ad(obj) ? 1 : obj == null ? 2 : ((C3110e) obj).ad)));
        }
        C11498e c11498e = this.f18111e;
        c11498e.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C11498e.vip;
        if (atomicIntegerFieldUpdater.decrementAndGet(c11498e) == 0) {
            Iterator it = this.f18110e.yandex.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            C14400e c14400e = this.f18110e;
            EnumC16228e enumC16228e2 = EnumC16228e.f31893e;
            C11498e c11498e2 = c14400e.billing;
            c11498e2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(c11498e2) != 0) {
                return;
            }
            C7744e c7744e = c14400e.purchase;
            do {
                obj2 = c7744e.ad;
                EnumC16228e enumC16228e3 = (EnumC16228e) obj2;
                int ordinal = enumC16228e3.ordinal();
                if (ordinal == 0) {
                    enumC16228e = EnumC16228e.f31891e;
                } else {
                    if (ordinal != 1) {
                        throw new IllegalStateException("Unexpected frame state for " + c14400e + "! State is " + enumC16228e3 + ' ');
                    }
                    enumC16228e = enumC16228e2;
                }
            } while (!c7744e.ad(obj2, enumC16228e));
            Iterator it2 = c14400e.yandex.iterator();
            if (it2.hasNext()) {
                throw AbstractC5087e.m1747goto(it2);
            }
            if (enumC16228e == enumC16228e2) {
                Iterator it3 = c14400e.yandex.iterator();
                if (it3.hasNext()) {
                    throw AbstractC5087e.m1747goto(it3);
                }
            }
        }
    }
}
