package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۧ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6073e extends AbstractC1029e {
    public final AbstractC3317e mopub;

    public AbstractC6073e(AbstractC3317e abstractC3317e) {
        this.mopub = abstractC3317e;
    }

    public final void ads() {
        inmobi(null, this.mopub);
    }

    @Override // defpackage.AbstractC3317e
    public final void advert(InterfaceC4407e interfaceC4407e) {
        this.adcel = interfaceC4407e;
        this.startapp = AbstractC9413e.subscription(null);
        premium();
    }

    public abstract void applovin(AbstractC6690e abstractC6690e);

    @Override // defpackage.AbstractC3317e
    public final AbstractC6690e billing() {
        return this.mopub.billing();
    }

    public C18208e isPro(C18208e c18208e) {
        return c18208e;
    }

    @Override // defpackage.AbstractC1029e
    public final void isVip(Object obj, AbstractC3317e abstractC3317e, AbstractC6690e abstractC6690e) {
        applovin(abstractC6690e);
    }

    public void premium() {
        ads();
    }

    @Override // defpackage.AbstractC1029e
    public final C18208e pro(Object obj, C18208e c18208e) {
        return isPro(c18208e);
    }

    @Override // defpackage.AbstractC3317e
    public void remoteconfig(C1962e c1962e) {
        this.mopub.remoteconfig(c1962e);
    }

    @Override // defpackage.AbstractC1029e
    public final long signatures(long j, Object obj) {
        return j;
    }

    @Override // defpackage.AbstractC3317e
    public final boolean startapp() {
        return this.mopub.startapp();
    }

    @Override // defpackage.AbstractC1029e
    public final int tapsense(int i, Object obj) {
        return i;
    }

    @Override // defpackage.AbstractC3317e
    public final C1962e yandex() {
        return this.mopub.yandex();
    }
}
