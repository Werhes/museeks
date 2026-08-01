package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3743e extends AbstractC12782e implements InterfaceC5972e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C15553e f8333e = new C15553e(C12575e.f25235e, new C2163e(0));

    public AbstractC3743e() {
        super(C12575e.f25235e);
    }

    public abstract void advert(InterfaceC8850e interfaceC8850e, Runnable runnable);

    @Override // defpackage.InterfaceC5972e
    public final void crashlytics(InterfaceC5083e interfaceC5083e) {
        C3843e c3843e = (C3843e) interfaceC5083e;
        c3843e.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3843e.f8479e;
        do {
        } while (atomicReferenceFieldUpdater.get(c3843e) == AbstractC7214e.vip);
        Object obj = atomicReferenceFieldUpdater.get(c3843e);
        C13578e c13578e = obj instanceof C13578e ? (C13578e) obj : null;
        if (c13578e != null) {
            c13578e.Signature();
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public boolean mo1397extends(InterfaceC8850e interfaceC8850e) {
        return !(this instanceof C1730e);
    }

    @Override // defpackage.AbstractC12782e, defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC17808e.license(this, interfaceC1598e);
    }

    public void loadAd(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        AbstractC7214e.smaato(this, interfaceC8850e, runnable);
    }

    @Override // defpackage.AbstractC12782e, defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC17808e.metrica(this, interfaceC1598e);
    }

    /* renamed from: static */
    public AbstractC3743e mo685static(int i) {
        AbstractC2356e.vip(i);
        return new C17325e(this, i);
    }

    @Override // defpackage.InterfaceC5972e
    public final InterfaceC5083e subs(AbstractC10731e abstractC10731e) {
        return new C3843e(this, abstractC10731e);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC7111e.purchase(this);
    }
}
