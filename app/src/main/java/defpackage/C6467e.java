package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6467e implements InterfaceC10500e, InterfaceC3451e {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13374e = AtomicReferenceFieldUpdater.newUpdater(C6467e.class, Object.class, "_state$volatile");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13373e = AtomicReferenceFieldUpdater.newUpdater(C6467e.class, Object.class, "_parentHandle$volatile");

    public C6467e(boolean z) {
        this._state$volatile = z ? AbstractC15211e.billing : AbstractC15211e.purchase;
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public static String m2162e(Object obj) {
        if (!(obj instanceof C8133e)) {
            return obj instanceof InterfaceC1648e ? ((InterfaceC1648e) obj).purchase() ? "Active" : "New" : obj instanceof C1427e ? "Cancelled" : "Completed";
        }
        C8133e c8133e = (C8133e) obj;
        return c8133e.license() ? "Cancelling" : C8133e.f16511e.get(c8133e) == 1 ? "Completing" : "Active";
    }

    /* renamed from: return, reason: not valid java name */
    public static C12657e m2163return(C7055e c7055e) {
        while (c7055e.yandex()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7055e.f14485e;
            C7055e license = c7055e.license();
            if (license == null) {
                Object obj = atomicReferenceFieldUpdater.get(c7055e);
                while (true) {
                    c7055e = (C7055e) obj;
                    if (!c7055e.yandex()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c7055e);
                }
            } else {
                c7055e = license;
            }
        }
        while (true) {
            c7055e = c7055e.billing();
            if (!c7055e.yandex()) {
                if (c7055e instanceof C12657e) {
                    return (C12657e) c7055e;
                }
                if (c7055e instanceof C5370e) {
                    return null;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10500e
    public void Signature(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2808e(firebase(), null, this);
        }
        applovin(cancellationException);
    }

    /* renamed from: abstract, reason: not valid java name */
    public boolean mo2164abstract() {
        return true;
    }

    public void applovin(Throwable th) {
        isPro(th);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [eؘِؒ, eَؚٕ] */
    /* renamed from: case, reason: not valid java name */
    public final C5370e m2165case(InterfaceC1648e interfaceC1648e) {
        C5370e vip = interfaceC1648e.vip();
        if (vip != null) {
            return vip;
        }
        if (interfaceC1648e instanceof C5080e) {
            return new C7055e();
        }
        if (interfaceC1648e instanceof AbstractC9832e) {
            m2167continue((AbstractC9832e) interfaceC1648e);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1648e).toString());
    }

    /* renamed from: class, reason: not valid java name */
    public boolean mo2166class(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return isPro(th) && mo2164abstract();
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        return AbstractC5797e.vip(this, interfaceC8850e);
    }

    /* renamed from: continue, reason: not valid java name */
    public final void m2167continue(AbstractC9832e abstractC9832e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7055e c7055e = new C7055e();
        abstractC9832e.getClass();
        C7055e.f14485e.set(c7055e, abstractC9832e);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7055e.f14486e;
        atomicReferenceFieldUpdater2.set(c7055e, abstractC9832e);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC9832e) != abstractC9832e) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC9832e, abstractC9832e, c7055e)) {
                if (atomicReferenceFieldUpdater2.get(abstractC9832e) != abstractC9832e) {
                    break;
                }
            }
            c7055e.appmetrica(abstractC9832e);
        }
        C7055e billing = abstractC9832e.billing();
        do {
            atomicReferenceFieldUpdater = f13374e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC9832e, billing)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC9832e);
    }

    /* renamed from: default, reason: not valid java name */
    public boolean mo2168default() {
        return this instanceof C8823e;
    }

    @Override // defpackage.InterfaceC10500e
    /* renamed from: else */
    public final InterfaceC1232e mo692else(Function1 function1) {
        return m2179package(true, new C9098e(1, function1));
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public final boolean m2169e(C8133e c8133e, C12657e c12657e, Object obj) {
        while (AbstractC6629e.smaato(c12657e.f25378e, false, new C1516e(this, c8133e, c12657e, obj)) == C14251e.f28173e) {
            c12657e = m2163return(c12657e);
            if (c12657e == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public Object m2170e(InterfaceC5083e interfaceC5083e) {
        return tapsense(interfaceC5083e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final Object m2171e(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1648e)) {
            return AbstractC15211e.ad;
        }
        if (((obj instanceof C5080e) || (obj instanceof AbstractC9832e)) && !(obj instanceof C12657e) && !(obj2 instanceof C1427e)) {
            InterfaceC1648e interfaceC1648e = (InterfaceC1648e) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13374e;
            Object c5705e = obj2 instanceof InterfaceC1648e ? new C5705e((InterfaceC1648e) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1648e, c5705e)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1648e) {
                    return AbstractC15211e.metrica;
                }
            }
            mo2186throws(obj2);
            m2177interface(interfaceC1648e, obj2);
            return obj2;
        }
        InterfaceC1648e interfaceC1648e2 = (InterfaceC1648e) obj;
        C5370e m2165case = m2165case(interfaceC1648e2);
        if (m2165case == null) {
            return AbstractC15211e.metrica;
        }
        C8133e c8133e = interfaceC1648e2 instanceof C8133e ? (C8133e) interfaceC1648e2 : null;
        if (c8133e == null) {
            c8133e = new C8133e(m2165case, null);
        }
        synchronized (c8133e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C8133e.f16511e;
            if (atomicIntegerFieldUpdater.get(c8133e) == 1) {
                return AbstractC15211e.ad;
            }
            atomicIntegerFieldUpdater.set(c8133e, 1);
            if (c8133e != interfaceC1648e2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13374e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1648e2, c8133e)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1648e2) {
                        return AbstractC15211e.metrica;
                    }
                }
            }
            boolean license = c8133e.license();
            C1427e c1427e = obj2 instanceof C1427e ? (C1427e) obj2 : null;
            if (c1427e != null) {
                c8133e.ad(c1427e.ad);
            }
            Throwable metrica = license ? null : c8133e.metrica();
            Unit unit = Unit.INSTANCE;
            if (metrica != null) {
                m2183switch(m2165case, metrica);
            }
            C12657e m2163return = m2163return(m2165case);
            if (m2163return != null && m2169e(c8133e, m2163return, obj2)) {
                return AbstractC15211e.vip;
            }
            m2165case.metrica(new C8590e(2), 2);
            C12657e m2163return2 = m2163return(m2165case);
            return (m2163return2 == null || !m2169e(c8133e, m2163return2, obj2)) ? m2178native(c8133e, obj2) : AbstractC15211e.vip;
        }
    }

    @Override // defpackage.InterfaceC10500e
    /* renamed from: eّٔؖ */
    public final boolean mo693e() {
        return !(f13374e.get(this) instanceof InterfaceC1648e);
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final int m2172e(Object obj) {
        boolean z = obj instanceof C5080e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13374e;
        if (z) {
            if (((C5080e) obj).f10916e) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, AbstractC15211e.billing)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo2173finally();
            return 1;
        }
        if (!(obj instanceof C8358e)) {
            return 0;
        }
        C5370e c5370e = ((C8358e) obj).f17110e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5370e)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo2173finally();
        return 1;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.appmetrica(this, interfaceC1598e);
    }

    /* renamed from: finally, reason: not valid java name */
    public void mo2173finally() {
    }

    public String firebase() {
        return "Job was cancelled";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘِؒ, eَؚٕ] */
    /* renamed from: for, reason: not valid java name */
    public final void m2174for(C5080e c5080e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? c7055e = new C7055e();
        C8358e c8358e = c7055e;
        if (!c5080e.f10916e) {
            c8358e = new C8358e(c7055e);
        }
        do {
            atomicReferenceFieldUpdater = f13374e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c5080e, c8358e)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c5080e);
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        return C4524e.f9798e;
    }

    @Override // defpackage.InterfaceC10500e
    /* renamed from: goto */
    public final InterfaceC11356e mo694goto(C6467e c6467e) {
        C12657e c12657e = new C12657e(c6467e);
        c12657e.f19423e = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13374e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C5080e) {
                C5080e c5080e = (C5080e) obj;
                if (c5080e.f10916e) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c12657e)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m2174for(c5080e);
            } else {
                boolean z = obj instanceof InterfaceC1648e;
                C14251e c14251e = C14251e.f28173e;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C1427e c1427e = obj2 instanceof C1427e ? (C1427e) obj2 : null;
                    c12657e.mopub(c1427e != null ? c1427e.ad : null);
                    return c14251e;
                }
                C5370e vip = ((InterfaceC1648e) obj).vip();
                if (vip == null) {
                    m2167continue((AbstractC9832e) obj);
                } else if (!vip.metrica(c12657e, 7)) {
                    boolean metrica = vip.metrica(c12657e, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C8133e) {
                        r4 = ((C8133e) obj3).metrica();
                    } else {
                        C1427e c1427e2 = obj3 instanceof C1427e ? (C1427e) obj3 : null;
                        if (c1427e2 != null) {
                            r4 = c1427e2.ad;
                        }
                    }
                    c12657e.mopub(r4);
                    if (metrica) {
                        break loop0;
                    }
                    return c14251e;
                }
            }
        }
        return c12657e;
    }

    @Override // defpackage.InterfaceC10500e
    /* renamed from: implements */
    public final CancellationException mo695implements() {
        CancellationException cancellationException;
        Object obj = f13374e.get(this);
        if (!(obj instanceof C8133e)) {
            if (obj instanceof InterfaceC1648e) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C1427e)) {
                return new C2808e(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1427e) obj).ad;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C2808e(firebase(), th, this) : cancellationException;
        }
        Throwable metrica = ((C8133e) obj).metrica();
        if (metrica == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = metrica instanceof CancellationException ? (CancellationException) metrica : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = firebase();
        }
        return new C2808e(concat, metrica, this);
    }

    /* renamed from: import, reason: not valid java name */
    public final boolean m2175import(Object obj) {
        Object m2171e;
        do {
            m2171e = m2171e(f13374e.get(this), obj);
            if (m2171e == AbstractC15211e.ad) {
                return false;
            }
            if (m2171e == AbstractC15211e.vip) {
                return true;
            }
        } while (m2171e == AbstractC15211e.metrica);
        remoteconfig(m2171e);
        return true;
    }

    @Override // defpackage.InterfaceC10500e
    public final InterfaceC1232e inmobi(boolean z, Function1 function1, boolean z2) {
        return m2179package(z2, z ? new C5263e(function1) : new C9098e(1, function1));
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final Object m2176instanceof(Object obj) {
        Object m2171e;
        do {
            m2171e = m2171e(f13374e.get(this), obj);
            if (m2171e == AbstractC15211e.ad) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1427e c1427e = obj instanceof C1427e ? (C1427e) obj : null;
                throw new IllegalStateException(str, c1427e != null ? c1427e.ad : null);
            }
        } while (m2171e == AbstractC15211e.metrica);
        return m2171e;
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2177interface(InterfaceC1648e interfaceC1648e, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13373e;
        InterfaceC11356e interfaceC11356e = (InterfaceC11356e) atomicReferenceFieldUpdater.get(this);
        if (interfaceC11356e != null) {
            interfaceC11356e.ad();
            atomicReferenceFieldUpdater.set(this, C14251e.f28173e);
        }
        C14803e c14803e = null;
        C1427e c1427e = obj instanceof C1427e ? (C1427e) obj : null;
        Throwable th = c1427e != null ? c1427e.ad : null;
        if (interfaceC1648e instanceof AbstractC9832e) {
            try {
                ((AbstractC9832e) interfaceC1648e).mopub(th);
                return;
            } catch (Throwable th2) {
                mo2181strictfp(new C14803e(0, "Exception in completion handler " + interfaceC1648e + " for " + this, th2));
                return;
            }
        }
        C5370e vip = interfaceC1648e.vip();
        if (vip != null) {
            vip.metrica(new C8590e(1), 1);
            for (C7055e c7055e = (C7055e) C7055e.f14486e.get(vip); !AbstractC7890e.billing(c7055e, vip); c7055e = c7055e.billing()) {
                if (c7055e instanceof AbstractC9832e) {
                    try {
                        ((AbstractC9832e) c7055e).mopub(th);
                    } catch (Throwable th3) {
                        if (c14803e != null) {
                            AbstractC13362e.license(c14803e, th3);
                        } else {
                            c14803e = new C14803e(0, "Exception in completion handler " + c7055e + " for " + this, th3);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (c14803e != null) {
                mo2181strictfp(c14803e);
            }
        }
    }

    @Override // defpackage.InterfaceC10500e
    public final boolean isCancelled() {
        Object obj = f13374e.get(this);
        if (obj instanceof C1427e) {
            return true;
        }
        return (obj instanceof C8133e) && ((C8133e) obj).license();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r0 = defpackage.AbstractC15211e.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != defpackage.AbstractC15211e.vip) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0104, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = m2171e(r0, new defpackage.C1427e(m2184this(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 == defpackage.AbstractC15211e.metrica) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0 != defpackage.AbstractC15211e.ad) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r4 = defpackage.C6467e.f13374e;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof defpackage.C8133e) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if ((r5 instanceof defpackage.InterfaceC1648e) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r1 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r1 = m2184this(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r6 = (defpackage.InterfaceC1648e) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (mo2168default() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r6.purchase() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        r4 = m2171e(r5, new defpackage.C1427e(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r4 == defpackage.AbstractC15211e.ad) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r4 == defpackage.AbstractC15211e.metrica) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = defpackage.C6467e.f13374e.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r5).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        r7 = m2165case(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r7 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        r8 = new defpackage.C8133e(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof defpackage.InterfaceC1648e) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        if (r4.get(r9) == r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        m2183switch(r7, r1);
        r10 = defpackage.AbstractC15211e.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        r10 = defpackage.AbstractC15211e.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004e, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005a, code lost:
    
        if (defpackage.C8133e.f16512e.get((defpackage.C8133e) r5) != defpackage.AbstractC15211e.appmetrica) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005f, code lost:
    
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0061, code lost:
    
        r10 = defpackage.AbstractC15211e.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0063, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0069, code lost:
    
        r4 = ((defpackage.C8133e) r5).license();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof defpackage.C8133e) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0070, code lost:
    
        if (r10 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0072, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0080, code lost:
    
        r10 = ((defpackage.C8133e) r5).metrica();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0087, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0089, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008a, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008b, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008d, code lost:
    
        m2183switch(((defpackage.C8133e) r5).f16513e, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0094, code lost:
    
        r10 = defpackage.AbstractC15211e.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0074, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0076, code lost:
    
        r1 = m2184this(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007a, code lost:
    
        ((defpackage.C8133e) r5).ad(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x005e, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fd, code lost:
    
        if (r0 != defpackage.AbstractC15211e.ad) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0102, code lost:
    
        if (r0 != defpackage.AbstractC15211e.vip) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (defpackage.C8133e.f16511e.get((defpackage.C8133e) r0) != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0107, code lost:
    
        if (r0 != defpackage.AbstractC15211e.license) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0109, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010a, code lost:
    
        remoteconfig(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPro(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6467e.isPro(java.lang.Object):boolean");
    }

    public Object isVip() {
        return m2188while();
    }

    /* renamed from: native, reason: not valid java name */
    public final Object m2178native(C8133e c8133e, Object obj) {
        Throwable m2187try;
        C1427e c1427e = obj instanceof C1427e ? (C1427e) obj : null;
        Throwable th = c1427e != null ? c1427e.ad : null;
        synchronized (c8133e) {
            c8133e.license();
            ArrayList<Throwable> appmetrica = c8133e.appmetrica(th);
            m2187try = m2187try(c8133e, appmetrica);
            if (m2187try != null && appmetrica.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(appmetrica.size()));
                for (Throwable th2 : appmetrica) {
                    if (th2 != m2187try && th2 != m2187try && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        AbstractC13362e.license(m2187try, th2);
                    }
                }
            }
        }
        if (m2187try != null && m2187try != th) {
            obj = new C1427e(m2187try, false);
        }
        if (m2187try != null && (premium(m2187try) || mo2182super(m2187try))) {
            C1427e c1427e2 = (C1427e) obj;
            c1427e2.getClass();
            C1427e.vip.compareAndSet(c1427e2, 0, 1);
        }
        mo2186throws(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13374e;
        Object c5705e = obj instanceof InterfaceC1648e ? new C5705e((InterfaceC1648e) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c8133e, c5705e) && atomicReferenceFieldUpdater.get(this) == c8133e) {
        }
        m2177interface(c8133e, obj);
        return obj;
    }

    /* renamed from: package, reason: not valid java name */
    public final InterfaceC1232e m2179package(boolean z, AbstractC9832e abstractC9832e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C14251e c14251e;
        boolean z2;
        boolean metrica;
        abstractC9832e.f19423e = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f13374e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C5080e;
            c14251e = C14251e.f28173e;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC1648e)) {
                    z2 = false;
                    break;
                }
                InterfaceC1648e interfaceC1648e = (InterfaceC1648e) obj;
                C5370e vip = interfaceC1648e.vip();
                if (vip == null) {
                    m2167continue((AbstractC9832e) obj);
                } else {
                    if (abstractC9832e.startapp()) {
                        C8133e c8133e = interfaceC1648e instanceof C8133e ? (C8133e) interfaceC1648e : null;
                        Throwable metrica2 = c8133e != null ? c8133e.metrica() : null;
                        if (metrica2 == null) {
                            metrica = vip.metrica(abstractC9832e, 5);
                        } else if (z) {
                            abstractC9832e.mopub(metrica2);
                            return c14251e;
                        }
                    } else {
                        metrica = vip.metrica(abstractC9832e, 1);
                    }
                    if (metrica) {
                        break;
                    }
                }
            } else {
                C5080e c5080e = (C5080e) obj;
                if (c5080e.f10916e) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC9832e)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m2174for(c5080e);
            }
        }
        if (z2) {
            return abstractC9832e;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1427e c1427e = obj2 instanceof C1427e ? (C1427e) obj2 : null;
            abstractC9832e.mopub(c1427e != null ? c1427e.ad : null);
        }
        return c14251e;
    }

    public final boolean premium(Throwable th) {
        if (mo655transient()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC11356e interfaceC11356e = (InterfaceC11356e) f13373e.get(this);
        return (interfaceC11356e == null || interfaceC11356e == C14251e.f28173e) ? z : interfaceC11356e.inmobi(th) || z;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m2180private(InterfaceC10500e interfaceC10500e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13373e;
        C14251e c14251e = C14251e.f28173e;
        if (interfaceC10500e == null) {
            atomicReferenceFieldUpdater.set(this, c14251e);
            return;
        }
        interfaceC10500e.start();
        InterfaceC11356e mo694goto = interfaceC10500e.mo694goto(this);
        atomicReferenceFieldUpdater.set(this, mo694goto);
        if (mo693e()) {
            mo694goto.ad();
            atomicReferenceFieldUpdater.set(this, c14251e);
        }
    }

    @Override // defpackage.InterfaceC10500e
    /* renamed from: protected */
    public final Object mo696protected(InterfaceC5083e interfaceC5083e) {
        Object obj;
        do {
            obj = f13374e.get(this);
            if (!(obj instanceof InterfaceC1648e)) {
                AbstractC6629e.yandex(interfaceC5083e.admob());
                return Unit.INSTANCE;
            }
        } while (m2172e(obj) < 0);
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        c13578e.isPro(new C7394e(2, AbstractC6629e.smaato(this, true, new C12087e(c13578e, 1))));
        Object signatures = c13578e.signatures();
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (signatures != enumC2821e) {
            signatures = Unit.INSTANCE;
        }
        return signatures == enumC2821e ? signatures : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.vip(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC10500e
    public boolean purchase() {
        Object obj = f13374e.get(this);
        return (obj instanceof InterfaceC1648e) && ((InterfaceC1648e) obj).purchase();
    }

    public void remoteconfig(Object obj) {
    }

    public void signatures(Object obj) {
        remoteconfig(obj);
    }

    @Override // defpackage.InterfaceC10500e
    public final boolean start() {
        int m2172e;
        do {
            m2172e = m2172e(f13374e.get(this));
            if (m2172e == 0) {
                return false;
            }
        } while (m2172e != 1);
        return true;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void mo2181strictfp(C14803e c14803e) {
        throw c14803e;
    }

    /* renamed from: super, reason: not valid java name */
    public boolean mo2182super(Throwable th) {
        return false;
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m2183switch(C5370e c5370e, Throwable th) {
        c5370e.metrica(new C8590e(4), 4);
        C14803e c14803e = null;
        for (C7055e c7055e = (C7055e) C7055e.f14486e.get(c5370e); !AbstractC7890e.billing(c7055e, c5370e); c7055e = c7055e.billing()) {
            if ((c7055e instanceof AbstractC9832e) && ((AbstractC9832e) c7055e).startapp()) {
                try {
                    ((AbstractC9832e) c7055e).mopub(th);
                } catch (Throwable th2) {
                    if (c14803e != null) {
                        AbstractC13362e.license(c14803e, th2);
                    } else {
                        c14803e = new C14803e(0, "Exception in completion handler " + c7055e + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (c14803e != null) {
            mo2181strictfp(c14803e);
        }
        premium(th);
    }

    /* renamed from: synchronized */
    public String mo678synchronized() {
        return getClass().getSimpleName();
    }

    public final Object tapsense(InterfaceC5083e interfaceC5083e) {
        Object obj;
        do {
            obj = f13374e.get(this);
            if (!(obj instanceof InterfaceC1648e)) {
                if (obj instanceof C1427e) {
                    throw ((C1427e) obj).ad;
                }
                return AbstractC15211e.startapp(obj);
            }
        } while (m2172e(obj) < 0);
        C11285e c11285e = new C11285e(AbstractC10558e.startapp(interfaceC5083e), this);
        c11285e.tapsense();
        c11285e.isPro(new C7394e(2, AbstractC6629e.smaato(this, true, new C9098e(2, c11285e))));
        return c11285e.signatures();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    /* renamed from: this, reason: not valid java name */
    public final Throwable m2184this(Object obj) {
        CancellationException cancellationException;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2808e(firebase(), null, this) : th;
        }
        C6467e c6467e = (C6467e) ((InterfaceC3451e) obj);
        c6467e.getClass();
        Object obj2 = f13374e.get(c6467e);
        if (obj2 instanceof C8133e) {
            cancellationException = ((C8133e) obj2).metrica();
        } else if (obj2 instanceof C1427e) {
            cancellationException = ((C1427e) obj2).ad;
        } else {
            if (obj2 instanceof InterfaceC1648e) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new C2808e("Parent job is ".concat(m2162e(obj2)), cancellationException, c6467e) : cancellationException2;
    }

    /* renamed from: throw, reason: not valid java name */
    public final InterfaceC9093e m2185throw() {
        return new C1356e(new C18042e(this, null, 1));
    }

    /* renamed from: throws, reason: not valid java name */
    public void mo2186throws(Object obj) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo678synchronized() + '{' + m2162e(f13374e.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC7111e.purchase(this));
        return sb.toString();
    }

    /* renamed from: transient */
    public boolean mo655transient() {
        return this instanceof C3624e;
    }

    /* renamed from: try, reason: not valid java name */
    public final Throwable m2187try(C8133e c8133e, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c8133e.license()) {
                return new C2808e(firebase(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C3063e) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof C3063e)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // defpackage.InterfaceC10500e
    /* renamed from: volatile */
    public final C15024e mo697volatile() {
        C15770e c15770e = C15770e.f31057e;
        AbstractC9476e.purchase(3, c15770e);
        return new C15024e(this, c15770e);
    }

    /* renamed from: while, reason: not valid java name */
    public final Object m2188while() {
        Object obj = f13374e.get(this);
        if (obj instanceof InterfaceC1648e) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C1427e) {
            throw ((C1427e) obj).ad;
        }
        return AbstractC15211e.startapp(obj);
    }
}
