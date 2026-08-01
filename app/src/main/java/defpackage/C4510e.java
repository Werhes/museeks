package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4510e implements Closeable, InterfaceC18435e {
    private volatile boolean closed;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9778e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9779e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC8850e f9782e;
    private volatile boolean inSelect;
    private volatile Selector selectorRef;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final SelectorProvider f9781e = SelectorProvider.provider();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AtomicLong f9780e = new AtomicLong();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C12916e f9777e = new C12916e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C14579e f9783e = new C14579e();

    public C4510e(InterfaceC8850e interfaceC8850e) {
        this.f9782e = interfaceC8850e.mo394const(new C5621e("selector"));
        AbstractC5336e.purchase(this, null, 0, new C1247e(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r10 != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (defpackage.AbstractC2803e.loadAd(r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[LOOP:1: B:18:0x005a->B:20:0x00da, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [eؖۦٟ] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.nio.channels.Selector] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.nio.channels.Selector] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.nio.channels.Selector] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008f -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009d -> B:15:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C4510e r7, defpackage.C14579e r8, java.nio.channels.spi.AbstractSelector r9, defpackage.AbstractC10731e r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4510e.ad(eؖۦٟ, eؚٔۙ, java.nio.channels.spi.AbstractSelector, eُؑ۠):java.lang.Object");
    }

    public static void ads(AbstractSelector abstractSelector, Throwable th) {
        if (th == null) {
            th = new C9719e("Closed selector", 2);
        }
        for (SelectionKey selectionKey : abstractSelector.keys()) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object attachment = selectionKey.attachment();
            InterfaceC18519e interfaceC18519e = attachment instanceof InterfaceC18519e ? (InterfaceC18519e) attachment : null;
            if (interfaceC18519e != null) {
                inmobi(interfaceC18519e, th);
            }
            selectionKey.cancel();
        }
    }

    public static void inmobi(InterfaceC18519e interfaceC18519e, Throwable th) {
        C2488e c2488e = ((AbstractC12898e) interfaceC18519e).f25755e;
        for (EnumC16368e enumC16368e : EnumC16368e.f32159e) {
            c2488e.getClass();
            InterfaceC1148e interfaceC1148e = (InterfaceC1148e) C2488e.ad[enumC16368e.ordinal()].getAndSet(c2488e, null);
            if (interfaceC1148e != null) {
                interfaceC1148e.billing(new C12763e(th));
            }
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f9782e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: break, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1633break(java.nio.channels.Selector r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C1048e
            if (r0 == 0) goto L13
            r0 = r6
            eؒٓٛ r0 = (defpackage.C1048e) r0
            int r1 = r0.f3533e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3533e = r1
            goto L18
        L13:
            eؒٓٛ r0 = new eؒٓٛ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3531e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f3533e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.nio.channels.Selector r5 = r0.f3532e
            defpackage.AbstractC2003e.purchase(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            r4.inSelect = r3
            r0.f3532e = r5
            r0.f3533e = r3
            java.lang.Object r6 = defpackage.AbstractC2803e.loadAd(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.concurrent.atomic.AtomicLong r6 = r4.f9780e
            long r0 = r6.get()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L57
            r1 = 500(0x1f4, double:2.47E-321)
            int r5 = r5.select(r1)
            r4.inSelect = r0
            goto L62
        L57:
            r4.inSelect = r0
            java.util.concurrent.atomic.AtomicLong r6 = r4.f9780e
            r6.set(r2)
            int r5 = r5.selectNow()
        L62:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4510e.m1633break(java.nio.channels.Selector, eُؑ۠):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
        this.f9783e.vip();
        C12916e c12916e = this.f9777e;
        Unit unit = Unit.INSTANCE;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) ((AtomicReference) c12916e.f25784e).getAndSet(null);
        if (interfaceC5083e == null) {
            m1635implements();
        } else {
            interfaceC5083e.billing(unit);
        }
    }

    public final void crashlytics(AbstractC12898e abstractC12898e) {
        SelectionKey keyFor;
        inmobi(abstractC12898e, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (keyFor = abstractC12898e.adcel().keyFor(selector)) == null) {
            return;
        }
        keyFor.cancel();
        m1635implements();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1634goto(defpackage.C14579e r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            boolean r1 = r8 instanceof defpackage.C16432e
            if (r1 == 0) goto L15
            r1 = r8
            eٌٖۗ r1 = (defpackage.C16432e) r1
            int r2 = r1.f32264e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f32264e = r2
            goto L1a
        L15:
            eٌٖۗ r1 = new eٌٖۗ
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.f32262e
            int r2 = r1.f32264e
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            eؚٔۙ r7 = r1.f32263e
            goto L2e
        L26:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2e:
            defpackage.AbstractC2003e.purchase(r8)
        L31:
            java.lang.Object r8 = r7.license()
            eۧۜ r8 = (defpackage.InterfaceC18519e) r8
            if (r8 == 0) goto L3a
            return r8
        L3a:
            boolean r8 = r6.closed
            r2 = 0
            if (r8 == 0) goto L40
            return r2
        L40:
            r1.f32263e = r7
            r1.f32264e = r3
            eّۨؒ r8 = r6.f9777e
            boolean r4 = r7.metrica()
            if (r4 == 0) goto L88
            boolean r4 = r6.closed
            if (r4 != 0) goto L88
            java.lang.Object r4 = r8.f25784e
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
        L54:
            boolean r5 = r4.compareAndSet(r2, r1)
            if (r5 == 0) goto L79
            boolean r4 = r7.metrica()
            if (r4 == 0) goto L65
            boolean r4 = r6.closed
            if (r4 != 0) goto L65
            goto L77
        L65:
            java.lang.Object r8 = r8.f25784e
            r5 = r8
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5
        L6a:
            boolean r8 = r5.compareAndSet(r1, r2)
            if (r8 == 0) goto L71
            goto L88
        L71:
            java.lang.Object r8 = r5.get()
            if (r8 == r1) goto L6a
        L77:
            r2 = r0
            goto L88
        L79:
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L80
            goto L54
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Continuation is already set"
            r7.<init>(r8)
            throw r7
        L88:
            if (r2 != 0) goto L8c
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L8c:
            if (r2 != r0) goto L31
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4510e.m1634goto(eؚٔۙ, eُؑ۠):java.lang.Object");
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m1635implements() {
        Selector selector;
        if (this.f9780e.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    public final void isVip(Selector selector, InterfaceC18519e interfaceC18519e) {
        try {
            SelectableChannel adcel = interfaceC18519e.adcel();
            SelectionKey keyFor = adcel.keyFor(selector);
            int purchase = ((AbstractC12898e) interfaceC18519e).purchase();
            if (keyFor == null) {
                if (purchase != 0) {
                    adcel.register(selector, purchase, interfaceC18519e);
                }
            } else if (keyFor.interestOps() != purchase) {
                keyFor.interestOps(purchase);
            }
            if (purchase != 0) {
                this.f9779e++;
            }
        } catch (Throwable th) {
            SelectionKey keyFor2 = interfaceC18519e.adcel().keyFor(selector);
            if (keyFor2 != null) {
                keyFor2.cancel();
            }
            inmobi(interfaceC18519e, th);
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public final Object m1636protected(InterfaceC18519e interfaceC18519e, EnumC16368e enumC16368e, AbstractC10731e abstractC10731e) {
        AbstractC12898e abstractC12898e = (AbstractC12898e) interfaceC18519e;
        int purchase = abstractC12898e.purchase();
        int i = enumC16368e.f32164e;
        if (abstractC12898e.f25756e.get()) {
            throw new IOException("Selectable is already closed");
        }
        if ((purchase & i) == 0) {
            throw new IllegalStateException(("Selectable is invalid state: " + purchase + ", " + i).toString());
        }
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC10731e));
        c13578e.tapsense();
        c13578e.inmobi(C15146e.f29968e);
        C2488e c2488e = abstractC12898e.f25755e;
        c2488e.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2488e.ad[enumC16368e.ordinal()];
        while (!atomicReferenceFieldUpdater.compareAndSet(c2488e, null, c13578e)) {
            if (atomicReferenceFieldUpdater.get(c2488e) != null) {
                throw new IllegalStateException(("Handler for " + enumC16368e.name() + " is already registered").toString());
            }
        }
        if (!c13578e.ads()) {
            try {
                if (!this.f9783e.ad(abstractC12898e)) {
                    if (abstractC12898e.adcel().isOpen()) {
                        throw new ClosedSelectorException();
                    }
                    throw new ClosedChannelException();
                }
                C12916e c12916e = this.f9777e;
                Unit unit = Unit.INSTANCE;
                InterfaceC5083e interfaceC5083e = (InterfaceC5083e) ((AtomicReference) c12916e.f25784e).getAndSet(null);
                if (interfaceC5083e != null) {
                    interfaceC5083e.billing(unit);
                }
                m1635implements();
            } catch (Throwable th) {
                inmobi(abstractC12898e, th);
            }
        }
        Object signatures = c13578e.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public final void subs(Set set, Set set2) {
        int size = set.size();
        this.f9779e = set2.size() - size;
        this.f9778e = 0;
        if (size <= 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SelectionKey selectionKey = (SelectionKey) it.next();
            try {
                int readyOps = selectionKey.readyOps();
                int interestOps = selectionKey.interestOps();
                Object attachment = selectionKey.attachment();
                InterfaceC18519e interfaceC18519e = attachment instanceof InterfaceC18519e ? (InterfaceC18519e) attachment : null;
                if (interfaceC18519e == null) {
                    selectionKey.cancel();
                    this.f9778e++;
                } else {
                    C2488e c2488e = ((AbstractC12898e) interfaceC18519e).f25755e;
                    int[] iArr = EnumC16368e.f32158e;
                    int length = iArr.length;
                    for (int i = 0; i < length; i++) {
                        if ((iArr[i] & readyOps) != 0) {
                            c2488e.getClass();
                            InterfaceC1148e interfaceC1148e = (InterfaceC1148e) C2488e.ad[i].getAndSet(c2488e, null);
                            if (interfaceC1148e != null) {
                                interfaceC1148e.billing(Unit.INSTANCE);
                            }
                        }
                    }
                    int i2 = (~readyOps) & interestOps;
                    if (i2 != interestOps) {
                        selectionKey.interestOps(i2);
                    }
                    if (i2 != 0) {
                        this.f9779e++;
                    }
                }
            } catch (Throwable th) {
                selectionKey.cancel();
                this.f9778e++;
                Object attachment2 = selectionKey.attachment();
                InterfaceC18519e interfaceC18519e2 = attachment2 instanceof InterfaceC18519e ? (InterfaceC18519e) attachment2 : null;
                if (interfaceC18519e2 != null) {
                    inmobi(interfaceC18519e2, th);
                    selectionKey.attach(null);
                }
            }
            it.remove();
        }
    }
}
