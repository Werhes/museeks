package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16777e {
    public Exception ad;
    public long vip = -9223372036854775807L;
    public long metrica = -9223372036854775807L;

    public final void ad(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.ad == null) {
            this.ad = exc;
        }
        if (this.vip == -9223372036854775807L && C18536e.f36344instanceof.get() <= 0) {
            this.vip = 200 + elapsedRealtime;
        }
        long j = this.vip;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.metrica = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.ad;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.ad;
        this.ad = null;
        this.vip = -9223372036854775807L;
        this.metrica = -9223372036854775807L;
        throw exc3;
    }
}
