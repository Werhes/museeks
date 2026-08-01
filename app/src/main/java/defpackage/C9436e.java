package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9436e implements InterfaceC6174e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f18775e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f18776e;

    public C9436e(int i, long j) {
        AbstractC2301e.billing(j >= 0);
        this.f18776e = i;
        this.f18775e = j;
    }

    public /* synthetic */ C9436e(int i, long j, boolean z) {
        this.f18776e = i;
        this.f18775e = j;
    }

    public /* synthetic */ C9436e(long j, int i) {
        this.f18775e = j;
        this.f18776e = i;
    }

    public static C9436e ad(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C9436e(j, i3);
    }

    public static C9436e vip(InterfaceC2283e interfaceC2283e, C1292e c1292e) {
        interfaceC2283e.ad(0, 8, c1292e.ad);
        c1292e.m571try(0);
        return new C9436e(c1292e.smaato(), c1292e.subscription(), false);
    }

    @Override // defpackage.InterfaceC6174e
    public C5471e toInstant() {
        C5471e c5471e = C5471e.f11744e;
        long j = C5471e.f11744e.f11747e;
        long j2 = this.f18775e;
        if (j2 >= j && j2 <= C5471e.f11745e.f11747e) {
            return C13023e.metrica(j2, this.f18776e);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
