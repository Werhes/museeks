package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5677e extends AbstractC15920e {
    public final C6594e adcel;
    public final C10068e advert;
    public int amazon;
    public final String mopub;
    public final C12718e smaato;

    public C5677e(C6594e c6594e, String str, C10068e c10068e) {
        this.adcel = c6594e;
        this.mopub = str;
        this.advert = c10068e;
        C12718e c12718e = new C12718e();
        c12718e.addLast(str);
        this.smaato = c12718e;
    }

    @Override // defpackage.InterfaceC5757e
    public final C10068e ad() {
        return this.advert;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void admob(long j) {
        ((SharedPreferences) this.adcel.f13613e).edit().putLong(m1965class(), j).apply();
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void advert(char c) {
        this.adcel.m2216continue(c, m1965class());
    }

    @Override // defpackage.InterfaceC5757e
    public final void amazon(InterfaceC9998e interfaceC9998e, int i) {
        this.adcel.m2216continue(i, m1965class());
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void billing(short s) {
        this.adcel.m2216continue(s, m1965class());
    }

    /* renamed from: class, reason: not valid java name */
    public final String m1965class() {
        return AbstractC13480e.m3608try(this.smaato, ".", null, null, null, 62);
    }

    @Override // defpackage.InterfaceC5757e
    public final void license() {
        String m1965class = m1965class();
        C6594e c6594e = this.adcel;
        c6594e.m2217e(m1965class);
        c6594e.m2223for(m1965class() + '?', false);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void loadAd(int i) {
        this.adcel.m2216continue(i, m1965class());
    }

    @Override // defpackage.InterfaceC5757e
    public final InterfaceC11845e metrica(InterfaceC9998e interfaceC9998e) {
        this.amazon++;
        return this;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void mopub(float f) {
        ((SharedPreferences) this.adcel.f13613e).edit().putFloat(m1965class(), f).apply();
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final InterfaceC11845e pro(InterfaceC9998e interfaceC9998e, int i) {
        this.adcel.m2216continue(i, m1965class() + ".size");
        metrica(interfaceC9998e);
        return this;
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void purchase(double d) {
        ((SharedPreferences) this.adcel.f13613e).edit().putLong(m1965class(), Double.doubleToRawLongBits(d)).apply();
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void remoteconfig(String str) {
        ((SharedPreferences) this.adcel.f13613e).edit().putString(m1965class(), str).apply();
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void smaato() {
        this.adcel.m2223for(m1965class() + '?', true);
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void startapp(boolean z) {
        this.adcel.m2223for(m1965class(), z);
    }

    @Override // defpackage.AbstractC15920e
    public final void tapsense(InterfaceC9998e interfaceC9998e, int i) {
        C12718e c12718e = this.smaato;
        if (c12718e.f25459e > this.amazon) {
            c12718e.removeLast();
        }
        c12718e.addLast(interfaceC9998e.billing(i));
    }

    @Override // defpackage.InterfaceC11845e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        this.amazon--;
        C12718e c12718e = this.smaato;
        c12718e.removeLast();
        if (c12718e.isEmpty()) {
            c12718e.addLast(this.mopub);
        }
    }

    @Override // defpackage.AbstractC15920e, defpackage.InterfaceC5757e
    public final void yandex(byte b) {
        this.adcel.m2216continue(b, m1965class());
    }
}
