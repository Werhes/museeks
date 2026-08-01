package defpackage;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18303e {
    public static volatile AbstractC18303e ad;
    public static final Logger vip;

    static {
        try {
            for (Map.Entry entry : AbstractC4830e.vip.entrySet()) {
                AbstractC4830e.vip((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        AbstractC18303e c10871e = C10871e.appmetrica ? new C10871e() : null;
        if (c10871e == null) {
            c10871e = C10932e.appmetrica ? new C10932e() : null;
        }
        if (c10871e == null) {
            throw new IllegalStateException(AbstractC1786e.admob(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        ad = c10871e;
        vip = Logger.getLogger(C1343e.class.getName());
    }

    public static X509TrustManager amazon() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    public abstract void adcel(int i, String str, Throwable th);

    public abstract SSLContext advert();

    public abstract void appmetrica(SSLSocket sSLSocket, String str, List list);

    public abstract String billing(SSLSocket sSLSocket);

    public InterfaceC2995e license(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C16469e((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public AbstractC0014e metrica(X509TrustManager x509TrustManager) {
        return new C3762e(license(x509TrustManager));
    }

    public void mopub(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        adcel(5, str, (Throwable) obj);
    }

    public void purchase(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public final SSLSocketFactory smaato(X509TrustManager x509TrustManager) {
        try {
            SSLContext advert = advert();
            advert.init(null, new TrustManager[]{x509TrustManager}, null);
            return advert.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public abstract boolean startapp(String str);

    public final String toString() {
        return getClass().getSimpleName();
    }

    public Object yandex() {
        if (vip.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }
}
