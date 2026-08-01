package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: try, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Ctry extends Cdefault {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final inmobi f36488e = new inmobi(13, Ctry.class);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final ConcurrentHashMap f36489e = new ConcurrentHashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f36490e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f36491e;

    public Ctry(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
        if (!m4670this(str)) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("string ", str, " not a valid OID"));
        }
        byte[] m4671throw = m4671throw(str);
        crashlytics(m4671throw.length);
        this.f36491e = m4671throw;
        this.f36490e = str;
    }

    public Ctry(String str, byte[] bArr) {
        this.f36491e = bArr;
        this.f36490e = str;
    }

    public static void crashlytics(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public static String m4668extends(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
                    sb.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigInteger == null) {
                    bigInteger = BigInteger.valueOf(j);
                }
                BigInteger or = bigInteger.or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        sb.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    public static Ctry firebase(boolean z, byte[] bArr) {
        crashlytics(bArr.length);
        Ctry ctry = (Ctry) f36489e.get(new Cwhile(bArr));
        if (ctry != null) {
            return ctry;
        }
        if (!Cimplements.firebase(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z) {
            bArr = AbstractC12442e.license(bArr);
        }
        return new Ctry(null, bArr);
    }

    /* renamed from: interface, reason: not valid java name */
    public static Ctry m4669interface(Object obj) {
        if (obj == null || (obj instanceof Ctry)) {
            return (Ctry) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof Ctry) {
                return (Ctry) billing;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (Ctry) f36488e.m4631e((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct object identifier from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
    }

    /* renamed from: this, reason: not valid java name */
    public static boolean m4670this(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !Cimplements.m4590class(2, str)) {
            return false;
        }
        if (charAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        return (str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4';
    }

    /* renamed from: throw, reason: not valid java name */
    public static byte[] m4671throw(String str) {
        int i;
        String substring;
        String substring2;
        int i2;
        String str2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int indexOf = str.indexOf(46, 0);
        if (indexOf == -1) {
            substring = str.substring(0);
            i = -1;
        } else {
            i = indexOf + 1;
            substring = str.substring(0, indexOf);
        }
        int parseInt = Integer.parseInt(substring) * 40;
        if (i == -1) {
            i2 = i;
            substring2 = null;
        } else {
            int indexOf2 = str.indexOf(46, i);
            if (indexOf2 == -1) {
                substring2 = str.substring(i);
                i2 = -1;
            } else {
                substring2 = str.substring(i, indexOf2);
                i2 = indexOf2 + 1;
            }
        }
        if (substring2.length() <= 18) {
            Cimplements.m4592interface(byteArrayOutputStream, Long.parseLong(substring2) + parseInt);
        } else {
            Cimplements.m4591goto(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
        }
        while (true) {
            if (!(i2 != -1)) {
                return byteArrayOutputStream.toByteArray();
            }
            if (i2 == -1) {
                str2 = null;
            } else {
                int indexOf3 = str.indexOf(46, i2);
                if (indexOf3 == -1) {
                    str2 = str.substring(i2);
                    i2 = -1;
                } else {
                    String substring3 = str.substring(i2, indexOf3);
                    i2 = indexOf3 + 1;
                    str2 = substring3;
                }
            }
            if (str2.length() <= 18) {
                Cimplements.m4592interface(byteArrayOutputStream, Long.parseLong(str2));
            } else {
                Cimplements.m4591goto(byteArrayOutputStream, new BigInteger(str2));
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public static Ctry m4672while(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385 || !m4670this(str)) {
            return null;
        }
        byte[] m4671throw = m4671throw(str);
        if (m4671throw.length <= 4096) {
            return new Ctry(str, m4671throw);
        }
        return null;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(6, z, this.f36491e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    /* renamed from: class, reason: not valid java name */
    public final synchronized String m4673class() {
        try {
            if (this.f36490e == null) {
                this.f36490e = m4668extends(this.f36491e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36490e;
    }

    /* renamed from: goto, reason: not valid java name */
    public final Ctry m4674goto() {
        Cwhile cwhile = new Cwhile(this.f36491e);
        ConcurrentHashMap concurrentHashMap = f36489e;
        Ctry ctry = (Ctry) concurrentHashMap.get(cwhile);
        if (ctry != null) {
            return ctry;
        }
        synchronized (concurrentHashMap) {
            try {
                if (concurrentHashMap.containsKey(cwhile)) {
                    return (Ctry) concurrentHashMap.get(cwhile);
                }
                concurrentHashMap.put(cwhile, this);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f36491e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (this == cdefault) {
            return true;
        }
        if (cdefault instanceof Ctry) {
            return Arrays.equals(this.f36491e, ((Ctry) cdefault).f36491e);
        }
        return false;
    }

    /* renamed from: native, reason: not valid java name */
    public final boolean m4675native(Ctry ctry) {
        byte[] bArr = ctry.f36491e;
        int length = bArr.length;
        byte[] bArr2 = this.f36491e;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36491e.length, z);
    }

    public final Ctry subs(String str) {
        byte[] adcel;
        String substring;
        inmobi inmobiVar = Cimplements.f36400e;
        if (str.length() > 16383) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        int i = 0;
        if (!Cimplements.m4590class(0, str)) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("string ", str, " not a valid relative OID"));
        }
        int length = str.length();
        byte[] bArr = this.f36491e;
        if (length <= 2) {
            crashlytics(bArr.length + 1);
            int charAt = str.charAt(0) - '0';
            if (str.length() == 2) {
                charAt = (charAt * 10) + (str.charAt(1) - '0');
            }
            int length2 = bArr.length;
            adcel = new byte[length2 + 1];
            System.arraycopy(bArr, 0, adcel, 0, length2);
            adcel[length2] = (byte) charAt;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (i != -1) {
                if (i == -1) {
                    substring = null;
                } else {
                    int indexOf = str.indexOf(46, i);
                    if (indexOf == -1) {
                        substring = str.substring(i);
                        i = -1;
                    } else {
                        substring = str.substring(i, indexOf);
                        i = indexOf + 1;
                    }
                }
                if (substring.length() <= 18) {
                    Cimplements.m4592interface(byteArrayOutputStream, Long.parseLong(substring));
                } else {
                    Cimplements.m4591goto(byteArrayOutputStream, new BigInteger(substring));
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            crashlytics(bArr.length + byteArray.length);
            adcel = AbstractC12442e.adcel(bArr, byteArray);
        }
        return new Ctry(AbstractC4653e.isPro(m4673class(), ".", str), adcel);
    }

    public final String toString() {
        return m4673class();
    }
}
