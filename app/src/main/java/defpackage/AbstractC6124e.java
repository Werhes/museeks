package defpackage;

import android.content.Context;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6124e implements InterfaceC6823e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile int f12867e = -1;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2580e f12868e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C2691e f12869e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f12870e;

    public AbstractC6124e(String str, C2580e c2580e) {
        this.f12870e = str;
        this.f12868e = c2580e;
    }

    public abstract Object ad();

    public abstract Object appmetrica();

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        C13150e c13150e;
        if (AbstractC0179e.appmetrica == null) {
            Object obj = C13150e.adcel;
            AbstractC0179e.appmetrica = new C2123e(15);
        }
        Context context = (Context) C13150e.mopub.get();
        if (context == null) {
            AbstractC0179e.license();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        C13150e c13150e2 = C13150e.advert;
        if (c13150e2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                Class<?> cls = applicationContext.getApplicationContext().getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (C13150e.adcel) {
                    try {
                        if (C13150e.advert != null) {
                            c13150e = C13150e.advert;
                        } else {
                            c13150e = (C13150e) new C14217e(applicationContext, 0).get();
                            C13150e.advert = c13150e;
                            AbstractC17808e.Signature(Level.CONFIG, c13150e.ad(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        c13150e2 = c13150e;
                    } finally {
                    }
                }
            }
        }
        Object vip = vip(c13150e2);
        vip.getClass();
        return vip;
    }

    public abstract Object license(Object obj);

    public abstract Object metrica(String str);

    public abstract void purchase(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0012, B:12:0x0017, B:14:0x0027, B:15:0x0033, B:16:0x0040, B:18:0x004c, B:20:0x005e, B:22:0x006c, B:28:0x008d, B:30:0x00a3, B:32:0x00ad, B:33:0x00b9, B:34:0x00bd, B:36:0x00c5, B:38:0x00d3, B:40:0x00db, B:41:0x00f7, B:54:0x010a, B:57:0x0112, B:43:0x011d, B:47:0x0128, B:49:0x012e, B:50:0x0133, B:60:0x0095, B:61:0x0081, B:62:0x0079, B:64:0x0135), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0012, B:12:0x0017, B:14:0x0027, B:15:0x0033, B:16:0x0040, B:18:0x004c, B:20:0x005e, B:22:0x006c, B:28:0x008d, B:30:0x00a3, B:32:0x00ad, B:33:0x00b9, B:34:0x00bd, B:36:0x00c5, B:38:0x00d3, B:40:0x00db, B:41:0x00f7, B:54:0x010a, B:57:0x0112, B:43:0x011d, B:47:0x0128, B:49:0x012e, B:50:0x0133, B:60:0x0095, B:61:0x0081, B:62:0x0079, B:64:0x0135), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0012, B:12:0x0017, B:14:0x0027, B:15:0x0033, B:16:0x0040, B:18:0x004c, B:20:0x005e, B:22:0x006c, B:28:0x008d, B:30:0x00a3, B:32:0x00ad, B:33:0x00b9, B:34:0x00bd, B:36:0x00c5, B:38:0x00d3, B:40:0x00db, B:41:0x00f7, B:54:0x010a, B:57:0x0112, B:43:0x011d, B:47:0x0128, B:49:0x012e, B:50:0x0133, B:60:0x0095, B:61:0x0081, B:62:0x0079, B:64:0x0135), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.C13150e r10) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6124e.vip(eٌْۨ):java.lang.Object");
    }
}
