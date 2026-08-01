package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9569e {
    public static final C9569e metrica;
    public final UUID ad;
    public final AtomicLong vip;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            metrica = new C9569e(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public C9569e(UUID uuid, long j) {
        this.ad = uuid;
        this.vip = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public final long ad() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.vip;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID vip() {
        long ad = ad() & (-61441);
        long ad2 = ad() >>> 2;
        UUID uuid = this.ad;
        return new UUID(ad ^ uuid.getMostSignificantBits(), ad2 ^ uuid.getLeastSignificantBits());
    }
}
