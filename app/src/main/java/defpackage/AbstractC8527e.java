package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8527e {
    public static final BinderC9066e ad;
    public static Context appmetrica;
    public static final Object license;
    public static volatile InterfaceC7606e metrica;
    public static final BinderC9066e vip;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new BinderC9066e(0, "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset));
        new BinderC9066e(1, "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset));
        new BinderC9066e(2, "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset));
        new BinderC9066e(3, "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset));
        ad = new BinderC9066e(4, "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset));
        vip = new BinderC9066e(5, "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset));
        license = new Object();
    }

    public static synchronized void ad(Context context) {
        synchronized (AbstractC8527e.class) {
            if (appmetrica != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                appmetrica = context.getApplicationContext();
            }
        }
    }

    public static C12309e metrica(String str, BinderC3559e binderC3559e, boolean z, boolean z2) {
        try {
            vip();
            AbstractC9528e.startapp(appmetrica);
            try {
                InterfaceC7606e interfaceC7606e = metrica;
                BinderC3838e binderC3838e = new BinderC3838e(appmetrica.getPackageManager());
                C18163e c18163e = (C18163e) interfaceC7606e;
                Parcel m4156e = c18163e.m4156e();
                int i = AbstractC14342e.ad;
                boolean z3 = true;
                m4156e.writeInt(1);
                int applovin = AbstractC16852e.applovin(m4156e, 20293);
                AbstractC16852e.remoteconfig(m4156e, 1, str);
                AbstractC16852e.smaato(m4156e, 2, binderC3559e);
                AbstractC16852e.isPro(m4156e, 3, 4);
                m4156e.writeInt(z ? 1 : 0);
                AbstractC16852e.isPro(m4156e, 4, 4);
                m4156e.writeInt(z2 ? 1 : 0);
                AbstractC16852e.ads(m4156e, applovin);
                AbstractC14342e.vip(m4156e, binderC3838e);
                Parcel m4152e = c18163e.m4152e(m4156e, 5);
                if (m4152e.readInt() == 0) {
                    z3 = false;
                }
                m4152e.recycle();
                return z3 ? C12309e.f24692e : new C16493e(new CallableC3165e(z, str, binderC3559e));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C12309e.m3337interface("module call", e);
            }
        } catch (C15674e e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return C12309e.m3337interface("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [eؚۦٟ] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void vip() {
        ?? r1;
        if (metrica != null) {
            return;
        }
        AbstractC9528e.startapp(appmetrica);
        synchronized (license) {
            try {
                if (metrica == null) {
                    IBinder vip2 = C0781e.metrica(appmetrica, C0781e.appmetrica, "com.google.android.gms.googlecertificates").vip("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = AbstractBinderC10821e.license;
                    if (vip2 == null) {
                        r1 = 0;
                    } else {
                        IInterface queryLocalInterface = vip2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        r1 = queryLocalInterface instanceof InterfaceC7606e ? (InterfaceC7606e) queryLocalInterface : new AbstractC16277e(vip2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    metrica = r1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
