package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9841e extends AbstractC3317e {
    public boolean Signature;
    public final InterfaceC14469e adcel;
    public boolean admob;
    public final int advert;
    public boolean amazon = true;
    public long loadAd = -9223372036854775807L;
    public final C5401e mopub;
    public C1962e pro;
    public InterfaceC4407e remoteconfig;
    public final C16975e smaato;
    public final C2007e startapp;
    public boolean subscription;
    public final InterfaceC15169e yandex;

    public C9841e(C1962e c1962e, InterfaceC15169e interfaceC15169e, C2007e c2007e, InterfaceC14469e interfaceC14469e, C5401e c5401e, int i, C16975e c16975e) {
        this.pro = c1962e;
        this.yandex = interfaceC15169e;
        this.startapp = c2007e;
        this.adcel = interfaceC14469e;
        this.mopub = c5401e;
        this.advert = i;
        this.smaato = c16975e;
    }

    @Override // defpackage.AbstractC3317e
    public final void Signature() {
        this.adcel.release();
    }

    @Override // defpackage.AbstractC3317e
    public final boolean ad(C1962e c1962e) {
        C16914e c16914e = yandex().vip;
        c16914e.getClass();
        C16914e c16914e2 = c1962e.vip;
        return c16914e2 != null && c16914e2.ad.equals(c16914e.ad) && c16914e2.startapp == c16914e.startapp && Objects.equals(c16914e2.purchase, c16914e.purchase);
    }

    @Override // defpackage.AbstractC3317e
    public final void adcel() {
    }

    @Override // defpackage.AbstractC3317e
    public final void advert(InterfaceC4407e interfaceC4407e) {
        this.remoteconfig = interfaceC4407e;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        C5350e c5350e = this.billing;
        c5350e.getClass();
        InterfaceC14469e interfaceC14469e = this.adcel;
        interfaceC14469e.mo2041transient(myLooper, c5350e);
        interfaceC14469e.license();
        pro();
    }

    @Override // defpackage.AbstractC3317e
    public final void amazon(InterfaceC14239e interfaceC14239e) {
        C7340e c7340e = (C7340e) interfaceC14239e;
        if (c7340e.f15043e) {
            for (C16806e c16806e : c7340e.f15044e) {
                c16806e.mopub();
                InterfaceC16612e interfaceC16612e = c16806e.yandex;
                if (interfaceC16612e != null) {
                    interfaceC16612e.metrica(c16806e.appmetrica);
                    c16806e.yandex = null;
                    c16806e.billing = null;
                }
            }
        }
        c7340e.f15021e.m4555switch(c7340e);
        c7340e.f15027e.removeCallbacksAndMessages(null);
        c7340e.f15048e = null;
        c7340e.f15051e = true;
    }

    public final void pro() {
        long j = this.loadAd;
        boolean z = this.Signature;
        boolean z2 = this.admob;
        C1962e yandex = yandex();
        AbstractC6690e c7635e = new C7635e(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, yandex, z2 ? yandex.metrica : null);
        if (this.amazon) {
            c7635e = new AbstractC10596e(c7635e);
        }
        smaato(c7635e);
    }

    @Override // defpackage.AbstractC3317e
    public final synchronized void remoteconfig(C1962e c1962e) {
        this.pro = c1962e;
    }

    public final void signatures(long j, InterfaceC6347e interfaceC6347e, boolean z) {
        if (this.subscription && interfaceC6347e.license()) {
            return;
        }
        this.subscription = !interfaceC6347e.license();
        if (j == -9223372036854775807L) {
            j = this.loadAd;
        }
        boolean vip = interfaceC6347e.vip();
        if (!this.amazon && this.loadAd == j && this.Signature == vip && this.admob == z) {
            return;
        }
        this.loadAd = j;
        this.Signature = vip;
        this.admob = z;
        this.amazon = false;
        pro();
    }

    @Override // defpackage.AbstractC3317e
    public final InterfaceC14239e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        InterfaceC9660e remoteconfig = this.yandex.remoteconfig();
        InterfaceC4407e interfaceC4407e = this.remoteconfig;
        if (interfaceC4407e != null) {
            remoteconfig.license(interfaceC4407e);
        }
        C16914e c16914e = yandex().vip;
        c16914e.getClass();
        Uri uri = c16914e.ad;
        this.billing.getClass();
        return new C7340e(uri, remoteconfig, new C18478e(8, (InterfaceC6440e) this.startapp.f5254e), this.adcel, new C15683e(this.license.metrica, 0, c18208e), this.mopub, new Csuper((CopyOnWriteArrayList) this.metrica.f36471e, 0, c18208e), this, interfaceC16970e, c16914e.purchase, this.advert, this.smaato, AbstractC9413e.m2546case(c16914e.startapp), null);
    }

    @Override // defpackage.AbstractC3317e
    public final synchronized C1962e yandex() {
        return this.pro;
    }
}
