package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517e extends C17760e {
    @Override // defpackage.C17760e, defpackage.InterfaceC9178e
    public final void ad(long j, long j2, float f) {
        if (!Float.isNaN(f)) {
            this.ad.setZoom(f);
        }
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            this.ad.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            this.ad.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
