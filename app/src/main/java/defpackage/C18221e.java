package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18221e implements InterfaceC5634e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C14137e f35682e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C13578e f35683e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f35684e = AbstractC11295e.Signature;

    public C18221e(C14137e c14137e) {
        this.f35682e = c14137e;
    }

    public final Object ad(AbstractC10731e abstractC10731e) {
        C0922e c0922e;
        Boolean bool;
        Object obj = this.f35684e;
        boolean z = true;
        if (obj == AbstractC11295e.Signature || obj == AbstractC11295e.advert) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C14137e.f27959e;
            C14137e c14137e = this.f35682e;
            C0922e c0922e2 = (C0922e) atomicReferenceFieldUpdater.get(c14137e);
            while (true) {
                int i = 0;
                if (c14137e.premium()) {
                    this.f35684e = AbstractC11295e.advert;
                    Throwable signatures = c14137e.signatures();
                    if (signatures != null) {
                        int i2 = AbstractC3795e.ad;
                        throw signatures;
                    }
                    z = false;
                } else {
                    long andIncrement = C14137e.f27953e.getAndIncrement(c14137e);
                    long j = AbstractC11295e.vip;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (c0922e2.f24956e != j2) {
                        c0922e = c14137e.pro(j2, c0922e2);
                        if (c0922e == null) {
                            continue;
                        }
                    } else {
                        c0922e = c0922e2;
                    }
                    Object m3763while = c14137e.m3763while(c0922e, i3, andIncrement, null);
                    C2443e c2443e = AbstractC11295e.smaato;
                    if (m3763while == c2443e) {
                        throw new IllegalStateException("unreachable");
                    }
                    C2443e c2443e2 = AbstractC11295e.loadAd;
                    if (m3763while == c2443e2) {
                        if (andIncrement < c14137e.isPro()) {
                            c0922e.vip();
                        }
                        c0922e2 = c0922e;
                    } else {
                        if (m3763while == AbstractC11295e.amazon) {
                            C14137e c14137e2 = this.f35682e;
                            C13578e metrica = AbstractC15297e.metrica(AbstractC10558e.startapp(abstractC10731e));
                            try {
                                this.f35683e = metrica;
                                Object m3763while2 = c14137e2.m3763while(c0922e, i3, andIncrement, this);
                                Function1 function1 = c14137e2.f27963e;
                                if (m3763while2 == c2443e) {
                                    metrica(c0922e, i3);
                                } else {
                                    C17630e c17630e = null;
                                    if (m3763while2 == c2443e2) {
                                        if (andIncrement < c14137e2.isPro()) {
                                            c0922e.vip();
                                        }
                                        C0922e c0922e3 = (C0922e) C14137e.f27959e.get(c14137e2);
                                        while (true) {
                                            if (c14137e2.premium()) {
                                                C13578e c13578e = this.f35683e;
                                                this.f35683e = null;
                                                this.f35684e = AbstractC11295e.advert;
                                                Throwable signatures2 = c14137e.signatures();
                                                if (signatures2 == null) {
                                                    c13578e.billing(Boolean.FALSE);
                                                } else {
                                                    c13578e.billing(new C12763e(signatures2));
                                                }
                                            } else {
                                                long andIncrement2 = C14137e.f27953e.getAndIncrement(c14137e2);
                                                long j3 = AbstractC11295e.vip;
                                                long j4 = andIncrement2 / j3;
                                                int i4 = (int) (andIncrement2 % j3);
                                                if (c0922e3.f24956e != j4) {
                                                    C0922e pro = c14137e2.pro(j4, c0922e3);
                                                    if (pro != null) {
                                                        c0922e3 = pro;
                                                    }
                                                }
                                                Object m3763while3 = c14137e2.m3763while(c0922e3, i4, andIncrement2, this);
                                                if (m3763while3 == AbstractC11295e.smaato) {
                                                    metrica(c0922e3, i4);
                                                    break;
                                                }
                                                if (m3763while3 == AbstractC11295e.loadAd) {
                                                    if (andIncrement2 < c14137e2.isPro()) {
                                                        c0922e3.vip();
                                                    }
                                                } else {
                                                    if (m3763while3 == AbstractC11295e.amazon) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c0922e3.vip();
                                                    this.f35684e = m3763while3;
                                                    this.f35683e = null;
                                                    bool = Boolean.TRUE;
                                                    if (function1 != null) {
                                                        c17630e = new C17630e(function1, m3763while3, i);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c0922e.vip();
                                        this.f35684e = m3763while2;
                                        this.f35683e = null;
                                        bool = Boolean.TRUE;
                                        if (function1 != null) {
                                            c17630e = new C17630e(function1, m3763while2, i);
                                        }
                                    }
                                    metrica.smaato(bool, c17630e);
                                }
                                return metrica.signatures();
                            } catch (Throwable th) {
                                metrica.m3617class();
                                throw th;
                            }
                        }
                        c0922e.vip();
                        this.f35684e = m3763while;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC5634e
    public final void metrica(AbstractC12466e abstractC12466e, int i) {
        C13578e c13578e = this.f35683e;
        if (c13578e != null) {
            c13578e.metrica(abstractC12466e, i);
        }
    }

    public final Object vip() {
        Object obj = this.f35684e;
        C2443e c2443e = AbstractC11295e.Signature;
        if (obj == c2443e) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f35684e = c2443e;
        if (obj != AbstractC11295e.advert) {
            return obj;
        }
        Throwable isVip = this.f35682e.isVip();
        int i = AbstractC3795e.ad;
        throw isVip;
    }
}
