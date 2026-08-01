package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٞۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6549e {
    public static final C3924e ad;

    static {
        C14872e c14872e = new C14872e(50);
        ad = new C3924e(c14872e, c14872e, c14872e, c14872e);
    }

    public static final C3924e ad(float f) {
        C1536e c1536e = new C1536e(f);
        return new C3924e(c1536e, c1536e, c1536e, c1536e);
    }

    public static C3924e vip(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return new C3924e(new C1536e(f), new C1536e(f2), new C1536e(f3), new C1536e(f4));
    }
}
