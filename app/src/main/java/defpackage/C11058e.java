package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11058e implements Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2895e f21931e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final long f21932e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final long f21933e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f21934e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C11058e f21935e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C6613e f21936e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC12473e f21937e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final InterfaceC5019e f21938e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final boolean f21939e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final InterfaceC17357e f21940e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C11058e f21941e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f21942e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C11058e f21943e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8650e f21944e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AbstractC12834e f21945e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C15793e f21946e;

    public C11058e(C8650e c8650e, EnumC12473e enumC12473e, String str, int i, C2895e c2895e, C15793e c15793e, AbstractC12834e abstractC12834e, InterfaceC17357e interfaceC17357e, C11058e c11058e, C11058e c11058e2, C11058e c11058e3, long j, long j2, C6613e c6613e, InterfaceC5019e interfaceC5019e) {
        this.f21944e = c8650e;
        this.f21937e = enumC12473e;
        this.f21934e = str;
        this.f21942e = i;
        this.f21931e = c2895e;
        this.f21946e = c15793e;
        this.f21945e = abstractC12834e;
        this.f21940e = interfaceC17357e;
        this.f21943e = c11058e;
        this.f21935e = c11058e2;
        this.f21941e = c11058e3;
        this.f21933e = j;
        this.f21932e = j2;
        this.f21936e = c6613e;
        this.f21938e = interfaceC5019e;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f21939e = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًْؓ, java.lang.Object] */
    public final C7677e ad() {
        ?? obj = new Object();
        obj.metrica = -1;
        obj.billing = AbstractC12834e.f25655e;
        obj.loadAd = InterfaceC5019e.f10701e;
        obj.ad = this.f21944e;
        obj.vip = this.f21937e;
        obj.metrica = this.f21942e;
        obj.license = this.f21934e;
        obj.appmetrica = this.f21931e;
        obj.purchase = this.f21946e.yandex();
        obj.billing = this.f21945e;
        obj.yandex = this.f21940e;
        obj.startapp = this.f21943e;
        obj.adcel = this.f21935e;
        obj.mopub = this.f21941e;
        obj.advert = this.f21933e;
        obj.smaato = this.f21932e;
        obj.amazon = this.f21936e;
        obj.loadAd = this.f21938e;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21945e.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f21937e + ", code=" + this.f21942e + ", message=" + this.f21934e + ", url=" + this.f21944e.ad + '}';
    }
}
