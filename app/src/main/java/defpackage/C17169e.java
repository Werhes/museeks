package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17169e {
    public final AbstractC17475e ad;
    public final long license;
    public final long metrica;
    public final long vip;

    public C17169e(long j, long j2, List list) {
        this.ad = AbstractC17475e.remoteconfig(list);
        this.vip = j;
        this.metrica = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.license = j3;
    }
}
