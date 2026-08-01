package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8478e {
    public final C16437e ad;
    public final int[] vip;

    public C8478e(int i, C16437e c16437e, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC2803e.billing("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.ad = c16437e;
        this.vip = iArr;
    }
}
