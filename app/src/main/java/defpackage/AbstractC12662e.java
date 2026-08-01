package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12662e {
    public static final ArrayList ad(List list) {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((C13157e) it.next()).metrica.getBytes(AbstractC5508e.ad));
            try {
                Collection<? extends Certificate> generateCertificates = certificateFactory.generateCertificates(byteArrayInputStream);
                byteArrayInputStream.close();
                AbstractC13480e.inmobi(arrayList, generateCertificates);
            } finally {
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof X509Certificate) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eًؔٚ, eؚٗٔ] */
    public static final InterfaceC7696e appmetrica(C14542e c14542e, C8763e c8763e) {
        InterfaceC1363e interfaceC1363e = c14542e.metrica;
        if (!(interfaceC1363e instanceof C17702e)) {
            return new C12916e(19, c8763e);
        }
        ViewOnAttachStateChangeListenerC3798e billing = AbstractC5750e.billing(((C17702e) interfaceC1363e).f34698e);
        synchronized (billing) {
            C17002e c17002e = billing.f8411e;
            if (c17002e != null) {
                Bitmap.Config[] configArr = AbstractC13427e.ad;
                if (AbstractC7890e.billing(Looper.myLooper(), Looper.getMainLooper()) && billing.f8410e) {
                    billing.f8410e = false;
                    c17002e.f33303e = c8763e;
                    return c17002e;
                }
            }
            C8419e c8419e = billing.f8409e;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            billing.f8409e = null;
            ?? obj = new Object();
            obj.f33303e = c8763e;
            billing.f8411e = obj;
            return obj;
        }
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C10692e(new C8392e(function1)));
    }

    public static final void metrica(C4017e c4017e) {
        try {
            c4017e.ad();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            if (!AbstractC5304e.inmobi(message, "mViewFlags", false) && !AbstractC5304e.inmobi(message, "LayoutNode", false)) {
                throw e;
            }
        }
    }

    public static final void purchase(InterfaceC1683e interfaceC1683e, Function1 function1) {
        InterfaceC2661e interfaceC2661e = (InterfaceC2661e) AbstractC10432e.vip(interfaceC1683e, AbstractC11473e.billing);
        C16446e metrica = interfaceC2661e.metrica();
        try {
            function1.invoke(metrica);
        } finally {
            interfaceC2661e.ad(metrica);
        }
    }

    public static long vip(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }
}
