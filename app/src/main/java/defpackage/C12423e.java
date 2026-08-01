package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12423e implements InterfaceC13543e {
    public final /* synthetic */ float ad;
    public final /* synthetic */ float metrica;
    public final /* synthetic */ float vip;

    public C12423e(float f, float f2, float f3) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
    }

    @Override // defpackage.InterfaceC13543e
    public final long ad(float f, float f2) {
        float f3 = f + this.ad;
        float f4 = this.vip;
        return C9268e.ad(f3 / f4, (f2 + this.metrica) / f4);
    }
}
