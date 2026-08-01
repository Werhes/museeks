package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16365e {
    public final C16747e ad;
    public final int vip;

    public C16365e(int i, C16747e c16747e) {
        this.ad = c16747e;
        this.vip = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i = this.vip;
        sb.append(i != 1 ? i != 2 ? "null" : "Finished" : "BoundReached");
        sb.append(", endState=");
        sb.append(this.ad);
        sb.append(')');
        return sb.toString();
    }
}
