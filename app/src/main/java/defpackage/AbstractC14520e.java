package defpackage;

import android.graphics.BitmapShader;
import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14520e {
    public static final C0763e ad = new C0763e(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static BitmapShader ad(C1362e c1362e) {
        return new BitmapShader(AbstractC11815e.vip(c1362e), AbstractC12110e.license(0), AbstractC12110e.license(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eّۧۨ, eًٟ٘] */
    public static IOException adcel(C6843e c6843e, Uri uri, IOException iOException, String str) {
        try {
            ?? obj = new Object();
            obj.f25779e = true;
            File file = (File) c6843e.ad(uri, obj);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? mopub(file, iOException, str) : mopub(file, iOException, str) : file.canWrite() ? mopub(file, iOException, str) : mopub(file, iOException, str) : file.canRead() ? file.canWrite() ? mopub(file, iOException, str) : mopub(file, iOException, str) : file.canWrite() ? mopub(file, iOException, str) : mopub(file, iOException, str) : mopub(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static IOException advert(File file, IOException iOException, String str) {
        String concat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            concat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(concat.length() + str3.length());
                sb2.append(concat);
                sb2.append(str3);
                concat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    public static final boolean appmetrica(long j, long j2) {
        return j == j2;
    }

    public static final void billing(C11898e c11898e) {
        metrica(c11898e);
        if (((EnumC10668e) c11898e.f23835e) == EnumC10668e.f21009e) {
            c11898e.license();
        }
    }

    public static final void license(C11898e c11898e) {
        if (((EnumC10668e) c11898e.f23835e) == EnumC10668e.f21008e) {
            c11898e.metrica();
        }
        if (((EnumC10668e) c11898e.f23835e) == EnumC10668e.f21011e) {
            c11898e.ad();
        }
        if (((EnumC10668e) c11898e.f23835e) == EnumC10668e.f21009e) {
            c11898e.onDestroy();
        }
    }

    public static final void metrica(C11898e c11898e) {
        if (((EnumC10668e) c11898e.f23835e) == EnumC10668e.f21010e) {
            c11898e.onCreate();
        }
    }

    public static IOException mopub(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            return parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? advert(file, iOException, str) : advert(file, iOException, str) : parentFile.canWrite() ? advert(file, iOException, str) : advert(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? advert(file, iOException, str) : advert(file, iOException, str) : parentFile.canWrite() ? advert(file, iOException, str) : advert(file, iOException, str);
        }
        return advert(file, iOException, str);
    }

    public static final long purchase(C4034e c4034e, long j, C14980e c14980e) {
        InterfaceC0043e interfaceC0043e;
        long metrica;
        long j2;
        C12890e c12890e;
        int license;
        float vip;
        C12890e c12890e2;
        int license2;
        C12890e c12890e3;
        int license3;
        float vip2;
        C12890e c12890e4;
        int license4;
        C12850e metrica2 = c4034e.metrica(c14980e);
        if (metrica2 == null || (interfaceC0043e = c4034e.advert) == null) {
            return 9205357640488583168L;
        }
        C1040e c1040e = metrica2.metrica;
        InterfaceC0043e metrica3 = metrica2.metrica();
        if (metrica3 == null) {
            return 9205357640488583168L;
        }
        int i = c14980e.vip;
        C12476e c12476e = (C12476e) c1040e.invoke();
        if (i > (c12476e == null ? 0 : metrica2.vip(c12476e))) {
            return 9205357640488583168L;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (metrica3.mo207class(interfaceC0043e, ((C2152e) c4034e.remoteconfig.getValue()).ad) >> 32));
        C12476e c12476e2 = (C12476e) c1040e.invoke();
        if (c12476e2 == null) {
            metrica = C12347e.vip;
        } else {
            C12890e c12890e5 = c12476e2.vip;
            int vip3 = metrica2.vip(c12476e2);
            if (vip3 < 1) {
                metrica = C12347e.vip;
            } else {
                int license5 = c12890e5.license(AbstractC3062e.metrica(i, 0, vip3 - 1));
                metrica = AbstractC9262e.metrica(c12476e2.startapp(license5), c12890e5.metrica(license5, true));
            }
        }
        if (C12347e.license(metrica)) {
            C12476e c12476e3 = (C12476e) c1040e.invoke();
            vip = (c12476e3 != null && (license4 = (c12890e4 = c12476e3.vip).license(i)) < c12890e4.purchase) ? c12476e3.billing(license4) : -1.0f;
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i2 = (int) (metrica >> 32);
            C12476e c12476e4 = (C12476e) c1040e.invoke();
            float billing = (c12476e4 != null && (license2 = (c12890e2 = c12476e4.vip).license(i2)) < c12890e2.purchase) ? c12476e4.billing(license2) : -1.0f;
            int i3 = ((int) (metrica & 4294967295L)) - 1;
            C12476e c12476e5 = (C12476e) c1040e.invoke();
            float yandex = (c12476e5 != null && (license = (c12890e = c12476e5.vip).license(i3)) < c12890e.purchase) ? c12476e5.yandex(license) : -1.0f;
            vip = AbstractC3062e.vip(intBitsToFloat, Math.min(billing, yandex), Math.max(billing, yandex));
        }
        if (vip == -1.0f) {
            return 9205357640488583168L;
        }
        if (!C12729e.vip(j, 0L) && Math.abs(intBitsToFloat - vip) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        C12476e c12476e6 = (C12476e) c1040e.invoke();
        if (c12476e6 != null && (license3 = (c12890e3 = c12476e6.vip).license(i)) < c12890e3.purchase) {
            float purchase = c12890e3.purchase(license3);
            vip2 = ((c12890e3.vip(license3) - purchase) / 2) + purchase;
        } else {
            vip2 = -1.0f;
        }
        if (vip2 == -1.0f) {
            return 9205357640488583168L;
        }
        return interfaceC0043e.mo207class(metrica3, (Float.floatToRawIntBits(vip) << 32) | (Float.floatToRawIntBits(vip2) & j2));
    }

    public static final C0763e startapp(InterfaceC0043e interfaceC0043e) {
        C0763e vip = AbstractC0890e.vip(interfaceC0043e, true);
        return AbstractC18489e.appmetrica(interfaceC0043e.pro(vip.yandex()), interfaceC0043e.pro(vip.appmetrica()));
    }

    public static final boolean vip(long j, C0763e c0763e) {
        float f = c0763e.ad;
        float f2 = c0763e.metrica;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = c0763e.vip;
        float f4 = c0763e.license;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    public static String yandex(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + AbstractC2270e.adcel(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC2270e.adcel(Float.intBitsToFloat(i)) + ", " + AbstractC2270e.adcel(Float.intBitsToFloat(i2)) + ')';
    }
}
