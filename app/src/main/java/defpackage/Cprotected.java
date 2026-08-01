package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: protected, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Cprotected extends Cdefault implements Cbreak {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36449e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f36448e = new inmobi(14, Cprotected.class);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final byte[] f36447e = new byte[0];

    public Cprotected(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f36449e = bArr;
    }

    public static Cprotected subs(Object obj) {
        if (obj == null || (obj instanceof Cprotected)) {
            return (Cprotected) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof Cprotected) {
                return (Cprotected) billing;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (Cprotected) f36448e.m4631e((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct OCTET STRING from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
    }

    @Override // defpackage.Cdefault
    public Cdefault ads() {
        return new Cprotected(this.f36449e);
    }

    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        return this;
    }

    @Override // defpackage.Cbreak
    public final InputStream appmetrica() {
        return new ByteArrayInputStream(this.f36449e);
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36449e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof Cprotected) {
            return Arrays.equals(this.f36449e, ((Cprotected) cdefault).f36449e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public Cdefault premium() {
        return new Cprotected(this.f36449e);
    }

    public final String toString() {
        C2873e c2873e = AbstractC7240e.ad;
        byte[] bArr = this.f36449e;
        return "#".concat(AbstractC1433e.ad(AbstractC7240e.license(0, bArr.length, bArr)));
    }
}
