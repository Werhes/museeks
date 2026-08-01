package defpackage;

/* renamed from: eؙؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0501e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public isPro f2579e;

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f2579e;
    }

    public final String toString() {
        StringBuilder sb;
        int i;
        byte[] crashlytics = this.f2579e.crashlytics();
        if (crashlytics.length == 1) {
            sb = new StringBuilder("KeyUsage: 0x");
            i = crashlytics[0] & 255;
        } else {
            sb = new StringBuilder("KeyUsage: 0x");
            i = (crashlytics[0] & 255) | ((crashlytics[1] & 255) << 8);
        }
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
}
