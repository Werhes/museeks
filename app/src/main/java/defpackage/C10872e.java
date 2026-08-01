package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10872e extends C5981e implements InterfaceC0542e {
    @Override // defpackage.InterfaceC0542e
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) AbstractC6959e.license(this.f12587e, (this.f12589e + ((int) ((admob() + this.f12588e) - this.f12589e))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void inmobi(int i) {
        synchronized (this) {
            purchase(Integer.valueOf(((Number) AbstractC6959e.license(this.f12587e, (this.f12589e + ((int) ((admob() + this.f12588e) - this.f12589e))) - 1)).intValue() + i));
        }
    }
}
