package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3843e extends AbstractC2477e implements InterfaceC18430e, InterfaceC5083e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8479e = AtomicReferenceFieldUpdater.newUpdater(C3843e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC10731e f8480e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC3743e f8481e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f8482e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f8483e;

    public C3843e(AbstractC3743e abstractC3743e, AbstractC10731e abstractC10731e) {
        super(-1);
        this.f8481e = abstractC3743e;
        this.f8480e = abstractC10731e;
        this.f8483e = AbstractC7214e.ad;
        this.f8482e = abstractC10731e.admob().mo395e(0, AbstractC2745e.metrica);
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f8480e.admob();
    }

    @Override // defpackage.AbstractC2477e
    public final InterfaceC5083e appmetrica() {
        return this;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        Throwable ad = C13523e.ad(obj);
        Object c1427e = ad == null ? obj : new C1427e(ad, false);
        AbstractC10731e abstractC10731e = this.f8480e;
        InterfaceC8850e admob = abstractC10731e.admob();
        AbstractC3743e abstractC3743e = this.f8481e;
        if (AbstractC7214e.amazon(abstractC3743e, admob)) {
            this.f8483e = c1427e;
            this.f6325e = 0;
            AbstractC7214e.smaato(abstractC3743e, abstractC10731e.admob(), this);
            return;
        }
        AbstractC11092e ad2 = AbstractC3858e.ad();
        if (ad2.f21991e >= 4294967296L) {
            this.f8483e = c1427e;
            this.f6325e = 0;
            ad2.m2988e(this);
            return;
        }
        ad2.m2986e(true);
        try {
            InterfaceC8850e admob2 = abstractC10731e.admob();
            Object purchase = AbstractC2745e.purchase(admob2, this.f8482e);
            try {
                abstractC10731e.billing(obj);
                Unit unit = Unit.INSTANCE;
                do {
                } while (ad2.m2985e());
            } finally {
                AbstractC2745e.appmetrica(admob2, purchase);
            }
        } catch (Throwable th) {
            try {
                startapp(th);
            } finally {
                ad2.m2987e(true);
            }
        }
    }

    @Override // defpackage.AbstractC2477e
    public final Object mopub() {
        Object obj = this.f8483e;
        this.f8483e = AbstractC7214e.ad;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f8481e + ", " + AbstractC7111e.yandex(this.f8480e) + ']';
    }

    @Override // defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        return this.f8480e;
    }
}
