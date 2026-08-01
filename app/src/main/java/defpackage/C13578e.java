package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۢ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13578e extends AbstractC2477e implements InterfaceC1148e, InterfaceC18430e, InterfaceC5634e {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC8850e f26926e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC5083e f26927e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26925e = AtomicIntegerFieldUpdater.newUpdater(C13578e.class, "_decisionAndIndex$volatile");

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26924e = AtomicReferenceFieldUpdater.newUpdater(C13578e.class, Object.class, "_state$volatile");

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26923e = AtomicReferenceFieldUpdater.newUpdater(C13578e.class, Object.class, "_parentHandle$volatile");

    public C13578e(int i, InterfaceC5083e interfaceC5083e) {
        super(i);
        this.f26927e = interfaceC5083e;
        this.f26926e = interfaceC5083e.admob();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C15583e.f30749e;
    }

    public static void crashlytics(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: this, reason: not valid java name */
    public static Object m3616this(InterfaceC5305e interfaceC5305e, Object obj, int i, Function3 function3) {
        if (obj instanceof C1427e) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (function3 != null || (interfaceC5305e instanceof InterfaceC4075e)) {
            return new C11634e(obj, interfaceC5305e instanceof InterfaceC4075e ? (InterfaceC4075e) interfaceC5305e : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    public final void Signature() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26923e;
        InterfaceC1232e interfaceC1232e = (InterfaceC1232e) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1232e == null) {
            return;
        }
        interfaceC1232e.ad();
        atomicReferenceFieldUpdater.set(this, C14251e.f28173e);
    }

    @Override // defpackage.InterfaceC1148e
    public final boolean ad(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26924e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC5305e)) {
                return false;
            }
            boolean z = (obj instanceof InterfaceC4075e) || (obj instanceof AbstractC12466e);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            C1427e c1427e = new C1427e(th2, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1427e)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC5305e interfaceC5305e = (InterfaceC5305e) obj;
            if (interfaceC5305e instanceof InterfaceC4075e) {
                advert((InterfaceC4075e) obj, th);
            } else if (interfaceC5305e instanceof AbstractC12466e) {
                loadAd((AbstractC12466e) obj, th);
            }
            if (!subs()) {
                Signature();
            }
            subscription(this.f6325e);
            return true;
        }
    }

    @Override // defpackage.InterfaceC1148e
    public final C2443e adcel(Object obj, Function3 function3) {
        return m3620native(obj, function3);
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f26926e;
    }

    public final boolean ads() {
        return f26924e.get(this) instanceof C3854e;
    }

    public final void advert(InterfaceC4075e interfaceC4075e, Throwable th) {
        try {
            interfaceC4075e.ad(th);
        } catch (Throwable th2) {
            AbstractC15849e.license(this.f26926e, new C14803e(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void amazon(Function3 function3, Throwable th, Object obj) {
        InterfaceC8850e interfaceC8850e = this.f26926e;
        try {
            function3.invoke(th, obj, interfaceC8850e);
        } catch (Throwable th2) {
            AbstractC15849e.license(interfaceC8850e, new C14803e(0, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final boolean applovin() {
        return f26924e.get(this) instanceof InterfaceC5305e;
    }

    @Override // defpackage.AbstractC2477e
    public final InterfaceC5083e appmetrica() {
        return this.f26927e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        Throwable ad = C13523e.ad(obj);
        if (ad != null) {
            obj = new C1427e(ad, false);
        }
        m3619interface(obj, this.f6325e, null);
    }

    /* renamed from: class, reason: not valid java name */
    public final void m3617class() {
        InterfaceC5083e interfaceC5083e = this.f26927e;
        Throwable th = null;
        C3843e c3843e = interfaceC5083e instanceof C3843e ? (C3843e) interfaceC5083e : null;
        if (c3843e != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3843e.f8479e;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c3843e);
                C2443e c2443e = AbstractC7214e.vip;
                if (obj != c2443e) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c3843e, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c3843e) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c3843e, c2443e, this)) {
                    if (atomicReferenceFieldUpdater.get(c3843e) != c2443e) {
                        break;
                    }
                }
            }
            if (th == null) {
                return;
            }
            Signature();
            ad(th);
        }
    }

    public String firebase() {
        return "CancellableContinuation";
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3618goto(AbstractC3743e abstractC3743e, Unit unit) {
        InterfaceC5083e interfaceC5083e = this.f26927e;
        C3843e c3843e = interfaceC5083e instanceof C3843e ? (C3843e) interfaceC5083e : null;
        m3619interface(unit, (c3843e != null ? c3843e.f8481e : null) == abstractC3743e ? 4 : this.f6325e, null);
    }

    public final void inmobi(Function1 function1) {
        isPro(new C7394e(1, function1));
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3619interface(Object obj, int i, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26924e;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC5305e) {
                Object m3616this = m3616this((InterfaceC5305e) obj2, obj, i, function3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m3616this)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!subs()) {
                    Signature();
                }
                subscription(i);
                return;
            }
            if (obj2 instanceof C3854e) {
                C3854e c3854e = (C3854e) obj2;
                if (C3854e.metrica.compareAndSet(c3854e, 0, 1)) {
                    if (function3 != null) {
                        amazon(function3, c3854e.ad, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        crashlytics(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void isPro(defpackage.InterfaceC5305e r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C13578e.f26924e
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.C15583e
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.InterfaceC4075e
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.AbstractC12466e
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.C1427e
            if (r1 == 0) goto L4d
            r0 = r2
            eۣؒۨ r0 = (defpackage.C1427e) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.C1427e.vip
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof defpackage.C3854e
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.ad
            boolean r1 = r8 instanceof defpackage.InterfaceC4075e
            if (r1 == 0) goto L43
            eْؖؕ r8 = (defpackage.InterfaceC4075e) r8
            r7.advert(r8, r0)
            return
        L43:
            eّٓۛ r8 = (defpackage.AbstractC12466e) r8
            r7.loadAd(r8, r0)
            return
        L49:
            crashlytics(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof defpackage.C11634e
            if (r1 == 0) goto L80
            r1 = r2
            eٍُِ r1 = (defpackage.C11634e) r1
            eْؖؕ r4 = r1.vip
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof defpackage.AbstractC12466e
            if (r4 == 0) goto L5d
            return
        L5d:
            r4 = r8
            eْؖؕ r4 = (defpackage.InterfaceC4075e) r4
            java.lang.Throwable r5 = r1.appmetrica
            if (r5 == 0) goto L68
            r7.advert(r4, r5)
            return
        L68:
            r5 = 29
            eٍُِ r1 = defpackage.C11634e.ad(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            crashlytics(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof defpackage.AbstractC12466e
            if (r1 == 0) goto L85
            return
        L85:
            r3 = r8
            eْؖؕ r3 = (defpackage.InterfaceC4075e) r3
            eٍُِ r1 = new eٍُِ
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            crashlytics(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13578e.isPro(eؗۧۧ):void");
    }

    public final InterfaceC1232e isVip() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) this.f26926e.mo397public(C4524e.f9798e);
        if (interfaceC10500e == null) {
            return null;
        }
        InterfaceC1232e smaato = AbstractC6629e.smaato(interfaceC10500e, true, new C12087e(this, 0));
        do {
            atomicReferenceFieldUpdater = f26923e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, smaato)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return smaato;
    }

    @Override // defpackage.AbstractC2477e
    public final void license(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26924e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC5305e) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C1427e) {
                return;
            }
            if (!(obj instanceof C11634e)) {
                cancellationException2 = cancellationException;
                C11634e c11634e = new C11634e(obj, (InterfaceC4075e) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c11634e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C11634e c11634e2 = (C11634e) obj;
            if (c11634e2.appmetrica != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C11634e ad = C11634e.ad(c11634e2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ad)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC4075e interfaceC4075e = c11634e2.vip;
            if (interfaceC4075e != null) {
                advert(interfaceC4075e, cancellationException);
            }
            Function3 function3 = c11634e2.metrica;
            if (function3 != null) {
                amazon(function3, cancellationException, c11634e2.ad);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    public final void loadAd(AbstractC12466e abstractC12466e, Throwable th) {
        InterfaceC8850e interfaceC8850e = this.f26926e;
        int i = f26925e.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC12466e.yandex(i, interfaceC8850e);
        } catch (Throwable th2) {
            AbstractC15849e.license(interfaceC8850e, new C14803e(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.InterfaceC5634e
    public final void metrica(AbstractC12466e abstractC12466e, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f26925e;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        isPro(abstractC12466e);
    }

    @Override // defpackage.AbstractC2477e
    public final Object mopub() {
        return f26924e.get(this);
    }

    /* renamed from: native, reason: not valid java name */
    public final C2443e m3620native(Object obj, Function3 function3) {
        C2443e c2443e = AbstractC14966e.ad;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26924e;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC5305e)) {
                return null;
            }
            Object m3616this = m3616this((InterfaceC5305e) obj2, obj, this.f6325e, function3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, m3616this)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!subs()) {
                Signature();
            }
            return c2443e;
        }
    }

    public final boolean premium() {
        return !(f26924e.get(this) instanceof InterfaceC5305e);
    }

    @Override // defpackage.InterfaceC1148e
    public final void pro(Object obj) {
        subscription(this.f6325e);
    }

    @Override // defpackage.AbstractC2477e
    public final Throwable purchase(Object obj) {
        Throwable purchase = super.purchase(obj);
        if (purchase != null) {
            return purchase;
        }
        return null;
    }

    public Throwable remoteconfig(C6467e c6467e) {
        return c6467e.mo695implements();
    }

    public final Object signatures() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC10500e interfaceC10500e;
        boolean subs = subs();
        do {
            atomicIntegerFieldUpdater = f26925e;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (subs) {
                    m3617class();
                }
                Object obj = f26924e.get(this);
                if (obj instanceof C1427e) {
                    throw ((C1427e) obj).ad;
                }
                int i3 = this.f6325e;
                if ((i3 != 1 && i3 != 2) || (interfaceC10500e = (InterfaceC10500e) this.f26926e.mo397public(C4524e.f9798e)) == null || interfaceC10500e.purchase()) {
                    return yandex(obj);
                }
                CancellationException mo695implements = interfaceC10500e.mo695implements();
                license(mo695implements);
                throw mo695implements;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC1232e) f26923e.get(this)) == null) {
            isVip();
        }
        if (subs) {
            m3617class();
        }
        return EnumC2821e.f6782e;
    }

    @Override // defpackage.InterfaceC1148e
    public final void smaato(Object obj, Function3 function3) {
        m3619interface(obj, this.f6325e, function3);
    }

    public final boolean subs() {
        if (this.f6325e != 2) {
            return false;
        }
        C3843e c3843e = (C3843e) this.f26927e;
        c3843e.getClass();
        return C3843e.f8479e.get(c3843e) != null;
    }

    public final void subscription(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f26925e;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC5083e interfaceC5083e = this.f26927e;
                if (!z && (interfaceC5083e instanceof C3843e)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f6325e;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C3843e c3843e = (C3843e) interfaceC5083e;
                        AbstractC3743e abstractC3743e = c3843e.f8481e;
                        InterfaceC8850e admob = c3843e.f8480e.admob();
                        if (AbstractC7214e.amazon(abstractC3743e, admob)) {
                            AbstractC7214e.smaato(abstractC3743e, admob, this);
                            return;
                        }
                        AbstractC11092e ad = AbstractC3858e.ad();
                        if (ad.f21991e >= 4294967296L) {
                            ad.m2988e(this);
                            return;
                        }
                        ad.m2986e(true);
                        try {
                            AbstractC0111e.appmetrica(this, interfaceC5083e, true);
                            do {
                            } while (ad.m2985e());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0111e.appmetrica(this, interfaceC5083e, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final void tapsense() {
        InterfaceC1232e isVip = isVip();
        if (isVip != null && premium()) {
            isVip.ad();
            f26923e.set(this, C14251e.f28173e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firebase());
        sb.append('(');
        sb.append(AbstractC7111e.yandex(this.f26927e));
        sb.append("){");
        Object obj = f26924e.get(this);
        sb.append(obj instanceof InterfaceC5305e ? "Active" : obj instanceof C3854e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC7111e.purchase(this));
        return sb.toString();
    }

    @Override // defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        InterfaceC5083e interfaceC5083e = this.f26927e;
        if (interfaceC5083e instanceof InterfaceC18430e) {
            return (InterfaceC18430e) interfaceC5083e;
        }
        return null;
    }

    @Override // defpackage.AbstractC2477e
    public final Object yandex(Object obj) {
        return obj instanceof C11634e ? ((C11634e) obj).ad : obj;
    }
}
