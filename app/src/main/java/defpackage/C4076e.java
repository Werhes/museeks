package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4076e extends AbstractC3004e {
    public final C2428e ad;
    public final Integer license;
    public final C15768e metrica;
    public final C17974e vip;

    public C4076e(C2428e c2428e, C17974e c17974e, C15768e c15768e, Integer num) {
        this.ad = c2428e;
        this.vip = c17974e;
        this.metrica = c15768e;
        this.license = num;
    }

    @Override // defpackage.AbstractC3004e
    public final C15768e advert() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.license;
    }
}
