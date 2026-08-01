package defpackage;

import java.io.ByteArrayOutputStream;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۨؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9931e {
    public static final C2892e ad = new C2892e(-1964758910, false, new C4509e(4));
    public static final C2892e vip = new C2892e(-1664083269, false, new C4509e(13));
    public static final C2892e metrica = new C2892e(2076196140, false, new C16627e(3));
    public static final C2892e license = new C2892e(633912803, false, new C16627e(4));
    public static final C2892e appmetrica = new C2892e(-253860424, false, new C4509e(14));
    public static final C2892e purchase = new C2892e(1376994261, false, new C4509e(5));
    public static final C2892e billing = new C2892e(812422305, false, new C4509e(6));
    public static final C2892e yandex = new C2892e(400711550, false, new C4509e(7));
    public static final C2892e startapp = new C2892e(1994655040, false, new C4509e(8));
    public static final C2892e adcel = new C2892e(1582944285, false, new C4509e(9));
    public static final C2892e mopub = new C2892e(707662752, false, new C16627e(1));
    public static final C2892e advert = new C2892e(-1016945570, false, new C16627e(2));
    public static final C2892e smaato = new C2892e(616630618, false, new C4509e(10));
    public static final C2892e amazon = new C2892e(-245673543, false, new C4509e(11));
    public static final C2892e loadAd = new C2892e(-1107977704, false, new C4509e(12));

    public static final long ad(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = C13220e.metrica;
        return floatToRawIntBits;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [eؙٗ, e٘ؒ۟] */
    /* JADX WARN: Type inference failed for: r2v14, types: [eؙٗ, e٘ؒ۟] */
    public static AbstractC9027e appmetrica(byte[] bArr) {
        AbstractC9027e abstractC9027e;
        C17041e c17041e = new C17041e(bArr);
        String appmetrica2 = c17041e.appmetrica();
        if ("ssh-rsa".equals(appmetrica2)) {
            abstractC9027e = new C7362e(false, c17041e.metrica(), c17041e.metrica(), false);
        } else if ("ssh-dss".equals(appmetrica2)) {
            abstractC9027e = new C5574e(c17041e.metrica(), new C6818e(c17041e.metrica(), c17041e.metrica(), c17041e.metrica()));
        } else if (appmetrica2.startsWith("ecdsa")) {
            String appmetrica3 = c17041e.appmetrica();
            Ctry ctry = (Ctry) AbstractC9045e.vip.get(appmetrica3);
            C9300e vip2 = AbstractC2208e.vip(ctry);
            if (vip2 == null) {
                throw new IllegalStateException(AbstractC17861e.admob("unable to find curve for ", appmetrica2, " using curve name ", appmetrica3));
            }
            AbstractC9932e billing2 = vip2.f18531e.f34438e.billing(c17041e.license());
            ?? c16833e = new C16833e(vip2);
            c16833e.f34311e = ctry;
            abstractC9027e = new C2964e(billing2, c16833e);
        } else if (appmetrica2.equals("sk-ecdsa-sha2-nistp256@openssh.com")) {
            String appmetrica4 = c17041e.appmetrica();
            Ctry ctry2 = (Ctry) AbstractC9045e.vip.get(appmetrica4);
            C9300e vip3 = AbstractC2208e.vip(ctry2);
            if (vip3 == null) {
                throw new IllegalStateException(AbstractC17861e.admob("unable to find curve for ", appmetrica2, " using curve name ", appmetrica4));
            }
            AbstractC0362e abstractC0362e = vip3.f18531e.f34438e;
            byte[] license2 = c17041e.license();
            c17041e.appmetrica();
            AbstractC9932e billing3 = abstractC0362e.billing(license2);
            ?? c16833e2 = new C16833e(vip3);
            c16833e2.f34311e = ctry2;
            abstractC9027e = new C2964e(billing3, c16833e2);
        } else if ("ssh-ed25519".equals(appmetrica2)) {
            byte[] license3 = c17041e.license();
            if (license3.length != 32) {
                throw new IllegalStateException("public key value of wrong length");
            }
            abstractC9027e = new C5249e(0, license3);
        } else if ("sk-ecdsa-sha2-nistp256@openssh.com".equals(appmetrica2)) {
            byte[] license4 = c17041e.license();
            if (license4.length != 32) {
                throw new IllegalStateException("public key value of wrong length");
            }
            c17041e.appmetrica();
            abstractC9027e = new C5249e(0, license4);
        } else {
            abstractC9027e = null;
        }
        if (abstractC9027e == null) {
            throw new IllegalArgumentException("unable to parse key");
        }
        if (c17041e.vip >= bArr.length) {
            return abstractC9027e;
        }
        throw new IllegalArgumentException("decoded key has trailing data");
    }

    public static final void billing(C1543e c1543e) {
        int i = c1543e.vip;
        if (i == 0) {
            AbstractC14783e.startapp("FloatList is empty.");
            throw null;
        }
        float f = c1543e.ad[i - 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float vip2 = c1543e.vip(i2);
            if (vip2 < 0.0f || vip2 >= 1.0f) {
                throw new IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(C1543e.metrica(c1543e, 31)).toString());
            }
            if (purchase(vip2, f) <= 1.0E-4f) {
                throw new IllegalArgumentException("FloatMapping - Progress repeats a value: ".concat(C1543e.metrica(c1543e, 31)).toString());
            }
            if (vip2 < f && (i3 = i3 + 1) > 1) {
                throw new IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(C1543e.metrica(c1543e, 31)).toString());
            }
            i2++;
            f = vip2;
        }
    }

    public static final float license(C1543e c1543e, C1543e c1543e2, float f) {
        int nextInt;
        int i;
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = AbstractC3062e.admob(0, c1543e.vip).iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            nextInt = c3296e.nextInt();
            float vip2 = c1543e.vip(nextInt);
            i = nextInt + 1;
            float vip3 = c1543e.vip(i % c1543e.vip);
            if (vip3 < vip2) {
                if (f >= vip2 || f <= vip3) {
                    break;
                }
            } else if (vip2 <= f && f <= vip3) {
                break;
            }
        }
        int i2 = i % c1543e.vip;
        float metrica2 = AbstractC4424e.metrica(c1543e.vip(i2) - c1543e.vip(nextInt));
        return AbstractC4424e.metrica((AbstractC4424e.metrica(c1543e2.vip(i2) - c1543e2.vip(nextInt)) * (metrica2 < 0.001f ? 0.5f : AbstractC4424e.metrica(f - c1543e.vip(nextInt)) / metrica2)) + c1543e2.vip(nextInt));
    }

    public static final boolean metrica(Throwable th) {
        return (th instanceof ConnectException) || (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException);
    }

    public static final float purchase(float f, float f2) {
        float abs = Math.abs(f - f2);
        return Math.min(abs, 1.0f - abs);
    }

    public static byte[] vip(AbstractC9027e abstractC9027e) {
        C13935e c13935e;
        Object obj;
        String str;
        if (abstractC9027e == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        }
        if (abstractC9027e instanceof C7362e) {
            if (abstractC9027e.f18083e) {
                throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
            }
            C7362e c7362e = (C7362e) abstractC9027e;
            c13935e = new C13935e(24);
            c13935e.m3742return(AbstractC1433e.metrica("ssh-rsa"));
            c13935e.m3746synchronized(c7362e.f15092e);
            c13935e.m3746synchronized(c7362e.f15093e);
        } else if (abstractC9027e instanceof C2964e) {
            c13935e = new C13935e(24);
            C2964e c2964e = (C2964e) abstractC9027e;
            C16833e c16833e = c2964e.f8719e;
            Map map = AbstractC9045e.ad;
            if (c16833e instanceof C17494e) {
                str = (String) AbstractC9045e.ad.get(((C17494e) c16833e).f34311e);
            } else {
                str = (String) AbstractC9045e.metrica.get(AbstractC9045e.license.get(c16833e.f32975e));
            }
            if (str == null) {
                throw new IllegalArgumentException("unable to derive ssh curve name for ".concat(c16833e.f32975e.getClass().getName()));
            }
            c13935e.m3742return(AbstractC1433e.metrica("ecdsa-sha2-".concat(str)));
            c13935e.m3742return(AbstractC1433e.metrica(str));
            c13935e.m3742return(c2964e.f7010e.yandex(false));
        } else {
            if (abstractC9027e instanceof C5574e) {
                C5574e c5574e = (C5574e) abstractC9027e;
                C6818e c6818e = (C6818e) c5574e.f3209e;
                C13935e c13935e2 = new C13935e(24);
                c13935e2.m3742return(AbstractC1433e.metrica("ssh-dss"));
                c13935e2.m3746synchronized(c6818e.f14046e);
                c13935e2.m3746synchronized(c6818e.f14047e);
                c13935e2.m3746synchronized(c6818e.f14049e);
                c13935e2.m3746synchronized(c5574e.f11922e);
                obj = c13935e2.f27641e;
                return ((ByteArrayOutputStream) obj).toByteArray();
            }
            if (!(abstractC9027e instanceof C5249e)) {
                throw new IllegalArgumentException("unable to convert " + abstractC9027e.getClass().getName() + " to public key");
            }
            c13935e = new C13935e(24);
            c13935e.m3742return(AbstractC1433e.metrica("ssh-ed25519"));
            c13935e.m3742return(((C5249e) abstractC9027e).getEncoded());
        }
        obj = c13935e.f27641e;
        return ((ByteArrayOutputStream) obj).toByteArray();
    }
}
