package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6192e extends AbstractC0421e {
    public static final long appmetrica;
    public static final long billing;
    public static final long license;
    public static final long metrica;
    public static final long purchase;
    public static final Unsafe vip;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(C2250e.ad);
            }
            try {
                license = unsafe.objectFieldOffset(AbstractC13307e.class.getDeclaredField("eّؑؑ"));
                metrica = unsafe.objectFieldOffset(AbstractC13307e.class.getDeclaredField("eؙِٖ"));
                appmetrica = unsafe.objectFieldOffset(AbstractC13307e.class.getDeclaredField("eًؔؐ"));
                purchase = unsafe.objectFieldOffset(C9503e.class.getDeclaredField("ad"));
                billing = unsafe.objectFieldOffset(C9503e.class.getDeclaredField("vip"));
                vip = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.AbstractC0421e
    public final boolean Signature(AbstractC13307e abstractC13307e, Object obj, Object obj2) {
        return AbstractC2977e.ad(vip, abstractC13307e, appmetrica, obj, obj2);
    }

    @Override // defpackage.AbstractC0421e
    public final void adcel(C9503e c9503e, Thread thread) {
        vip.putObject(c9503e, purchase, thread);
    }

    @Override // defpackage.AbstractC0421e
    public final boolean advert(AbstractC13307e abstractC13307e, C9503e c9503e, C9503e c9503e2) {
        return AbstractC4863e.ad(vip, abstractC13307e, license, c9503e, c9503e2);
    }

    @Override // defpackage.AbstractC0421e
    public final C9503e amazon(AbstractC2074e abstractC2074e) {
        C9503e c9503e;
        C9503e c9503e2 = C9503e.metrica;
        do {
            c9503e = abstractC2074e.f26539e;
            if (c9503e2 == c9503e) {
                break;
            }
        } while (!advert(abstractC2074e, c9503e, c9503e2));
        return c9503e;
    }

    @Override // defpackage.AbstractC0421e
    public final C9563e loadAd(AbstractC2074e abstractC2074e) {
        C9563e c9563e;
        C9563e c9563e2 = C9563e.license;
        do {
            c9563e = abstractC2074e.f26541e;
            if (c9563e2 == c9563e) {
                break;
            }
        } while (!smaato(abstractC2074e, c9563e, c9563e2));
        return c9563e;
    }

    @Override // defpackage.AbstractC0421e
    public final void mopub(C9503e c9503e, C9503e c9503e2) {
        vip.putObject(c9503e, billing, c9503e2);
    }

    @Override // defpackage.AbstractC0421e
    public final boolean smaato(AbstractC13307e abstractC13307e, C9563e c9563e, C9563e c9563e2) {
        return AbstractC14316e.ad(vip, abstractC13307e, metrica, c9563e, c9563e2);
    }
}
