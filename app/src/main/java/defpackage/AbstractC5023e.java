package defpackage;

/* renamed from: eٜٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5023e {
    public static final C6935e ad;
    public static final C3205e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [catch, eؚؖٚ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [final, eؚؕٓ] */
    static {
        ?? ccatch = new Ccatch();
        ccatch.f14196e = -1;
        ad = ccatch;
        ?? cfinal = new Cfinal();
        cfinal.f7323e = -1;
        vip = cfinal;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [catch, eؚؖٚ] */
    public static C6935e ad(crashlytics crashlyticsVar) {
        if (crashlyticsVar.f1117e < 1) {
            return ad;
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f14196e = -1;
        return ccatch;
    }
}
