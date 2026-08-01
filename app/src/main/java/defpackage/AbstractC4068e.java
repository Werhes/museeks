package defpackage;

/* renamed from: eّؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4068e {
    public AbstractC0362e ad;
    public C9300e vip;

    public abstract AbstractC0362e ad();

    public final synchronized C9300e license() {
        try {
            if (this.vip == null) {
                this.vip = vip();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.vip;
    }

    public final synchronized AbstractC0362e metrica() {
        try {
            if (this.ad == null) {
                this.ad = ad();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ad;
    }

    public abstract C9300e vip();
}
