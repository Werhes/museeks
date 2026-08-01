package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٟ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13540e implements InterfaceC6512e {
    public final float ad;
    public final Object metrica;
    public final float vip;

    public C13540e(float f, float f2, Object obj) {
        this.ad = f;
        this.vip = f2;
        this.metrica = obj;
    }

    public /* synthetic */ C13540e(Object obj) {
        this(1.0f, 1500.0f, obj);
    }

    @Override // defpackage.InterfaceC2869e
    public final InterfaceC17717e ad(C11139e c11139e) {
        Object obj = this.metrica;
        return new C7850e(this.ad, this.vip, obj == null ? null : (AbstractC3424e) c11139e.ad.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13540e) {
            C13540e c13540e = (C13540e) obj;
            if (c13540e.ad == this.ad && c13540e.vip == this.vip && AbstractC7890e.billing(c13540e.metrica, this.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.metrica;
        return Float.floatToIntBits(this.vip) + AbstractC1414e.license((obj != null ? obj.hashCode() : 0) * 31, this.ad, 31);
    }
}
