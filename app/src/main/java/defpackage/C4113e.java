package defpackage;

/* renamed from: eؖٔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4113e implements InterfaceC3894e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C4113e f9070e = new C4113e("falcon-512", 9);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C4113e f9071e = new C4113e("falcon-1024", 10);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f9072e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f9073e;

    public C4113e(String str, int i) {
        if (i < 1 || i > 10) {
            throw new IllegalArgumentException("Log N degree should be between 1 and 10");
        }
        this.f9073e = str;
        this.f9072e = i;
    }
}
