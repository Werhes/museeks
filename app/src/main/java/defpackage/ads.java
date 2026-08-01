package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ads extends Cdefault {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte f5e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f3e = new inmobi(2, ads.class);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final ads f2e = new ads((byte) 0);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final ads f4e = new ads((byte) -1);

    public ads(byte b) {
        this.f5e = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ads crashlytics(subs subsVar) {
        if (subsVar == 0 || (subsVar instanceof ads)) {
            return (ads) subsVar;
        }
        if (!(subsVar instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(subsVar.getClass().getName()));
        }
        try {
            return (ads) f3e.m4631e((byte[]) subsVar);
        } catch (IOException e) {
            throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct boolean from byte[]: ")));
        }
    }

    public static ads subs(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new ads(b) : f2e : f4e;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(1, z);
        c7850e.m2330abstract(1);
        c7850e.m2341protected(this.f5e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault
    public final Cdefault ads() {
        return firebase() ? f4e : f2e;
    }

    public final boolean firebase() {
        return this.f5e != 0;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return firebase() ? 1 : 0;
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        return (cdefault instanceof ads) && firebase() == ((ads) cdefault).firebase();
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(1, z);
    }

    public final String toString() {
        return firebase() ? "TRUE" : "FALSE";
    }
}
