package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class firebase extends Cdefault {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final inmobi f36391e = new inmobi(3, firebase.class);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final firebase[] f36392e = new firebase[12];

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f36393e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36394e;

    public firebase(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f36394e = BigInteger.valueOf(i).toByteArray();
        this.f36393e = 0;
    }

    public firebase(boolean z, byte[] bArr) {
        if (Cthis.m4661extends(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        int i = 0;
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f36394e = z ? AbstractC12442e.license(bArr) : bArr;
        int length = bArr.length - 1;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f36393e = i;
    }

    public static firebase crashlytics(Object obj) {
        if (obj == null || (obj instanceof firebase)) {
            return (firebase) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
        }
        try {
            return (firebase) f36391e.m4631e((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC8703e.subscription(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static firebase subs(boolean z, byte[] bArr) {
        if (bArr.length > 1) {
            return new firebase(z, bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new firebase(z, bArr);
        }
        firebase[] firebaseVarArr = f36392e;
        firebase firebaseVar = firebaseVarArr[i];
        if (firebaseVar != null) {
            return firebaseVar;
        }
        firebase firebaseVar2 = new firebase(z, bArr);
        firebaseVarArr[i] = firebaseVar2;
        return firebaseVar2;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(10, z, this.f36394e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    public final int firebase() {
        byte[] bArr = this.f36394e;
        int length = bArr.length;
        int i = this.f36393e;
        if (length - i <= 4) {
            return Cthis.m4662this(i, -1, bArr);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36394e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof firebase) {
            return Arrays.equals(this.f36394e, ((firebase) cdefault).f36394e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36394e.length, z);
    }
}
