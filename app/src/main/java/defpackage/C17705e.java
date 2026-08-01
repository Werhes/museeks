package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C8550e.class)
/* renamed from: eؚّ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17705e extends AbstractC0894e {
    public static final C1763e Companion = new Object();
    public final long appmetrica;
    public final String license;
    public final long metrica;

    public C17705e(long j) {
        this.metrica = j;
        if (j <= 0) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j, "Unit duration must be positive, but was ", " ns.").toString());
        }
        if (j % 3600000000000L == 0) {
            this.license = "HOUR";
            this.appmetrica = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.license = "MINUTE";
            this.appmetrica = j / 60000000000L;
            return;
        }
        long j2 = 1000000000;
        if (j % j2 == 0) {
            this.license = "SECOND";
            this.appmetrica = j / j2;
            return;
        }
        long j3 = 1000000;
        if (j % j3 == 0) {
            this.license = "MILLISECOND";
            this.appmetrica = j / j3;
            return;
        }
        long j4 = 1000;
        if (j % j4 == 0) {
            this.license = "MICROSECOND";
            this.appmetrica = j / j4;
        } else {
            this.license = "NANOSECOND";
            this.appmetrica = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17705e) {
            return this.metrica == ((C17705e) obj).metrica;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.metrica;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final String toString() {
        long j = this.appmetrica;
        String str = this.license;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }

    public final C17705e vip(int i) {
        return new C17705e(AbstractC3752e.license(this.metrica, i));
    }
}
