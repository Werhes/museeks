package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8681e implements InterfaceC10857e {
    public final C14134e vip;

    public C8681e(C14134e c14134e) {
        this.vip = c14134e;
    }

    @Override // defpackage.InterfaceC10857e
    public final AbstractC4457e ad(float f, C7695e c7695e) {
        return (AbstractC4457e) this.vip.invoke(Float.valueOf(f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8681e.class == obj.getClass() && this.vip.equals(((C8681e) obj).vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (AbstractC8703e.m2467class(1) * 31);
    }

    @Override // defpackage.InterfaceC10857e
    public final int vip() {
        return 1;
    }
}
