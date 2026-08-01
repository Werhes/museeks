package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13918e implements InterfaceC17718e {
    public final boolean ad;
    public final C4395e appmetrica;
    public final C9106e license;
    public final int metrica;
    public final int vip;

    public C13918e(boolean z, int i, int i2, C9106e c9106e, C4395e c4395e) {
        this.ad = z;
        this.vip = i;
        this.metrica = i2;
        this.license = c9106e;
        this.appmetrica = c4395e;
    }

    @Override // defpackage.InterfaceC17718e
    public final boolean ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e adcel() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final boolean advert(InterfaceC17718e interfaceC17718e) {
        if (this.license == null || interfaceC17718e == null || !(interfaceC17718e instanceof C13918e)) {
            return true;
        }
        C13918e c13918e = (C13918e) interfaceC17718e;
        if (this.vip != c13918e.vip || this.metrica != c13918e.metrica || this.ad != c13918e.ad) {
            return true;
        }
        C4395e c4395e = c13918e.appmetrica;
        C4395e c4395e2 = this.appmetrica;
        return (c4395e2.ad == c4395e.ad && c4395e2.metrica == c4395e.metrica && c4395e2.license == c4395e.license) ? false : true;
    }

    @Override // defpackage.InterfaceC17718e
    public final int appmetrica() {
        return 1;
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e billing() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e license() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final C9106e metrica() {
        return this.license;
    }

    @Override // defpackage.InterfaceC17718e
    public final int mopub() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC17718e
    public final int purchase() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final C16529e smaato(C9106e c9106e) {
        boolean z = c9106e.metrica;
        C14980e c14980e = c9106e.vip;
        C14980e c14980e2 = c9106e.ad;
        if ((!z && c14980e2.vip > c14980e.vip) || (z && c14980e2.vip <= c14980e.vip)) {
            c9106e = C9106e.ad(c9106e, null, null, !z, 3);
        }
        long j = this.appmetrica.ad;
        C16529e c16529e = AbstractC2800e.ad;
        C16529e c16529e2 = new C16529e();
        c16529e2.yandex(j, c9106e);
        return c16529e2;
    }

    @Override // defpackage.InterfaceC17718e
    public final void startapp(Function1 function1) {
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.ad + ", crossed=" + AbstractC13501e.ads(yandex()) + ", info=\n\t" + this.appmetrica + ')';
    }

    @Override // defpackage.InterfaceC17718e
    public final C4395e vip() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC17718e
    public final int yandex() {
        int i = this.vip;
        int i2 = this.metrica;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return this.appmetrica.vip();
    }
}
