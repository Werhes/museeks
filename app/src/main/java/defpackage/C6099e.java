package defpackage;

import androidx.car.app.model.Alert;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؐؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6099e implements InterfaceC11304e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C6099e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public static int license(C11058e c11058e, int i) {
        String appmetrica = c11058e.f21946e.appmetrica("Retry-After");
        if (appmetrica == null) {
            appmetrica = null;
        }
        return appmetrica == null ? i : Pattern.compile("\\d+").matcher(appmetrica).matches() ? Integer.valueOf(appmetrica).intValue() : Alert.DURATION_SHOW_INDEFINITELY;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v50 e￘ﾑ￙ﾔￛﾖ, still in use, count: 2, list:
          (r0v50 e￘ﾑ￙ﾔￛﾖ) from 0x0076: MOVE (r18v0 e￘ﾑ￙ﾔￛﾖ) = (r0v50 e￘ﾑ￙ﾔￛﾖ)
          (r0v50 e￘ﾑ￙ﾔￛﾖ) from 0x0063: MOVE (r18v3 e￘ﾑ￙ﾔￛﾖ) = (r0v50 e￘ﾑ￙ﾔￛﾖ)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Type inference failed for: r5v22, types: [eٖٖؐ, java.lang.Object] */
    @Override // defpackage.InterfaceC11304e
    public final defpackage.C11058e ad(defpackage.C9840e r35) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6099e.ad(eٍۢٚ):eٍُ٘");
    }

    public boolean metrica(IOException iOException, C4602e c4602e, C8650e c8650e) {
        AbstractC1101e abstractC1101e;
        boolean z = iOException instanceof C10952e;
        if (!((C1343e) this.vip).appmetrica) {
            return false;
        }
        if ((!z && (((abstractC1101e = c8650e.license) != null && abstractC1101e.yandex()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C6613e c6613e = c4602e.f9919e;
        if (c6613e == null || !c6613e.f13641e) {
            return false;
        }
        C0309e purchase = c4602e.f9924e.purchase();
        C6613e c6613e2 = c4602e.f9919e;
        return purchase.ad(c6613e2 != null ? c6613e2.applovin() : null);
    }

    public C8650e vip(C11058e c11058e, C6613e c6613e) {
        C14052e c14052e;
        AbstractC1101e abstractC1101e;
        C11058e c11058e2;
        C2257e c2257e = c6613e != null ? c6613e.applovin().metrica : null;
        int i = c11058e.f21942e;
        C8650e c8650e = c11058e.f21944e;
        String str = c8650e.vip;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((C1343e) this.vip).billing.getClass();
                return null;
            }
            if (i == 421) {
                AbstractC1101e abstractC1101e2 = c8650e.license;
                if ((abstractC1101e2 == null || !abstractC1101e2.yandex()) && c6613e != null && !AbstractC7890e.billing(((InterfaceC16718e) c6613e.f13640e).purchase().startapp.yandex.license, ((InterfaceC8246e) c6613e.f13645e).startapp().metrica().ad.yandex.license)) {
                    C0177e applovin = c6613e.applovin();
                    synchronized (applovin) {
                        applovin.mopub = true;
                        Unit unit = Unit.INSTANCE;
                    }
                    return c11058e.f21944e;
                }
            } else if (i == 503) {
                C11058e c11058e3 = c11058e.f21941e;
                if ((c11058e3 == null || c11058e3.f21942e != 503) && license(c11058e, Alert.DURATION_SHOW_INDEFINITELY) == 0) {
                    return c11058e.f21944e;
                }
            } else {
                if (i == 407) {
                    if (c2257e.vip.type() == Proxy.Type.HTTP) {
                        return ((C1343e) this.vip).smaato.purchase(c2257e, c11058e);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (((C1343e) this.vip).appmetrica && (((abstractC1101e = c8650e.license) == null || !abstractC1101e.yandex()) && (((c11058e2 = c11058e.f21941e) == null || c11058e2.f21942e != 408) && license(c11058e, 0) <= 0))) {
                    return c11058e.f21944e;
                }
            }
            return null;
        }
        C1343e c1343e = (C1343e) this.vip;
        if (c1343e.yandex) {
            String appmetrica = c11058e.f21946e.appmetrica("Location");
            if (appmetrica == null) {
                appmetrica = null;
            }
            C8650e c8650e2 = c11058e.f21944e;
            if (appmetrica != null) {
                C15718e c15718e = c8650e2.ad;
                c15718e.getClass();
                try {
                    c14052e = new C14052e();
                    c14052e.adcel(c15718e, appmetrica);
                } catch (IllegalArgumentException unused) {
                    c14052e = null;
                }
                C15718e metrica = c14052e != null ? c14052e.metrica() : null;
                if (metrica != null && (AbstractC7890e.billing(metrica.ad, c8650e2.ad.ad) || c1343e.startapp)) {
                    C18464e ad = c8650e2.ad();
                    if (AbstractC13083e.license(str)) {
                        int i2 = c11058e.f21942e;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            ad.m4494e(str, z ? c8650e2.license : null);
                        } else {
                            ad.m4494e("GET", null);
                        }
                        if (!z) {
                            ad.m4512e("Transfer-Encoding");
                            ad.m4512e("Content-Length");
                            ad.m4512e("Content-Type");
                        }
                    }
                    if (!AbstractC16286e.ad(c8650e2.ad, metrica)) {
                        ad.m4512e("Authorization");
                    }
                    ad.f36191e = metrica;
                    return new C8650e(ad);
                }
            }
        }
        return null;
    }
}
