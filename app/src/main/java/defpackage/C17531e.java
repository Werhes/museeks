package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17531e extends AbstractC3743e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34373e = AtomicIntegerFieldUpdater.newUpdater(C17531e.class, "eؙِٖ");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC3743e f34374e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile /* synthetic */ int f34375e = 1;

    public C17531e(AbstractC3743e abstractC3743e) {
        this.f34374e = abstractC3743e;
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        m4366e().advert(interfaceC8850e, runnable);
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: extends */
    public final boolean mo1397extends(InterfaceC8850e interfaceC8850e) {
        return m4366e().mo1397extends(interfaceC8850e);
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final AbstractC3743e m4366e() {
        return f34373e.get(this) == 1 ? AbstractC6731e.vip : this.f34374e;
    }

    @Override // defpackage.AbstractC3743e
    public final void loadAd(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        m4366e().loadAd(interfaceC8850e, runnable);
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: static */
    public final AbstractC3743e mo685static(int i) {
        return m4366e().mo685static(i);
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f34374e + ")";
    }
}
