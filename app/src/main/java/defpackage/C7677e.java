package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7677e {
    public C8650e ad;
    public C11058e adcel;
    public long advert;
    public C6613e amazon;
    public C2895e appmetrica;
    public String license;
    public C11058e mopub;
    public long smaato;
    public C11058e startapp;
    public EnumC12473e vip;
    public InterfaceC17357e yandex;
    public int metrica = -1;
    public AbstractC12834e billing = AbstractC12834e.f25655e;
    public InterfaceC5019e loadAd = InterfaceC5019e.f10701e;
    public C15783e purchase = new C15783e(0);

    public static void vip(C11058e c11058e, String str) {
        if (c11058e != null) {
            if (c11058e.f21943e != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c11058e.f21935e != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c11058e.f21941e != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final C11058e ad() {
        int i = this.metrica;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.metrica).toString());
        }
        C8650e c8650e = this.ad;
        if (c8650e == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC12473e enumC12473e = this.vip;
        if (enumC12473e == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.license;
        if (str != null) {
            return new C11058e(c8650e, enumC12473e, str, i, this.appmetrica, this.purchase.billing(), this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd);
        }
        throw new IllegalStateException("message == null");
    }
}
