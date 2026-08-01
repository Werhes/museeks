package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2232e extends AbstractC16977e {
    public final /* synthetic */ int ad;
    public final long metrica;
    public final long vip;

    public C2232e(int i, long j, long j2) {
        this.ad = i;
        switch (i) {
            case 2:
                this.vip = j;
                this.metrica = j2;
                return;
            default:
                this.vip = j2;
                this.metrica = j;
                return;
        }
    }

    public C2232e(long j, long j2, List list) {
        this.ad = 1;
        this.vip = j;
        this.metrica = j2;
        DesugarCollections.unmodifiableList(list);
    }

    public static long license(long j, C1292e c1292e) {
        long ads = c1292e.ads();
        if ((128 & ads) != 0) {
            return 8589934591L & ((((ads & 1) << 32) | c1292e.subs()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.AbstractC16977e
    public final String toString() {
        switch (this.ad) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.vip);
                sb.append(", identifier= ");
                return AbstractC5087e.m1750native(this.metrica, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.vip);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return AbstractC5087e.m1750native(this.metrica, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.vip);
                sb3.append(", playbackPositionUs= ");
                return AbstractC5087e.m1750native(this.metrica, " }", sb3);
        }
    }
}
