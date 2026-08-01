package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۡؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18061e extends AbstractC0326e {
    public static final long appmetrica;
    public static final long billing;
    public static final long license;
    public static final long metrica;
    public static final long purchase;
    public static final Unsafe vip;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            license = unsafe.objectFieldOffset(AbstractC0586e.class.getDeclaredField("eًؔؐ"));
            metrica = unsafe.objectFieldOffset(AbstractC0586e.class.getDeclaredField("eؘٙؓ"));
            appmetrica = unsafe.objectFieldOffset(AbstractC0586e.class.getDeclaredField("eّٖۦ"));
            purchase = unsafe.objectFieldOffset(C2694e.class.getDeclaredField("ad"));
            billing = unsafe.objectFieldOffset(C2694e.class.getDeclaredField("vip"));
            vip = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.AbstractC0326e
    public final C17100e adcel(AbstractC0586e abstractC0586e) {
        C17100e c17100e;
        C17100e c17100e2 = C17100e.license;
        do {
            c17100e = abstractC0586e.f2775e;
            if (c17100e2 == c17100e) {
                break;
            }
        } while (!metrica(abstractC0586e, c17100e, c17100e2));
        return c17100e;
    }

    @Override // defpackage.AbstractC0326e
    public final void amazon(C2694e c2694e, C2694e c2694e2) {
        vip.putObject(c2694e, billing, c2694e2);
    }

    @Override // defpackage.AbstractC0326e
    public final boolean appmetrica(AbstractC0586e abstractC0586e, C2694e c2694e, C2694e c2694e2) {
        return AbstractC0777e.ad(vip, abstractC0586e, license, c2694e, c2694e2);
    }

    @Override // defpackage.AbstractC0326e
    public final boolean license(AbstractC0586e abstractC0586e, Object obj, Object obj2) {
        return AbstractC13709e.ad(vip, abstractC0586e, appmetrica, obj, obj2);
    }

    @Override // defpackage.AbstractC0326e
    public final void loadAd(C2694e c2694e, Thread thread) {
        vip.putObject(c2694e, purchase, thread);
    }

    @Override // defpackage.AbstractC0326e
    public final boolean metrica(AbstractC0586e abstractC0586e, C17100e c17100e, C17100e c17100e2) {
        return AbstractC0723e.ad(vip, abstractC0586e, metrica, c17100e, c17100e2);
    }

    @Override // defpackage.AbstractC0326e
    public final C2694e mopub(AbstractC0586e abstractC0586e) {
        C2694e c2694e;
        C2694e c2694e2 = C2694e.metrica;
        do {
            c2694e = abstractC0586e.f2774e;
            if (c2694e2 == c2694e) {
                break;
            }
        } while (!appmetrica(abstractC0586e, c2694e, c2694e2));
        return c2694e;
    }
}
