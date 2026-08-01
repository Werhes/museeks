package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15325e implements InterfaceC3934e {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15325e.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(0.5f) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231;
    }

    @Override // defpackage.InterfaceC3934e
    public final C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        boolean z = c7695e.billing;
        boolean z2 = c7695e.appmetrica;
        boolean z3 = c7695e.metrica;
        boolean z4 = c7695e.license;
        float vip = AbstractC3062e.vip(0.5f, 0.0f, 0.5f) * f;
        long floatToRawIntBits = (Float.floatToRawIntBits(vip) << 32) | (Float.floatToRawIntBits(vip) & 4294967295L);
        AbstractC1634e.license(c17985e, new C2330e(0.0f, 0.0f, f, f, (z4 || z3) ? 0L : floatToRawIntBits, (z4 || z2) ? 0L : floatToRawIntBits, (z || z2) ? 0L : floatToRawIntBits, (z || z3) ? 0L : floatToRawIntBits));
        return c17985e;
    }
}
