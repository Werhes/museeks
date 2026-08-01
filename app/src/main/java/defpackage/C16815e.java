package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16815e extends AbstractC17233e {
    public final boolean metrica;
    public final int vip;

    public C16815e(int i, boolean z) {
        super("GRAPH_ERROR");
        this.vip = i;
        this.metrica = z;
    }

    @Override // defpackage.AbstractC17233e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append("(cameraError=");
        sb.append((Object) C1096e.ad(this.vip));
        sb.append(", willAttemptRetry=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
