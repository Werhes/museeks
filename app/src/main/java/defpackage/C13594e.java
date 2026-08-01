package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13594e implements InterfaceC18133e {
    public final int ad;

    public C13594e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC2869e
    public final InterfaceC0566e ad(C11139e c11139e) {
        return new C5401e(this.ad, 17, (byte) 0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13594e) && ((C13594e) obj).ad == this.ad;
    }

    public final int hashCode() {
        return this.ad;
    }
}
