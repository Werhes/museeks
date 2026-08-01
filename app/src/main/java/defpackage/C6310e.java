package defpackage;

import java.util.Arrays;

/* renamed from: eَؙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6310e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f13140e = new inmobi(21, C6310e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f13141e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6310e(String str) {
        this(AbstractC1433e.purchase(str.toCharArray()));
        String str2 = AbstractC1433e.ad;
    }

    public C6310e(byte[] bArr) {
        this.f13141e = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C6310e subs(subs subsVar) {
        if (subsVar == 0 || (subsVar instanceof C6310e)) {
            return (C6310e) subsVar;
        }
        Cdefault billing = subsVar.billing();
        if (billing instanceof C6310e) {
            return (C6310e) billing;
        }
        if (!(subsVar instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(subsVar.getClass().getName()));
        }
        try {
            return (C6310e) f13140e.m4631e((byte[]) subsVar);
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC8703e.subscription(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(12, z, this.f13141e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f13141e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C6310e) {
            return Arrays.equals(this.f13141e, ((C6310e) cdefault).f13141e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f13141e.length, z);
    }

    public final String toString() {
        return yandex();
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        String str = AbstractC1433e.ad;
        byte[] bArr = this.f13141e;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = AbstractC0472e.ad;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = AbstractC0472e.ad[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 >= length) {
                            break loop0;
                        }
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = AbstractC0472e.vip[b2 + ((b3 & 255) >>> 4)];
                        i3 = i5;
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & 1023) | 56320);
                            i = i3;
                        }
                    }
                }
                i2 = -1;
                break;
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }
}
