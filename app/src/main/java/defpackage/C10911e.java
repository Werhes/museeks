package defpackage;

import java.util.Arrays;

/* renamed from: eٍُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10911e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f21613e = new inmobi(8, C10911e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f21614e;

    public C10911e(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f21614e = AbstractC1433e.metrica(str);
    }

    public C10911e(byte[] bArr) {
        this.f21614e = bArr;
    }

    public static C10911e subs(Object obj) {
        if (obj == null || (obj instanceof C10911e)) {
            return (C10911e) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof C10911e) {
                return (C10911e) billing;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
        }
        try {
            return (C10911e) f21613e.m4631e((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC8703e.subscription(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(22, z, this.f21614e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f21614e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C10911e) {
            return Arrays.equals(this.f21614e, ((C10911e) cdefault).f21614e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f21614e.length, z);
    }

    public String toString() {
        return AbstractC1433e.ad(this.f21614e);
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return AbstractC1433e.ad(this.f21614e);
    }
}
