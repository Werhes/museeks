package defpackage;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eؔؖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2383e implements InterfaceC14454e, InterfaceC10801e, InterfaceC0987e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f6092e;

    public /* synthetic */ C2383e(Object obj) {
        this.f6092e = obj;
    }

    public static C2383e license(String str) {
        return new C2383e((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC18450e.UNINITIALIZED : C5291e.appmetrica(str.charAt(0)));
    }

    @Override // defpackage.InterfaceC10801e
    public void ad(Object obj) {
        boolean z;
        boolean z2;
        C3223e c3223e = (C3223e) obj;
        try {
            byte[] bArr = (byte[]) this.f6092e;
            C17268e c17268e = C17268e.ad;
            int i = AbstractC3433e.ad;
            C15272e tapsense = C15272e.tapsense(bArr, C17268e.vip);
            Iterator it = c3223e.vip.purchase.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                C4548e c4548e = (C4548e) it.next();
                List signatures = tapsense.signatures();
                c4548e.getClass();
                C8167e c8167e = C13400e.startapp;
                c8167e.getClass();
                if (signatures == null || signatures.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = signatures.iterator();
                    z = false;
                    while (it2.hasNext()) {
                        C0164e c0164e = (C0164e) ((ConcurrentHashMap) c8167e.f16626e).get((String) it2.next());
                        if (c0164e != null) {
                            C13400e c13400e = c0164e.ad;
                            if (c13400e.appmetrica) {
                                C12344e c12344e = c13400e.ad;
                                if (c12344e != null && (c12344e.f24750e || ((C12434e) c12344e.f24753e).f24874e == 3 || c13400e.yandex.vip())) {
                                    synchronized (c13400e) {
                                        try {
                                            C12344e c12344e2 = c13400e.ad;
                                            if (c12344e2 != null) {
                                                if (!c12344e2.f24750e) {
                                                    if (!(((C12434e) c12344e2.f24753e).f24874e == 3)) {
                                                        if (c13400e.yandex.vip()) {
                                                        }
                                                    }
                                                }
                                                c13400e.ad = null;
                                                ((AtomicInteger) c13400e.billing.f6570e).incrementAndGet();
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    c3223e.ad.ad();
                    z3 = true;
                }
            }
        } catch (C10895e unused) {
            c3223e.getClass();
        }
    }

    @Override // defpackage.InterfaceC14454e
    public int admob(byte[] bArr) {
        int i = bArr[bArr.length - 1] & 255;
        if ((((bArr.length - i) | (i - 1)) >> 31) == 0) {
            return i;
        }
        throw new Exception("pad block corrupted");
    }

    public void appmetrica(long j, long j2) {
        C2285e c2285e = (C2285e) this.f6092e;
        c2285e.mo2250e();
        C6936e c6936e = (C6936e) c2285e.f36443e;
        if (c6936e.ad()) {
            C1195e c1195e = c6936e.f14198e;
            C6936e.purchase(c1195e);
            c1195e.f3806e.license(j);
            c6936e.f14215e.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.vip(Long.valueOf(elapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            C8320e c8320e = c6936e.f14199e;
            C6936e.billing(c8320e);
            c8320e.m2413e(j, valueOf, "auto", "_sid");
            C6936e.purchase(c1195e);
            c1195e.f3805e.license(j3);
            c1195e.f3800e.vip(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            C6936e.billing(c8320e);
            c8320e.m2404e(j, j2, bundle, "auto", "_s");
            String tapsense = c1195e.f3816e.tapsense();
            if (TextUtils.isEmpty(tapsense)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", tapsense);
            C6936e.billing(c8320e);
            c8320e.m2404e(j, j2, bundle2, "auto", "_ssr");
        }
    }

    @Override // defpackage.InterfaceC0987e
    public ListenableFuture call() {
        C14742e c14742e = (C14742e) this.f6092e;
        ExecutorC12022e executorC12022e = (ExecutorC12022e) c14742e.appmetrica;
        try {
            return AbstractC2017e.license(c14742e.Signature((Uri) AbstractC2017e.vip((ListenableFuture) c14742e.metrica)));
        } catch (IOException e) {
            C4842e c4842e = (C4842e) c14742e.billing;
            c4842e.getClass();
            if ((e instanceof C15791e) || (e.getCause() instanceof C15791e)) {
                return AbstractC2017e.metrica(e);
            }
            C11428e c11428e = (C11428e) c4842e.f10311e;
            c11428e.getClass();
            return AbstractC2017e.billing(!(e.getCause() instanceof C10895e) ? AbstractC2017e.metrica(e) : AbstractC2017e.ad(AbstractC2017e.billing(AbstractC2017e.license(c11428e.ad), AbstractC9855e.vip(new C7703e(c14742e, 2)), executorC12022e), IOException.class, new C2169e(5, e), EnumC3320e.f7489e), AbstractC9855e.vip(new C7703e(c14742e, 1)), executorC12022e);
        }
    }

    @Override // defpackage.InterfaceC14454e
    public void isPro(SecureRandom secureRandom) {
        this.f6092e = secureRandom;
    }

    @Override // defpackage.InterfaceC14454e
    public int loadAd(int i, byte[] bArr) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            SecureRandom secureRandom = (SecureRandom) this.f6092e;
            if (secureRandom == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) secureRandom.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }

    public void metrica(long j, long j2) {
        C2285e c2285e = (C2285e) this.f6092e;
        c2285e.mo2250e();
        c2285e.m802e();
        C6936e c6936e = (C6936e) c2285e.f36443e;
        C1195e c1195e = c6936e.f14198e;
        C6936e.purchase(c1195e);
        if (c1195e.m489e(j)) {
            C6936e.purchase(c1195e);
            c1195e.f3800e.vip(true);
            c6936e.smaato().m3390e();
        }
        C6936e.purchase(c1195e);
        c1195e.f3806e.license(j);
        if (c1195e.f3800e.ad()) {
            appmetrica(j, j2);
        }
    }

    public void vip() {
        long j;
        C2285e c2285e = (C2285e) this.f6092e;
        c2285e.mo2250e();
        C6936e c6936e = (C6936e) c2285e.f36443e;
        C1195e c1195e = c6936e.f14198e;
        C6936e.purchase(c1195e);
        C17647e c17647e = c6936e.f14215e;
        c17647e.getClass();
        if (c1195e.m489e(System.currentTimeMillis())) {
            C1195e c1195e2 = c6936e.f14198e;
            C6936e.purchase(c1195e2);
            c1195e2.f3800e.vip(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27497e.ad("Detected application was in foreground");
                c17647e.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33810e)) {
                    c17647e.getClass();
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                appmetrica(currentTimeMillis, j);
            }
        }
    }
}
