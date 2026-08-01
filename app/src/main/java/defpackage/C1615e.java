package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1615e extends AbstractC12078e implements InterfaceC8384e, InterfaceC1108e, InterfaceC10455e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4531e = AtomicReferenceFieldUpdater.newUpdater(C1615e.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f4532e;

    public C1615e(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r14.equals(r15) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r15 == r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
    
        if (kotlin.Unit.INSTANCE == r5) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0073, B:16:0x007b, B:19:0x0082, B:20:0x0086, B:24:0x0089, B:26:0x00aa, B:29:0x00b7, B:30:0x00d1, B:36:0x00e3, B:41:0x00ea, B:32:0x00d8, B:35:0x00de, B:46:0x008f, B:49:0x0096, B:57:0x004d, B:59:0x0057, B:60:0x0066), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0073, B:16:0x007b, B:19:0x0082, B:20:0x0086, B:24:0x0089, B:26:0x00aa, B:29:0x00b7, B:30:0x00d1, B:36:0x00e3, B:41:0x00ea, B:32:0x00d8, B:35:0x00de, B:46:0x008f, B:49:0x0096, B:57:0x004d, B:59:0x0057, B:60:0x0066), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b6 -> B:14:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC1108e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC6034e r14, defpackage.InterfaceC5083e r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1615e.ad(eؘۥؒ, eًؗۖ):java.lang.Object");
    }

    public final void advert(Object obj) {
        if (obj == null) {
            obj = AbstractC18467e.ad;
        }
        smaato(null, obj);
    }

    @Override // defpackage.AbstractC12078e
    public final AbstractC13118e appmetrica() {
        return new C1286e();
    }

    @Override // defpackage.AbstractC12078e
    public final AbstractC13118e[] billing() {
        return new C1286e[2];
    }

    @Override // defpackage.InterfaceC0542e
    public final Object getValue() {
        Object obj = f4531e.get(this);
        if (obj == AbstractC18467e.ad) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.InterfaceC3542e
    public final void license() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean mopub(Object obj, Object obj2) {
        C2443e c2443e = AbstractC18467e.ad;
        if (obj == null) {
            obj = c2443e;
        }
        if (obj2 == null) {
            obj2 = c2443e;
        }
        return smaato(obj, obj2);
    }

    @Override // defpackage.InterfaceC3542e
    public final boolean purchase(Object obj) {
        advert(obj);
        return true;
    }

    public final boolean smaato(Object obj, Object obj2) {
        int i;
        AbstractC13118e[] abstractC13118eArr;
        C2443e c2443e;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4531e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC7890e.billing(obj3, obj)) {
                return false;
            }
            if (AbstractC7890e.billing(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f4532e;
            if ((i2 & 1) != 0) {
                this.f4532e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f4532e = i3;
            AbstractC13118e[] abstractC13118eArr2 = this.f24211e;
            Unit unit = Unit.INSTANCE;
            while (true) {
                C1286e[] c1286eArr = (C1286e[]) abstractC13118eArr2;
                if (c1286eArr != null) {
                    for (C1286e c1286e : c1286eArr) {
                        if (c1286e != null) {
                            AtomicReference atomicReference = c1286e.ad;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c2443e = AbstractC9180e.smaato)) {
                                    C2443e c2443e2 = AbstractC9180e.advert;
                                    if (obj4 != c2443e2) {
                                        while (!atomicReference.compareAndSet(obj4, c2443e2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C13578e) obj4).billing(Unit.INSTANCE);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c2443e)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f4532e;
                    if (i == i3) {
                        this.f4532e = i3 + 1;
                        return true;
                    }
                    abstractC13118eArr = this.f24211e;
                    Unit unit2 = Unit.INSTANCE;
                }
                abstractC13118eArr2 = abstractC13118eArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        advert(obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC10455e
    public final InterfaceC1108e vip(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? AbstractC6959e.billing(this, interfaceC8850e, i, i2) : this;
    }
}
