package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0860e extends AbstractC3004e {
    public final C11897e ad;
    public final Integer appmetrica;
    public final C15768e license;
    public final C17974e metrica;
    public final C17974e vip;

    public C0860e(C11897e c11897e, C17974e c17974e, C17974e c17974e2, C15768e c15768e, Integer num) {
        this.ad = c11897e;
        this.vip = c17974e;
        this.metrica = c17974e2;
        this.license = c15768e;
        this.appmetrica = num;
    }

    @Override // defpackage.AbstractC3004e
    public final C15768e advert() {
        return this.license;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.appmetrica;
    }
}
