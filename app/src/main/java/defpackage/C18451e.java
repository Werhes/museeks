package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18451e {
    public static final C18451e appmetrica = new C18451e(-3, -9223372036854775807L, -1);
    public static C18451e purchase;
    public final /* synthetic */ int ad;
    public int license;
    public long metrica;
    public long vip;

    public C18451e(int i) {
        this.ad = 2;
        this.license = i;
    }

    public C18451e(int i, long j, long j2) {
        this.ad = 0;
        this.license = i;
        this.vip = j;
        this.metrica = j2;
    }

    public C18451e(C5401e c5401e) {
        this.ad = 3;
        this.license = c5401e.f11581e;
        this.vip = System.currentTimeMillis();
    }

    public static void metrica(C18451e c18451e, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (c18451e) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = c18451e.vip + j;
                c18451e.vip = j3;
                long j4 = c18451e.metrica + j2;
                c18451e.metrica = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ad(double d, double d2, long j) {
        double d3 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((float) Math.round((r2 - 9.0E-4f) - r6)) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.license = 1;
            this.vip = -1L;
            this.metrica = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.license = 0;
                this.vip = -1L;
                this.metrica = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.vip = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.metrica = round;
            if (round >= j || this.vip <= j) {
                this.license = 1;
            } else {
                this.license = 0;
            }
        }
    }

    public String toString() {
        switch (this.ad) {
            case 2:
                return "WindowCounter(streamId=" + this.license + ", total=" + this.vip + ", acknowledged=" + this.metrica + ", unacknowledged=" + vip() + ')';
            default:
                return super.toString();
        }
    }

    public synchronized long vip() {
        return this.vip - this.metrica;
    }
}
