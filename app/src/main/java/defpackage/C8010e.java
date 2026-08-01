package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8010e {
    public long ad;
    public final ThreadLocal license = new ThreadLocal();
    public long metrica;
    public long vip;

    public C8010e(long j) {
        billing(j);
    }

    public final synchronized long ad(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!purchase()) {
                long j2 = this.ad;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.license.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.vip = j2 - j;
                notifyAll();
            }
            this.metrica = j;
            return j + this.vip;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long appmetrica() {
        return this.vip;
    }

    public final synchronized void billing(long j) {
        this.ad = j;
        this.vip = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.metrica = -9223372036854775807L;
    }

    public final synchronized long license() {
        long j;
        j = this.ad;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long metrica(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.metrica;
        if (j2 != -9223372036854775807L) {
            String str = AbstractC9413e.ad;
            long m2555import = AbstractC9413e.m2555import(j2, 90000L, 1000000L, RoundingMode.DOWN);
            long j3 = m2555import / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j = j4 >= m2555import ? j4 : ((j3 + 1) * 8589934592L) + j;
        }
        long j5 = j;
        String str2 = AbstractC9413e.ad;
        return ad(AbstractC9413e.m2555import(j5, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized boolean purchase() {
        return this.vip != -9223372036854775807L;
    }

    public final synchronized long vip(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.metrica;
            if (j2 != -9223372036854775807L) {
                String str = AbstractC9413e.ad;
                long m2555import = AbstractC9413e.m2555import(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + m2555import) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - m2555import) < Math.abs(j5 - m2555import) ? j4 : j5;
            }
            long j6 = j;
            String str2 = AbstractC9413e.ad;
            return ad(AbstractC9413e.m2555import(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void yandex(long j, boolean z) {
        try {
            AbstractC2301e.subscription(this.ad == 9223372036854775806L);
            if (purchase()) {
                return;
            }
            if (z) {
                this.license.set(Long.valueOf(j));
            } else {
                while (!purchase()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
