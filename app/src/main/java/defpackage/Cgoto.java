package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/* renamed from: goto, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cgoto extends FilterInputStream {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[][] f36397e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f36398e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f36399e;

    public Cgoto(int i, byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public Cgoto(InputStream inputStream) {
        this(inputStream, AbstractC8913e.license(inputStream), false);
    }

    public Cgoto(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11]);
    }

    public Cgoto(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.f36399e = i;
        this.f36398e = z;
        this.f36397e = bArr;
    }

    public Cgoto(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public static byte[] advert(C9482e c9482e, byte[][] bArr) {
        int i = c9482e.f18832e;
        if (i >= bArr.length) {
            return c9482e.license();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = c9482e.f19544e;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + c9482e.f18832e + " >= " + i2);
        }
        int license = i - AbstractC9460e.license(c9482e.f19545e, bArr2, 0, bArr2.length);
        c9482e.f18832e = license;
        if (license == 0) {
            c9482e.ad();
            return bArr2;
        }
        throw new EOFException("DEF length " + c9482e.f18831e + " object truncated by " + c9482e.f18832e);
    }

    public static int isVip(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i3 = read & 127;
        if (i3 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((read & 128) != 0) {
            if ((i3 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i4 = i3 << 7;
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i3 = i4 | (read2 & 127);
            read = read2;
        }
        return i3;
    }

    public static Cdefault license(int i, C9482e c9482e, byte[][] bArr) {
        try {
            switch (i) {
                case 1:
                    return ads.subs(advert(c9482e, bArr));
                case 2:
                    return new Cthis(c9482e.license());
                case 3:
                    return isPro.subs(c9482e.license());
                case 4:
                    return new Cprotected(c9482e.license());
                case 5:
                    if (c9482e.f18832e == 0) {
                        return C0503e.f2592e;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    Ctry.crashlytics(c9482e.f18832e);
                    return Ctry.firebase(true, advert(c9482e, bArr));
                case 7:
                    return new Cthrow(new C0674e(c9482e.license()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return firebase.subs(true, advert(c9482e, bArr));
                case 12:
                    return new C6310e(c9482e.license());
                case 13:
                    int i2 = c9482e.f18832e;
                    inmobi inmobiVar = Cimplements.f36400e;
                    if (i2 <= 4096) {
                        return Cimplements.subs(true, advert(c9482e, bArr));
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    throw new IOException("unsupported tag " + i + " encountered");
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    return new C6699e(c9482e.license());
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    return new C9169e(c9482e.license());
                case 20:
                    return new C12873e(c9482e.license());
                case 21:
                    return new C17568e(c9482e.license());
                case 22:
                    return new C10911e(c9482e.license());
                case 23:
                    return new Cprivate(c9482e.license());
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    return new Cinterface(c9482e.license());
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    return new C0674e(c9482e.license());
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    return new C10409e(c9482e.license());
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    return new C1669e(c9482e.license());
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    return new C12180e(c9482e.license());
                case 30:
                    return new C3102e(purchase(c9482e));
            }
        } catch (IllegalArgumentException e) {
            throw new Cclass(e.getMessage(), e, 0);
        } catch (IllegalStateException e2) {
            throw new Cclass(e2.getMessage(), e2, 0);
        }
    }

    public static int loadAd(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i2 = read & 127;
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < i2);
        if (i3 < i || z) {
            return i3;
        }
        throw new IOException(AbstractC1786e.Signature(i3, i, "corrupted stream - out of bounds length found: ", " >= "));
    }

    public static char[] purchase(C9482e c9482e) {
        int i = c9482e.f18832e;
        if ((i & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i2 = i / 2;
        char[] cArr = new char[i2];
        byte[] bArr = new byte[8];
        int i3 = 0;
        int i4 = 0;
        while (i >= 8) {
            if (AbstractC9460e.license(c9482e, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i4 += 4;
            i -= 8;
        }
        if (i > 0) {
            if (AbstractC9460e.license(c9482e, bArr, 0, i) != i) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i5 = i3 + 1;
                int i6 = bArr[i3] << 8;
                i3 += 2;
                cArr[i4] = (char) ((bArr[i5] & 255) | i6);
                i4++;
            } while (i3 < i);
        }
        if (c9482e.f18832e == 0 && i2 == i4) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [byte[][], java.io.Serializable] */
    public final Cdefault Signature() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int isVip = isVip(this, read);
        int i = this.f36399e;
        int loadAd = loadAd(this, i, false);
        if (loadAd >= 0) {
            try {
                return ad(read, isVip, loadAd);
            } catch (IllegalArgumentException e) {
                throw new Cclass("corrupted stream detected", e, 0);
            }
        }
        if ((read & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        Csuper csuper = new Csuper(new C3704e(this, i), i, (Serializable) this.f36397e, 0);
        int i2 = read & 192;
        if (i2 != 0) {
            return csuper.m4640abstract(i2, isVip);
        }
        if (isVip == 3) {
            return C15936e.ad(csuper);
        }
        if (isVip == 4) {
            return new C6210e(AbstractC9460e.metrica(new C6235e(csuper)), null);
        }
        if (isVip == 8) {
            return C6525e.ad(csuper);
        }
        if (isVip == 16) {
            return new Ccatch(csuper.m4654super());
        }
        if (isVip == 17) {
            return new Cfinal(csuper.m4654super(), false);
        }
        throw new IOException("unknown BER object encountered");
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [default, eٌۣۘ, catch] */
    /* JADX WARN: Type inference failed for: r7v13, types: [default, final, eؚؕٓ] */
    public final Cdefault ad(int i, int i2, int i3) {
        C9482e c9482e = new C9482e(this, i3, this.f36399e);
        if ((i & 224) == 0) {
            return license(i2, c9482e, this.f36397e);
        }
        int i4 = i & 192;
        int i5 = 0;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                return new Cstrictfp(4, i4, i2, new Cprotected(c9482e.license()));
            }
            crashlytics inmobi = inmobi(c9482e);
            return inmobi.f1117e == 1 ? new Cstrictfp(3, i4, i2, inmobi.adcel(0)) : new Cstrictfp(4, i4, i2, AbstractC5023e.ad(inmobi));
        }
        if (i2 == 3) {
            crashlytics inmobi2 = inmobi(c9482e);
            int i6 = inmobi2.f1117e;
            isPro[] isproArr = new isPro[i6];
            while (i5 != i6) {
                subs adcel = inmobi2.adcel(i5);
                if (!(adcel instanceof isPro)) {
                    throw new Cclass("unknown object encountered in constructed BIT STRING: " + adcel.getClass());
                }
                isproArr[i5] = (isPro) adcel;
                i5++;
            }
            return new C16940e(isproArr);
        }
        if (i2 == 4) {
            crashlytics inmobi3 = inmobi(c9482e);
            int i7 = inmobi3.f1117e;
            Cprotected[] cprotectedArr = new Cprotected[i7];
            while (i5 != i7) {
                subs adcel2 = inmobi3.adcel(i5);
                if (!(adcel2 instanceof Cprotected)) {
                    throw new Cclass("unknown object encountered in constructed OCTET STRING: " + adcel2.getClass());
                }
                cprotectedArr[i5] = (Cprotected) adcel2;
                i5++;
            }
            return new C6210e(C6210e.crashlytics(cprotectedArr), cprotectedArr);
        }
        if (i2 == 8) {
            C6935e ad = AbstractC5023e.ad(inmobi(c9482e));
            ad.getClass();
            return new C4148e(ad, 1);
        }
        if (i2 == 16) {
            if (c9482e.f18832e < 1) {
                return AbstractC5023e.ad;
            }
            if (!this.f36398e) {
                return AbstractC5023e.ad(inmobi(c9482e));
            }
            byte[] license = c9482e.license();
            ?? ccatch = new Ccatch();
            ccatch.f17900e = license;
            return ccatch;
        }
        if (i2 != 17) {
            throw new IOException(AbstractC1634e.smaato("unknown tag ", i2, " encountered"));
        }
        crashlytics inmobi4 = inmobi(c9482e);
        C6935e c6935e = AbstractC5023e.ad;
        if (inmobi4.f1117e < 1) {
            return AbstractC5023e.vip;
        }
        ?? cfinal = new Cfinal(inmobi4, false);
        cfinal.f7323e = -1;
        return cfinal;
    }

    public final crashlytics inmobi(C9482e c9482e) {
        Cgoto cgoto;
        Cdefault Signature;
        int i = c9482e.f18832e;
        if (i >= 1 && (Signature = (cgoto = new Cgoto(c9482e, i, this.f36398e, this.f36397e)).Signature()) != null) {
            crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
            do {
                crashlyticsVar.appmetrica(Signature);
                Signature = cgoto.Signature();
            } while (Signature != null);
            return crashlyticsVar;
        }
        return new crashlytics(0, 0);
    }
}
