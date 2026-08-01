package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3442e implements Closeable, Flushable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f7699e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String[] f7700e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f7701e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f7702e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f7703e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f7704e;

    public abstract C12867e Signature();

    public abstract C12867e ad();

    public abstract C12867e ads(String str);

    public final String advert() {
        return AbstractC11203e.license(this.f7703e, this.f7701e, this.f7700e, this.f7702e);
    }

    public abstract C12867e inmobi(long j);

    public final int isVip() {
        int i = this.f7703e;
        if (i != 0) {
            return this.f7701e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract C12867e license();

    public abstract C12867e loadAd(String str);

    public abstract C12867e purchase();
}
