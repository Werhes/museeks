package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14590e implements InterfaceC3934e {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14590e.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    @Override // defpackage.InterfaceC3934e
    public final C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        float vip = (f - (AbstractC3062e.vip(1.0f, 0.0f, 1.0f) * f)) / 2;
        AbstractC1634e.metrica(c17985e, AbstractC18489e.billing((Float.floatToRawIntBits(vip) << 32) | (Float.floatToRawIntBits(vip) & 4294967295L), (Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(r11) & 4294967295L)));
        return c17985e;
    }
}
