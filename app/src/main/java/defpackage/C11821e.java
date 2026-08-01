package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11821e extends AbstractC16519e {
    @Override // defpackage.AbstractC16519e
    public final void appmetrica(C18397e c18397e, float f) {
        c18397e.f36065e.vip = f / 10000.0f;
        c18397e.invalidateSelf();
    }

    @Override // defpackage.AbstractC16519e
    public final float metrica(C18397e c18397e) {
        return c18397e.f36065e.vip * 10000.0f;
    }
}
