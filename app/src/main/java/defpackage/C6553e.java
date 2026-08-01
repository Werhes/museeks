package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6553e {
    public static volatile C12425e appmetrica;
    public final InterfaceC3832e ad;
    public final C4956e license;
    public final InterfaceC6963e metrica;
    public final InterfaceC3832e vip;

    public C6553e(InterfaceC3832e interfaceC3832e, InterfaceC3832e interfaceC3832e2, InterfaceC6963e interfaceC6963e, C4956e c4956e, C11106e c11106e) {
        this.ad = interfaceC3832e;
        this.vip = interfaceC3832e2;
        this.metrica = interfaceC6963e;
        this.license = c4956e;
        ((Executor) c11106e.f22008e).execute(new RunnableC1352e(18, c11106e));
    }

    public static C6553e ad() {
        C12425e c12425e = appmetrica;
        if (c12425e != null) {
            return (C6553e) c12425e.f24858e.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void vip(Context context) {
        if (appmetrica == null) {
            synchronized (C6553e.class) {
                try {
                    if (appmetrica == null) {
                        C2691e c2691e = new C2691e(4);
                        context.getClass();
                        c2691e.f6570e = context;
                        appmetrica = c2691e.subs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C13192e metrica(InterfaceC9204e interfaceC9204e) {
        byte[] bytes;
        Set unmodifiableSet = interfaceC9204e instanceof InterfaceC9204e ? DesugarCollections.unmodifiableSet(C12664e.license) : Collections.singleton(new C12007e("proto"));
        C12894e ad = C7869e.ad();
        interfaceC9204e.getClass();
        ad.f25751e = "cct";
        C12664e c12664e = (C12664e) interfaceC9204e;
        String str = c12664e.ad;
        String str2 = c12664e.vip;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            bytes = AbstractC17861e.admob("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        ad.f25750e = bytes;
        return new C13192e(unmodifiableSet, ad.startapp(), this);
    }
}
