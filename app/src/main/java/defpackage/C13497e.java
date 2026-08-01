package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13497e {
    public static final C13497e purchase;
    public final long ad;
    public final boolean metrica;
    public final boolean vip;
    public static final C13497e license = new C13497e(0, false, false);
    public static final C13497e appmetrica = new C13497e(500, true, false);

    static {
        new C13497e(100L, true, false);
        purchase = new C13497e(0L, false, true);
    }

    public C13497e(long j, boolean z, boolean z2) {
        this.vip = z;
        this.ad = j;
        if (z2) {
            AbstractC4265e.license(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.metrica = z2;
    }
}
