package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13845e extends C4211e {
    public final void billing(InterfaceC13543e interfaceC13543e, int i) {
        float[] fArr = this.ad;
        int i2 = i + 1;
        long ad = interfaceC13543e.ad(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (ad >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & ad));
    }
}
