package defpackage;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16077e implements InterfaceC9815e {
    public static final C1400e purchase = new C1400e(23);
    public final Class ad;
    public final Method appmetrica;
    public final Method license;
    public final Method metrica;
    public final Method vip;

    public C16077e(Class cls) {
        this.ad = cls;
        this.vip = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.metrica = cls.getMethod("setHostname", String.class);
        this.license = cls.getMethod("getAlpnSelectedProtocol", null);
        this.appmetrica = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean ad() {
        boolean z = C10932e.appmetrica;
        return C10932e.appmetrica;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean license(SSLSocket sSLSocket) {
        return this.ad.isInstance(sSLSocket);
    }

    @Override // defpackage.InterfaceC9815e
    public final void metrica(SSLSocket sSLSocket, String str, List list) {
        if (this.ad.isInstance(sSLSocket)) {
            try {
                this.vip.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.metrica.invoke(sSLSocket, str);
                }
                Method method = this.appmetrica;
                AbstractC18303e abstractC18303e = AbstractC18303e.ad;
                method.invoke(sSLSocket, C10914e.appmetrica(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.InterfaceC9815e
    public final String vip(SSLSocket sSLSocket) {
        if (this.ad.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.license.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC5508e.ad);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC7890e.billing(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }
}
