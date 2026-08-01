package defpackage;

import java.io.InputStream;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16483e extends AbstractC15468e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C16483e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public C16483e(InterfaceC8376e interfaceC8376e, Throwable th) {
        this.ad = 2;
        StringBuilder sb = new StringBuilder("<html><body><h1>Internal Server Error</h1><h2>Request Information:</h2><pre>");
        InterfaceC2861e license = interfaceC8376e.license();
        sb.append("Method: " + ((C3434e) ((C17790e) AbstractC10337e.ad(license)).f34883e) + '\n');
        sb.append("Path: " + AbstractC7535e.admob(license) + '\n');
        sb.append("Parameters: " + license.adcel() + '\n');
        sb.append("From origin: " + AbstractC10337e.ad(license) + '\n');
        sb.append("</pre><h2>Stack Trace:</h2><pre>");
        Iterator it = AbstractC5304e.m1870protected(AbstractC13362e.advert(th)).iterator();
        while (it.hasNext()) {
            sb.append("<span style=\"color:blue;\">" + ((String) it.next()) + "</span><br>");
        }
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("<br>Caused by:<br>");
            Iterator it2 = AbstractC5304e.m1870protected(AbstractC13362e.advert(cause)).iterator();
            while (it2.hasNext()) {
                sb.append("<span style=\"color:green;\">" + ((String) it2.next()) + "</span><br>");
            }
        }
        sb.append("</pre></body></html>");
        this.vip = sb.toString();
    }

    @Override // defpackage.AbstractC15468e
    public final InterfaceC13033e appmetrica() {
        switch (this.ad) {
            case 0:
                return AbstractC17324e.billing((InputStream) this.vip);
            case 1:
                return (InterfaceC13033e) this.vip;
            default:
                return AbstractC4265e.ad(AbstractC1266e.appmetrica((String) this.vip, AbstractC5508e.ad));
        }
    }

    @Override // defpackage.AbstractC14601e
    public C2394e license() {
        switch (this.ad) {
            case 2:
                C2394e c2394e = C2394e.f6116e;
                return C2394e.f6114e;
            default:
                return super.license();
        }
    }
}
