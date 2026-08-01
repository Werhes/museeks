package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC14891e implements Runnable {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final String f29505e = C5401e.crashlytics("StopWorkRunnable");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f29506e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f29507e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15899e f29508e;

    public RunnableC14891e(C15899e c15899e, String str, boolean z) {
        this.f29508e = c15899e;
        this.f29507e = str;
        this.f29506e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean mopub;
        C15899e c15899e = this.f29508e;
        WorkDatabase workDatabase = c15899e.appmetrica;
        C9327e c9327e = c15899e.yandex;
        C4956e amazon = workDatabase.amazon();
        workDatabase.metrica();
        try {
            String str = this.f29507e;
            synchronized (c9327e.f18581e) {
                containsKey = c9327e.f18586e.containsKey(str);
            }
            if (this.f29506e) {
                mopub = this.f29508e.yandex.adcel(this.f29507e);
            } else {
                if (!containsKey && amazon.advert(this.f29507e) == EnumC7300e.f14901e) {
                    amazon.isVip(EnumC7300e.f14903e, this.f29507e);
                }
                mopub = this.f29508e.yandex.mopub(this.f29507e);
            }
            C5401e.loadAd().smaato(f29505e, "StopWorkRunnable for " + this.f29507e + "; Processor.stopWork = " + mopub, new Throwable[0]);
            workDatabase.yandex();
            workDatabase.purchase();
        } catch (Throwable th) {
            workDatabase.purchase();
            throw th;
        }
    }
}
