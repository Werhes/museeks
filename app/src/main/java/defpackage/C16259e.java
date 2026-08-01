package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16259e implements InterfaceC4075e, InterfaceC11221e, InterfaceC5634e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31934e = AtomicReferenceFieldUpdater.newUpdater(C16259e.class, Object.class, "state$volatile");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f31936e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f31939e;
    private volatile /* synthetic */ Object state$volatile = AbstractC4608e.ad;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ArrayList f31937e = new ArrayList(2);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f31938e = -1;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f31935e = AbstractC4608e.license;

    public C16259e(InterfaceC8850e interfaceC8850e) {
        this.f31939e = interfaceC8850e;
    }

    @Override // defpackage.InterfaceC4075e
    public final void ad(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31934e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC4608e.vip) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, AbstractC4608e.metrica)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f31937e;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1822e) it.next()).ad();
            }
            this.f31935e = AbstractC4608e.license;
            this.f31937e = null;
            return;
        }
    }

    public final C1822e appmetrica(Object obj) {
        ArrayList arrayList = this.f31937e;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C1822e) next).ad == obj) {
                obj2 = next;
                break;
            }
        }
        C1822e c1822e = (C1822e) obj2;
        if (c1822e != null) {
            return c1822e;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void billing(C1822e c1822e, boolean z) {
        ArrayList arrayList;
        Object obj = c1822e.ad;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31934e;
        if (atomicReferenceFieldUpdater.get(this) instanceof C1822e) {
            return;
        }
        if (!z && ((arrayList = this.f31937e) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C1822e) it.next()).ad == obj) {
                    throw new IllegalStateException(AbstractC1634e.advert(obj, "Cannot use select clauses on the same object: ").toString());
                }
            }
        }
        c1822e.vip.invoke(obj, this, c1822e.license);
        if (this.f31935e != AbstractC4608e.license) {
            atomicReferenceFieldUpdater.set(this, c1822e);
            return;
        }
        if (!z) {
            this.f31937e.add(c1822e);
        }
        c1822e.billing = this.f31936e;
        c1822e.yandex = this.f31938e;
        this.f31936e = null;
        this.f31938e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.AbstractC10731e r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16259e.license(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5634e
    public final void metrica(AbstractC12466e abstractC12466e, int i) {
        this.f31936e = abstractC12466e;
        this.f31938e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void purchase(C11106e c11106e, Function2 function2) {
        billing(new C1822e(this, c11106e.f22008e, (Function3) c11106e.f22007e, (Function3) c11106e.f22009e, null, (AbstractC7185e) function2, (Function3) c11106e.f22006e), false);
    }

    public final int startapp(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31934e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC1148e)) {
                if (AbstractC7890e.billing(obj3, AbstractC4608e.vip) || (obj3 instanceof C1822e)) {
                    return 3;
                }
                if (AbstractC7890e.billing(obj3, AbstractC4608e.metrica)) {
                    return 2;
                }
                if (AbstractC7890e.billing(obj3, AbstractC4608e.ad)) {
                    List singletonList = Collections.singletonList(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, singletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList m3572catch = AbstractC13480e.m3572catch(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, m3572catch)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            C1822e appmetrica = appmetrica(obj);
            if (appmetrica != null) {
                Function3 function3 = appmetrica.purchase;
                Function3 function32 = function3 != null ? (Function3) function3.invoke(this, appmetrica.license, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, appmetrica)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC1148e interfaceC1148e = (InterfaceC1148e) obj3;
                this.f31935e = obj2;
                C2443e adcel = interfaceC1148e.adcel(Unit.INSTANCE, function32);
                if (adcel == null) {
                    this.f31935e = AbstractC4608e.license;
                    return 2;
                }
                interfaceC1148e.pro(adcel);
                return 0;
            }
            continue;
        }
    }

    public final Object vip(AbstractC10731e abstractC10731e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31934e;
        C1822e c1822e = (C1822e) atomicReferenceFieldUpdater.get(this);
        Object obj = this.f31935e;
        ArrayList arrayList = this.f31937e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1822e c1822e2 = (C1822e) it.next();
                if (c1822e2 != c1822e) {
                    c1822e2.ad();
                }
            }
            atomicReferenceFieldUpdater.set(this, AbstractC4608e.vip);
            this.f31935e = AbstractC4608e.license;
            this.f31937e = null;
        }
        Function3 function3 = c1822e.metrica;
        Object obj2 = c1822e.license;
        Object invoke = function3.invoke(c1822e.ad, obj2, obj);
        InterfaceC5083e interfaceC5083e = c1822e.appmetrica;
        return obj2 == AbstractC4608e.appmetrica ? ((Function1) interfaceC5083e).invoke(abstractC10731e) : ((Function2) interfaceC5083e).invoke(invoke, abstractC10731e);
    }

    public final boolean yandex(Object obj, Object obj2) {
        return startapp(obj, obj2) == 0;
    }
}
