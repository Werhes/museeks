package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10932e extends AbstractC18303e implements InterfaceC0504e {
    public static final boolean appmetrica;
    public final ArrayList license;
    public Context metrica;

    static {
        appmetrica = Build.VERSION.SDK_INT < 29;
    }

    public C10932e() {
        C16077e c16077e;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c16077e = new C16077e(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = AbstractC4830e.ad;
            AbstractC4830e.ad(C1343e.class.getName(), 5, "unable to load android socket classes", e);
            c16077e = null;
        }
        ArrayList isPro = AbstractC1660e.isPro(new InterfaceC9815e[]{c16077e, new C16487e(C16077e.purchase), new C16487e(C8711e.ad), new C16487e(C11966e.ad)});
        ArrayList arrayList = new ArrayList();
        Iterator it = isPro.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC9815e) next).ad()) {
                arrayList.add(next);
            }
        }
        this.license = arrayList;
    }

    @Override // defpackage.InterfaceC0504e
    public final void ad(Context context) {
        this.metrica = context;
    }

    @Override // defpackage.AbstractC18303e
    public final void adcel(int i, String str, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.AbstractC18303e
    public final SSLContext advert() {
        StrictMode.noteSlowCall("newSSLContext");
        return SSLContext.getInstance("TLS");
    }

    @Override // defpackage.AbstractC18303e
    public final void appmetrica(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.license.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC9815e) obj).license(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC9815e interfaceC9815e = (InterfaceC9815e) obj;
        if (interfaceC9815e != null) {
            interfaceC9815e.metrica(sSLSocket, str, list);
        }
    }

    @Override // defpackage.AbstractC18303e
    public final String billing(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.license.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC9815e) obj).license(sSLSocket)) {
                break;
            }
        }
        InterfaceC9815e interfaceC9815e = (InterfaceC9815e) obj;
        if (interfaceC9815e != null) {
            return interfaceC9815e.vip(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.AbstractC18303e
    public final InterfaceC2995e license(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C15307e(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.license(x509TrustManager);
        }
    }

    @Override // defpackage.AbstractC18303e
    public final AbstractC0014e metrica(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C17656e c17656e = x509TrustManagerExtensions != null ? new C17656e(x509TrustManager, x509TrustManagerExtensions) : null;
        return c17656e != null ? c17656e : super.metrica(x509TrustManager);
    }

    @Override // defpackage.AbstractC18303e
    public final void purchase(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // defpackage.AbstractC18303e
    public final boolean startapp(String str) {
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // defpackage.InterfaceC0504e
    public final Context vip() {
        return this.metrica;
    }
}
