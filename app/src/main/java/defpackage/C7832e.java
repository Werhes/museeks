package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: eًٍٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7832e extends Cextends {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16527e f15838e = new C16527e(InterfaceC5051e.f10791e, C0503e.f2592e);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cthis f15839e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cthis f15840e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16527e f15841e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cprotected f15842e;

    public C7832e(Ccatch ccatch) {
        Enumeration mo170goto = ccatch.mo170goto();
        this.f15842e = (Cprotected) mo170goto.nextElement();
        this.f15840e = (Cthis) mo170goto.nextElement();
        if (!mo170goto.hasMoreElements()) {
            this.f15839e = null;
            this.f15841e = null;
            return;
        }
        Object nextElement = mo170goto.nextElement();
        if (nextElement instanceof Cthis) {
            this.f15839e = Cthis.subs(nextElement);
            nextElement = mo170goto.hasMoreElements() ? mo170goto.nextElement() : null;
        } else {
            this.f15839e = null;
        }
        if (nextElement != null) {
            this.f15841e = C16527e.loadAd(nextElement);
        } else {
            this.f15841e = null;
        }
    }

    public C7832e(byte[] bArr, int i, int i2, C16527e c16527e) {
        this.f15842e = new Cprotected(AbstractC12442e.license(bArr));
        this.f15840e = new Cthis(i);
        this.f15839e = i2 > 0 ? new Cthis(i2) : null;
        this.f15841e = c16527e;
    }

    public static C7832e loadAd(Object obj) {
        if (obj instanceof C7832e) {
            return (C7832e) obj;
        }
        if (obj != null) {
            return new C7832e(Ccatch.m168class(obj));
        }
        return null;
    }

    public final BigInteger Signature() {
        Cthis cthis = this.f15839e;
        if (cthis != null) {
            return cthis.firebase();
        }
        return null;
    }

    public final C16527e admob() {
        C16527e c16527e = this.f15841e;
        return c16527e != null ? c16527e : f15838e;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        crashlytics crashlyticsVar = new crashlytics(4, 0);
        crashlyticsVar.appmetrica(this.f15842e);
        crashlyticsVar.appmetrica(this.f15840e);
        Cthis cthis = this.f15839e;
        if (cthis != null) {
            crashlyticsVar.appmetrica(cthis);
        }
        C16527e c16527e = this.f15841e;
        if (c16527e != null && !c16527e.equals(f15838e)) {
            crashlyticsVar.appmetrica(c16527e);
        }
        ?? ccatch = new Ccatch(crashlyticsVar);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final byte[] subscription() {
        return AbstractC12442e.license(this.f15842e.f36449e);
    }
}
